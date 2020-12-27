package platfrom.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class MemberDao implements SqlDao<Member>{
	
	private DataSource dataSource;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		
	}
	
	@Override
	public Member Select(String sql, Object[] args) throws SQLException {
		
		if(this.dataSource == null) {
			throw new SQLException("物件尚未注入");
		}
		
		Member member = null;
		Connection connection = dataSource.getConnection();
		
		PreparedStatement pre = connection.prepareStatement(sql);
		
		pre.setObject(1, args[0]);
		pre.setObject(2, args[1]);
		
		ResultSet rs = pre.executeQuery();
		
		if(rs.next()) {
			
			member = new Member();
			member.setUsername(rs.getString("username"));
			member.setPassword(rs.getString("password"));
		}
		connection.close();
		return member;
		
	}

}
