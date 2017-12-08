$(document).ready(function () {
    
      //show data
       $('#myTable').dataTable({
            "ajax": {
                url:"http://localhost:8084/familytree/webapi/familyservice/showfamilies",
                "dataSrc": function(json) {
                    var obj = [];
                    for (var t=0; t<json.length; t++) {
                        obj.push([json[t]['id'],json[t]['family']]);
                    }
                    return obj;
                }lo
            }
        });

    //insert
    $('#submit').click(function (e){
       
        var fid = $('#familyid').val();
        var family = $('#family').val();
        
        var JSONobject = {
	"id":fid,
	"family":family
         }
        
        $.ajax({
            url : 'http://localhost:8084/familytree/webapi/familyservice/createfamily',
            type: 'POST',
            dataType: 'json',
            data:JSON.stringify(JSONobject),
            contentType: 'application/json',
            success: function (data) {
               console.log(data);  
               alert("family succesfully inserted");
            }
        })
        
        e.preventDefault();
        
    });
    
    //remove
    $('#family_remove').submit(function (e){
        
        var fid = $('#removeid').val();
        
        $.ajax({
            url : 'http://localhost:8084/familytree/webapi/familyservice/deletefamily/'+fid,
            type: 'DELETE',
            dataType: 'json',
            contentType: 'application/json',
            success: function (data) {
               console.log(data);  
               alert("family succesfully removed");
            }
        })
        
       e.preventDefault(); 
    })
    
    
    
    $('#family_update').submit(function (e){
       var fid = $('#updateid').val();
       var fname = $('#updatefamily').val();
        
         var JSONobject = {
	"id":fid,
	"family":fname
         }
         
          $.ajax({
            url : 'http://localhost:8084/familytree/webapi/familyservice/updatefamily',
            type: 'PUT',
            dataType: 'json',
            data:JSON.stringify(JSONobject),
            contentType: 'application/json',
            success: function (data) {
               console.log(data);  
               alert("family succesfully updated");
            }
        })
        
         e.preventDefault();
    })
  
    
})