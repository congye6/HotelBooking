<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@taglib uri="/congye6"  prefix="congye6"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<congye6:override name="title">订单</congye6:override>

<congye6:override name="main">
	<div class="row mt">
		<div class="col-md-12">
			<h2>酒店id:${order.hotelId}</h2>
			<h2>折扣价:${order.price}</h2>
			<button class="btn btn-theme" onclick="confirm()">确认预订</button>
		</div>
	</div>
	

</congye6:override>

<jsp:include page="/WEB-INF/jsp/client/clientTemplate.jsp"></jsp:include>

<script>
	function confirm(){
		alert('${order}');
		 $.ajax({
            url: "/HotelBooking/order",
            type : "put",
            dateType:"json",
            contentType:"application/json",
            data : '${order}',
            success : function(message){
                if(message.success==false)
                    zeroModal.error(message.message);
                else{
                    zeroModal.success("预订成功");
   
                    location.reload();
                }
                
                    
            },
           
            error : function(data){
                zeroModal.alert("系统错误");
            }
        })
	}

</script>