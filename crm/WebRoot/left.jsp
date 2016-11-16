<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>导航</title>
    <script type="text/javascript" src="JS/dtree.js"></script>
    <link type="text/css" href="css/dtree.css" rel="StyleSheet">
    <link type="text/css" href="css/leftStyle.css" rel="StyleSheet">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- dwr -->
	<script type="text/javascript" src="<%=basePath%>dwr/engine.js"></script>
	<script type="text/javascript" src="<%=basePath%>dwr/interface/SjzdflDAO.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <a href="javascript: d.openAll();">打开全部</a>|<a href="javascript: d.closeAll();">关闭全部</a>
    <script type="text/javascript">
    var sjzdflarr; 
    DWREngine.setAsync(false);
    SjzdflDAO.findAll(load);
    function load(data){
     	sjzdflarr=data;
    }
    
    d=new dTree('d');
    d.config.useCookies=false;
    d.config.useStatusText=true;//状态栏显示文本
    d.config.closeSameLevel=true;//关闭同一层次其他节点
    //root
    d.add(0,-1,"CRM系统");
    //一级导航
    d.add(1,0,"客户信息"); 
    d.add(2,0,"客户服务");
    d.add(3,0,"任务/日程");
    d.add(4,0,"项目管理");
    d.add(5,0,"系统管理");
    d.add(6,0,"数据字典");
    d.add(7,0,"消息提醒");
    //二级导航
    d.add(11,1,"客户");
    d.add(12,1,"联系人");
    
    d.add(21,2,"客户投诉");
    d.add(22,2,"投诉报表");
    
    d.add(31,3,"任务");
    d.add(32,3,"日程");
    
    
    d.add(41,4,"项目立项");
    d.add(42,4,"项目审批");
    d.add(43,4,"项目进程");
    d.add(44,4,"项目总结");
    d.add(45,4,"项目交易");
    
    d.add(51,5,"用户");
    d.add(52,5,"角色");
    
    d.add(61, 6, "数据字典分类","getSjzdfl.action","百度","main");
    for(var i=0;i<sjzdflarr.length;i++){
     if(sjzdflarr[i].sjzdflmc!=null&&sjzdflarr[i].sjzdflmc!=""){
     d.add(62+i,6,sjzdflarr[i].sjzdflmc);
     }
    }
    d.add(71,7,"短消息");
   
    document.write(d );
    </script>
  </body>
</html>
