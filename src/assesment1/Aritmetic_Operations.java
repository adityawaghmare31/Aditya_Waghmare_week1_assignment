package assesment1;

public class Aritmetic_Operations {
	int c;
	void Addition(int a, int b) {
		c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is= "+c);
	}
	
	
	void Substraction(int a, int b) {
		c=a-b;
		System.out.println("Substraction of "+a+" and "+b+" is= "+c);
	}
	
	void Multiplication(int a, int b) {
		c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is= "+c);
	}
	
	void Division(int a, int b) {
		c=a/b;
		System.out.println("Division of "+a+" and "+b+" is= "+c);
	}
	public static void main(String[] args) {
		Aritmetic_Operations aritmetic_Operations=new Aritmetic_Operations();
		aritmetic_Operations.Addition(25, 45);
		aritmetic_Operations.Substraction(56, 42);
		aritmetic_Operations.Multiplication(25, 5);
		aritmetic_Operations.Division(125, 5);
	}
}
