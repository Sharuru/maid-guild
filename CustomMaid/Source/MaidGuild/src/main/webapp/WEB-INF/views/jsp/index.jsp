<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>MaidGuild API Test Panel</title>
    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    <link href="${coreCss}" rel="stylesheet"/>
</head>

<div class="jumbotron">
    <div class="container">
        <h1>${title}</h1>

        <p>
            <c:if test="${not empty msg}">
                ${msg}
            </c:if>
        </p>
    </div>
</div>
<div class="jumbotron">
    <div class="container">
        <div class="container">
            <p>接口 API 测试：</p>
            <input style="width:90%;" placeholder="请求路径…"/>
            <button style="width:9%;">POST</button>
        </div>
    </div>
</div>


<spring:url value="/resources/css/bootstrap.min.js" var="bootstrapJs"/>

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>

</body>
</html>