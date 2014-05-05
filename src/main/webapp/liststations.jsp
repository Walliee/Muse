<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Muse - The Radio App</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.css" rel="stylesheet">

<!-- Add custom CSS here -->
<link href="css/stylish-portfolio.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link type="text/css" href="/skin/jplayer.blue.monday.css"
	rel="stylesheet" />
<!-- JavaScript -->
	<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<script type="text/javascript" src="/js/jquery.jplayer.min.js"></script>
</head>
<body>
<!-- Side Menu -->
	<a id="menu-toggle" href="#" class="btn btn-primary btn-lg toggle"><i
		class="fa fa-bars"></i></a>
	<div id="sidebar-wrapper">
		<ul class="sidebar-nav">
			<a id="menu-close" href="#"
				class="btn btn-default btn-lg pull-right toggle"><i
				class="fa fa-times"></i></a>
			<li class="sidebar-brand"><a href="/">Muse</a></li>
			<li><a href="/#top">Home</a></li>
			<li><a href="/#about">About</a></li>
			<li><a href="/#services">Services</a></li>
			<li><a href="#">Stations</a></li>
			<li><a href='<%=session.getAttribute("authUrl")%>'>MyMuse</a></li>
		</ul>
	</div>
	<!-- /Side Menu -->
<div id="stations"></div>
<script type="text/javascript">
	$(document).ready(function(){
		$.getJSON('/list', function (data){
			for (var i = 0; i < data.length; i++) {
				var station = data[i];
				var contentString = '<p><b>' + station.propertyMap.name + '</b> : ' + station.propertyMap.description + '</p>';
				$('#stations').append(contentString);
			}
		});
	});
</script>
<!-- Custom JavaScript for the Side Menu and Smooth Scrolling -->
	<script>
		$("#menu-close").click(function(e) {
			e.preventDefault();
			$("#sidebar-wrapper").toggleClass("active");
		});
	</script>
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#sidebar-wrapper").toggleClass("active");
		});
	</script>
	<script>
		$(function() {
			$('a[href*=#]:not([href=#])')
					.click(
							function() {
								if (location.pathname.replace(/^\//, '') == this.pathname
										.replace(/^\//, '')
										|| location.hostname == this.hostname) {

									var target = $(this.hash);
									target = target.length ? target
											: $('[name=' + this.hash.slice(1)
													+ ']');
									if (target.length) {
										$('html,body').animate({
											scrollTop : target.offset().top
										}, 1000);
										return false;
									}
								}
							});
		});
	</script>
</body>
</html>