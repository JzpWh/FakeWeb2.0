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
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
       <link rel="stylesheet" href="../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="../css/unicorn.main.css" />
		<link rel="stylesheet" href="../css/unicorn.grey.css" class="skin-color" />
      <link rel="stylesheet" href="../css/main.css" />
        
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
                <li class="submenu">
                    <a href="#">
                      <i class="icon icon-tint"></i> 
                      <span>�������</span>
                      <span class="label">4</span></a>
                    <ul>
                        <li><a href="BrowseBarberShop.jsp">�������</a></li>
                        <li><a href="AddBarberShop.jsp">�������</a></li>
                        <li><a href="ResearchBarberShop.jsp">��������</a></li>
                        <li><a href="AuditBarberShop.jsp">�������</a></li>
                    </ul>

                 </li>
               
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
                        <li><a href="BrowseCustomer.jsp">���������</a></li>
                        <li><a href="ResearchCustomer.jsp">����������</a></li>
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
                        <span class="label">2</span></a>
                    <ul>
                        <li><a href="BrowseBeGoodAtHair.jsp">����ó�����</a></li>
                        <li><a href="AddBeGoodAtHair.jsp">����ó�����</a></li>
                    </ul>
                </li>
                  <!--  stop-->
                  <!--  start  -->
                
                <li class="active">
                    <a href="BrowseHairdo.jsp">
                        <i class="icon icon-signal"></i> 
                        <span>��˷���ҳͼƬ</span></a>
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
                <h1>�������ҳͼƬ</h1>
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
                <a href="ViewAdminInfo.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> ��ҳ</a>
                <a href="#" class="current">�������ҳͼƬ</a>
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
                                <h5>�������ҳͼƬ</h5>
                            </div>
                            <div class="widget-content nopadding">
                                    <ul class="thumbnails">
									<li class="span5">
										
											     <div id="pictures1" class="pic1">
                                                 
                                                    <img src="../images/picture1.png" alt="" />
                                                    <img src="../images/picture2.png" alt="" />
                                                    <img src="../images/picture3.png" alt="" />
                                                    <img src="../images/picture4.png" alt="" />
                                                    <img src="../images/picture5.png" alt="" />
                                                             
                                                  </div>
                                                  
                                                    <div id="prev2" class="btn btn-primary" >
                                                    <a href="#previous" style="color:#FFF;">��һҳ</a>
                                                    
                                                  </div>
                                                  <div  style="display:inline; margin-left:34px; margin-top:50px;">
                                                 <a title="" href="#" style="background-color: #000000; " ><i class="icon-remove icon-white" ></i></a> 
                                                 &nbsp;&nbsp;
                                                 <a title="" href="#" style="background-color: #000000;" ><i class="icon-ok icon-white"></i></a>                                                    </div>
                                                  <div id="next2" class="btn btn-primary">
                                                    <a href="#next" style="color:#FFF;">��һҳ </a>
                                                  </div>    
									</li>
                                    
                                    <li class="span5">
										
											     <div id="pictures2" class="pic2">
                                                
                                                    <img src="../images/picture1.png" alt="" />
                                                    <img src="../images/picture2.png" alt="" />
                                                    <img src="../images/picture3.png" alt="" />
                                                    <img src="../images/picture4.png" alt="" />
                                                    <img src="../images/picture5.png" alt="" />
                                                             
                                                  </div>
                                                  
                                                  <div id="prev2" class="btn btn-primary" >
                                                    <a href="#previous" style="color:#FFF;">��һҳ</a>
                                                    
                                                  </div>
                                                  <div  style="display:inline; margin-left:34px; margin-top:50px;">
                                                 <a title="" href="#" style="background-color: #000000; " ><i class="icon-remove icon-white" ></i></a> 
                                                 &nbsp;&nbsp;
                                                 <a title="" href="#" style="background-color: #000000;" ><i class="icon-ok icon-white"></i></a>                                                    </div>
                                                  <div id="next2" class="btn btn-primary">
                                                    <a href="#next" style="color:#FFF;">��һҳ </a>
                                                  </div>    
                                                  
									</li>
                                   
								</ul>
				                
                            </div>
                        </div>  
                                    
                    </div>
                </div><!-- row-fluid  stop-->
                

                <div class="row-fluid">
                    <div id="footer" class="span12">
                        2014 &copy;  <a href="http://www.ifkvip.com">����</a>
                    </div>
                </div>
                 <!--  footer stop-->
            </div>
        </div>
        

            <script src="../js/jquery.min.js"></script>
            <script src="../js/jquery.ui.custom.js"></script>
            <script src="../js/bootstrap.min.js"></script>
            <script src="../js/unicorn.js"></script>
            <script src="../js/demo.js"></script>
           <script src="../js/demo1.js"></script>
            
    </body>
</html>
