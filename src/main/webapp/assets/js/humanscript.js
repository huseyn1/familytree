$(document).ready(function (){
    
   
    
     //insert
    $('#submit').click(function (e){
       
        var hid = $('#humanid').val();
        var name = $('#name').val();
        var surname = $('#surname').val();
        var age = $('#age').val();
        var gender = $('input[name="genderadio"]:checked').val();
        var life = $('input[name="liferadio"]:checked').val();
        var familyid = $('#familyid').val();
        
        var JSONobject = {
	"id":hid,
	"name":name,
        "surname":surname,
	"age":age,
        "genderStatus":gender,
	"lifeStatus":life,
        "familyId":familyid,

         }
        
        $.ajax({
            url : 'http://localhost:8084/familytree/webapi/humanservice/createhuman',
            type: 'POST',
            dataType: 'json',
            data:JSON.stringify(JSONobject),
            contentType: 'application/json',
            success: function (data) {
               console.log(data);  
               alert("human succesfully inserted");
            }
        })
        
        e.preventDefault();
        
    });
    
})

