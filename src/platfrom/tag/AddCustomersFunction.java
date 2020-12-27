package platfrom.tag;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import com.mysql.cj.jdbc.MysqlDataSource;


import platfrom.domain.AddCustomers;
import platfrom.domain.DaoConfig;

public class AddCustomersFunction {
	public static String addCustomers(AddCustomers customers,ServletContext servletContext) throws SQLException {
		String message = "";
		DataSource dataSource = (DataSource)servletContext.getAttribute("ApplicationSetDatasource");
		
		
		Connection connection = null;
		
		try {
			connection = dataSource.getConnection();
			
			String sql = "INSERT INTO `demo`.`customers` (`customerid`, `companyname`, `address`, `phone`, `country`) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setInt(1, customers.getCustomerId());
			pre.setString(2, customers.getCompanyName());
			pre.setString(3, customers.getAddress());
			pre.setString(4, customers.getPhone());
			pre.setString(5, customers.getCountry());
			int r = pre.executeUpdate();
			if(r != 0) {
				message = String.format("客戶:%d 新增成功", customers.getCustomerId(),customers.getCompanyName());
				}
			
		} catch (SQLException e) {
				message = String.format("客戶:%d 新增失敗..%s", customers.getCustomerId(),e.getMessage());
			
		}
		finally {
			if (connection!=null) {
				connection.close();
			}
		}
		
		return message;
		
			
		}
	
}
