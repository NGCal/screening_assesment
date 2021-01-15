<!DOCTYPE html>
<html lang="en">
<head>
    <title>Course Selection</title>

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Courses Selection</title>
    
    <style type="text/css">


      h4.resultTittle{
        color:black;
      }

      pre.resultBody{
        color:darkblue;
      }

    </style>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/validateSelection.js"></script>
</head>
<body>
    
    <h1>Course Selection Form</h1>
    <h4>Greetings and salutations ${name}</h4>
    <p>You have the option to input up to three courses but one of those courses has to be a calculus</p>
    <hr/>
  
    <form action="saveSelection" method="post" id="courseSelectionForm" command="courses">
      <table>
        <tr>
          <td>Name:</td>
          <td><input id="course1" name="course1" type="text" /></td>
        </tr>
        <tr>
          <td>Name:</td>
          <td><input id="course2" name="course2" type="text" /></td>
        </tr>
        <tr>
          <td>Name:</td>
          <td><input id="course3" name="course3" type="text" /></td>
        </tr>
          <td></td>
          <td><button id="button" type="submit">Submit</button></td>
        </tr>
      </table>
    </form>
    <div id="resultContainer" style="display: none;">
        <hr/>
        <h4 id="rTittle" class="resultTittle">This was your selection</h4>
         <pre id="rBody"class="resultBody">
           <code></code>
          </pre>
       </div>
</body>
</html>