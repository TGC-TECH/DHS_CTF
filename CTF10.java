public class AnotherProblem {
	public static void main(String[] args) {
		String key = "Set this variable to the correct key!";
​
		String encoded = "";
		for (int i = 0; i < key.length(); i++) {
			encoded += (int) key.charAt(i);
			if (i != key.length() - 1) encoded += " ";
		}
		if (encoded.equals("75 69 89 45 49 49 48 51 55")) System.out.println("That's correct! You've found the key!");
		else System.out.println("That isn't the key. Try again!");
	}
}