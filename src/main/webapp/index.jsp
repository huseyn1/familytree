<html lang="en">
<head>
	<title>index</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
	<!-- <link rel="stylesheet" type="text/css" href="css/style.css"> -->
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">

</head>

<body>
    
    
    <div class="container">
        <h1 align="center">Family tree</h1>
       
        
    	
         <!-- Create Family-->
  <button type="button" id="login" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal0">Create Family</button>
  
   <!-- Modal -->
  <div class="modal fade" id="myModal0" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">TYPE ID AND FAMILY</h4>
        </div>
        <div class="modal-body">
             <!--input form -->
        <form id="family_insert" name="family_insert" action="#" method="POST">
            
    	    <div class="form-group">
            <input type="number" name="familyid" id="familyid" min="1000" data-bind="value:replyNumber" placeholder="---enter id---"/>
    	    </div>
            
    	    <div class="form-group">
    	    <input type="text" id="family" name="family" class="form-control" placeholder="---enter family---" >
    	    </div>
            
            <button type="submit" id="submit" class="btn btn-primary">create family</button>
            
    	</form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div> 
  <!-- end of Trigger the modal with a button -->
        
         <!-- Go to Family-->
  <button type="button" id="login" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Go to family</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">TYPE ID AND FAMILY</h4>
        </div>
        <div class="modal-body">
            <form id="family_login" name="family_login" action="loginservlet" method="POST">
                
            <div class="form-group">
            <input type="number" name="loginid" id="loginid" placeholder="---enter id---"/>
    	    </div>
            
    	    <div class="form-group">
    	    <input type="text" id="family" name="family" class="form-control" placeholder="---enter family---" >
    	    </div>
            
            <button type="submit" id="login" class="btn btn-primary">Login Family</button>
                
            </form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div> 
  <!-- end of Trigger the modal with a button -->
  
  
   <!-- Remove -->
  <button type="button" id="remove" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal1">Remove family</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal1" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">TYPE_ID </h4>
        </div>
        <div class="modal-body">
            
            <form id="family_remove" name="family_remove" Method="POST">
                
            <div class="form-group">
            <input type="number" name="removeid" id="removeid" placeholder="---enter id---"/>
    	    </div>
            
            
            <button type="submit" id="remove" class="btn btn-primary">Remove Family</button>
                
            </form>
            
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div> 
  <!-- end of Trigger the modal with a button -->
  
  
  
   <!-- Update -->
  <button type="button" id="login" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal2">Update Family</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal2" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">TYPE ID AND FAMILY</h4>
        </div>
        <div class="modal-body">
            
            <form id="family_update" name="family_update" action="#" Method="GET">
                
            <div class="form-group">
            <input type="number" name="updateid" id="updateid" placeholder="---enter id---"/>
    	    </div>
            
    	    <div class="form-group">
    	    <input type="text" id="updatefamily" name="updatefamily" class="form-control" placeholder="---enter family---" >
    	    </div>
            
            <button type="submit" id="update" class="btn btn-primary">Update Family</button>
                
            </form>
            
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div> 
  <!-- end of Trigger the modal with a button -->
  
  
       
        <p></p>
        <table class="table" id="myTable">
            <thead>
                <tr>
                    <th>family id</th>
                    <th>families</th>
                </tr>
            </thead>
            <tbody>
              
          
            </tbody>
        </table>

    </div>
 

    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <script src="assets/js/familyscript.js"></script>
   
</body>
</html>

