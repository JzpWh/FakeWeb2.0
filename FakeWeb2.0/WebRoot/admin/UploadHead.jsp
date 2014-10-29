<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>图片剪裁</title>
<link href="javascript/jquery-ui-1.8.12.custom.css" rel="Stylesheet" type="text/css" />  
<script type="text/javascript" src="javascript/jquery.js"></script> 
<script type="text/javascript" src="javascript/jquery-ui-1.8.12.custom.min.js"></script> 
<script type="text/javascript" src="javascript/jquery.cropzoom.js"></script> 

<script type="text/javascript">

$(document).ready(function(){
          var cropzoom = $('#crop_container2').cropzoom({
            width:768,
            height:432,
            bgColor: '#CCC',
            enableRotation:false,
            enableZoom:false,
            zoomSteps:5,
            rotationSteps:10,
            selector:{        
              centered:true,
              w:150,
              h:200,
              borderColor:'blue',
              borderColorHover:'red',
			  showPositionsOnDrag: false,
              showDimetionsOnDrag: false
            },
            image:{
                source:'images/1534559.jpg',
                width:1280,
                height:720,
                minZoom:100,
                maxZoom:300,
	            startZoom:60,
//                 useStartZoomAsMinZoom:true,
                snapToContainer:true //图片 边界不能移出容器边界
            }
        });
        
       $('#crop').click(function(){ 
            cropzoom.send('crop.jsp','POST',{},function(rta){
                $('#result_image').find('img').remove();
                var img = $('<img />').attr('src',rta);
                $('#result_image').append(img);
            });
        });
        
});
       

</script>
</head>

<body>

<table border="2">
	<tr>
		<td align="center">图片</td><td align="center">预览</td>
	</tr>
	<tr>
		<td align="center"><div id="crop_container2"></div></td><td align="center"> <div id="result_image"></div></td>
	</tr>

</table>


   <div class="btn"> 
      <input type="button" class="btn" id="crop" value="剪切照片" /> 
   </div> 
</body>
</html>
