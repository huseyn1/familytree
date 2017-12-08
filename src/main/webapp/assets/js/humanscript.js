$(document).ready(function (){
    
   
   //show data
       $('#myTable1').dataTable({
            "ajax": {
                url:"http://localhost:8084/familytree/webapi/humanservice/showhuman",
                "dataSrc": function(json) {
                    var obj = [];
                    for (var t=0; t<json.length; t++) {
                        obj.push([json[t]['id'],json[t]['name'],json[t]['surname'],json[t]['age'],json[t]['genderType'],json[t]['life_status'],json[t]['relatedName'],json[t]['relType']]);
                    }
                    return obj;
                }
            }
        });
    
     //insert human
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
        "familyId":familyid

         };
        
        $.ajax({
            url : 'http://localhost:8084/familytree/webapi/humanservice/createhuman',
            type: 'POST',
            dataType: 'json',
            data:JSON.stringify(JSONobject),
            contentType: 'application/json',
            success: function (data) {
               console.log(data);  
               alert("human succesfully inserted");
            },
            error: function(){
                alert("something is wrong try again and use correct id");
            }
        });
        
        e.preventDefault();
        
    });
    
    
     //insert relation
    $('#submitrelation').click(function (e){
       
        var hid = $('#rhid').val();
        var rel_hid = $('#rel_hid').val();
        var rel_radio = $('input[name="rel_radio"]:checked').val();
        
        var JSONobj = {
	"human_id":hid,
	"rel_human_id":rel_hid,
        "rel_type_id":rel_radio
         };
        
        $.ajax({
            url : 'http://localhost:8084/familytree/webapi/humanservice/relation',
            type: 'POST',
            dataType: 'json',
            data:JSON.stringify(JSONobj),
            contentType: 'application/json',
            success: function (data) {
               console.log(data);  
               alert("relation succesfully created");
            },
            error: function(){
                alert("something is wrong try again and use correct id");
            }
        });
        
        e.preventDefault();
        
    });
    
});

