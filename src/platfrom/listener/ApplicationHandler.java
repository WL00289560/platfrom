package platfrom.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.dbcp.BasicDataSource;

import platfrom.domain.DaoConfig;
@WebListener()
public class ApplicationHandler implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		ServletContextListener.super.contextInitialized(sce);
		ServletContext application = sce.getServletContext();
		String url = application.getInitParameter("url");
		String username = application.getInitParameter("username");
		String password = application.getInitParameter("password");
		
		DaoConfig config = new DaoConfig();
		config.setUrl(url);
		config.setUsername(username);
		config.setPassword(password);
		
		application.setAttribute("ApplicationHandler", config);
		
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl(url);
		datasource.setUsername(username);
		datasource.setPassword(password);
		application.setAttribute("ApplicationSetDatasource", datasource);
		
		
	}
	
}