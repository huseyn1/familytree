$(document).ready(function(){
    //https://github.com/308tube/com.youtube.rest/blob/master/WebContent/js/post.js
    var family_insert = $('#family_insert');
    
    $('#submit').click(function(e){
       e.preventDefault();
       var jsObj = $family_insert.serializeObject, ajaxObj={};
       
       ajaxObj = {
           type: "POST",
           url: "http://localhost:8080/familytree/webapi/createfamily", 
           data: JSON.stringify(jsObj),
           contentType: "application/json",
           error: function(jqXHR, textStatus, errorThrown) {
				console.log("Error " + jqXHR.getAllResponseHeaders() + " " + errorThrown);
	   },
           success: function(data){
               
               if(data[0].HTTP_CODE == 200) {
		$('#div_ajaxResponse').text( data[0].MSG );
	       }
           },
           complete: function(XMLHttpRequest) {
				//console.log( XMLHttpRequest.getAllResponseHeaders() );
			}, 
			dataType: "json" //request JSON
		};
                
                $.ajax(ajaxObj);
       };
        
    } );
    