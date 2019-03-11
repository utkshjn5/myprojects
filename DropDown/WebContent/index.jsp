<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
function change(){
	var country=document.getElementById("country").value;

	var xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange=function (){
		if(xhttp.readyState==4 && xhttp.status==200)
		{
			 document.getElementById("stateeee").innerHTML=xhttp.responseText;
			 document.getElementById("city").disabled=true;
 
			
		}
	};
	xhttp.open("POST","DropDownServlet?country="+country,true);
	xhttp.send();
	
	
	
	
}
function state(){
	
	var state=document.getElementById("stateeee").value;
	
	var xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange=function (){
		if(xhttp.readyState==4 && xhttp.status==200)
		{
			 document.getElementById("city").disabled=false;
			 document.getElementById("city").innerHTML=xhttp.responseText;
 
			
		}
	};
	xhttp.open("POST","DropDownServlet2?state="+state,true);
	xhttp.send();
	
	
	
	
}

</script>

<body>
<form>

<table>
<tr>
  <td>
      Select Country::<select id="country" onchange="change()">
                        <option>country</option>
                        <option value="India">India</option>
                        <option value="China">China</option>
                     </select>
  </td>
</tr>
<tr><td>
     
     Select State <select id="stateeee" onchange="state()" > </select>
   </td>
</tr>
<tr><td>
      <div id="city1">
      Select City<select id="city"> </select>
      
      </div></td>
</tr>

</table>

</form>
</body>
</html>

