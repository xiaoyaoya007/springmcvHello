<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="/form.do">
    username:<input name="username"><br>
    password:<input type="password" name="password"><br>
    age:<input name="age"><br>
    sex:<input type="radio" name="sex" value="0">man<input type="radio" name="sex" value="1">female<br>
    爱好:<input type="checkbox" name="aihao" value="sing">sing
    <input type="checkbox" name="aihao" value="dance">dance
    <input type="checkbox" name="aihao" value="rap">rap<br>
    home:<select name="home">
                    <option>江西</option>
                    <option>福建</option>
                </select><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
