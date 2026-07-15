package register;
public class Register {

    public static void main(String[] args) {
        Student s1,s2;
        Course c1,c2;
        s1 = new Student();
        s2 = new Student();
        c1 = new Course();
        c2 = new Course();
        s1.setdetail("66020228", "Kritsakorn", "Buein", "66020228@up.ac.th", "IT");
        s2.setdetail("67020364", "Kan", "jarungjit", "667020364@up.ac.th", "IT");
        c1.setDetail("222325", "Enterprise Java Programming", "CE7310/1", true);
        c2.setDetail("222321", "Applied it", "ICT 1219", true);
        s1.regis(c1);
        s1.regis(c2);          
        s2.regis(c1);
        s2.regis(c2);          
        System.out.println(s1.showDetail());
        s1.showCourse();
        System.out.println(s2.showDetail());
        s2.showCourse();
        System.out.println(c1.showDetail());
        c1.showStudent();
        System.out.println(c2.showDetail());   
        c2.showStudent();                     
    }
}
