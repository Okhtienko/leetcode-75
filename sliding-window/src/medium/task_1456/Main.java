package medium.task_1456;

public class Main {
	public static void main(String[] args) {
		final String str = "weallloveyou";
	  final int k = 7;
		System.out.println(maxVowels(str, k));
	}

	public static int maxVowels(final String str, final int k) {
		int numberOfVowels = findNumberOfVowels(str, k);
		int maxNumberOfVowels = numberOfVowels;
		for (int i = 0; i < str.length() - k; i++) {
			numberOfVowels -= isVowel(str.charAt(i)) ? 1 : 0;
			numberOfVowels += isVowel(str.charAt(i + k)) ? 1 : 0;
			maxNumberOfVowels = Math.max(maxNumberOfVowels, numberOfVowels);
		}
		return maxNumberOfVowels;
	}

	public static int findNumberOfVowels(final String str, final int k) {
		int numberOfVowels = 0;
		for (int i = 0; i < k; i++) {
			numberOfVowels += isVowel(str.charAt(i)) ? 1 : 0;
		}
		return numberOfVowels;
	}

	public static boolean isVowel(final char symbol) {
		if (symbol =='a'|| symbol =='e'||symbol =='i'|| symbol =='o'|| symbol =='u')return true;
		return false;
	}
}
