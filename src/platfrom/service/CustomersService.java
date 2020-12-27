package platfrom.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mysql.cj.jdbc.MysqlDataSource;

import platfrom.servlet.domain.Customers;
import platfrom.servlet.domain.MyMessage;

@Path("customerservice")
public class CustomersService {
	

	
	@Path("select/{country}/result")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response selectCountry(@PathParam("country")String country) {
		List<Customers> result = new ArrayList<>();
		
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=UTC");
		dataSource.setUser("root");
		dataSource.setPassword("1111");
		Connection connection = null;
		try {
			connection =  dataSource.getConnection();
			if(connection == null) {
				throw new SQLException("連接物件沒有注入");
			}
			String sql = "SELECT ID,name,address,phone,country FROM sakila.customer_list where country=?  order by id asc;";
			
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setString(1, country);
			
			ResultSet rs = pre.executeQuery();
			
			while(rs.next()) {
				Customers customers = new Customers();
				customers.setId(rs.getShort("ID"));
				customers.setName(rs.getString("name"));
				customers.setAddress(rs.getString("address"));
				customers.setPhone(rs.getString("phone"));
				customers.setCountry(rs.getString("country"));
				result.add(customers);
			}
			if(result.size() > 0) {
				return Response.ok(result).build();
			}else {
				MyMessage message = new MyMessage();
				message.setMsg("查無相關資料");
				message.setCode(200);
				return Response.status(400).entity(message).build();
			}
			
			
			
		} catch (SQLException e) {
			MyMessage msg=new MyMessage();
			msg.setCode(400); //bad request
			msg.setMsg("錯誤:"+e.getMessage());
			return Response.status(400).entity(msg).build();
		
		}
		
		finally{
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
