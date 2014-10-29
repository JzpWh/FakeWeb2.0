<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<base href="<%=basePath %>">
		<title>发客系统管理平台</title>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="css/uniform.css" />
		<link rel="stylesheet" href="css/select2.css" />		
		<link rel="stylesheet" href="css/unicorn.main.css" />
		<link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <style> 
	#control-two{
		margin-left:30px;
		margin-top:30px;
		
	
	
	
	}
	#control-one{
		margin-left:65px;
	}
    #control-two span{
		   color:#5476A6;
		   font-weight:bold;
		   
	   }
	.form-search button{
		margin-left:20px;
	}
		
	</style>
    <script type="text/javascript"> 
	function getID(){ 
		var oHID = $("#hid");
	    oHID.val($("input:radio:checked").val())//为隐藏域对象的value赋值 
	} 
	</script> 
    </head>
	<body>
		
	<!-- 头部-->
		<div id="header">
			<h1><a href="./dashboard.html">Fa.Ke </a></h1>		
		</div>
		<!-- 查找-->
		<div id="search">
			<input type="text" placeholder="请输入关键词" /><button type="submit" class="tip-right" title="搜索">
            
            <i class="icon-search icon-white"></i>
            
            </button>
		</div>
        <!-- 查找结束-->
        
         <!-- 顶部右侧的导航栏-->
		<div id="user-nav" class="navbar navbar-inverse">
            <ul class="nav btn-group">
                <li class="btn btn-inverse"><a title="" href="#">
                <i class="icon icon-user"></i> 
                <span class="text">人物简介</span>
                </a>
                </li>
                <!-- Messages-->
                <li class="btn btn-inverse dropdown" id="menu-messages">
                   <a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle">
                       <i class="icon icon-envelope"></i> 
                          <span class="text">消息</span> 
                             <span class="label label-important">5</span>
                            <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu"><!-- 下拉-->
                        <li><a class="sAdd" title="" href="#">message1</a></li>
                        <li><a class="sInbox" title="" href="#">message2</a></li>
                        <li><a class="sOutbox" title="" href="#">message3</a></li>
                        <li><a class="sTrash" title="" href="#">message4</a></li>
                    </ul>
                </li>
                <!-- Messages 结束-->
                
                <!-- Settings-->
                <li class="btn btn-inverse">
                   <a title="" href="#"><i class="icon icon-cog"></i> <span class="text">设置</span>
                   </a>
                 </li>
                 <!-- Settings 结束-->
                 <!-- 注销-->
                <li class="btn btn-inverse">
                   <a title="" href="admin/admin_logout.action"><i class="icon icon-share-alt"></i>
                       <span class="text">注销</span>
                   </a>
                </li>
                <!-- 注销 结束-->
            </ul>
        </div>
            <!-- 顶部右侧的导航栏 结束-->
            
            <!--  左侧竖直的导航栏  -->
