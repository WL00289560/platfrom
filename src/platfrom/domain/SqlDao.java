package platfrom.domain;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;


public interface SqlDao<T> {
	default T Select(String sql,Object[] args) throws SQLException{
		return null;
	}
	public void setDataSource(DataSource dataSource);
	
	default List<T> selectForEachList(String sql,Object[] args)throws SQLException{
		return null;
	};
}
