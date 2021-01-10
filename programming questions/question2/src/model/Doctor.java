package model;

public class Doctor extends Person{

    public String askto_OpenMouth(Person patient){
        String ans = patient.change_mouthStatus("open");
        return ans;

    }

    public String askto_OpenMouth(Man patient){
        String ans = patient.change_MouthStatus("open", this);
        return ans;
    }

    public String askto_CloseMouth(Person patient){
        String ans = patient.change_mouthStatus("close");
        return ans;
    }

    public String askto_CloseMouth(Man patient){
        String ans = patient.change_MouthStatus("close", this);
        return ans;
    }


    
}
