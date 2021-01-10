

import model.Doctor;
import model.Man;
import model.Nurse;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Welcome to your Regular check up!");

    
        Man patient = new Man();
        Nurse nurse = new Nurse();
        Doctor doctor = new Doctor();

        System.out.println(nurse.getClass().getSimpleName() + ":'Please Open your mouth'");
        System.out.println("Narrator: "+nurse.askto_OpenMouth(patient));
        System.out.println(nurse.getClass().getSimpleName() + ":'I can make you open your mouth!'");
        
            //this gives an error
            //patient.mouthStatus = "open"; 
    
        System.out.println("Narrator: But the nurse couldn't! Only if the pattients changed it's essence would the nurse get them to open their mouth;then it wouldnt be a " 
        + patient.getClass().getSimpleName()+" anymore");

        System.out.println("'Let me try' said the "+ doctor.getClass().getSimpleName());
        System.out.println(doctor.getClass().getSimpleName() + ":'Please Open your mouth'");
        System.out.println("Narrator: "+doctor.askto_OpenMouth(patient));
        System.out.println(doctor.getClass().getSimpleName() + ":'Thank you' the doctor took a look inside");
        patient.change_mouthStatus("close");
        System.out.println(patient.getClass().getSimpleName()+": mouth " + patient.getMouthStatus());
        System.out.println(doctor.getClass().getSimpleName() + ":'oops not yet'");
        patient.change_mouthStatus("open");
        System.out.println(patient.getClass().getSimpleName() + ":'sorry' " +"mouth " + patient.getMouthStatus());

    }
}
