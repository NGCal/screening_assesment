$(document).ready(function(){
    $("#courseSelectionForm").submit(function (event) {

      event.preventDefault();

      var selection ={};
      selection["course1"] = $("#course1").val();
      selection["course2"] = $("#course2").val();
      selection["course3"] = $("#course3").val();
      
      selection = JSON.stringify(selection);
      sendPost(selection);

      });
  });

  function sendPost(selection){

   
      $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/saveSelection",
        data:selection,
        dataType:'json',
        success: function(res) {
          if(selection.toLowerCase().includes("calculus")){
              if(res.validated){
                $('input').val('');
                  $('#resultContainer pre code').text(JSON.stringify(res.course));
                  $('#resultContainer').show();
                  $('.resultTittle').text("Congratulations your selection was saved")
                }
            else{
                  $('#resultContainer pre code').text(JSON.stringify(res.errorMessages));
                  $('#resultContainer').show();
                }
        
            }
          else{
              $('.resultTittle').text("Your course selection contains errors");
              $('#resultContainer pre code').text(JSON.stringify(res.errorMessages));
              $('#resultContainer').show();
                }
      }
  });



  }