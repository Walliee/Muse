<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@page import="java.net.URLEncoder" %>
<%
    String fbURL = "http://www.facebook.com/dialog/oauth?client_id=526132877497296&redirect_uri=" + URLEncoder.encode("http://localhost:8080/signinfb", "UTF-8") + "&scope=email,user_status";
%>

<a href="<%= fbURL %>">Sign in Facebook</a>