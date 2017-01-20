<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="/congye6"  prefix="congye6"%>


<congye6:override name="title">找酒店</congye6:override>


<jsp:include page="/WEB-INF/jsp/client/clientTemplate.jsp"></jsp:include>

<script type="text/javascript">
	$(function(){
	    //将选项卡选中
	    $('li.mt > a').eq(0).addClass('active');
	})
</script>