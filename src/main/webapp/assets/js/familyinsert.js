$(document).ready(function () {
    $('#submit').click(function (){
        var familyid = document.getElementById("familyid").value;
        var family = document.getElementById("family").value;
        var JSONobject = {
            "familyid":familyid,
            "password":family
        };
        
    })
})