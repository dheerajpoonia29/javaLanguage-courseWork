<!DOCTYPE html>
<html>
<head>
	<title>FIRST JAVA BEAN</title>
</head>
<body>
	<h1>Hello how are you</h1>
	<jsp:useBean id="myBean" class="my.myBean" scope="session" />
	<jsp:setProperty name="myBean" property="name" value="PIET" />
	<h2>Students? </h2>
	<h2>
		<jsp:getPorperty name="myBean" property="name" />
	</h2>		
</body>
</html>