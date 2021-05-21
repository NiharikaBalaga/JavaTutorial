package Tutorials;

public class methods_basics {
//no return and taking parameters
	static void add(int x,int y) {		//(a,b)
		int c=x+y;
		System.out.println(c);
	}
	
//no parameter and no return
 void greet() {
		System.out.println("Good Morning");
	}

	//taking parameters and using return
float operation(int x,int y) {
	float c=x*y*0.1f;
	return c;	
}

void Greetname(String a) {
	System.out.println("Good Night "+ a);
}

//not taking parameter and using return
static int n() {
	int password=1234;
	return password;
}
	
// return 	parameters
// yes		yes
// yes 		no
// no		yes
// no 		no

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methods_basics h=new methods_basics();
		Methods m=new Methods();
		m.doll(1, 2, 3);
		int a=10;
		int b=20;
//		add(a,b);
//		add(2,4);
//		add(7,8);
		h.greet();
		float d=h.operation(9, 8);
//		System.out.println(d-a);
//		Gre"etname("Yamini");
//		Greetname("Victor);
		
	}

}
