package platfrom.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class LinkToVenderJax implements Tag{
	private PageContext pageContext;
	private Tag parent;
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		String content = "<input type=\"button\" value=\"搜尋廠商資料頁面(分散式架構)\" onclick=\"location.href='http://localhost:8080/platfrom/member/venderselectjax.jsp'\">";
		try {
			out.print(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
		
	}

	@Override
	public void setParent(Tag parent) {
		this.parent = parent;
		
	}

}
