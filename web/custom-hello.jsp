<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="custom-hello.css">
    <title>My hello</title>
</head>
<body>
    <h1> Custom hello </h1>
        <p>
        <%
            String sample = (String) request.getAttribute("sample");
            out.println(sample);
        %>
        </p>
</body>
</html>
