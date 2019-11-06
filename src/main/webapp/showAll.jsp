<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-jqgrid/css/trirand/ui.jqgrid-bootstrap.css">
    <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap-jqgrid/js/trirand/i18n/grid.locale-cn.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap-jqgrid/js/trirand/jquery.jqGrid.min.js"></script>

    <%--<!--bootstrap的css样式-->
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <!--bootstrap与jqgrid整合的css样式-->
    <link rel="stylesheet" href="bootstrap-jqgrid/css/trirand/ui.jqgrid-bootstrap.css">
    <!--jqurey的js文件-->
    <script src="bootstrap-3.3.7-dist/js/jquery-3.3.1.min.js"></script>
    <!--bootstrap的js文件-->
    <script src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <!--bootstrap与jqgrid整合的国际化的js文件-->
    <script src="bootstrap-jqgrid/js/trirand/i18n/grid.locale-cn.js"></script>
    <!--jqgrid与bootstrap整合的js文件-->
    <script src="bootstrap-jqgrid/js/trirand/jquery.jqGrid.min.js"></script>
--%>
    <script type="application/javascript">
        $(function () {
            $("#table").jqGrid({
                styleUI:"Bootstrap",
                url:"${pageContext.request.contextPath}/employee/showEmployees.do",
                datatype:"json",
                autowidth:true,
                pager:"#pager",
                 rowNum:"3",
                rowList:["3","6","9"],
                viewrecords:true,
                closeAfterEdit:true,
                editurl:"${pageContext.request.contextPath}/employee/edit.do",
                colNames:["用户id","用户名","密码","年龄","部门"],
                colModel:[
                    {name:"id"},
                    {name:"username",editable:true},
                    {name:"password",editable:true},
                    {name:"age",editable:true},
                    {name:"department.id",editable:true,edittype:"select",editoptions:{dataUrl:"${pageContext.request.contextPath}/Department/showD.do"},
                        formatter:function (cellvalue,options ,rowObject) {
                                return   rowObject.department.deptname;
                        }
                    }
                ],
            }).jqGrid("navGrid","#pager",{edit:true});
        });


    </script>
</head>
<body>


    <table id="table"></table>
    <div id="pager"> </div>
</body>
</html>