package congye6.HotelBooking.tag;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
/**
 * 自定义标签，用于在jsp模板中重写指定的占位内容
 * 
 * 基本原理：
 * 将override的值设置到request中
 * 在block占位标签将override的值读取出来
 * 
 * 主体是模板jsp
 * 
 * @author 逆风之羽
 *
 */
public class OverrideTag extends BodyTagSupport {
	private static final long serialVersionUID = 5901780136314677968L;
	//模块名的前缀
	public static final String PREFIX = "JspTemplateBlockName_";
	//模块名
	private String name;
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doStartTag();
	}
	@Override
	public int doEndTag() throws JspException {
		ServletRequest request = pageContext.getRequest();
		//标签内容
		BodyContent bodyContent = getBodyContent();
		if(bodyContent==null){
			request.setAttribute(PREFIX+name,"");
		}else{
			request.setAttribute(PREFIX+name,  bodyContent.getString());
		}
				
		// TODO Auto-generated method stub
		return super.doEndTag();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}