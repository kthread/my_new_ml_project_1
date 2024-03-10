
public class ValidPalindrome {

//	Write a function that takes a string, s, as an input and determines whether or not it is a palindrome.
# adding a comment
	  public static boolean isPalindrome(String s) {
		    int left = 0;
		    int right = s.length() - 1;
		    while (left < right) {
		      if (s.charAt(left) != s.charAt(right))
		      {
		        return false;
		      }
		      left = left + 1;
		      right = right - 1;
		    }
		    return true;
		  }
	
}
