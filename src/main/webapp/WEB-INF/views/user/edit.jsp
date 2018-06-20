<%--
  Created by IntelliJ IDEA.
  User: MinGOOD
  Date: 2018-06-19
  Time: 오후 5:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>WebMvc</title>
    <style>
        label { margin-top: 20px; }
    </style>
</head>
<body>
<div class="container">
    <h1>사용자 정보 수정</h1>

    <form class="form-group" method="post">
        <label for="id">id</label>
        <input class="form-control" type="text" id="id" value="${user.id}" readonly />

        <label for="loginId">로그인 ID</label>
        <input type="text" id="loginId" value="${user.loginId}" />

        <label for="name">이름</label>
        <input type="text" id="name" value="${user.name}" />

        <label for="email">이메일</label>
        <input type="email" id="email" value="${user.email}" />

        <label for="userType">사용자 유형</label>
        <input type="text" id="userType" value="${user.userType}" />

        <label for="departmentId">학과</label>
        <input type="text" id="departmentId" value="${user.deapartmentId}" />
    </form>

    <c:if test="${not empty error}">
        <div class="alert alert-danger" role="alert">${error}</div>
    </c:if>

    <c:if test="${not empty success}">
        <div class="alert alert-success" role="alert">${success}</div>
    </c:if>
</div>


</body>
</html>