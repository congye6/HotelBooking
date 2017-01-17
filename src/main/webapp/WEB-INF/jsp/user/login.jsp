<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>登录</title>
		<!-- Bootstrap core CSS -->
	    <link href="/HotelBooking/assets/css/bootstrap.css" rel="stylesheet">
	    <!--external css-->
	    <link href="/HotelBooking/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
	        
	    <!-- Custom styles for this template -->
	    <link href="/HotelBooking/assets/css/style.css" rel="stylesheet">
	    <link href="/HotelBooking/assets/css/style-responsive.css" rel="stylesheet">
		<link href="/HotelBooking/css/alert.css" rel="stylesheet">
	    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	    <!--[if lt IE 9]>
	      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	    <![endif]-->
	</head>
	<body>
		<!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->

	  <div id="login-page">
	  	<div class="container">
	  	
		      <div class="form-login" >
		        <h2 class="form-login-heading">sign in now</h2>
		        <div class="login-wrap">
		            <input type="text" id="id" class="form-control" placeholder="User ID" autofocus>
		            <br>
		            <input type="password" id="password" class="form-control" placeholder="Password">
		            <label class="checkbox">
		                <span class="pull-right">
		                    <a data-toggle="modal" href="login.html#myModal"> Forgot Password?</a>
		
		                </span>
		            </label>
		            <button class="btn btn-theme btn-block" onclick="login()"><i class="fa fa-lock"></i> SIGN IN</button>
		            <hr>
		            
		            <div class="login-social-link centered">
		            <p>or you can sign in via your social network</p>
		                <button class="btn btn-facebook" type="submit"><i class="fa fa-facebook"></i> Facebook</button>
		                <button class="btn btn-twitter" type="submit"><i class="fa fa-twitter"></i> Twitter</button>
		            </div>
		            <div class="registration">
		                Don't have an account yet?<br/>
		                <a class=""  data-toggle="modal" data-target="#registerModal">
		                    Create an account
		                </a>
		            </div>
		
		        </div>
		
		          <!-- Modal -->
		          <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
		                      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">Forgot Password ?</h4>
		                      </div>
		                      <div class="modal-body">
		                          <p>Enter your e-mail address below to reset your password.</p>
		                          <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix">
		
		                      </div>
		                      <div class="modal-footer">
		                          <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
		                          <button class="btn btn-theme" type="button">Submit</button>
		                      </div>
		                  </div>
		              </div>
		          </div>
		          <!-- modal -->
		          
		          <!-- Modal -->
		          <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="registerModal" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
		                      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">创建账号</h4>
		                      </div>
		                      <div class="modal-body">
		                          <p>用户名</p>
		                          <input type="text" id="name"   class="form-control placeholder-no-fix">
		                          <p>密码</p>
		                          <input type="password" id="password"   class="form-control placeholder-no-fix">
								  <p>手机号</p>
		                          <input type="text" id="phoneNumber"   class="form-control placeholder-no-fix">
		                          <p>合作企业</p>
		                          <input type="text" id="company"   class="form-control placeholder-no-fix">
		                          <p>生日</p>
		                          <input type="text" id="birthday"   class="form-control placeholder-no-fix">
		                      </div>
		                      <div class="modal-footer">
		                          <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
		                          <button class="btn btn-theme" type="button" onclick="register()">Submit</button>
		                      </div>
		                  </div>
		              </div>
		          </div>
		          <!-- modal -->
		
		      </div>	  	
	  	
	  	</div>
	  </div>

	    <!-- js placed at the end of the document so the pages load faster -->
	    <script src="/HotelBooking/assets/js/jquery.js"></script>
	    <script src="/HotelBooking/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="/HotelBooking/js/alert.js"></script>
	    <!--BACKSTRETCH-->
	    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
	    <script type="text/javascript" src="/HotelBooking/assets/js/jquery.backstretch.min.js"></script>
	    <script>
	        $.backstretch("/HotelBooking/assets/img/login-bg.jpg", {speed: 500});
	    </script>
			
	
	</body>
	
	<script type="text/javascript">
		function login(){
		    var id=$("input#id").val();
		    var password=$("input#password").val();
		    
		    if(id==""){
				zeroModal.alert("请输入id");
				return;
		    }
		    var pattern=/^[0-9]*$/;
		    if(!pattern.test(id)){
				zeroModal.alert("id只有数字哦");
				return;
		    }
		    
		    if(password==""){
				zeroModal.alert("请输入密码");
				return;
		    }
		    
		    $.ajax({
		            url: "/HotelBooking/login",
		            type : "post",
		            dateType:"json",
		            contentType:"application/json",
		            data : JSON.stringify({
		                'id' : id,
		              
		                'password':password
		            }),
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
		    
		    
		}
	
		function register(){
		    var name=$("input#name").val();
		    var password=$("input#password").val();
		    var phoneNumber=$("input#phoneNumber").val();
		    var birthday=$("input#birthday").val();
		    var company=$("input#company").val();
		   
		    if(name==""){
				zeroModal.alert("请输入用户名");
				return;
		    }
		    if(password==""){
				zeroModal.alert("请输入密码");
				return;
		    }
		    
		    var pattern=/^1[0-9]{10}$/;
		    if(phoneNumber!=""&&!pattern.test(phoneNumber)){
				zeroModal.alert("请输入正确的手机号");
				return;
		    }
	
		    
		    $.ajax({
	            url: "/HotelBooking/client",
	            type : "put",
	            dateType:"json",
	            contentType:"application/json",
	            data : JSON.stringify({
	                'name' : name,
	                'phoneNumber' : phoneNumber,
	                'birthday':birthday,
	                'company':company,
	                'password':password
	            }),
	            success : function(message){
	                if(message.success==false)
	                    zeroModal.error(message.message);
	                else{
	                    zeroModal.success("注册成功，您的id为"+message.message);
	                    location.reload();
	                    
	                }
	                
	                    
	            },
	           
	            error : function(data){
	                zeroModal.alert("系统错误");
	            }
	        })
		}
	</script>
</html>