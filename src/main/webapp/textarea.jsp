<%--
  Created by IntelliJ IDEA.
  User: Phoenix
  Date: 2019/10/30
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false"  %>
<html>
<head>
    <title>Title</title>
    <script charset="utf-8" src="kindeditor/kindeditor-all.js"></script>
    <script charset="utf-8" src="kindeditor/kindeditor-all-min.js"></script>
    <script>
        KindEditor.ready(function(K) {
            window.editor = K.create('#editor_id',{
                width:"900",
                height:"300",
                allowFileManager: true,
                fileManagerJson: "/index.jsp"

            });

        });
    </script>
</head>
<body>
<textarea id="editor_id" name="content">


</textarea>
</body>
</html>
