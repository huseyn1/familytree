$(document).ready(function () {
    $('#submit').click(function (e){
       
        var fid = $('#familyid').val();
        var family = $('#family').val();
        
        var JSONobject = {
            "familyid":fid,
            "password":family
        };
        
        $.ajax({
            url : '',
            type: 'GET',
            dataType: 'json',
            success: function (data) {
                
            }
        })
        
        console.log(JSONobject);
        
        e.preventDefault();
        
    })
})