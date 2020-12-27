package platfrom.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.commons.dbcp.BasicDataSource;

import platfrom.domain.DaoConfig;
import platfrom.domain.Member;

@WebServlet("/RegisterSave")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");

		BasicDataSource datasource = (BasicDataSource) this.getServletContext().getAttribute("ApplicationSetDatasource");

		
		Connection connection = null;
		try {
			connection = datasource.getConnection();
			String sql = "insert into vip(username,password,address,phone,email) values (?,?,?,?,?)";
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setString(1, username);
			pre.setString(2, password);
			pre.setString(3, address);
			pre.setString(4, phone);
			pre.setString(5, email);
			
			int r = pre.executeUpdate();
			
			if(r>0) {
				
				
				
				Member member = new Member();
				member.setUsername(username);
				member.setPassword(password);
				member.setAddress(address);
				member.setPhone(phone);
				member.setEmail(email);
				request.setAttribute("member", member);
		

				RequestDispatcher disp = request.getRequestDispatcher("registerok.jsp");
				disp.forward(request, response);
				
			}
			
		} catch (SQLException e) {
			
			String match = e.getMessage()+"";
			match = match.matches("Duplicate(.*)")+"";
			String content = "";
			switch (match) {
			case "true":
				content = "新增失敗...名稱重複";
				break;
			default :
				content = "其他異常,請重新註冊";
				break;
			}
			
			
			request.setAttribute("content", content);
			RequestDispatcher disp = request.getRequestDispatcher("registerfail.jsp");
			disp.forward(request, response);
		}
		finally {
			if(connection != null) {
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
