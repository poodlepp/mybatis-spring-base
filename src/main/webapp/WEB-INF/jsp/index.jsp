<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF8">
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common/index.css"/>
</head>
<body>
<div id="login">
    <h1>Login</h1>
    <form method="post" action="javascript:;">
        <input type="text" required="required" placeholder="用户名" name="u"></input>
        <input type="password" required="required" placeholder="密码" name="p"></input>
        <button id="submit" class="but" >登录</button>
    </form>
</div>
<p>
    服务器时间：<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/>
</p>

<script src="/js/plugin/jquery-3.1.1.min.js"></script>
<script src="/js/plugin/layui/layui.js"></script>
<script src="/js/common/common.js"></script>
<script >
    window.onload = function(){
        if(paramInit != undefined){
            paramInit();
        }
    }
    $("#submit").click(function () {
        layui.use('layer',function(){
            var layer = layui.layer;
            layer.msg('还没做呢，莫急莫急~~');
        })
    });

</script>
</body>
</html>