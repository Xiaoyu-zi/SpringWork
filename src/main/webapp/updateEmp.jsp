<%@ page pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>update Emp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css" />
    <script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script type="application/javascript">
        $(function () {
            //ajax开发步骤
            $.ajax({
               url:"${pageContext.request.contextPath}/employee/querydepartment",
               type:"GET",
                dataType:"json",//后台响应回的对象自动转换为jquery的独享内容
                success:function (departments) {
                      //alert(departments);
                      for (var i=0;i<departments.length;i++){
                          if(departments[i].id == "${employee.employeedepartmentid}"){
                           var option=$("<option value='"+departments[i].id+"' selected>"+departments[i].departmentname+"</option>");
                          // alert(departments);
                          } else {
                              var option=$("<option value="+departments[i].id+">"+departments[i].departmentname+"</option>");
                          }
                          $("#select").append(option);
                    }
                }
            })
        })

    </script>
</head>

<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">Main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                update Emp info:
            </h1>
            <form action="${pageContext.request.contextPath}/employee/update" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>

                        <td valign="middle" align="right">
                            id:
                        </td>
                        <td valign="middle" align="left">
                                <input type="hidden" id="input" class="inputgri" name="employee.id" value="${employee.id}" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            头像:
                        </td>
                        <td valign="middle" align="left">
                            <img width="40px" height="40px" src="${pageContext.request.contextPath}/img/1.jpg" />
                            <input type="file" name="upload" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            用户名:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="employee.employeename" value="${employee.employeename}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            工资:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="employee.employeesalary" value="${employee.employeesalary}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            年龄:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="employee.employeeage" value="${employee.employeeage}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="rigt">
                            部门:
                        </td>
                        <td valign="middle" align="left">
                            <select id="select" name="employee.employeedepartmentid" >
                                <%--<option>研发部</option>
                                <option>教学部</option>--%>
                            </select>
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="修改" />
                </p>
            </form>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
