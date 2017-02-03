<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="/congye6"  prefix="congye6"%>


<congye6:override name="title">找酒店</congye6:override>

<congye6:override name="main">
	<!-- INLINE FORM ELELEMNTS -->
   	<div class="row mt">
   		<div class="col-lg-12">
   			
             <div class="form-inline" role="form">
                 <div class="form-group"> 
                     <input type="text" class="form-control" id="city" placeholder="城市">
                 </div>
                 <div class="form-group">
                     <input type="text" class="form-control" id="circle" placeholder="商圈">
                 </div>
                 <button class="btn btn-theme" id="searchHotel">搜索</button>
             </div>
   			
   		</div><!-- /col-lg-12 -->
   	</div><!-- /row -->

</congye6:override>

<jsp:include page="/WEB-INF/jsp/client/clientTemplate.jsp"></jsp:include>

<script type="text/javascript">
	$(function(){
	    //将选项卡选中
	    $('li.mt > a').eq(0).addClass('active');
	})
	
	$("button#searchHotel").click(function(){
	    alert("hh");
	    var city=$("input#city").val();
	    var circle=$("input#circle").val();
	    if(city==""||circle==""){
			zeroModal.alert("城市和商圈必填哦");
			return;
	    }
	    $.ajax({
           url: "/HotelBooking/hotel",
           type : "get",
           contentType:"application/json",
           success : function(message){
               if(message.success==false)
                   zeroModal.error(message.message);
               else{
                   zeroModal.success("登录成功");
  
                   location.reload();
               }
               
                   
           },
           error : function(data){
               zeroModal.alert("系统错误");
           }
       })
	    
	    
	
	});
</script>