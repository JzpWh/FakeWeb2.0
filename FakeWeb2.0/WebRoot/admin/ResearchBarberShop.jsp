<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<title>����ϵͳ����ƽ̨</title>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
       <link rel="stylesheet" href="../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="../css/uniform.css" />
		<link rel="stylesheet" href="../css/select2.css" />		
		<link rel="stylesheet" href="../css/unicorn.main.css" />
		<link rel="stylesheet" href="../css/unicorn.grey.css" class="skin-color" />	
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
    </head>
	<body>
		
		<!-- ͷ��-->
		<div id="header">
			<h1><a href="./dashboard.html">Fa.Ke </a></h1>		
		</div>
		<!-- ����-->
		<div id="search">
			<input type="text" placeholder="Search here" /><button type="submit" class="tip-right" title="Search">
            
            <i class="icon-search icon-white"></i>
            
            </button>
		</div>
        <!-- ���ҽ���-->
        
         <!-- �����Ҳ�ĵ�����-->
		<div id="user-nav" class="navbar navbar-inverse">
            <ul class="nav btn-group">
                <li class="btn btn-inverse"><a title="" href="#">
                <i class="icon icon-user"></i> 
                <span class="text">������</span>
                </a>
                </li>
                <!-- Messages-->
                <li class="btn btn-inverse dropdown" id="menu-messages">
                   <a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle">
                       <i class="icon icon-envelope"></i> 
                          <span class="text">��Ϣ</span> 
                             <span class="label label-important">5</span>
                            <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu"><!-- ����-->
                        <li><a class="sAdd" title="" href="#">message1</a></li>
                        <li><a class="sInbox" title="" href="#">message2</a></li>
                        <li><a class="sOutbox" title="" href="#">message3</a></li>
                        <li><a class="sTrash" title="" href="#">message4</a></li>
                    </ul>
                </li>
                <!-- Messages ����-->
                
                <!-- Settings-->
                <li class="btn btn-inverse">
                   <a title="" href="#"><i class="icon icon-cog"></i> <span class="text">����</span>
                   </a>
                 </li>
                 <!-- Settings ����-->
                 <!-- ע��-->
                <li class="btn btn-inverse">
                   <a title="" href="admin_logout.action"><i class="icon icon-share-alt"></i>
                       <span class="text">ע��</span>
                   </a>
                </li>
                <!-- ע�� ����-->
            </ul>
        </div>
            <!-- �����Ҳ�ĵ����� ����-->
            
            <!--  �����ֱ�ĵ�����  -->
		<div id="sidebar">
			<!--<a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashbo</a> -->
            
			<ul>
				<li>
                    <a href="index.jsp">
                    <i class="icon icon-home"></i>
                           <span>��ҳ</span></a>
                </li>

				<li><a href="AlterAdminPwd.jsp">
                      <i class="icon icon-tint"></i> 
                      <span>�޸�����</span></a>
                 </li>

                  <!--  start  -->
				<li class="submenu">
					<a href="#">
                    <i class="icon icon-th-list"></i> 
                           <span>����Ա����</span> 
                        <span class="label">3</span></a>
					<ul>
						<li><a href="BrowseAdmin.jsp">�������Ա</a></li>
						<li><a href="AddAdmin.jsp">��ӹ���Ա</a></li>
						<li><a href="ResearchAdmin.jsp">���ҹ���Ա</a></li>
					</ul>
				</li>
                <!--  stop-->
                 <!--  start  -->
				<li class="submenu open">
					<a href="#">
                      <i class="icon icon-tint"></i> 
                      <span>�������</span>
                      <span class="label">4</span></a>
                 	<ul>
						<li><a href="BrowseBarberShop.jsp">�������</a></li>
						<li><a href="AddBarberShop.jsp">�������</a></li>
						<li class="active"><a href="ResearchBarberShop.jsp">��������</a></li>
						<li><a href="AuditBarberShop.jsp">�������</a></li>
					</ul>

                 </li>
                 <!--  stop-->
                 <!--  start  -->
				
                <!--  stop-->
                 <!--  start  -->
				<li class="submenu">
					<a href="#">
                     <i class="icon icon-th"></i>
                     <span>����ʦ����</span>
                     <span class="label">2</span></a>
                   <ul>
						<li><a href="BrowseBarber.jsp">�������ʦ</a></li>
						<li><a href="ResearchBarber.jsp">���ҷ���ʦ</a></li>
					</ul>
                </li>

                <li class="submenu">
                	<a href="#">
                        <i class="icon icon-pencil"></i> 
                        <span>�����߹���</span>
                        <span class="label">2</span></a>
                     <ul>
						<li><a href="BrowseCustomer">���������</a></li>
						<li><a href="ResearchCustomer">����������</a></li>
					</ul>
                </li>

                
                <!--  stop-->
                 <!--  start  -->
				<li class="submenu">
					<a href="#">
                       <i class="icon icon-th-list"></i> 
                       <span>�������</span>
                       <span class="label">2</span></a>
                     <ul>
						<li><a href="BrowseTopic.jsp">�������</a></li>
						<li><a href="ResearchTopic.jsp">���һ���</a></li>
					</ul>
                </li>
                <!--  stop-->
                <!--  start  -->
				<li class="submenu">
					<a href="#">
						<i class="icon icon-file"></i> 
						<span>���ó����͹���</span> 
						<span class="label">4</span></a>
					<ul>
						<li><a href="BrowseBeGoodAtHair.jsp">����ó�����</a></li>
						<li><a href="AddBeGoodAtHair.jsp">����ó�����</a></li>
					</ul>
				</li>
                  <!--  stop-->
                  <!--  start  -->
                
				<li>
					<a href="BrowseHairdo.jsp">
						<i class="icon icon-signal"></i> 
						<span>�������ҳͼƬ</span></a>
				</li>
                 <!--  stop-->
                  <!--  start  -->
				<li class="submenu">
					<a href="#">
						<i class="icon icon-inbox"></i> 
						<span>ͳ��</span>
						<span class="label">8</span></a>
					<ul>
						<li><a href="BrowseOperation.jsp">�������ͳ��</a></li>
						<li><a href="HourPeriod.jsp">ʱʱ�η���</a></li>
						<li><a href="DayPeriod.jsp">��ʱ�η���</a></li>
						<li><a href="MonthPeriod.jsp">��ʱ�η���</a></li>
						<li><a href="BarberShopInterview.jsp">������ʿͻ��˷���</a></li>
						<li><a href="BarberInterview.jsp">����ʦ���ʿͻ��˷���</a></li>
						<li><a href="CustomerInterview.jsp">�˿ͷ��ʿͻ��˷���</a></li>
						<li><a href="AdminInterview.jsp">����Ա���ʿͻ��˷���</a></li>
					</ul>
				</li>
			</ul>
		
		</div>
          <!--  �����ֱ�ĵ����� stop -->
		<!--  �Ҳ�ı������ɫstart-->
		<div id="style-switcher">
			<i class="icon-arrow-left icon-white"></i>
			<span>���:</span>
			<a href="#grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
			<a href="#blue" style="background-color: #2D2F57;border-color: #aaaaaa;"></a>
			<a href="#red" style="background-color: #673232;border-color: #aaaaaa;"></a>
		</div>
		<!--  �Ҳ�ı������ɫstop-->
		
        
        <!--  ������start-->
        
        <div id="content">
			<div id="content-header">
				<h1>��������</h1>
                  <!-- ���Ͻǵڶ����ĸ���ť-->
				<div class="btn-group">
					<a class="btn btn-large tip-bottom" title="Manage Files"><i class="icon-file"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Users"><i class="icon-user"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Comments"><i class="icon-comment"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Orders"><i class="icon-shopping-cart"></i></a>
				</div>
                <!-- ���Ͻǵڶ����ĸ���ťstop-->
			</div>
            <!--  content-header-->
            
			<div id="breadcrumb">
				<a href="index.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> ��ҳ</a>
				<a href="#" class="current">�������</a>
                <a href="#" class="current">��������</a>
			</div>
            <!--  ���м����stop-->
            
			<div class="container-fluid">
				  <!--  �ĸ�����start-->	
               
                
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>��������</h5>
							</div>
							<div class="widget-content nopadding">
									<form class="form-horizontal" method="post" action="#" name="basic_validate" id="basic_validate" />
                                       <div class="control-group" id="control-two">
                              
                                        <label class="checkbox inline">   <span>���ҷ�ʽ��</span>
                                          <input type="checkbox" id="inlineCheckbox1" value="name"> ��������
                                            </label>
                                        <label class="checkbox inline">
                                          <input type="checkbox" id="inlineCheckbox2" value="address">�����ַ
                                        </label>
                                       
                                    </div>
                                    </form>
                                    <hr>
                               
									<form class="form-search" method="post" action="#" name="basic_validate" id="basic_validate" novalidate>
                                         <div class="control-group" id="control-one">
                                            <input type="text" class="input-medium search-query">
                                          <button type="submit" class="btn btn-primary">����</button>
                                          </div>
                                      </form>

                                    <div class="form-actions">
                                        <table class="table">
                                           <thead>
                                              <tr>
                                                 <th>��������</th>
                                                 <th>��ϵ�绰</th>
                                                 <th>�곤�ֻ�</th>
                                                 <th>��ַ</th>
                                                 <th>�Ƿ�鿴</th>
                                                 <th>�Ƿ�ɾ��</th>
                                              </tr>
                                           
                                           </thead>
                                        <tbody>
                                           <tr class="success">
                                               <td>����</td>
                                               <td>0536534215</td>
                                               <td>18369189000</td>
                                               <td>ɽ����ѧ��������</td>
                                               <td><a href="#" class="tip-top" data-original-title="Update"><i class="icon-ok"></i></a></td>
                                                <td class="taskOptions"> 
                                                   <a href="" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a>
                                                </td>

                                           </tr>
                                         <tr class="warning">
                                                <td>����</td>
                                               <td>0536534215</td>
                                               <td>18369189000</td>
                                               <td>ɽ����ѧ��������</td>
                                               <td><a href="#" class="tip-top" data-original-title="Update"><i class="icon-ok"></i></a></td>
                                               <td class="taskOptions"> 
                                                  <a href="" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a>
                                               </td>
                                           </tr> <tr class="error">
                                              <td>����</td>
                                               <td>0536534215</td>
                                               <td>18369189000</td>
                                               <td>ɽ����ѧ��������</td>
                                               <td><a href="#" class="tip-top" data-original-title="Update"><i class="icon-ok"></i></a></td>
                                                <td class="taskOptions"> <a href="" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a></td>
                                           </tr> 
                                           <tr class="info">
                                               <td>����</td>
                                               <td>0536534215</td>
                                               <td>18369189000</td>
                                               <td>ɽ����ѧ��������</td>
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
                

                <!-- ********************** ��������� *******************-->
                
			<!--  row-fluid stop-->
                <!--  Calendar start-->
				
                 <!--  Calendar stop-->
				<div class="row-fluid">
					<div id="footer" class="span12">
						2014 &copy;  <a href="www.ifkvip.com">����</a>
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
            <script src="../js/jquery.validate.js"></script>
            <script src="../js/unicorn.js"></script>
            <script src="../js/unicorn.form_validation.js"></script>
	</body>
</html>
