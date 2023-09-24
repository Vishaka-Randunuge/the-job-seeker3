<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>


<%
String name_seek=request.getParameter("name_seek");
String number_seek=request.getParameter("number_seek");
String email_seek=request.getParameter("email_seek");
String country_seek=request.getParameter("country_seek");
String job_seek=request.getParameter("job_seek");
String username=request.getParameter("username");
String password=request.getParameter("password");

try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/thejobs","root","Fimq123$");
    Statement st1=con1.createStatement();
    ResultSet rs1=st1.executeQuery("SELECT * FROM seeker");
    while(rs1.next()){

    String InsertQuery = "insert into seeker (name_seek,number_seek,email_seek,country_seek,job_seek,username,password) values('"+name_seek+"','"+number_seek+"','"+email_seek+"','"+country_seek+"','"+job_seek+"','"+username+"','"+password+"');";

    st1.executeUpdate(InsertQuery);}}

catch(Exception error){
    out.println(error);}
 %>
 
 
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
    <div class="title">Registration</div>
    <div class="content">
      <form action="#">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <input type="text" name="name_seek" placeholder="Enter your name" required>
          </div>
           <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="text" name="number_seek" placeholder="Insert phone number" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="text" name="email_seek" placeholder="Enter your email" required>
          </div>

          <div class="input-box">
            <span class="details">Country Preference</span>
            <input type="text" name="country_seek" placeholder="What is your prefered country?" required>
          </div>
          <div class="input-box">
            <span class="details">Job Preference</span>
            <input type="text" name="job_seek" placeholder="What is your prefered job?" required>
          </div>
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
          <input type="submit" value="Register">
          <br><br>
          <h3>Already registered? Login now <a href="login.jsp"> Login</a></h3>
        </div>
      </form>
    </div>
  </div>

</body>
</html>

