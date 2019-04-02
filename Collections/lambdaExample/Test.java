package lambdaExample;

public class Test {

	interface func1
	{
		int operation(int a,int b);
	}
	
	interface func2{
		void Saymessage(String message);
	}
	
	private int operate(int a, int b, func1 obj) {
		return obj.operation(a, b);
		
	}
	public static void main(String[] args) {
		func1 add = (int x,int y)->x+y;
		func1 multiply = (int x,int y)->x*y;
		func1 division = (int x,int y)->x/y;
		
		Test tobj = new Test();  
        System.out.println("Addition is " + 
                          tobj.operate(6, 3, add)); 
   
        System.out.println("Multiplication is " + 
                          tobj.operate(6, 3, multiply));
        
        System.out.println("Division is " + 
                tobj.operate(6, 3, division));

	}

}
