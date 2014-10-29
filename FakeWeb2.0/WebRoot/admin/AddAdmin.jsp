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
	<script language="javascript">
	var teipprim ="";
	//构造权限字符串
	function checkPrim(){
		for(var i=1;i<16;i++){
			var c = "0";
			var tempid = "prim"+i;
			if (document.getElementById(tempid).checked == true)
			{c = "1";
			teipprim = teipprim+c;
			}
		}
		
		if (teipprim!='000000000000000'){
			document.all.adprivileges.value = teipprim;		
		}else{
			document.all.adprivileges.value = "";
		}
	}
	
	function check(){
		if (document.all.name.value == ""){
            alert("对不起，管理员姓名不能为空!");
            return false;
		}
		if (document.all.number.value == ""){
            alert("对不起，手机号不能为空!");
            return false;
		}
		return true;
	}
	//还原权限列表
	function recoverPrim(temp){
		if (teipprim=='000000000000000'){
			document.all.adprivileges.value = "";	
			return;	
		}else{
			for (var i=0;i<15;i++){
				if (temp.substring(i,i+1)=="1")document.getElementById("prim"+(i+1)).checked = true;
			}			
		}	
	}
</script>
	
	</head>
	
	<body onLoad="setup('中国','北京','北京')">
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
                        <li class="active"><a href="admin/AddAdmin.jsp">添加管理员</a></li>
                        <li><a href="admin/ResearchAdmin.jsp">查找管理员</a></li>
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
                        <li><a href="admin/BrowseBarberShop.action">浏览理发店</a></li>
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
				<h1>添加管理员</h1>
				
			</div>
			<div id="breadcrumb">
				<a href="admin/index.jsp" title="前往首页" class="tip-bottom"><i class="icon-home"></i> 首页</a>
				<a href="#">管理员管理</a>
				<a href="#" class="current">添加管理员</a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>添加管理员</h5>
							</div>
							<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="admin/admin_addAdmin.action" name="basic_validate" id="basic_validate" onSubmit="checkPrim()">
                                    <div class="control-group">
                                        <label class="control-label">管理员姓名</label>
                                        <div class="controls">
                                            <input type="text" name="administratorName" id="name" />
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">性别</label>
                                        <div class="controls">
                                        	<select name="administratorSex" id="sex">
                                        	<option value='true'>男</option>
                                        	<option value='false'>女</option>
                                        	</select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">部门</label>
                                        <div class="controls">
                                        	<s:select name="administratorRight" list="#{'总经理':'总经理','技术部':'技术部','商家市场部':'商家市场部',
		  									  '消费者市场部':'消费者市场部','财务部':'财务部','广告部':'广告部'}" listKey="key" listValue="value">
                                        	</s:select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">所在城市</label>
                                        <div class="controls" >
                                            <select name="country" id="s1">
											<option>国家</option>
											</select>
											
											<select name="prov" id="s2">
											<option>省份</option>
											</select>
											
											<select name="city" id="s3">
											<option>地级市</option>
											</select>
             								</div>
                                        </div>
                                    
                                    <div class="control-group">
                                        <label class="control-label">手机号码</label>
                                        <div class="controls">
                                            <input type="text" name="administratorTelephone" id="number"/>
                                        </div>
                                    </div>
                                    <div class="control-group" id="control-two"> 
                                
                              			 <label class="control-label">设置管理员权限</label>
                              			 <div class="controls">          
                                        <label class="checkbox inline">   
                                          <input type="checkbox" id="prim1" value="prim1"/>全权
                                      	</label>
                                      	<label class="checkbox inline">
                                          <input type="checkbox" id="prim2" value="prim2"/>管理员管理
                                        </label>
                                        <label class="checkbox inline">
                                          <input type="checkbox" id="prim3" value="prim3"/>理发店和发型师管理
                                        </label>
                                        <label class="checkbox inline">
                                          <input type="checkbox" id="prim4" value="prim4"/>消费者和话题管理
                                        </label>
                                         <label class="checkbox inline">
                                          <input type="checkbox" id="prim5" value="prim5"/>消费者和话题管理
                                        </label>
                                         <label class="checkbox inline">
                                          <input type="checkbox" id="prim6" value="prim6"/>最擅长发型及发型秀管理
                                        </label>
                                        </div>
                                    </div>
                             
                                   <hr>
										<div class="form-actions">
										<input type="hidden" id="adprivileges" name="adprivileges" value=""/>
										<button type="submit" class="btn btn-primary" onClick="return check()">添加</button>
									</div>	
                                </form>
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
		    <s:if test="#request.adprivileges!=null && #request.adprivileges.length()>0">
			<script language="javascript">
			recoverPrim('${adprivileges}');
			</script>	
			</s:if>
            <script src="js/jquery.uniform.js"></script>
            <script src="js/select2.min.js"></script>
            <script src="js/jquery.validate.js"></script>      
            <script src="js/unicorn.form_validation.js"></script>
             <script src="js/jquery.min.js"></script>
            <script src="js/jquery.ui.custom.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/jquery.gritter.min.js"></script>
            <script src="js/jquery.peity.min.js"></script>
            <script src="js/unicorn.js"></script>
            <script src="js/unicorn.interface.js"></script>
            <script src="js/addadmin.js"></script>
    

	</body>
</html>
