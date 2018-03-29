<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>

<tiles:insertDefinition name="myapp.homepage" flush="true">
    <tiles:putAttribute name="body">
        <div class="jumbotron">
            <div class="container">
                <h1>Hello, guests!</h1>
                <p>...</p>
                <p><a class="btn btn-primary btn-lg" href="#" role="button">Nothing more</a></p>
            </div>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>