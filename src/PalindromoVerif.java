import java.util.Stack;

public class PalindromoVerif {
    public static void main(String[] args) {
        String input = "arara"; // Troque por qualquer palavra/frase/número
        System.out.println(isPalindromo(input));
    }

    public static boolean isPalindromo(String str) {
        Stack<Character> stack = new Stack<>();
        str = str.replaceAll("\\s+", "").toLowerCase(); // Remove espaços e torna minúscula

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
