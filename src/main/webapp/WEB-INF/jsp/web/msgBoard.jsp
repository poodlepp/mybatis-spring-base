<%--
  Created by IntelliJ IDEA.
  User: lipy-b
  Date: 2018/3/29
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>

<tiles:insertDefinition name="myapp.homepage" flush="true">
    <tiles:putAttribute name="body">
        <div class="container" style="width: 80%;margin: 30px auto;">
            <div class="row">
                <div class="col-lg-4">
                    <ul class="list-group">
                        <li class="list-group-item">
                            <span class="badge list-group-item-success">${msgList.size()}</span>
                            这里已经有很多评论啦！
                        </li>
                    </ul>
                </div>
            </div>


            <c:forEach items="${msgList}"  var="itrator" varStatus="itratorS">
                <div class="media">
                    <div class="media-left">
                        <img style="width: 50px;height: 50px;" class="media-object" src="${pageContext.request.contextPath}/img/user/user${itratorS.count%4}.jpg" alt="">
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading">${itrator.username}</h4>
                        <p>${itrator.msg}</p>
                        <p>
                            <%--<fmt:formatDate value="${itrator.createTime}"/>发表--%>
                        <fmt:formatDate value="${itrator.createTime}" pattern="yyyy-MM-dd　HH:mm:ss"/>

                        </p>
                        <hr>
                    </div>
                </div>
            </c:forEach>

            <div>
                <%--<button class="btn btn-success">留下点什么吧</button>--%>
                <button type="button" class="btn btn-success" data-toggle="modal" data-target="#exampleModal" data-whatever="lipy">留下点什么吧</button>
                <button class="btn btn-primary">查看更多</button>
            </div>
        </div>




        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="exampleModalLabel">New message</h4>
                    </div>
                    <div class="modal-body">
                        <form id="newMsg" action="${pageContext.request.contextPath}/web/haveNewMsg" method="post">
                            <div class="form-group">
                                <label for="recipient-name" class="control-label">留下你的大名:</label>
                                <input type="text" class="form-control" id="recipient-name" name="username">
                            </div>
                            <div class="form-group">
                                <label for="message-text" class="control-label">Message:</label>
                                <textarea class="form-control" id="message-text" name="msg"></textarea>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" id="newMsgSubmit">Send message</button>
                    </div>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/web/msgBoard.js"></script>
    </tiles:putAttribute>
</tiles:insertDefinition>
