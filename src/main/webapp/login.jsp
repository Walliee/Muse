<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
	<head>
		<title>Muse</title>
		<link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.css" />
		<style> 
	       #container { 
			top: 40px;	
			bottom: 0;
	       } 
	     </style>
	</head>
	<body>
		<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			   		<span class="icon-bar"></span>
			    </button>
				<a class="navbar-brand" href="#">Muse</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-left">
					<li class="divider-vertical"></li>
					<li><a data-toggle="modal" href="#instructions">Instructions</a></li>
					<li><a href="https://github.com/Walliee/TweetBuzz" target="_blank">Code</a></li>
<%-- 					<li><a href='<%=request.getAttribute("authUrl") %>'>Login</a></li> --%>
				</ul>
			</div>					
		</div>
	</div>
	<div class="container">
		<p><%=request.getSession().getAttribute("user") %></p>
		<p><%=request.getSession().getAttribute("latestTweet") %></p>
		<p><%=request.getSession().getAttribute("emotion") %></p>
		<p><%=request.getSession().getAttribute("stationName") %></p>
		<p><%=request.getSession().getAttribute("url") %></p>
<%-- 		<p><%=request.getAttribute("emotion") %></p> --%>
	</div>
	<script type="text/javascript" charset="utf8" src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
    <script type="text/javascript" charset="utf8" src="/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript">

	</script>
	</body>
</html>
