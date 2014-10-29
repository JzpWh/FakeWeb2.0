<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
        <base href="<%=basePath%>">
	<head>
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
		function getResearchMethod(){
			alert($("input:radio:checked").val());
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
			<input type="text" placeholder="Search here" /><button type="submit" class="tip-right" title="Search">
            
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
                   <a title="" href="login.html"><i class="icon icon-share-alt"></i>
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
                    <a href="ViewAdminInfo.html">
                    <i class="icon icon-home"></i>
                           <span>首页</span></a>
                </li>

				<li><a href="AlterAdminPwd.html">
                      <i class="icon icon-tint"></i> 
                      <span>修改密码</span></a>
                 </li>

                  <!--  start  -->
				<li class="submenu">
					<a href="#">
                    <i class="icon icon-th-list"></i> 
                           <span>管理员管理</span> 
                        <span class="label">3</span></a>
					<ul>
						<li><a href="BrowseAdmin.html">浏览管理员</a></li>
						<li><a href="AddAdmin.html">添加管理员</a></li>
						<li><a href="ResearchAdmin.html">查找管理员</a></li>
					</ul>
				</li>
                <!--  stop-->
                 <!--  start  -->
				<li class="submenu open">
					<a href="#">
                      <i class="icon icon-tint"></i> 
                      <span>理发店管理</span>
                      <span class="label">4</span></a>
                 			<ul>
						<li><s:a href="admin/barbershop_browseBarberShop.action">浏览理发店</s:a></li>
						<li><s:a href="barbershop/addBarberShop.jsp">添加理发店</s:a></li>
						<li><s:a href="barbershop/researchBarberShop.jsp">查找理发店</s:a></li>
						<li><s:a href="admin/barbershop_auditBarberShop.action">审核理发店</s:a></li>
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
						<li><a href="BrowseBarber.html">浏览发型师</a></li>
						<li><a href="ResearchBarber.html">查找发型师</a></li>
					</ul>
                </li>

                <li class="submenu">
                	<a href="#">
                        <i class="icon icon-pencil"></i> 
                        <span>消费者管理</span>
                        <span class="label">2</span></a>
                     <ul>
						<li><a href="BrowseCustomer">浏览消费者</a></li>
						<li><a href="ResearchCustomer">查找消费者</a></li>
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
						<li><a href="BrowseTopic.html">浏览话题</a></li>
						<li><a href="ResearchTopic.html">查找话题</a></li>
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
						<li><a href="BrowseBeGoodAtHair.html">浏览擅长发型</a></li>
						<li><a href="AddBeGoodAtHair.html">添加擅长发型</a></li>
					</ul>
				</li>
                  <!--  stop-->
                  <!--  start  -->
                
				<li>
					<a href="BrowseHairdo.html">
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
						<li><a href="BrowseOperation.html">浏览数量统计</a></li>
						<li><a href="HourPeriod.html">时时段分析</a></li>
						<li><a href="DayPeriod.html">日时段分析</a></li>
						<li><a href="MonthPeriod.html">月时段分析</a></li>
						<li><a href="BarberShopInterview.html">理发店访问客户端分析</a></li>
						<li><a href="BarberInterview.html">发型师访问客户端分析</a></li>
						<li><a href="CustomerInterview.html">顾客访问客户端分析</a></li>
						<li><a href="AdminInterview.html">管理员访问客户端分析</a></li>
					</ul>
				</li>
			</ul>
		
		</div>
          <!--  左侧竖直的导航栏 stop -->
		<!--  右侧改变界面颜色start-->
		<div id="style-switcher">
			<i class="icon-arrow-left icon-white"></i>
			<span>风格:</span>
			<a href="#grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
			<a href="#blue" style="background-color: #2D2F57;border-color: #aaaaaa;"></a>
			<a href="#red" style="background-color: #673232;border-color: #aaaaaa;"></a>
		</div>
		<!--  右侧改变界面颜色stop-->
		
        
        <!--  内容区start-->
        
        <div id="content">
			<div id="content-header">
				<h1>查找理发店</h1>
                  <!-- 右上角第二排四个按钮-->
				<div class="btn-group">
					<a class="btn btn-large tip-bottom" title="Manage Files"><i class="icon-file"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Users"><i class="icon-user"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Comments"><i class="icon-comment"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Orders"><i class="icon-shopping-cart"></i></a>
				</div>
                <!-- 右上角第二排四个按钮stop-->
			</div>
            <!--  content-header-->
            
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> 首页</a>
				<a href="#" class="current">理发店管理</a>
                <a href="#" class="current">查找理发店</a>
			</div>
            <!--  面包屑导航stop-->
            
			<div class="container-fluid">
				  <!--  四个方格start-->	
               
                
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>查找理发店</h5>
							</div>
							<div class="widget-content nopadding">
									<form class="form-horizontal" method="post" action="#" name="basic_validate" id="basic_validate" />
                                       <div class="control-group" id="control-two">
                              
                                      <label class="radio"><span style="margin-left:30px;">查找方式：</span>
                                                 <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                                                       理发店名称
                                      </label>
                                        <label class="radio" style="margin-left:10px;">
                                           <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> 理发店地址
                                               
                                        </label>
                                   
                                       
                                    </div>
                                    </form>
                                    <hr>
                               
									<form class="form-search" method="post" action="#" name="basic_validate" id="basic_validate" novalidate>
                                         <div class="control-group" id="control-one">
                                          <input type="hidden" name="research" value="">
                                          <input type="text" class="input-medium search-query">
                                          <button type="submit" class="btn btn-primary" onClick="getResearchMethod()">查找</button>
                                          </div>
                                      </form>

                                    <div class="form-actions">
                                        <table class="table">
                                           <thead>
                                              <tr>
                                                 <th>店铺名称</th>
                                                 <th>联系电话</th>
                                                 <th>店长手机</th>
                                                 <th>地址</th>
                                                 <th>是否查看</th>
                                                 <th>是否删除</th>
                                              </tr>
                                           
                                           </thead>
                                        <tbody>
                                           <tr class="success">
                                               <td>港仔</td>
                                               <td>0536534215</td>
                                               <td>18369189000</td>
                                               <td>山东大学（威海）</td>
                                               <td><a href="#" class="tip-top" data-original-title="Update"><i class="icon-ok"></i></a></td>
                                                <td class="taskOptions"> 
                                                   <a href="" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a>
                                                </td>

                                           </tr>
                                         <tr class="warning">
                                                <td>港仔</td>
                                               <td>0536534215</td>
                                               <td>18369189000</td>
                                               <td>山东大学（威海）</td>
                                               <td><a href="#" class="tip-top" data-original-title="Update"><i class="icon-ok"></i></a></td>
                                               <td class="taskOptions"> 
                                                  <a href="" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a>
                                               </td>
                                           </tr> <tr class="error">
                                              <td>港仔</td>
                                               <td>0536534215</td>
                                               <td>18369189000</td>
                                               <td>山东大学（威海）</td>
                                               <td><a href="#" class="tip-top" data-original-title="Update"><i class="icon-ok"></i></a></td>
                                                <td class="taskOptions"> <a href="" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a></td>
                                           </tr> 
                                           <tr class="info">
                                               <td>港仔</td>
                                               <td>0536534215</td>
                                               <td>18369189000</td>
                                               <td>山东大学（威海）</td>
                                               <td><a href="#" class="tip-top" data-original-title="Update"><i class="icon-ok"></i></a></td>
                                                <td class="taskOptions"> <a href="" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a></td>
                                           </tr>
                                        </tbody>
                                        </table>
                                
                                        
                                    </div>
                                
                                
                                
							</div>
						</div>	
                        			
					</div>
				</div><!-- row-fluid  stop-->
                

                <!-- ********************** 这里加内容 *******************-->
                
			<!--  row-fluid stop-->
                <!--  Calendar start-->
				
                 <!--  Calendar stop-->
				<div class="row-fluid">
					<div id="footer" class="span12">
						2014 &copy;  <a href="www.ifkvip.com">发客</a>
					</div>
				</div>
                 <!--  footer stop-->
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