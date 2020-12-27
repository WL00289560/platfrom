package platfrom.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ChackCookies
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE
		}	,description = "≈Á√“Cookie¨Oß_•øΩT")
public class ChackCookies implements Filter {

  
    public ChackCookies() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest htprequest = (HttpServletRequest) request;
		HttpServletResponse htpresponse = (HttpServletResponse) response;
		Cookie[] cookie = htprequest.getCookies();
		boolean isVail = false;
		if(cookie == null) {
			htpresponse.sendRedirect("../login.jsp");
		}else {
			for(Cookie cookies : cookie) {
				if(cookies.getName().equals(".isck")) {
					isVail = true;
					break;
				}
			}
			if(isVail) {
				chain.doFilter(request, response);
			}else {
				htpresponse.sendRedirect("../login.jsp");
			}
			
		}
		
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
