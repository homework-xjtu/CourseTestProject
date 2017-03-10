package course.testclass;

public class TestClassCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world!");
		new TestClassCreation();

	}
	public TestClassCreation(){
		System.out.println("constructors!");
	}
	public TestClassCreation( int i ){
		System.out.println("This is a "+i	);
	}

}
