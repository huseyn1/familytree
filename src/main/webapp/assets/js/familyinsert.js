$(document).ready(function () {
    $('#submit').click(function (e){
       
        var fid = $('#familyid').val();
        var family = $('#family').val();
        
        var JSONobject = {
            "familyid":fid,
            "password":family
        };
        
        $.ajax({
            url : 'http://localhost:8084/familytree/family_insert/family',
            type: 'POST',
            dataType: 'json',
            data:JSONobject,
            contentType: 'application/json',
            success: function (data) {
               console.log(data);  
            }
        })
        
      
        e.preventDefault();
        
    })
})