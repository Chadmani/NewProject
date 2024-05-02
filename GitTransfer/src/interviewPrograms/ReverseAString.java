package interviewPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A = "Manikandan";
		StringBuffer Test = new StringBuffer();
		Test.append(A);
		System.out.println("Before a String Reverse : " + A);
		System.out.println("After a String Reverse is : "+ Test.reverse());

	}

}
