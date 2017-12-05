$(document).ready(function () {
    
    $('#myTable').DataTable();
    
    $('#submit').click(function (e){
       
        var fid = $('#familyid').val();
        var family = $('#family').val();
        
        var JSONobject = {
            "familyid":fid,
            "password":family
        };
        
        $.ajax({
            url : 'http://localhost:8084/familytree/webapi/familyservice/createfamily',
            type: 'POST',
            dataType: 'json',
            data:JSONobject,
            contentType: 'application/json',
            success: function (data) {
               console.log(data);  
               //alert('family succesfully inserted')
            }
        })
        
      
        e.preventDefault();
        
    })
})