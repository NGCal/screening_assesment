package q3.courses.selection.model;

import java.util.ArrayList;
import java.util.Map;
import q3.courses.selection.model.coursesSelection;

public class selectionResponse {

   private coursesSelection courses;
   private boolean validated;
   private Map<String, String> errorMessages;

   public coursesSelection getCourse(){
       return this.courses;
   }

   public void setCourse(coursesSelection courses){
        this.courses = courses;
    }

    public Map<String, String>geterrorMessages(){
         return this.errorMessages;
     }

    public void seterrorMessages(Map<String, String>errorMessages){
        this.errorMessages = errorMessages;
     }

    public boolean getValidated(){
        return this.validated;
     }

     public void setValidated(boolean valid){
        this.validated = valid;
     }

     
}