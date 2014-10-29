<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html> 
<html lang="en"> 
	<base href="<%=basePath %>">
    <head>
        <title>发客系统管理平台登录</title>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="css/unicorn.login.css" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
     <script language="javascript">
       function check(){
              if (document.all.loginName.value == ""){
                     alert("对不起，登录帐号不能为空!");
                     return false;
              }
              if (document.all.loginPwd.value == ""){
                     alert("对不起，登录密码不能为空!");
                     return false;
              }
              return true;
       }
  </script>
    </head>
    <body>
        <div id="logo">
            <img src="img/logo.png"/>
        </div>
        <div id="loginbox">            
            <s:form id="loginform" class="form-vertical" action="admin_login" onSubmit="return check()" >
				<p>欢迎登录发客系统管理平台</p>
                <div class="control-group">
                    <div class="controls">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-user"></i></span><input id="loginName" type="text" placeholder="请输入手机号或账户名"  name="loginName"/>
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-lock"></i></span><input  id="loginPwd" type="password" placeholder="请输入登入密码" name="loginPwd" />
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    <span class="pull-left"><a href="#" class="flip-link" id="to-recover">忘记密码？</a></span>
                    <span class="pull-right"><input type="submit" class="btn btn-inverse" value="登录" /></span>
                </div>
            </s:form>
            <s:form id="recoverform" action="#" class="form-vertical" >
				<p>正确填写您的邮箱地址，我们将会给您发送一封邮件，邮件指导您重置密码</p>
				<div class="control-group">
                    <div class="controls">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-envelope"></i></span><input type="text" placeholder="请输入您的邮箱地址" />
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    <span class="pull-left"><a href="#" class="flip-link" id="to-login">&lt; 返回登录</a></span>
                    <span class="pull-right"><input type="submit" class="btn btn-inverse" value="发送" /></span>
                </div>
            </s:form>
        </div>
        
        <script src="js/jquery.min.js"></script>  
        <script src="js/unicorn.login.js"></script> 
    </body>
</html>
