/* 
	Author Adam. 
	Date: Dec_26_2023
	Title: Phrase-O-Matic
	About: An app that makes 3 lists of of words and then randomly picks up one word from each of the three lists, then print out the results to the console. 
*/
public class PhraseOMatic {
	public static void main(String []args) {
		String[] wordListOne = {"Artemis", "Zeus", "Jesus"};
		String[] wordListTwo = {"Sasuki", "Naruto", "Gara"};
		String[] wordListThree = {"Ino", "Hinata", "Temari"};

		int listOneLength = wordListOne.length;
		int listTwoLength = wordListTwo.length;
		int listThreeLength = wordListThree.length;

		java.util.Random randomGenerator = new java.util.Random();
		int ListOneRandomWord = randomGenerator.nextInt(listOneLength);
		int ListTwoRandomWord = randomGenerator.nextInt(listTwoLength);
		int ListThreeRandomWord = randomGenerator.nextInt(listThreeLength);

		String finalPhrase = (wordListOne[ListOneRandomWord] + ", " + wordListTwo[ListTwoRandomWord] + ", and " + wordListThree[ListThreeRandomWord] + ".");

		System.out.println("In order to find the one piece Luffy needs " + finalPhrase);
	}
}