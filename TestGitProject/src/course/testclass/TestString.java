package course.testclass;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		String s3=new String( "hello" );
		String s4 = new String( "hello" );
		if ( s1 == s2 ) System.out.println(true);
		else System.out.println(false);
		
		if ( s3 == s4 ) System.out.println(true);
		else System.out.println(false);

	}

}
