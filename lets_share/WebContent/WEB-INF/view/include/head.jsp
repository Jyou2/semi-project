<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 모든 페이지에서 공통적으로 사용할 head를 작성하는 페이지이다. --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Let's Share</title>
<script type="text/javascript" src="/resources/js/common/asyncResponseError.js"></script>
<script type="text/javascript" src="/resources/js/common/urlEncoder.js"></script>
<c:set var="context" value="${pageContext.request.contextPath}"/>
</head>
