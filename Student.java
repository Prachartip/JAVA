package testdata2;

public class Student {
    private String name;
    private String id;
    Student(String i,String n){
        id = i;
        name = n;
    }
    String getId(){
        return id;
    }
    String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}
