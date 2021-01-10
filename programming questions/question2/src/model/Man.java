package model;

public class Man extends Person{
    private String mouthStatus;
    //private boolean mouthStatus_changed;
    
    public Man(){
        this.mouthStatus = "close";
        //this.mouthStatus_changed = false;
    }

   

    public String change_MouthStatus(String status, Object requester){
        String answer = "Has this MAN mouth status changed? ";
        Boolean changed = false;

        if(requester instanceof Doctor)
        {
            
            if(status == "close"){
                changed = this.close_Mouth();
            } 
            else {
                changed = this.open_Mouth();
            }
            
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
