package platfrom.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;

public class IterationTag implements BodyTag{
	private PageContext pageContext;
	private BodyContent bodyContent;
	private int start = 1;
	private int counter = 0;
	
	@Override
	public int doAfterBody() throws JspException {
		JspWriter out = bodyContent.getEnclosingWriter();
		if(start <= counter) {
			
			String msg = String.format("<h3>迴圈設定總共要執行: %d 次,目前迴圈執行第: %s 次</h3>", counter , start);
			try {
				out.print(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			start++;
			return EVAL_BODY_AGAIN;
			
		}else {
			start=0;
			return EVAL_PAGE;
			
		}
	}	
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_BODY_BUFFERED;
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
	public void setParent(Tag t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doInitBody() throws JspException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBodyContent(BodyContent bodyContent) {
		this.bodyContent = bodyContent;
		
	}

}
