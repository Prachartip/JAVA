package testdata;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class TestData {

    public static void main(String[] args) {
       Vector<Double> score = new Vector<>();
       int x[] = new int[5];
       score.add(56.6);
       score.add(65.7);
       score.add(99.6);
       score.add(85.8);
       x[0]= 65;
       x[1]= 55;
       score.insertElementAt(66.6, 3);
       //score.remove(1);
       System.out.println("x size: "+x.length);
       Iterator itr = score.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
       System.out.println("score.size: "+score.size());
        //int[]students;
       /*
       String pop; 
       LinkedList<Integer> score = new LinkedList<>(); 
       ArrayList<String>list = new ArrayList<>();
       Stack<String> stack = new Stack<>();
       list.add("Krisakorn");
       list.add("Supakit");
       list.add("Kanyarat");
       list.add("Kan");
       stack.push("Krisakorn");
       stack.push("Supakit");
       stack.push("Kanyarat");
       stack.push("Kan");
       score.add(99);
       score.add(88);
       score.add(60);
       score.add(55);
       Iterator itr = list.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
       Iterator itrs = score.iterator();
    while(itrs.hasNext()){
           System.out.println(itrs.next());
    }
    pop = stack.pop();
    Iterator itrstack = stack.iterator();
    while(itrstack.hasNext()){
           System.out.println(itrstack.next());
    }
    System.out.println(pop);
    }
       */
       /*
       students = new int[7];
       for(int i=0;i<students.length;i++){
           students[i]=2*i;
       System.out.println("Value stored in Array: ");
       }
       for(int i=0;i<students.length;i++){
        System.out.println(students[i]);
       }
       int[] arr = {55,69,70,30,80};
       {
       System.out.println("Array Length = " + students.length);
       System.out.println("Values Stored in Array:");
       }
       for(int i=0; i<students.length;i++){
       System.out.println(students[i]);
       }
    }*/
    
}}
