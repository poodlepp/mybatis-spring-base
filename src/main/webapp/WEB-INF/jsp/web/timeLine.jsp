<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<%--
  Created by IntelliJ IDEA.
  User: lipy-b
  Date: 2018/3/30
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<tiles:insertDefinition name="myapp.homepage" flush="true">
    <tiles:putAttribute name="body">

        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="VivaTimeline">
                        <dl>

                            <dt>May 2018</dt>

                            <dd class="pos-left clearfix">
                                <div class="circ"></div>
                                <div class="time">March 30</div>
                                <div class="events">
                                    <div class="events-header">add:留言板 and 技术概览</div>
                                    <div class="events-body">
                                        <div class="row">
                                            <div class="col-md-6 pull-left">
                                                <img class="events-object img-responsive img-rounded" src="${pageContext.request.contextPath}/img/board.jpg" />
                                            </div>
                                            <div class="events-desc">
                                                希望各位多多提意见！
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </dd>

                            <dd class="pos-right clearfix">
                                <div class="circ"></div>
                                <div class="time">March 30</div>
                                <div class="events">
                                    <div class="events-header">add:Apache Tiles</div>
                                    <div class="events-body">
                                        <div class="row">
                                            <div class="col-md-6 pull-left">
                                                <img class="events-object img-responsive img-rounded" src="${pageContext.request.contextPath}/img/timeLine/tiles.png" />
                                            </div>
                                            <div class="events-desc">
                                                使用Tiles 作为JSP布局框架！
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </dd>

                            <dt>February 2018</dt>
                        </dl>
                    </div>
                </div>
            </div>
        </div>

        <script src="${pageContext.request.contextPath}/js/web/timeLine.js"></script>
    </tiles:putAttribute>
</tiles:insertDefinition>