package platfrom.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbcp.BasicDataSource;

import platfrom.domain.Customers;
import platfrom.domain.CustomersDao;
import platfrom.domain.SqlDao;

@WebServlet("/member/VenderSelectController")
public class VenderSelectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public VenderSelectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String country = request.getParameter("country");
		SqlDao<Customers> sqlDao = new CustomersDao();
		
		sqlDao.setDataSource((BasicDataSource)this.getServletContext().getAttribute("ApplicationSetDatasource"));
		
		String sql = "SELECT ID,name,address,phone,city,country FROM sakila.customer_list where country=? order by id asc; ";
		try {
			List<Customers> rs = sqlDao.selectForEachList(sql,new Object[] {country} );
			request.setAttribute("selectCountry", rs);
			RequestDispatcher disp = request.getRequestDispatcher("/member/selectvenderresult.jsp");
			disp.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
