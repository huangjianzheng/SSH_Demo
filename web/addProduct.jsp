<%--
  Created by IntelliJ IDEA.
  User: hjz
  Date: 2019-01-01
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>保存商品的页面</h1>
<s:form action="product_save" method="post" namespace="/" theme="simple">
    <table border="1" width="400">
        <tr>
            <td>商品名称：</td>
            <td><s:textfield name="pname"/></td>
        </tr>
        <tr>
            <td>商品价格：</td>
            <td><s:textfield name="price"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="添加"></td>
        </tr>
    </table>
</s:form>

</body>
</html>
