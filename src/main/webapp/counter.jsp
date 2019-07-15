<%--
  Created by IntelliJ IDEA.
  User: jiangxiaoyao
  Date: 2019/7/15
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
</script>
<html>
<head>
    <title>计算器</title>
</head>
<body>
<%--<form >--%>
<input type="number" id="number1" name="number1">
<select name="sign" id="sign">
    <option value="1">+</option>
    <option value="2">-</option>
    <option value="3">*</option>
    <option value="4">/</option>
</select>
<input type="number" id="number2" name="number2">
<input type="submit" value="=" onclick="x()">
<input name="result" id="result" value="">
<%--</form>--%>
</body>

</html>
<script>
    x = function () {
        var number1 = $("#number1").val();
        var number2 = $("#number2").val();
        var sign = $("#sign").val();
        $.post("counter.do", {
            number1: number1,
            number2: number2,
            sign: sign,
        }, function (data) {
            $("#result").val(data.result);
        }, 'json');
    }
</script>