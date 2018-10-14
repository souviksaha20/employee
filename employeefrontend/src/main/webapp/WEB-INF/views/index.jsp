    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Employee</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  * {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  font-family: "Roboto";
  font-size: 14px;
  background-size: 200% 100% !important;
  -webkit-animation: move 10s ease infinite;
          animation: move 10s ease infinite;
  -webkit-transform: translate3d(0, 0, 0);
          transform: translate3d(0, 0, 0);
  background: linear-gradient(45deg, #49D49D 10%, #A2C7E5 90%);
  height: 100vh;
}

.user {
  width: 90%;
  max-width: 340px;
  margin: 10vh auto;
}

.user__header {
  text-align: center;
  opacity: 0;
  -webkit-transform: translate3d(0, 500px, 0);
          transform: translate3d(0, 500px, 0);
  -webkit-animation: arrive 500ms ease-in-out 0.7s forwards;
          animation: arrive 500ms ease-in-out 0.7s forwards;
}

.user__title {
  font-size: 14px;
  margin-bottom: -10px;
  font-weight: 500;
  color: white;
}

.user .form {
  margin-top: 40px;
  border-radius: 6px;
  overflow: hidden;
  opacity: 0;
  -webkit-transform: translate3d(0, 500px, 0);
          transform: translate3d(0, 500px, 0);
  -webkit-animation: arrive 500ms ease-in-out 0.9s forwards;
          animation: arrive 500ms ease-in-out 0.9s forwards;
}

.user .form--no {
  -webkit-animation: NO 1s ease-in-out;
          animation: NO 1s ease-in-out;
  opacity: 1;
  -webkit-transform: translate3d(0, 0, 0);
          transform: translate3d(0, 0, 0);
}

.user .form__input {
  display: block;
  width: 100%;
  padding: 20px;
  font-family: "Roboto";
  -webkit-appearance: none;
  border: 0;
  outline: 0;
  transition: 0.3s;
}
.user .form__input:focus {
  background: #f7f7f7;
}

.user .btn {
  display: block;
  width: 100%;
  padding: 20px;
  font-family: "Roboto";
  -webkit-appearance: none;
  outline: 0;
  border: 0;
  color: white;
  background: #ABA194;
  transition: 0.3s;
}
.user .btn:hover {
  background: #a09486;
}

@-webkit-keyframes NO {
  from, to {
    -webkit-transform: translate3d(0, 0, 0);
    transform: translate3d(0, 0, 0);
  }
  10%, 30%, 50%, 70%, 90% {
    -webkit-transform: translate3d(-10px, 0, 0);
    transform: translate3d(-10px, 0, 0);
  }
  20%, 40%, 60%, 80% {
    -webkit-transform: translate3d(10px, 0, 0);
    transform: translate3d(10px, 0, 0);
  }
}

@keyframes NO {
  from, to {
    -webkit-transform: translate3d(0, 0, 0);
    transform: translate3d(0, 0, 0);
  }
  10%, 30%, 50%, 70%, 90% {
    -webkit-transform: translate3d(-10px, 0, 0);
    transform: translate3d(-10px, 0, 0);
  }
  20%, 40%, 60%, 80% {
    -webkit-transform: translate3d(10px, 0, 0);
    transform: translate3d(10px, 0, 0);
  }
}
@-webkit-keyframes arrive {
  0% {
    opacity: 0;
    -webkit-transform: translate3d(0, 50px, 0);
            transform: translate3d(0, 50px, 0);
  }
  100% {
    opacity: 1;
    -webkit-transform: translate3d(0, 0, 0);
            transform: translate3d(0, 0, 0);
  }
}
@keyframes arrive {
  0% {
    opacity: 0;
    -webkit-transform: translate3d(0, 50px, 0);
            transform: translate3d(0, 50px, 0);
  }
  100% {
    opacity: 1;
    -webkit-transform: translate3d(0, 0, 0);
            transform: translate3d(0, 0, 0);
  }
}
@-webkit-keyframes move {
  0% {
    background-position: 0 0;
  }
  50% {
    background-position: 100% 0;
  }
  100% {
    background-position: 0 0;
  }
}
@keyframes move {
  0% {
    background-position: 0 0;
  }
  50% {
    background-position: 100% 0;
  }
  100% {
    background-position: 0 0;
  }
}
  
  </style>
</head>
<body>

<div class="container">
<div class="user">
    <header class="user__header">
        <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/3219/logo.svg" alt="" />
        <h1 class="user__title">Add Employee</h1>
    </header>
 
  <c:url var="add" value="/add"></c:url>
  <form:form action="${add}" method="post" commandName="employee" class="form">
  <form:input type="hidden" width="100%" class="form-control" path="id"/>
    <div class="form-group">
      <label for="name">Employee Name:</label>
      <form:input type="text" class="form-control" path="name" id="name" placeholder="Enter The Name" name="name"/>
    </div>
    <div class="form-group">
      <label for="Designation">Designation</label>
      <form:input type="text" class="form-control" path="Designation"  placeholder="Enter The Designation" name="Designation"/>
    </div>
    <div class="form-group">
      <label for="number">Employee Contact Number </label>
      <form:input type="number" class="form-control"  path="phone" placeholder="Enter The number" name="phone" />
    </div>
  
    <input type="submit" class="btn btn-primary" value="Add Employee">
  </form:form>
  <br><br>
  </div>
  
  
  
  
  
 <div class="input-group" >
    <input type="text" id="myInput" onkeyup="myFunction()" class="form-control" placeholder="Search Event by names or phone number or Designation">
    <div class="input-group-btn">
      <button class="btn btn-default" type="submit">
        <i class="glyphicon glyphicon-search"></i>
      </button>
    </div>
  </div>
  
<br><br>
  
  
  <table class="table table-bordered" id="myTable">
    <thead>
      <tr>
        <td>Id</td>
        <th>Employee Name</th>
        <th>Designation</th>
        <th>Number</th>
        <th>Option</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="e" items="${employies}">
      <tr>
       <td> ${e.id}</td>
       <td> ${e.name}</td>
       <td> ${e.designation}</td>
       <td> ${e.phone}</td>
        <td>
        <a href="<c:url value="/edit/${e.id}"/>">Edit</a> | 
		<a href="<c:url value="/delete/${e.id}"/>">Delete</a>
         </td>
      </tr>
      <tr>
      </c:forEach>
    </tbody>
  </table>
  
</div>
  
  


<script>
function myFunction() {
	  var input, filter, table, tr, td, i;
	  input = document.getElementById("myInput");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("myTable");
	  tr = table.getElementsByTagName("tr");
	  for (i = 0; i < tr.length; i++) {
	    td = tr[i].getElementsByTagName("td")[1];
	    if (td) {
	      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
	        tr[i].style.display = "";
	      } else {
	    	  td = tr[i].getElementsByTagName("td")[2];
	   	   if(td)
	   	    	{
	   	    	if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
	   		        tr[i].style.display = "";
	   		      } 
	   	    	else 
	   	    	{
	   	    	 td = tr[i].getElementsByTagName("td")[3];
	   		   if(td)
	   		    	{
	   		    	if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
	   			        tr[i].style.display = "";
	   			      } 
	   		    	else 
	   		    	{
	   			        tr[i].style.display = "none";
	   			      }
	   		    	}
	   		       
	   		      }
	   	    	}
	        
	      }
	    }
	   
	    	
	    	
	  }
}
	




</script>



</body>
</html>
