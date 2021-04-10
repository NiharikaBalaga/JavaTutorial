package Tutorials;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
        
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
        System.out.println("hey1");
    }
    
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Constructors {
    public static void main(String[] args) {
        //MyMainEmployee harry = new MyMainEmployee();
        MyMainEmployee harry = new MyMainEmployee("Neha",101);
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        
        System.out.println(harry.getId());
        System.out.println(harry.getName());
//        MyEmployee nm= new MyEmployee();
//        nm.greet();
//        nm.dob=77;
        
//        Employee em=new Employee();
//        em.id=124;
        
    }
}
