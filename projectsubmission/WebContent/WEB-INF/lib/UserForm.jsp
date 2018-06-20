
<html>
<head>

<title>form</title>
</head>
<body>
<b> <center> <font size="20"> REGISTRATION FORM
</font>
</center>
</b>
<form action="/projectsubmission/submitUserForm.html" method="post">
First name: <br>
<input type="text" name="FirstName" maxlength="10" required pattern="[A-Z a-z]" placeholder="First name"><br>
Last name: <br>
<input type="text" name="LastName" maxlength="10" required pattern="[A-Z a-z]" placeholder="Last name"><br>
Date of birth: <br>
<input type="date" name="DOB"min="31-12-2000" required ><br>
Email :<br>
<input type="email" name="email" required placeholder=" abc@abc1.uvw"><br>
Phone no: <br>
<input type="tel" name="phno"  required placeholder="98456....."> <br>
<input  type="submit" value="Submit">
</body>
</html>