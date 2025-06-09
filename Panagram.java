import java.util.*;

class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.nextLine();
        String lower = input.toLowerCase();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : lower.toCharArray()) {
            if (Character.isLetter(c)) { 
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
        }

        if (hm.size() == 26) {
            System.out.println("True (It's a Pangram)");
        } else {
            System.out.println("False (Not a Pangram)");
        }
    }
}