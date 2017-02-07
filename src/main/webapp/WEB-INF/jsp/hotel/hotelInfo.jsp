<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@taglib uri="/congye6"  prefix="congye6"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<congye6:override name="title">${hotel.name}</congye6:override>

<congye6:override name="main">
	<div class="row">
		<div class="col-md-12">
			<h2>名称:${hotel.name}<br/></h2>
			<h2>星级:${hotel.star}<br/></h2>
			<h2>城市:${hotel.city}<br/></h2>
			<h2>商圈:${hotel.circle}<br/></h2>
			<h2>地址:${hotel.address}<br/></h2>
			<h2>简介:${hotel.introduction}<br/></h2>
		</div>
	
	</div>
	
	<div class="row mt">
		<div class="col-lg-12">
                <div class="content-panel">
                <h4><i class="fa fa-angle-right"></i> 房间价格表</h4>
                    <section id="unseen">
                      <table class="table table-bordered table-striped table-condensed" id="room">
                        <thead>
                        <tr>
                            <th>房间类型</th>
                            <th class="numeric">剩余数量</th>
                            <th class="numeric">价格</th>
                        
                        </tr>
                        </thead>
                        <tbody>
                        	<c:forEach items="${rooms}" var="room">
                        		<tr>
                        			<td>${room.type}</td>
                        			<td>${room.number}</td>
                        			<td>${room.price}</td>
                        			<td onclick="book(${room.type},${room.id})">预订</td>
                        		</tr>
                        	</c:forEach>
                        
                        </tbody>
                    </table>
                    </section>
            </div><!-- /content-panel -->
         </div><!-- /col-lg-4 -->			
	</div><!-- /row -->
	
	<div class="row mt">
		<div class="col-lg-12">
                <div class="content-panel">
                <h4><i class="fa fa-angle-right"></i> 评价</h4>
                    <section id="unseen">
                      <table class="table table-bordered table-striped table-condensed" id="comment">
                        <thead>
                        <tr>
                            <th class="numeric">评论人</th>
                            <th class="numeric">评分</th>
                            <th >评论</th>
                        
                        </tr>
                        </thead>
                        <tbody>
                        	<c:forEach items="${comments}" var="comment">
                        		<tr>
                        			<td>${comment.userId}</td>
                        			<td>${comment.score}</td>
                        			<td>${comment.comment}</td>
                        		</tr>
                        	</c:forEach>
                        
                        </tbody>
                    </table>
                    </section>
            </div><!-- /content-panel -->
         </div><!-- /col-lg-4 -->			
	</div><!-- /row -->

</congye6:override>



<jsp:include page="/WEB-INF/jsp/client/clientTemplate.jsp"></jsp:include>