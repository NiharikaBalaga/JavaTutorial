package Tutorials;

class MyEmployee{
	public int dob;
    private int id=10;
    private String name;
	
//    public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        this.name = n;
//    }
    
    public void greet() {
    	System.out.println("hey");
    }

	
}
public class GetterSetters {

    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        MyEmployee Sita = new MyEmployee();
//        harry.id = 45;
//        harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
//        harry.setName("CodeWithHarry");
//        System.out.println(harry.getName());
          //harry.setId(234);
          //System.out.println(harry.getId());
        //harry.dob=102;
        //harry.setId(100);
        //System.out.println(harry.getId());
       
        
    }
}

