public class Question6 {

    //Question 6: Count the Occurrences of Each Character
    //Q: Write a program to count the occurrences of each character in a string.

    //fields
    String string;                                                                                              //declare string variable for parameter
    char[] charArray;                                                                                           //declare new array to have length set in constructor
    int[] intArray;                                                                                             //declare new array to have length set in constructor

    //constructor
    public Question6(String string) {                                                                           //accepts string parameter
        this.string = string;
        charArray = new char[string.length()];                                                                  //char array to store first instance of each novel character from string
        intArray = new int[string.length()];                                                                    //corresponding int array to count instances of each novel character from string
        //arrays will not be entirely filled if there are duplicate characters in string--will print only initialized indices
    }

    //method uses: char and int arrays, if/else statements inside for loops, and the string methods length, charAt, indexOf
    public void countStringChars() {

        for (int i = 0; i < string.length(); i = i + 1) {                                                       //for loop iterates for length of string
        if (string.indexOf(string.charAt(i)) == i) {                                                            //if current index is first instance of character
                charArray[i] = string.charAt(i);                                                                //then adds new character to char array
                intArray[i] = intArray[i] + 1;                                                                  //and increments corresponding index in int array
            } else {                                                                                            //if character has already occurred in string
            intArray[string.indexOf(string.charAt(i))] = intArray[string.indexOf(string.charAt(i))] + 1;        //then increment the int array for first instance of char but don't add to char array
            }
        }

        System.out.println("The number of occurrences of each character in string \"" + string + "\" are:");    //display results
        for (int j = 0; j < intArray.length; j = j + 1) {
            if (intArray[j] > 0) {                                                                              //print only the filled (non-zero) indices in char and int arrays
                System.out.println(charArray[j] + "   " + intArray[j]);
            }
        }
    }
}
