import java.util.Scanner;	//	Scanner class to get an integer input from the user.

class Main{	//	every java program have a class definition (that matches the filename)	

	public static void main(String[] args){	//	entry point of program
		// helloWorldMethod();
		// outputMethod();
		// inputMethod();
		// conditionMethod();
		// loopMethod();
		// arrayMethod();	
		understandingClassMethod();
	}

	public static void helloWorldMethod(){
		// publc is access modifier
		// static means that the method can be accessed without any objects
		// void mean method does not return any value
		System.out.println("Hello, World!");	
		//	system is class
		//	out is public static field - it accepts output data.
		// 	println is method of system class
	}

	public static void outputMethod(){
		System.out.print("hi bud");			//	normal std o/p
		System.out.println("hi bud");		//	give new line after std o/p		
		System.out.printf("hi bud");		//	Tt provides string formatting like printf in c

		System.out.println("value = "+10);
		System.out.println("dheeraj"+" "+"poonia");
	}

	public static void inputMethod(){
		// import java.util.Scanner;
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();										//	similarly we use nextLong(), nextFloat(), nextDouble(), input.next() for string
		System.out.println("You entered : "+number);

		String name = input.next();
		System.out.println("You entered : "+name);
		input.close();																	//	recommended to close the scanner object once the input is taken.
	}

	public static void conditionMethod(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you age: ");
		int age = input.nextInt();
		
		int generation = 0;
		if(age<18){
			generation = 1;
			System.out.println("teenager");
		}else if(age<30){
			generation = 2;
			System.out.println("youngster");
		}else{
			generation = 3;
			System.out.println("adult");
		}

		switch(generation){
			case 1:
				System.out.println("generation 1");
			break;
			case 2:
				System.out.println("generation 2");
			break;
			case 3:	
				System.out.println("generation 3");
			break;
			default:	
				System.out.println("Oops something wrong");
		}
	}

	public static void loopMethod(){
		for(int i=1; i<=10; i++){
			System.out.println(i);
		}

		int i=1;
		while(i<=10){
			System.out.print(i+", ");
			i++;
		}
		System.out.println();
	}

	public static void arrayMethod(){
		int[] arr;															//	Declaration of array

		arr = new int[3];												//	or int[] arr = new int[3];

		arr[0] = 10;	arr[1] = 20; arr[2] = 30;	//	Initialize

		System.out.println("Pattern1: ");
		for(int i=0; i<3; i++){									
			System.out.print(arr[i]);
		}
		System.out.println();

		int[] arr2 = {1,2,3,4,5};								//	Declaration with Initialization 

		System.out.println("Pattern2: ");
		for(int i=0; i<arr2.length; i++){			
			System.out.println(arr2[i]);
		}

		System.out.println("Pattern3: ");
		for(int item: arr2){									
			System.out.print(item+" ");
		}
		System.out.println();

		System.out.println("Pattern4: ");
		for(Object item: arr2){								//	Oject similar to auto in cpp
			System.out.print(item+" ");						
		}

		System.out.println("\nPattern5: ");
		int[][] matrix = {{1, 2}, {3, 4}};		
		for(int[] row: matrix){									// Pattern5
			for(int item: row){
				System.out.print(item+" ");
			}
			System.out.println();
		}
	}

	public static void understandingClassMethod(){
		UnderstandingClass obj = new UnderstandingClass();
		System.out.println("Instance Variable = "+obj.getInstanceVariableMethod());
		obj.setInstanceVariableMethod(50);
		System.out.println("Updated Instance Variable = "+obj.getInstanceVariableMethod());
	}
}

class UnderstandingClass{
	private int instance_variable = 10;							// State, private: can not be accessed by other classes.
	
	void UnderstandingClass(){																		// Constructor: it also have access modifier, parameterized Constructor
		System.out.println("Oops1 method called");
	}

	public int getInstanceVariableMethod(){					// Behavior, public:  accessed by other classes.
		// here not mention static because we access this method by creating object
		return instance_variable;
	}
	
	public void setInstanceVariableMethod(int new_value){
		instance_variable = new_value;							// this.instance_variable also same, we use this when statement vunerable to became ambiguous
		// imp use case of this keyword : https://www.programiz.com/java-programming/this-keyword
	}
}

class UnderstandingOops{
	// https://www.programiz.com/java-programming/inheritance
}
