<%@ include file="aheader.jsp"%>
<%@page import ="database.*,java.sql.*" %>

<br>
<div align="center">
<h2><font color="green"><b><i>Student Details</i></b></font></h2>
<br>
<table>
<tr style="color:orange"  >
<th>Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
<th>Roll NO.&nbsp;&nbsp;&nbsp;</th>
<th>&nbsp;&nbsp;&nbsp;&nbsp;Email</th>
<th></th>
<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contact</th>
</tr>

<%
String contact=null;
Connection con=databasecon.getconnection();
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from register");
while(rs.next())
{
	contact=rs.getString(8);
	%>
<tr>
<td><%=rs.getString(4)%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><%=rs.getString(2)%>&nbsp;&nbsp;&nbsp;</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rs.getString(7)%></td>
<td></td>
<%if(contact.equals("login")){%>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font style="color:green"><b><%=contact%></b></font></td><%}
else if(contact.equals("reject")){
%>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font style="color:red"><b><%=contact%></b></font></td><%}
else {%>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><%=contact%></b></td><%}%>
<%}%>
</table>
</div>



<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@ include file="footer.jsp"%>


<%
String contact=null;
try{
String email = request.getParameter("email");
String name = request.getParameter("name");
String uid = request.getParameter("uid");
  Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/radproject", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from mentor_register" );
            
            if(rs.next()){
                session.setAttribute("uid",rs.getString("uid"));
                //response.sendRedirect("adminview.jsp");
            }



}catch(Exception e){
    e.printStackTrace();
}

%>
