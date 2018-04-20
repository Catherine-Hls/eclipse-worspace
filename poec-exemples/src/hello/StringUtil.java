package hello;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringUtil {

	public static int countCharacters(String text) {
		// v1
		// String textWithoutSpaces = text.replace(" ", "");
		// return textWithoutSpaces.length();
		
		// v2
		int charCount = 0;
		for (int i = 0; i < text.length(); i++) {
//			if(text.charAt(i) != ' ') {
			if(! Character.isWhitespace(text.charAt(i))) {
				charCount++;
			}
		}
		
		return charCount;
	}

	public static int countWords(String text) {
		// v1
//		if(text.isEmpty()) {
//			return 0;
//		}
//		
//		int wordsCount = 0;
//		boolean isCharInAWord = false;
//		for (int i = 0; i < text.length(); i++) {
//			
//			if(! isCharInAWord
//			  && text.charAt(i) != ' ') { // debut d'un mot
//				isCharInAWord = true;
//			} else if (isCharInAWord
//					&& text.charAt(i) == ' ') { // fin d'un mot
//				isCharInAWord = false;
//				wordsCount++;
//			}
//			
//		}
//		
//		if(isCharInAWord) {
//			wordsCount++;
//		}
//		return wordsCount;
		
		// v2
		int wordsCount = 0;
		String[] splittedText = text.split(" ");
		for (int i = 0; i < splittedText.length; i++) {
			if(! splittedText[i].isEmpty()) {
				wordsCount++;
			}
		}
		
		return wordsCount;
		
	}

	public static boolean isPalindrome(String text) {
		if(text.isEmpty()
		|| text.length() == 1) {
			return false;
		}
		
//		if(text.length() == 1) {
//			return false;
//		}
		
		for (int i = 0; i < text.length() / 2; i++) {
			if(text.charAt(i) != text.charAt(text.length() - i - 1)) {
				return false;
			}
		}
		
		return true;
	}

	public static Map<String, Integer> countWordOccurences(String text) {
		HashMap<String, Integer> wordsCounters = new HashMap<String, Integer>();

		String[] words = text.split(" ");

		for (String currentWord : words) {	
			Integer counter = wordsCounters.getOrDefault(currentWord, 0);
			wordsCounters.put(currentWord, counter + 1);
		}
		
		return wordsCounters;
	}
}
