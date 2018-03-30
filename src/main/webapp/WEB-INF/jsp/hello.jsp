<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>

<tiles:insertDefinition name="myapp.homepage" flush="true">
    <tiles:putAttribute name="body">
        <div class="jumbotron" >
            <%--style="background-image:url(${pageContext.request.contextPath}/img/board.jpg);background-repeat:no-repeat;"--%>
            <div class="container col-md-1"></div>
            <div class="container col-md-6">
                <h2>Welcome to taste the MsgBoard!</h2>
                <p> </p>
                <p> </p>
                <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/web/msgBoard" role="button">Let's go!</a></p>
            </div>
                <div class="container">
                    <img style="height: 200px;" class="media-object" src="${pageContext.request.contextPath}/img/board.jpg" alt=""/>
                </div>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>