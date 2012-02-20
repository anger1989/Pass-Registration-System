<!DOCTYPE html>
<html lang="us">
<head>
    <title>Choice your place</title>
    <meta charset="utf-8" />
    <meta name="language" content="English" />
    <meta name="copyright" content="Golovko Igor (c) 2011" />
	
	<link rel="stylesheet" href="css/main.css" type="text/css" />

	<!--[if IE]>
		<script src="js/html5.js"></script><![endif]-->

	<!--[if lte IE 8]>
		<script src="js/IE8.js" type="text/javascript"></script><![endif]-->

	<!--[if lt IE 7]
		<link rel="stylesheet" type="text/css" media="all" href="css/ie8.css"/><![endif]-->

</head>

<body id="index" class="home">
    
<jsp:useBean id="regdata" scope="session" class="org.mypackage.prs.NameHandler" />
<jsp:setProperty name="regdata" property="name" />
<jsp:setProperty name="regdata" property="lastname" />
<jsp:setProperty name="regdata" property="pnumber" />

<!-- Scripts -->
<script type="text/javascript" src="js/jquery-1.7.1"></script>
<!-- Scripts -->

	<header id="banner" class="body">
		<h1>Passenger Registration System</h1>
	</header><!-- /#banner -->
	<br><br>
	<aside id="featured" class="body"><article>
		<figure>
			<img src="img/featured.png" alt="Smashing Magazine" />
		</figure>
		<hgroup>
			<h3>Mobile version (pre-alpha)</h3>
		</hgroup>
		<p>This is mobile version of Passenger Registration System. <br> You have to take a picture of QR-code on your ticket and upload it below.
           After successful registration you have to go to baggage drop-off point. <a href="#"> How do</a></p>
	</article></aside><!-- /#featured -->
	
	<section id="content" class="body">
		
		<ol id="posts-list" class="hfeed">
			<li><article><!--<a href="#test" style="display: block">-->

					<h2 class="entry-title">Hello, <jsp:getProperty name="regdata" property="lastname" /> <jsp:getProperty name="regdata" property="name" />, choice your place: </h2>
                <br />
		<div class="entry-content">
                <p>
                 <!-- #Script for flash  
                 
                  <script language="javascript">
                    var flashvars = {
                     teatr: "24",
                     user:"16465",
                     forces:"33760",
                     forcef:"????????. ???????, ??? ?????",
                     forcet:"23:59",
                     forced:"12.12.2011",
                     forceh:"47"
                };
                    var params = {
                     menu: "false",
                     wmode:"opaque"
                };
                    swfobject.embedSWF("scheme01.swf", "flashContent2","760","600","9.0.0","expressInstall.swf",flashvars,params);

                    </script>
                 
                 #/Script for flash -->
                    <img src="img/planes/a319.png">
                     
					
				
                
                </p>
                </div>
			</article></li>
			
		</ol><!-- /#posts-list -->
		
	</section><!-- /#content -->
	
	<footer id="contentinfo" class="body">
		<address id="about" class="vcard body">
			<span class="primary">
				<strong><a href="#" class="fn url">English</a> <a href="ru/choice-ru.html" class="fn url">Russian</a></strong>
			</span><!-- /.primary -->
		</address><!-- /#about -->
		
		<p>2011 <a href="#">GSM Co.</a></p>
	</footer><!-- /#contentinfo -->

</body>
</html>