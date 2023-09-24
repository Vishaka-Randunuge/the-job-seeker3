<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Registration| TheJobs</title>
    <link rel="stylesheet" href="style.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link href="https://fonts.googleapis.com/css2?family=Bitter:wght@300;400;500;600;700&display=swap" rel="stylesheet">
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
   </head>
<body>
  <div class="container">
    <div class="title">Login</div>
    <div class="content">
      <form action="<%=request.getContextPath()%>/seekhome.jsp" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Username</span>
            <input type="text" name="username" placeholder="Enter your username" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" name="password" placeholder="Enter your password" required>
          </div>
          
        </div>
        <div class="button">
          <input type="submit" value="Login">
          <br><br>
          <h3>Doesn't have an account? Register now <a href="reg.jsp"> Register</a></h3>
        </div>
      </form>
    </div>
  </div>
  
  <div class="container">
    <div class="title">Login as Consultant</div>
    <div class="content">
      <form action="<%=request.getContextPath()%>/conshome.jsp" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Username</span>
            <input type="text" name="username" placeholder="Enter your username" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" name="password" placeholder="Enter your password" required>
          </div>
          
        </div>
        <div class="button">
          <input type="submit" value="Login">
          <br><br>
        </div>
      </form>
    </div>
  </div>

</body>
</html>


