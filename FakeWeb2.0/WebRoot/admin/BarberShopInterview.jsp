<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>发客系统管理平台</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link rel="stylesheet" href="../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="../css/uniform.css" />
		<link rel="stylesheet" href="../css/select2.css" />		
		<link rel="stylesheet" href="../css/unicorn.main.css" />
		<link rel="stylesheet" href="../css/unicorn.grey.css" class="skin-color" />	
    
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
                   <a title="" href="admin_logout.action"><i class="icon icon-share-alt"></i>
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
                    <a href="index.jsp">
                    <i class="icon icon-home"></i>
                           <span>首页</span></a>
                </li>

                <li><a href="AlterAdminPwd.jsp">
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
                        <li><a href="BrowseAdmin.jsp">浏览管理员</a></li>
                        <li><a href="AddAdmin.jsp">添加管理员</a></li>
                        <li><a href="ResearchAdmin.jsp">查找管理员</a></li>
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
                        <li><a href="BrowseBarberShop.jsp">浏览理发店</a></li>
                        <li><a href="AddBarberShop.jsp">添加理发店</a></li>
                        <li><a href="ResearchBarberShop.jsp">查找理发店</a></li>
                        <li><a href="AuditBarberShop.jsp">审核理发店</a></li>
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
                        <li><a href="BrowseBarber.jsp">浏览发型师</a></li>
                        <li><a href="ResearchBarber.jsp">查找发型师</a></li>
                    </ul>
                </li>

                <li class="submenu">
                    <a href="#">
                        <i class="icon icon-pencil"></i> 
                        <span>消费者管理</span>
                        <span class="label">2</span></a>
                     <ul>
                        <li><a href="BrowseCustomer.jsp">浏览消费者</a></li>
                        <li><a href="ResearchCustomer.jsp">查找消费者</a></li>
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
                        <li><a href="BrowseTopic.jsp">浏览话题</a></li>
                        <li><a href="ResearchTopic.jsp">查找话题</a></li>
                    </ul>
                </li>
                <!--  stop-->
                <!--  start  -->
                <li class="submenu">
                    <a href="#">
                        <i class="icon icon-file"></i> 
                        <span>最擅长发型管理</span> 
                        <span class="label">2</span></a>
                    <ul>
                        <li><a href="BrowseBeGoodAtHair.jsp">浏览擅长发型</a></li>
                        <li><a href="AddBeGoodAtHair.jsp">添加擅长发型</a></li>
                    </ul>
                </li>
                  <!--  stop-->
                  <!--  start  -->
                
                <li>
                    <a href="BrowseHairdo.jsp">
                        <i class="icon icon-signal"></i> 
                        <span>浏览发现页图片</span></a>
                </li>
                 <!--  stop-->
                  <!--  start  -->
                <li class="submenu open">
                    <a href="#">
                        <i class="icon icon-inbox"></i> 
                        <span>统计</span>
                        <span class="label">8</span></a>
                    <ul>
                        <li><a href="BrowseOperation.jsp">浏览数量统计</a></li>
                        <li><a href="HourPeriod.jsp">时时段分析</a></li>
                        <li><a href="DayPeriod.jsp">日时段分析</a></li>
                        <li><a href="MonthPeriod.jsp">月时段分析</a></li>
                        <li class="active"><a href="BarberShopInterview.jsp">理发店访问客户端分析</a></li>
                        <li><a href="BarberInterview.jsp">发型师访问客户端分析</a></li>
                        <li><a href="CustomerInterview.jsp">顾客访问客户端分析</a></li>
                        <li><a href="AdminInterview.jsp">管理员访问客户端分析</a></li>
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
                <h1>理发店访问客户端分析</h1>
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
                <a href="ViewAdminInfo.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> 首页</a>
                <a href="#" class="current">统计</a>
                 <a href="#" class="current">理发店访问客户端分析</a>
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
                                <h5>理发店访问客户端分析</h5>
                            </div>
                           <div class="widget-content nopadding">
                                    <table class="table table-bordered data-table">
                                        <thead>
                                        <tr >
                                            <th >理发店名称</th>
                                            <th>访问源url</th>
                                            <th>受访url</th>
                                            <th>访问时间</th>
                                           
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr class="gradeX" >
                                        <td>港仔</td>
                                        <td>http://www.baidu.com</td>
                                        
                                        <td>http://www.baidu.com</td>
                                        <td>11.11</td>
                                       

                                        </tr>
                                        <tr class="gradeC">
                                       <td>港仔</td>
                                        <td>http://www.baidu.com</td>
                                        
                                        <td>http://www.baidu.com</td>
                                        <td>11.11</td>

                                        </tr>
                                        <tr class="gradeA">
                                      <td>港仔</td>
                                        <td>http://www.baidu.com</td>
                                        
                                        <td>http://www.baidu.com</td>
                                        <td>11.11</td>

                                        </tr>
                                        <tr class="gradeA">
                                     <td>港仔</td>
                                        <td>http://www.baidu.com</td>
                                        
                                        <td>http://www.baidu.com</td>
                                        <td>11.11</td>
                                        </tr>
                                      
                                        <tr class="gradeU">
                                      <td>港仔</td>
                                        <td>http://www.baidu.com</td>
                                        
                                        <td>http://www.baidu.com</td>
                                        <td>11.11</td>

                                        </tr>
                                        </tbody>
                                        </table>  
                                </div>
                        </div>  
                                    
                    </div>
                </div><!-- row-fluid  stop-->
                

                
                <div class="row-fluid">
                    <div id="footer" class="span12">
                        2014 &copy;  <a href="http://www.ifkvip.com">发客</a>
                    </div>
                </div>
                 <!--  footer stop-->
            </div>
        </div>
        

           <script src="../js/jquery.min.js"></script>
            <script src="../js/jquery.ui.custom.js"></script>
            <script src="../js/bootstrap.min.js"></script>
            <script src="../js/jquery.uniform.js"></script>
            <script src="../js/select2.min.js"></script>
            <script src="../js/jquery.dataTables.min.js"></script>
            <script src="../js/unicorn.js"></script>
            <script src="../js/unicorn.tables.js"></script>
    </body>
</html>