<div id="sidebar">
            <!--<a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashbo</a> -->
            
            <ul>
                <li>
                    <a href="admin/index.jsp">
                    <i class="icon icon-home"></i>
                           <span>首页</span></a>
                </li>

                <li><a href="admin/AlterAdminPwd.jsp">
                      <i class="icon icon-tint"></i> 
                      <span>修改密码</span></a>
                 </li>

                  <!--  start  -->
                <li class="submenu open">
                    <a href="#">
                    <i class="icon icon-th-list"></i> 
                           <span>管理员管理</span> 
                        <span class="label">3</span></a>
                    <ul>
                        <li><a href="admin/admin_browseAdmin.action">浏览管理员</a></li>
                        <li><a href="admin/AddAdmin.jsp">添加管理员</a></li>
                        <li class="active"><a href="admin/ResearchAdmin.jsp">查找管理员</a></li>
                    </ul>
                </li>
                <!--  stop-->
                 <!--  start  -->
                <li class="submenu">
                    <a href="#">
                      <i class="icon icon-tint"></i> 
                      <span>理发店管理</span>
                      <span class="label">4</span></a>
                    <ul>
                        <li><a href="admin/BrowseBarberShop.jsp">浏览理发店</a></li>
                        <li><a href="admin/AddBarberShop.jsp">添加理发店</a></li>
                        <li><a href="admin/ResearchBarberShop.jsp">查找理发店</a></li>
                        <li><a href="admin/AuditBarberShop.jsp">审核理发店</a></li>
                    </ul>

                 </li>
                 <!--  stop-->
                 <!--  start  -->
                
                <!--  stop-->
                 <!--  start  -->
                <li class="submenu">
                    <a href="#">
                     <i class="icon icon-th"></i>
                     <span>发型师管理</span>
                     <span class="label">2</span></a>
                   <ul>
                        <li><a href="admin/BrowseBarber.jsp">浏览发型师</a></li>
                        <li><a href="admin/ResearchBarber.jsp">查找发型师</a></li>
                    </ul>
                </li>

                <li class="submenu">
                    <a href="#">
                        <i class="icon icon-pencil"></i> 
                        <span>消费者管理</span>
                        <span class="label">2</span></a>
                     <ul>
                        <li><a href="admin/BrowseCustomer.jsp">浏览消费者</a></li>
                        <li><a href="admin/ResearchCustomer.jsp">查找消费者</a></li>
                    </ul>
                </li>
                <!--  stop-->
                 <!--  start  -->
                <li class="submenu">
                    <a href="#">
                       <i class="icon icon-th-list"></i> 
                       <span>话题管理</span>
                       <span class="label">2</span></a>
                     <ul>
                        <li><a href="admin/BrowseTopic.jsp">浏览话题</a></li>
                        <li><a href="admin/ResearchTopic.jsp">查找话题</a></li>
                    </ul>
                </li>
                <!--  stop-->
                <!--  start  -->
                <li class="submenu">
                    <a href="#">
                        <i class="icon icon-file"></i> 
                        <span>最擅长发型管理</span> 
                        <span class="label">4</span></a>
                    <ul>
                        <li><a href="admin/BrowseBeGoodAtHair.jsp">浏览擅长发型</a></li>
                        <li><a href="admin/AddBeGoodAtHair.jsp">添加擅长发型</a></li>
                    </ul>
                </li>
                  <!--  stop-->
                  <!--  start  -->
                
                <li>
                    <a href="admin/BrowseHairdo.jsp">
                        <i class="icon icon-signal"></i> 
                        <span>浏览发现页图片</span></a>
                </li>
                 <!--  stop-->
                  <!--  start  -->
                <li class="submenu">
                    <a href="#">
                        <i class="icon icon-inbox"></i> 
                        <span>统计</span>
                        <span class="label">8</span></a>
                    <ul>
                        <li><a href="admin/BrowseOperation.jsp">浏览数量统计</a></li>
                        <li><a href="admin/HourPeriod.jsp">时时段分析</a></li>
                        <li><a href="admin/DayPeriod.jsp">日时段分析</a></li>
                        <li><a href="admin/MonthPeriod.jsp">月时段分析</a></li>
                        <li><a href="admin/BarberShopInterview.jsp">理发店访问客户端分析</a></li>
                        <li><a href="admin/BarberInterview.jsp">发型师访问客户端分析</a></li>
                        <li><a href="admin/CustomerInterview.jsp">顾客访问客户端分析</a></li>
                        <li><a href="admin/AdminInterview.jsp">管理员访问客户端分析</a></li>
                    </ul>
                </li>
            </ul>
        
        </div>
          <!--  左侧竖直的导航栏 stop -->
		<!--  右侧改变界面颜色start-->
		<div id="style-switcher">
			<i class="icon-arrow-left icon-white"></i>
			<span>风格:</span>
			<a href="#" id="grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
			<a href="#" id="blue" style="background-color: #2D2F57;border-color: #aaaaaa;"></a>
			<a href="#" id="red" style="background-color: #673232;border-color: #aaaaaa;"></a>
		</div>
		<!--  右侧改变界面颜色stop-->
		
		
		
		<div id="content">
			<div id="content-header">
				<h1>查找管理员</h1>
				
			</div>
			<div id="breadcrumb">
				<a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> 首页</a>
				<a href="#">管理员管理</a>
				<a href="#" class="current">查找管理员</a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>查找管理员</h5>
								
							</div>
							<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="#" name="basic_validate" id="basic_validate" >
                                    <div class="control-group" id="control-two"> 
                                
                                        <label class="radio"><span style="margin-left:30px;">查找方式：</span>
                                                 <input type="radio" name="optionsRadios" id="optionsRadios1" value="1" checked>
                                                       姓名
                                         </label>
                                    <label class="radio" style="margin-left:10px;">
                                       <input type="radio" name="optionsRadios" id="optionsRadios2" value="2">
                                             部门
                                    </label>
                                    <label class="radio"  style="margin-left:10px;">
                                       <input type="radio" name="optionsRadios" id="optionsRadios3" value="3">
                                             城市
                                    </label>
                                    </div>
                                    </form>
                                    <hr>
                               
									<form class="form-search" method="post" action="admin/admin_researchAdmin.action" name="basic_validate" id="basic_validate">
                                         <div class="control-group" id="control-one">
                                         	<input type="hidden" id="hid" value="" name="optionvalue"> 
                                            <input type="text" class="input-medium search-query" name="researchkey">
                                          <button type="submit" class="btn btn-primary" onClick="getID()">查找</button>
                                          </div>
                                      </form>

                                    <div class="form-actions">
                                        <table class="table">
                                           <thead>
                                              <tr>
                                              	 <th>序列号</th>
                                                 <th>姓名</th>
                                                 <th>性别</th>
                                                 <th>手机号</th>
                                                 <th>部门</th>
                                                 <th>所在城市</th>
                                              </tr>
                                           </thead>
                                        <tbody>
                                                <s:iterator value="#researchList" status="status">
                                        	<tr class="success">
	                                        <td><s:property value="#status.count"></s:property></td>
	                                        <td >${administratorName}</td>
	                                        <td ><s:if test="administratorSex">男</s:if><s:else>女</s:else></td>
	                                        <td>${administratorTelephone}</td>
	                                        <td >${administratorRight}</td>
	                                        <td>${administratorAddress}</td>
                                           </tr>
                                           </s:iterator> 
                                        </tbody>
                                        </table>    
                                    </div>
                                
							</div>
						</div>			
					</div>
				</div>
                
                        <div class="row-fluid">
                            <div id="footer" class="span12">
                                2014 &copy;  <a href="http://www.ifkvip.com">发客</a>

                            </div>
                        </div>
                
			</div>
		</div>
		
		
            
            <script src="js/jquery.min.js"></script>
            <script src="js/jquery.ui.custom.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/jquery.uniform.js"></script>
            <script src="js/select2.min.js"></script>
            <script src="js/jquery.validate.js"></script>
            <script src="js/unicorn.js"></script>
            <script src="js/unicorn.form_validation.js"></script>
	</body>
</html>
