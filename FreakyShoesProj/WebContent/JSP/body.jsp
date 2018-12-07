<!DOCTYPE html>
<html>

	<head>
		<title>Body</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">
		<link rel="stylesheet" href="/FreakyShoesProj/CSSFiles/ExternalCSS.css">
		<style>
			.mySlides {display:none;}
		</style>
	</head>

	<body>

		

	<div class="images" style="max-width:100%" height="40%">
 		 <img class="mySlides" src="/FreakyShoesProj/images/download1.jpg" style="width:100%">
  		<img class="mySlides" src="/FreakyShoesProj/images/new.jpg" style="width:100%">
  		<img class="mySlides" src="/FreakyShoesProj/images/images.jpg" style="width:100%">
	</div>

		<script>
			var myIndex = 0;
			carousel();

			function carousel() {
    			var i;
   				 var x = document.getElementsByClassName("mySlides");
    			for (i = 0; i < x.length; i++) {
       				x[i].style.display = "none";  
    			}
    			myIndex++;
    			if (myIndex > x.length) {myIndex = 1}    
    			x[myIndex-1].style.display = "block";  
    			setTimeout(carousel, 2000); // Change image every 2 seconds
			}
		</script>

		<div class="row">
			<div class="column">
				<table border=1>
					<tr>
					<td><img src="/FreakyShoesProj/images/menshoe.jpg"></td>
					</tr>
					<tr>
					<td><h6><center>Men's Section</h6></td>
					</tr> 
				</table>
			</div>

			<div class="column">
				<table border=1>
					<tr>
					<td><img src="/FreakyShoesProj/images/womenshoe.jpg"></td>
					</tr>
					<tr>
					<td><h6><center>Women's Section</h6></td>
					</tr> 
				</table>
			</div>
			
			<div class="column">
				<table border=1>
					<tr>
					<td><img src=""></td>
					</tr>
					<tr>
					<td><h6><center>Kid's Section</h6></td>
					</tr> 
				</table>
			</div>
	</div>

	</body>
</html>
