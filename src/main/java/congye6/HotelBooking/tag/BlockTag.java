package congye6.HotelBooking.tag;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.apache.commons.lang.StringUtils;

/**
 * 自定义标签，用于在Jsp模板中占位
 * 
 * @author 逆风之羽
 *
 */
public class BlockTag extends BodyTagSupport {
	/**
	 * 占位模块名称
	 */
	private String name;
	
	/**
	 * 标记是否保留父类的内容
	 */
	private String override;
	
	private static final long serialVersionUID = 1425068108614007667L;
	@Override
	public int doStartTag() throws JspException{
		return super.doStartTag();				
	}
	@Override
	public int doEndTag() throws JspException {
		ServletRequest request = pageContext.getRequest();
		
		boolean override=this.override!=null&&this.override.equals("true");
		
		//block标签中的默认值
		String defaultContent = (getBodyContent() == null)?"":getBodyContent().getString();		
		String bodyContent = (String) request.getAttribute(OverrideTag.PREFIX+ name);
		//如果页面没有重写该模块则显示默认内容
		if(override)
			bodyContent = StringUtils.isEmpty(bodyContent)?defaultContent:bodyContent;
		else
			bodyContent = StringUtils.isEmpty(bodyContent)?defaultContent:defaultContent+bodyContent;
		try {
			pageContext.getOut().write(bodyContent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	public String getOverride() {
		return override;
	}
	public void setOverride(String override) {
		this.override = override;
	}
}
