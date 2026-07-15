package register;
 
public class Course {
    String cid;
    String cName;
    String time;
    String room;
    boolean status;
    Student s[];
    int sNumber;
    Course(){
        s = new Student[30];
        sNumber = 0;
    }
    void setDetail(String id,String cn,String room,boolean s){
        cid = id;
        cName = cn;
        this.room = room;
        status = s;
    }
    String showDetail(){
        return "Course id: "+cid+"\nCourse Name: "+cName+
                "\nRoom: "+room+"\nStatus: "+status; 
    }
     void enroll(Student student){
        s[sNumber] = student;
        sNumber++;
    }
    void showStudent(){
        System.out.println("Member of the class");
        for(int i=0;i<sNumber;i++){
            System.out.println(s[i].showDetail());
        }
    }
}
