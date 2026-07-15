package testdata2;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class TestData2 {
    public static void main(String[] args) {
      
      Hashtable tbl = new Hashtable();
      Student s1,s2,sRet;
      s1 = new Student("66020228","Kritsakorn");
      tbl.put(s1.getId(), s1);
      s2 = new Student("66027023","Supakit");
      tbl.put(s2.getId(), s2);
      sRet = (Student)tbl.get("66027023");
      System.out.println("Student name is "+sRet.getName());
      System.out.println(s1.toString());
      String s = new String("Have a nice day");
      System.out.println("String Length"+s.length());
      s = s.replace('n', 'N');
      System.out.println(s);
      System.out.println("Converted to Uppercase"+s.toUpperCase());
      System.out.println("Converted to LowerUppercase"+s.toLowerCase());
      
      StringBuffer str = new StringBuffer("Object Programming");
      String aString = new String (str.toString());
      int pos = aString.indexOf(" Programming");
      str.insert(pos, " Oriented");
      System.out.println(str);
      
      int num = 0;
      StringTokenizer st = new StringTokenizer("My name is prachartip"," ");
      while(st.hasMoreTokens()){
          System.out.println(st.nextElement());
          num++;
      }
      System.out.println("String has "+num+" word");
      
      int a =20;
      Integer i = Integer.valueOf(a);
      Integer j = a;
      System.out.println(a+" "+i+" "+j);
      
      String bdate="1984";
      int age = 2026-Integer.parseInt(bdate);
      System.out.println(age);
    }
}
