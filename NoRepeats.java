package noRepeats;
import java.util.Arrays; //import java arrays

public class NoRepeats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wonderful = "And I think to myself: what a wonderful world!"; //create string variable
		System.out.println(wonderful);
		abcDelete(wonderful); //use method on wonderful
	}
	public static void abcDelete(String str) {
		 
		 char[] characters = str.toCharArray(); //create a char array from the string of all the words
		 String noRepeats = ""; //create an empty string
		 //create for loop to go through array length
		 for(int i = 0; i < characters.length; i++) {
			 if (Character.isWhitespace(characters[i])) { //check if there an iteration is whitespace, if it is add it.
				 noRepeats = noRepeats + characters[i];	
				}
			 else if(noRepeats.toLowerCase().indexOf(characters[i]) == -1){ //checks if character exists if it doesn't return -1, to lowerCase is needed as to compare values if not D annd d are different 
				noRepeats = noRepeats + characters[i]; //string equals string + new character
			}
		
			 
		 }
		
		System.out.println(noRepeats); //method will print out a sting without duplicated but leaving spaces and capitals in place
		
	}
}
