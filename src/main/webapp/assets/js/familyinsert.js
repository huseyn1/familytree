$(document).ready(function () {
    $('#submit').click(function (e){
       
        var fid = $('#familyid').val();
        var family = $('#family').val();
        
        var JSONobject = {
            "familyid":fid,
            "password":family
        };
        
        console.log(JSONobject);
        
        e.preventDefault();
        
    })
})