package q3.courses.selection.controller;

import q3.courses.selection.model.*;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class selectionController {
    
    
    @GetMapping("/")
    public String selectionForm(Model model,@RequestParam(defaultValue = "human") String name) {
        model.addAttribute("name",name);
    
      return "views/courseSelectionForm";
   }

   @PostMapping(value = "/saveSelection", produces = { MediaType.APPLICATION_JSON_VALUE })
   @ResponseBody
   public selectionResponse saveSelection(@RequestBody @Valid coursesSelection courses,
         BindingResult result, Model model) {

            selectionResponse response = new selectionResponse();
            
            Map<String, String> errors = new HashMap<String, String>();
 

            if(result.hasErrors() && result.getErrorCount() > 2){
                
                errors.put("Not enough courses", "You need at least one course");
                response.setValidated(false);
                response.seterrorMessages(errors);
              
             }
             else if(!courses.validSelection()){

                errors.put("Missing course", "You need at least one calculus");
                response.setValidated(false);
                response.seterrorMessages(errors);
                

            }
            else{
                response.setValidated(true);
                response.setCourse(courses);
            }
        return response;      
      
   }

}