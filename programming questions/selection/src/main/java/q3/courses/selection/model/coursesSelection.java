package q3.courses.selection.model;

import java.util.ArrayList;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class coursesSelection{

    private @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
    @NotBlank(message="Field can't be empty")
    private String course1;
    @NotBlank(message="Field can't be empty")
    private String course2;
    @NotBlank(message="Field can't be empty")
    private String course3;

    public void setcourse1(String name){
        this.course1 = name;
    }
    public void setcourse2(String name){
        this.course2 = name;
    }
    public void setcourse3(String name){
        this.course3 = name;
    }

    public String getcourse1(){
        return this.course1;
    }

    public String getcourse2(){
        return this.course2;
    }

    public String getcourse3(){
        return this.course3;
    }

   /*public ArrayList<String> getallCourses(){

        ArrayList<String> courses = new ArrayList<String>();
        if(this.course1 != null) courses.add(this.course1);
        if(this.course2 != null) courses.add(this.course2);
        if(this.course3 != null) courses.add(this.course3);

        return courses;
    }*/

    public boolean validSelection(){
        String c1 = this.course1;
        String c2 = this.course2;
        String c3 = this.course3;
        String c = "calculus";

        if(c1 != null && c1.toLowerCase().contains(c)) return true;
        if(c2 != null && c2.toLowerCase().contains(c)) return true;
        if(c3 != null && c3.toLowerCase().contains(c)) return true;
         return false;
     }

    
}