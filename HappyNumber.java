class HappyNumber {
	
//	Write an algorithm to determine if a number n  is a happy number.

  public static int sumOfSquaredDigits(int number) {
      int totalSum = 0;
      while (number != 0) {
        int digit = number % 10;
        number = number / 10;
        totalSum += (Math.pow(digit, 2));
      }
      return totalSum;
  }
  
  public static boolean isHappyNumber(int n) {
      int slowPointer = n; 
      int fastPointer = sumOfSquaredDigits(n); 

      while (fastPointer != 1 && slowPointer != fastPointer) {
          slowPointer = sumOfSquaredDigits(slowPointer);
          fastPointer =  sumOfSquaredDigits(sumOfSquaredDigits(fastPointer));
      }
      return fastPointer == 1;
  }
  
}
