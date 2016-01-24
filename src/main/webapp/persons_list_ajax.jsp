<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="ch.ua.service.PersonServiceImpl" %>
<%@page import="java.util.List" %>
<%@page import="ch.ua.model.Person" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:useBean id="personService" class="ch.ua.service.PersonServiceImpl" scope="request"></jsp:useBean>

<c:set var="listPersons" value="${PersonServiceImpl.get }"></c:set>