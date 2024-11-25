public class Question1 {

    //Question 1: Counting Vowels
    //Q: Write a program to count the number of vowels in a string.

    //fields
    String string;                                                  //declare string variable for parameter
    int vowels;                                                 //create variable to hold the vowel count

    //constructor
    public Question1(String string) {                               //accepts string parameter

        this.string = string;
    }

    //method uses: for loop, switch, and the string methods toUpperCase, length, and charAt
    public void countStringVowels() {

        vowels = 0;
        String stringUpper = string.toUpperCase();                  //convert input string to uppercase to consolidate positive cases

        for (int i = 0; i < stringUpper.length(); i = i + 1) {      //used switch instead of if statement because conditions are several and bulky
            switch (stringUpper.charAt(i)) {                        //use charAt to get character at index i
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowels = vowels + 1;                            //initially used separate cases and results, but optimized with fall-through to single result for multiple cases
                    break;
            }
        }
        System.out.println("Method 1: The string \"" + string + "\" contains " + vowels + " vowels.");        //displays string and vowel count
    }

    //per Adem's suggestion, same as above but checks against a string of target characters using .contains method instead of switch or multiple if conditions
    public void countStringVowels2() {

        vowels = 0;
        String targetString = "aeiouAEIOU";
        String stringUpper = string.toUpperCase();

        for (int i = 0; i < stringUpper.length(); i = i + 1) {
            if ((targetString.contains(stringUpper.charAt(i)+"")) == true) {
                vowels = vowels + 1;
            }
        }
        System.out.println("Method 2: The string \"" + string + "\" contains " + vowels + " vowels.");
    }

}
