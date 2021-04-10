package Tutorials;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor of base class with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int y){
       super(y);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
    	//super(x,z);
    	//super(x,y);
        super(z);		
        
        System.out.println("I am an overloaded constructor of Derived with value of x y z as: " +x +" "+ y +" " +z);
    }
}
public class Inheritance_Constructors {
    public static void main(String[] args) {
         //Base1 b = new Base1(98);
         //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(14);
        //ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}

