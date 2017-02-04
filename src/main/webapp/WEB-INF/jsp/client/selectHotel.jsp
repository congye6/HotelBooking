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
   	
   	<div class="row mt">
   		<div class="col-lg-12">
   			
             <div class="form-inline" role="form">
                 <div class="form-group"> 
                     <input type="text" class="form-control" id="name" placeholder="名称">
                 </div>
                 <div class="form-group">
                     <input type="text" class="form-control" id="star" placeholder="星级">
                 </div>
                 <div class="form-group">
                     <input type="text" class="form-control" id="score" placeholder="评分">
                 </div>
                 
             </div>
             
             <div class="form-inline mt" role="form">
             	<!-- choose room -->
             	<select class="form-control">
				  <option>单人间</option>
				  <option>双人间</option>
				  <option>三人间</option>
				  <option>套房</option>
				  <option>总统套房</option>
				</select>
             
             	<div class="form-group"> 
                     <input type="text" class="form-control" id="number" placeholder="数量">
                 </div>
                 <div class="form-group">
                     <input type="text" class="form-control" id="high" placeholder="最高价">
                 </div>
                 <div class="form-group">
                     <input type="text" class="form-control" id="low" placeholder="最低价">
                 </div>
             	 <button class="btn btn-theme" id="selectHotel">筛选</button>
             </div>
   			
   		</div><!-- /col-lg-12 -->
   	</div><!-- /row -->
   	
   	
   	<div class="row mt">
		<div class="col-lg-12">
                <div class="content-panel">
                <h4><i class="fa fa-angle-right"></i> 合适的酒店</h4>
                    <section id="unseen">
                      <table class="table table-bordered table-striped table-condensed" id="hotel">
                        <thead>
                        <tr>
                            <th>酒店名称</th>
                            <th class="numeric">星级</th>
                            <th>地址</th>
                           
                            <th>城市</th>
                            <th>商圈</th>
                            <th>简介</th>
                        </tr>
                        </thead>
                    </table>
                    </section>
            </div><!-- /content-panel -->
         </div><!-- /col-lg-4 -->			
</div><!-- /row -->

</congye6:override>

<jsp:include page="/WEB-INF/jsp/client/clientTemplate.jsp"></jsp:include>

<script type="text/javascript">
	$(function(){
	    //将选项卡选中
	    $('li.mt > a').eq(0).addClass('active');
	})
	
	$("button#searchHotel").click(function(){
	    var city=$("input#city").val();
	    var circle=$("input#circle").val();
	    if(city==""||circle==""){
			zeroModal.alert("城市和商圈必填哦");
			return;
	    }
	    var url=getUrl(["/HotelBooking/hotel",city,circle]);
	    $.ajax({
           url: url,
           type : "get",
           contentType:"application/json",
           success : function(data){
               if(data.length==0)
        	   		zeroModal.alert("找不到酒店");
               attrs=["name","star","address","city","circle","introduction"];
               setTableContent(data, attrs, "hotel");
           },
           error : function(data){
               zeroModal.alert("系统错误");
           }
       });
	    
	  
	});
	
	$("button#selectHotel").click(function(){ 
	    var city=$("input#city").val();
	    var circle=$("input#circle").val();
	    if(city==""||circle==""){
			zeroModal.alert("城市和商圈必填哦");
			return;
	    }
	    
	    var name=$("input#name").val();
	    var star=$("input#star").val();
	    var score=$("input#score").val();
	    var low=$("input#low").val();
	    var high=$("input#high").val();
	    var number=$("input#number").val();
	    var roomType=$("select").val();
	    
	    if(name==""&&star==""&&score==""&&low==""&&high==""&&number==""){
			zeroModal.alert("还没输入筛选条件哦");
			return;
	    }
	    
	    $.ajax({
           url: "/HotelBooking/hotel",
           type : "get",
           dateType:"json",
           contentType:"application/json",
           data : JSON.stringify({
               'name' : name,
               'star' : star,
               'score': score,
               'low'  : low,
               'high' : high,
               'number':number,
               'roomType':roomType
           }),
           success : function(data){
               if(data.length==0)
        	   		zeroModal.alert("找不到酒店");
               attrs=["name","star","address","city","circle","introduction"];
               setTableContent(data, attrs, "hotel");
           },
           error : function(data){
               zeroModal.alert("系统错误");
           }
       });
	    
	    zeroModal.alert(roomType);
	 })
</script>