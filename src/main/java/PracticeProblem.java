import java.util.ArrayList;
import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {

	}


	public static ArrayList<String> perms(String str){
		ArrayList<String> perms = new ArrayList<String>();
		permsHelper("", str, perms);
		return perms;
	}

	public static void permsHelper(String usedLetters, String unusedLetters, ArrayList<String> perms){

		//base case
		if (unusedLetters.length() == 0){
			perms.add(usedLetters);
		}


		//recursive case
		for (int i = 0; i < unusedLetters.length(); i++){
			char currentChar = unusedLetters.charAt(i);
			String used = usedLetters + currentChar;
			String unused = unusedLetters.substring(0, i) + unusedLetters.substring(i + 1);
			permsHelper(used, unused, perms);
		}
	}

	public static ArrayList<String> permsUnique(String str){
		ArrayList<String> perms = new ArrayList<String>();

		permsUniqueHelper("", str, perms);
		return perms;
	}


	public static void permsUniqueHelper(String usedLetters, String unusedLetters, ArrayList<String> perms){

		//base case
		if (unusedLetters.length() == 0){
			if (!perms.contains(usedLetters)){
				perms.add(usedLetters);
			}
		}
	
		//recursive case
		for (int i = 0; i < unusedLetters.length(); i++){
			char currentChar = unusedLetters.charAt(i);
			String used = usedLetters + currentChar;
			String unused = unusedLetters.substring(0, i) + unusedLetters.substring(i + 1);
			permsUniqueHelper(used, unused, perms);
		}
	}
}
