<%--
  Created by IntelliJ IDEA.
  User: jiangxiaoyao
  Date: 2019/7/16
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Json</title>
</head>
<body>

</body>
</html>
<script>
    var str="{name:'lin'}";
    var obj =eval('('+str+")");
    alert(obj.name)
</script>