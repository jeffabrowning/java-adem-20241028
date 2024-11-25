public class Question2 {

    //Question 2: Palindrome Check
    //Q: Write a program to check if a string is a palindrome.

    //fields
    String string;                                                                  //declare string variable for parameter
    int i = 0;                                                                      //sets while loop counter; assigned/reassigned in loop
    int j;                                                                          //declare new variable to be instantiated in method
    boolean palindrome = true;                                                      //sets boolean flag for palindrome status, initialized to true which remains unless changed to false by loop

    //constructor
    public Question2 (String string) {                                              //accepts string parameter
        this.string = string;
    }

    //method uses: boolean flag, while loop, if/else statements, and string methods charAt and length
    public void checkIfPalindrome() {

        j = (string.length() - 1);
        while (i < j) {                                                             //runs until reaches middle of string where the 2 ends meet each other
            if (string.charAt(i) != string.charAt(j)) {                             //compares characters from beginning and end of string
                palindrome = false;                                                 //sets flag to false if characters don't match
                break;                                                              //breaks loop if flag set to false
            } else {                                                                //if not false
                i = i + 1;                                                          //then steps inward from both ends and repeats comparison
                j = j - 1;
            }
        }

        if (palindrome == true) {                                                   //if not flagged as false, displays status as palindrome
            System.out.println("String \"" + string + "\" IS a palindrome! It reads the same forwards and backwards.");
        } else {
            System.out.println("String \"" + string + "\" is NOT a palindrome!");   //if flagged as false, displays status as not a palindrome and first instance of character mismatch
            System.out.print("The first mismatch occurs with index " + i + " = '" + string.charAt(i));
            System.out.println("' and index " + j + " = '" + string.charAt(j) + "'.");
        }
    }
}