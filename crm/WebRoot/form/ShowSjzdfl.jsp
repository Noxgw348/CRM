<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
    <title>显示字典信息</title>
</head>
 <body>
<form action="updateSjzdfl.action" method="post">
<center><img src="image/user.gif"><font size="2">录入数据字典分类</font></center>
	<table align="center" border="1" cellspacing="0">
		<tr bgcolor="#666666" height="27">
			<td align="center"><font color="#FFFFFF" size="2">序号</font></td>
			<td align="center"><font color="#FFFFFF" size="2">启用</font></td>
			<td align="center"><font color="#FFFFFF" size="2">选项</font></td>
		</tr>
		<!-- 将 数据分类id 传过去  也将数据分类信息ids传过去-->
		<s:iterator value="#request.allSjzdfl" id="sjzdfl">
			<tr bgcolor="#E3E3E3">
				<td align="center"><s:property value="#sjzdfl.sjzdflid"/></td>
				<s:hidden name="sjzdflids" value="%{#sjzdfl.sjzdflid}"></s:hidden>
				<td align="center"><input type="checkbox" checked="checked"/></td>
				<td align="center"><input type="text" name="sjzdflmcs" value='<s:property value="#sjzdfl.sjzdflmc"/>'/></td>
				<td align="center"><a href='delSjzdfl.action?id=%{#sjzdfl.sjzdflid}'>删除</a></td>
			</tr>
		</s:iterator>
	</table><br>
	<center><input type="submit" value="提交">  </center>
</form>
</body>
</html>
