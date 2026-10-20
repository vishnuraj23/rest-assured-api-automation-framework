package Java_Program;



public class String_Reverse {

	public static void main(String[] args) {
	
		String str = "Vishnu Raj";
		String[] words = str.split(" ");
		String rev ="";
		for(String word : words) {
		for(int i=word.length()-1; i>=0; i--) {
			rev = rev + word.charAt(i);
		}
		rev = rev+ " ";
		}
		System.out.println(rev);
	}

}
