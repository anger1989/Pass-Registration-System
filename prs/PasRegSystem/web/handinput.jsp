<!DOCTYPE html>
<html lang="us">
<head>
    <title>Hand input page</title>
    <meta name="language" content="English" />
    <meta name="copyright" content="Golovko Igor (c) 2011" />
    <script src="js/validate.js"></script>
	<link rel="stylesheet" href="css/main.css" type="text/css" />

	<!--[if IE]>
		<script src="js/html5.js"></script><![endif]-->

	<!--[if lte IE 8]>
		<script src="js/IE8.js" type="text/javascript"></script><![endif]-->

	<!--[if lt IE 7]
		<link rel="stylesheet" type="text/css" media="all" href="css/ie8.css"/><![endif]-->

</head>

<body id="index" class="home">
	
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

					<h2 class="entry-title">Input data form</h2>

				<div class="entry-content">
					<p>
                    <form action="choice.jsp" method="post" onsubmit="return checkForm(this);">
                     <table width="760" cellspacing="0" cellpadding="0">
                    <tr>
                    <td align="middle" width="150">Last name </td>
                    <td><input type="text" size="20" name="lastname"  placeholder="McTavish" /> <br /></td>
                        </tr>
                    <tr>
                     <td align="middle">Name </td>
                     <td><input type="text" size="20" name="name" placeholder="John" /> <br /></td>
                    </tr>
                    <tr>
                     <td align="middle">Plane number </td>
                     <td><input type="text" size="10" name="pnumber" placeholder="6501"/> <br /></td>
                    </tr>
                     </table>
                    <input type="image" src="img/choice.png">
                    </form>

					</p>
				</div>
			</article></li>
			
		</ol><!-- /#posts-list -->
		
	</section><!-- /#content -->
	
	<footer id="contentinfo" class="body">
		<address id="about" class="vcard body">
			<span class="primary">
				<strong><a href="#" class="fn url">English</a> <a href="ru/handinput-ru.html" class="fn url">Russian</a></strong>
			</span><!-- /.primary -->
		</address><!-- /#about -->
		
		<p>2011 <a href="#">GSM Co.</a></p>
	</footer><!-- /#contentinfo -->

</body>
</html>