package Java_Program;

public class Find_aeiou_inString {

	public static void main(String[] args) {
		String str = "Vishnu Raj";
		
		str = str.toLowerCase();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if((ch == 'a') || (ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u')) {
				
				System.out.println("Vowels : " +ch );
				count++;
			}
			
		}
		System.out.print("Total vowel count:"+count);
	}

}
