package stringAndStringBuilder;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordTester {
	
	public static boolean isGoodPassword(String password) {
		Pattern symbols = Pattern.compile(".*[!@#$%^&*()\\[\\]{}|<>?].*");
		Pattern digit = Pattern.compile("\\d");
		Pattern capitalLetter = Pattern.compile("[A-Z]");
		Pattern lowercasePattern = Pattern.compile(".*[a-z].*");
		Pattern lengthPattern = Pattern.compile("^.{8,}$");
		
		Matcher symbolMatcher = symbols.matcher(password);
		Matcher digitMatcher = digit.matcher(password);
		Matcher captialMatcher = capitalLetter.matcher(password);
		Matcher lowercaseMatcher = lowercasePattern.matcher(password);
		Matcher lengthMatcher = lengthPattern.matcher(password);
		
		
		
		if(!symbolMatcher.matches()) {
			System.err.println("The password does not contain a sepcial Symbol");
			return false;
		}
		
		if(!digitMatcher.matches()) {
			System.err.println("The password does not contain a digit");
			return false;
		}
		
		if(!captialMatcher.matches()) {
			System.err.println("The password does not cotain a capital Letter");
			return false;
		}
		
		if(!lowercaseMatcher.matches()) {
			System.err.println("The passweord does not contain a lowercase Letter");
			return false;
		}
		
		if(!lengthMatcher.matches()) {
			System.err.println("The password is not long enough! Please try again!");
			return false;
		}
		return true;
			}
	

	    public static void main(String[] args) {
	        String[] passwords = {
	            "Abcd1234!", // Gültiges Passwort
	            "abc123!",   // Zu kurz
	            "ABCD123!",  // Kleinbuchstaben fehlen
	            "abcd!@#$",  // Großbuchstaben fehlen
	            "Abcd1234"   // Sonderzeichen fehlen
	        };

	        for (String password : passwords) {
	          isGoodPassword(password);
	        }
	    }
	}


		
	
