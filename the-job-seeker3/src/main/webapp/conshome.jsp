<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "thejobs";
String userid = "root";
String password = "Fimq123$";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title> Consultant Home | TheJobs</title>
    <link rel="stylesheet" href="table.css">
   </head>
<body>

<h1 align="center">The Job Seeker</h1><br>
                <h3 align="center">About the "The Job Seeker"</h3><br>
                <ul align="center">
                   <li>You, the consultants are able to see who are registered for this service.</li> <br>
                   <li>You can find who you think are compatible with your skills, and </li> <br>
                   <li>Contact them via their contact information,</li> <br>
                   <li>Give any updates to the receptionist directly.</li> <br>
                </ul>
                      
                <br><br>
                <h3 align="center">Sort Preferences : 
                <a href="#countrycon"> <button class="btn">Countries</button></a>
                <a href="#jobcon"> <button class="btn">Jobs</button></a>
                </h3>   


                

<h2 align="center" id="countrycon">Country preferences</h2>
<table border="1" class="center">
<tr>
<td class="data">Country</td>
<td class="data">Name</td>
<td class="data">Phone Number</td>
<td class="data">Email</td>
<td class="data">Job</td>


</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from seeker ORDER BY country_seek ASC";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td class="data1"><%=resultSet.getString("country_seek") %></td>
<td class="data1"><%=resultSet.getString("name_seek") %></td>
<td class="data1"><%=resultSet.getString("number_seek") %></td>
<td class="data1"><%=resultSet.getString("email_seek") %></td>

<td class="data1"><%=resultSet.getString("job_seek") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 
<h2 align="center" id="jobcon">Job preferences</h2>
<table border="1" class="center">
<tr>
<td class="data">Job</td>
<td class="data">Name</td>
<td class="data">Phone Number</td>
<td class="data">Email</td>
<td class="data">Country</td>


</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from seeker ORDER BY job_seek ASC";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td class="data1"><%=resultSet.getString("job_seek") %></td>
<td class="data1"><%=resultSet.getString("name_seek") %></td>
<td class="data1"><%=resultSet.getString("number_seek") %></td>
<td class="data1"><%=resultSet.getString("email_seek") %></td>
<td class="data1"><%=resultSet.getString("country_seek") %></td>

</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 
<a href="login.jsp"> <button color="red" class="btn1">Logout</button></a>
</body>
</html>