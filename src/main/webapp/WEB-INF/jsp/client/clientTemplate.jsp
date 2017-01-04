<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="/congye6"  prefix="congye6"%>


<congye6:override name="title">用户界面模板</congye6:override>

<congye6:override name="sidebar">
	<li class="mt">
       <a href="index.html">
           <i class="fa fa-dashboard"></i>
           <span>找酒店</span>
       </a>
   </li>
   
   <li class="mt">
       <a href="index.html">
           <i class="fa fa-dashboard"></i>
           <span>我的预订</span>
       </a>
   </li>
   
   <li class="mt">
       <a href="index.html">
           <i class="fa fa-dashboard"></i>
           <span>评价</span>
       </a>
   </li>

	<li class="sub-menu">
        <a href="javascript:;" >
            <i class="fa fa-desktop"></i>
            <span>历史订单</span>
        </a>
        <ul class="sub">
            <li><a  href="general.html">正常订单</a></li>
            <li><a  href="buttons.html">异常订单</a></li>
            <li><a  href="panels.html">撤销订单</a></li>
        </ul>
    </li>
    
    <li class="mt">
       <a href="index.html">
           <i class="fa fa-dashboard"></i>
           <span>住过的酒店</span>
       </a>
   </li>
   


</congye6:override>

<jsp:include page="/WEB-INF/jsp/template.jsp"></jsp:include>