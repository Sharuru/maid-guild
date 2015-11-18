<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>MaidGuild API Test Panel</title>
    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
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
            <input style="width:90%;" id="reqPath" placeholder="请求路径…"/>
            <button style="width:9%;" id="testButton">POST</button>
        </div>
    </div>
</div>
<div class="jumbotron">
    <div class="container">
        <div class="container">
            <p>服务器返回结果：</p>
            <div style="word-wrap: break-word; word-break: normal;" id="servReturn"></div>
        </div>
    </div>
</div>


<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs"/>
<script src="/resources/js/jquery.min.js"></script>
<script src="${bootstrapJs}"></script>
<script type="text/javascript">
    $(document).ready(function() {
        $("#testButton").click(function(event) {
            askReturn();
        });
    });
    //AJAX 获取子页面的内容
    function askReturn() {
        $.ajax({
            cache: false,
            type : "GET",
            url : document.getElementById('reqPath').value,
            success : function(data) {
                document.getElementById('servReturn').innerText = JSON.stringify(data);
            },
            error:function(){
                document.getElementById('servReturn').innerText = 'Error';
            }

        });
    }
</script>
</body>
</html>