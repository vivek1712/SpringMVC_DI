<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Spring MVC Hello World Annotation Example</h1>

	<h2 id="ajMsg">${msg}</h2>
	</br>
	</br>
	
	<input type="button" onclick="loadMsg()"> click for alert MSg </input>
	
	<input type="button" onclick="loadMsgJsp()"> click for alert change msg with jsp </input>
	
	<div id="putData">
	
	</div>
</body>
<script type="text/javascript"
    src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script>

 function loadMsg(){
	/* debugger;
	var ajaxObj=new XMLHttpRequest();
	  ajaxObj.onreadystatechange  = function(){
		if(this.readyState ==4 && this.status==100){
			alert("hey");
		}
	};  
	ajaxObj.open("GET","changeMsg",true);
	ajaxObj.send();
	  */
	  
	 $.ajax({
         url : 'changeMsg',
         success : function(data) {
        	
         // document.getElementById("ajMsg").innerHTML=data;
         }
     });
} 
 
 function loadMsgJsp(){
		/* debugger;
		var ajaxObj=new XMLHttpRequest();
		  ajaxObj.onreadystatechange  = function(){
			if(this.readyState ==4 && this.status==100){
				alert("hey");
			}
		};  
		ajaxObj.open("GET","changeMsg",true);
		ajaxObj.send();
		  */
		  var mess={"name":"Raj"};
		 $.ajax({
			 type:"POST",
			 contentType:"application/json; charset=utf-8",
			 dataType:"json",
			 data:JSON.stringify(mess),
	         url : 'changeMsgJsp',
	         success : function(data) {
	        	 debugger;
	        	 document.getElementById("putData").innerHTML=data;
	        	 console.log("vivek response from change msg jsp",data);
	         // document.getElementById("ajMsg").innerHTML=data;
	         }
	     });
	} 

</script>


</html>