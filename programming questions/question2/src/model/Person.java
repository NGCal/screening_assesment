package model;

public class Person {
   private String mouthStatus;

   public Person(){
    this.mouthStatus = "close";

   }
   
    public String getMouthStatus(){
        return this.mouthStatus;
    }

   public String change_mouthStatus(String status){
       String answer = "Has this PERSON mouth status changed? ";
       Boolean changed;

       if(status == "close"){
           changed = this.close_Mouth();
       } 
       else {
           changed = this.open_Mouth();
       }
       
       answer = answer + changed + " Mouth status is " + this.mouthStatus;
       return answer;
   }

    private boolean open_Mouth(){

        if(this.mouthStatus == "close"){
            this.mouthStatus = "open";
            return true;
        }

        return false;
    }


    private boolean close_Mouth(){

        if(this.mouthStatus == "open"){
            this.mouthStatus = "close";
            return true;
        }

        return false;
    }
 
    
}
