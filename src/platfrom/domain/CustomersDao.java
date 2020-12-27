package platfrom.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class CustomersDao implements SqlDao<Customers>{
	private DataSource dataSource;
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		
	}
	
	@Override
	public List<Customers> selectForEachList(String sql, Object[] args) throws SQLException {
		List<Customers> result = new ArrayList<>();
		if(dataSource==null) {
			throw new SQLException("連接資料尚未注入");
		}
		
		Connection connection = dataSource.getConnection(); 
		PreparedStatement pre = connection.prepareStatement(sql);
		
		
		for(int pos = 1 ; pos <= args.length ; pos++) {
			pre.setObject(pos, args[pos-1]);
		}
		ResultSet rs = pre.executeQuery();
		
		while(rs.next()) {
			Customers customers = new Customers();
			customers.setId(rs.getShort("ID"));
			customers.setName(rs.getString("name"));
			customers.setAddress(rs.getString("address"));
			customers.setPhone(rs.getString("phone"));
			customers.setCity(rs.getString("city"));
			customers.setCountry(rs.getString("country"));
			result.add(customers);
		}
		connection.close();
		return result;
	}
}
