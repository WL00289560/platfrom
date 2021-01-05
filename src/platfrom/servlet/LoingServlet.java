package platfrom.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbcp.BasicDataSource;

import platfrom.domain.Member;
import platfrom.domain.MemberDao;
import platfrom.domain.SqlDao;


@WebServlet("/LoingServlet")
public class LoingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoingServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		BasicDataSource dataSource = (BasicDataSource)this.getServletContext().getAttribute("ApplicationSetDatasource");
		
		try {
		SqlDao<Member> sqlDao = new MemberDao();
		sqlDao.setDataSource(dataSource);
		String sql = "SELECT username,password FROM demo.vip where username = ? and password = ?;";
		
			Member member = sqlDao.Select(sql, new Object[] {username,password});

			if(member==null) {
				String msg = "失敗";
				String message = String.format("使用者:%s \n 驗證%s", username,msg);
				request.setAttribute("message", message);
				RequestDispatcher disp = request.getRequestDispatcher("loginvlid.jsp");
				disp.forward(request, response);
			}else {
				String msg = "成功";
				String message = String.format("使用者:%s 驗證%s", username,msg);
				request.setAttribute("message", message);
				
				Cookie cookie = new Cookie(".isck",username);
				cookie.setHttpOnly(true);
				cookie.setMaxAge(1800);
				response.addCookie(cookie);
				
				RequestDispatcher disp = request.getRequestDispatcher("loginvlid.jsp");
				disp.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
	
		
	}

}
