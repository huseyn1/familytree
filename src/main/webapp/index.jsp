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
        
    	<button type="submit" class="btn btn-primary">show families</button>
        <button type="submit" class="btn btn-primary">delete families</button>
        <button type="submit" class="btn btn-primary">update families</button>
        <p></p>
        <table class="table" id="myTable">
            <thead>
                <tr>
                    <th>family id</th>
                    <th>families</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1001</td>
                    <td>Huseynovlar</td>
                </tr>
                <tr>
                    <td>1002</td>
                    <td>Memmedovlar</td>
                </tr>
                <tr>
                    <td>1003</td>
                    <td>Memmedovlar</td>
                </tr>
                <tr>
                    <td>1004</td>
                    <td>Lazarevler</td>
                </tr>
                <tr>
                    <td>1005</td>
                    <td>Eliyevler</td>
                </tr>
          
            </tbody>
        </table>

    </div>
 

    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <script src="assets/js/familyinsert.js"></script>
    <script>
        $(document).ready(function(){
          $('#myTable').DataTable();
        });
    </script>
</body>
</html>

