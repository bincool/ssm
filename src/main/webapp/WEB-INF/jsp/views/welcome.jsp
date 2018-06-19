<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="description" content="First Page" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>首页</title>
    <style type="text/css">
        table.gridtable {
            font-family: verdana,arial,sans-serif;
            font-size:11px;
            color:#333333;
            border-width: 1px;
            border-color: #666666;
            border-collapse: collapse;
        }
        table.gridtable th {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #dedede;
        }
        table.gridtable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #ffffff;
        }
    </style>
</head>
<body>
    <div class="test-box">
        <h4>测试表数据：</h4>
        <table class="gridtable">
            <thead>
            <tr>
                <th><input type="checkbox" id="ids"/></th>
                <th>序号</th>
                <th>String测试</th>
                <th>Integer测试</th>
                <th>Double测试</th>
                <th>Text测试</th>
                <th>Boolean测试</th>
                <th>创建时间</th>
                <th>上次修改时间</th>
            </tr>
            </thead>
            <tbody>
            <c:choose>
                <c:when test="${not empty testList}">
                    <c:forEach items="${testList}" var="var" varStatus="vs">
                        <tr id="${var.id}">
                            <td><label><input type='checkbox' name="ids" value="${var.id}"/><span class="lbl"></span></label></td>
                            <td>${vs.index+1}</td>
                            <td>${var.stringTest}</td>
                            <td>${var.integerTest}</td>
                            <td>${var.doubleTest}</td>
                            <td>${var.textTest}</td>
                            <td>${var.booleanTest}</td>
                            <td>${var.createTime}</td>
                            <td>${var.updateTime}</td>
                        </tr>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td colspan="100"><center>没有相关数据</center></td>
                    </tr>
                </c:otherwise>
            </c:choose>
            </tbody>
        </table>
    </div>
</body>
</html>