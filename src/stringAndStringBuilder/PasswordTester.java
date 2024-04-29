package stringAndStringBuilder;


public class PasswordTester {
	
	public static boolean isGoodPassword(String password) {
		
	  if (password == null || password.length() < 8) {
      	System.err.println("The password should have at least 8 signs.\n");
      	return false;
      }

      if (!password.matches(".*[A-Z].*")) {
          System.err.println("The password should contain at least one capital letter.\n");
          return false;
      }

      if (!password.matches(".*[a-z].*")) {
      	System.err.println("The password should contain at least one small letter.\n");
      	return false;
      }

      if (!password.matches(".*\\d.*")) {
      	System.err.println("The password should contain at least one digit.\n");
      	return false;
      }

      if (!password.matches(".*[!@#$%^&*()-_=+\\|\\[{\\]};:'\",<.>/?].*")) {
      	System.err.println("The password should contain at least one special symbol.\n");
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


		
	
