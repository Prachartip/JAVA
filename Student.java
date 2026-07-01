package register;
 
public class Student {
    String sId;
    String firstName;
    String lastName;
    String eMail;
    int year;
    String major;
    Course[] c ;
    int cNumber;
    Student(){
        c = new Course[7];
        cNumber = 0;
    }
    void setdetail(String id, String fn, String ln, String email, String maj){
        sId = id;
        firstName = fn;
        lastName = ln;
        eMail = email;
        major = maj;
    }
    String showDetail(){
        return "Student ID: "+sId+"\nName: "+firstName+" "+lastName+
                "\nMajor: "+major;
    }
     void regis(Course course){
        c[cNumber] = course;
        cNumber++;
        course.enroll(this);
    }
    void showCourse(){
        System.out.print("Registing Course\n");
        for(int i=0;i<cNumber;i++){
            System.out.println(c[i].showDetail());
        }
        System.out.println("\n");
    }
}