package Tutorials;

class MyEmployee{
	
    private int id;
    private String name;
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
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
          harry.setId(234);
          System.out.println(harry.getId());
    }
}

