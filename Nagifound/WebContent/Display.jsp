<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
<script type="text/javascript">
var obj=<%=request.getAttribute("json")%>
var tbl=$("<table/>").attr("id","mytable");
    $("#div1").append(tbl);
    for(var i=0;i<obj.length;i++)
    {
        var tr="<tr>";
        var td1="<td>"+obj[i]["firstName"]+"</td>";
        var td2="<td>"+obj[i]["lastName"]+"</td>";
        var td3="<td>"+obj[i]["phoneNumber"]+"</td>";
        var td4="<td>"+obj[i]["color"]+"</td>";
        var td5="<td>"+obj[i]["sex"]+"</td>";
        var td6="<td>"+obj[i]["location"]+"</td>";
        var td7="<td>"+obj[i]["features"]+"</td>";
        var td8="<td>"+obj[i]["image"]+"</td>";
        var td9="<td>"+obj[i]["details"]+"</td></tr>";

       $("#mytable").append(tr+td1+td2+td3); 

    }   
    </script>
</head>
<body>
<div id="div1" name="div1">
</div>
</body>
</html>