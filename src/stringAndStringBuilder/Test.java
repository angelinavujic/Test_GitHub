package stringAndStringBuilder;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    
    public boolean isGoodPassword(String input) {
        LinkedList<String> stack = new LinkedList<>();
        Pattern symbols = Pattern.compile("!?%&$/.,-<>#*+");
        Pattern digit = Pattern.compile("\\d+");
        Pattern capitalLetter = Pattern.compile("[A-Z]");

        String[] tokens = input.split("\\s+");
        for (String token : tokens) {
            Matcher symbolMatcher = symbols.matcher(token);
            Matcher numericMatcher = digit.matcher(token);
            Matcher letterMatcher = capitalLetter.matcher(token);
            
            switch (token) {
                case "": // Leerer Token �berspringen
                    break;
                case " ": // Leerzeichen �berspringen
                    break;
                default:
                    if (symbolMatcher.find() && numericMatcher.find() && letterMatcher.find()) {
                        return true; // Erf�llt alle Kriterien, daher sicher
                    }
                    break;
            }
        }
        return false; // Kein Token erf�llt alle Kriterien
    }
    
    
    public static void main(String[] args) {
        String password = "12345671Ga";
        if (isGoodPassword(password) {
            System.out.println("Das Passwort ist sicher.");
        } else {
            System.out.println("Das Passwort ist nicht sicher.");
        }
    }
}