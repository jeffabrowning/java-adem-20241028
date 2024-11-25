import java.util.Arrays;

public class Question10 {

    //Question 10: Anagram Check
    //Q: Write a program to check if two strings are anagrams of each other (contain the same characters in a different order).

    //approach 1: string length check; identical string check; convert string to string array, check each i against all js, and for matches set j to null; after i completed, check if j contains non-null (no sorting)
    //(NOT USED) approach 2: string length check; convert string to char array, sort each char array, then compare char arrays with nested for-each loop (requires sorting but end comparison is easier)
    //cheat approach 3: string.length check; string.equal check; run toCharArray on strings, run sort on each array, run equals on the arrays

    //fields
    String string1;                                                                     //declare string param 1
    String string2;                                                                     //declare string param 2
    String[] stringArray1;                                                              //declare string array for string 1
    String[] stringArray2;                                                              //declare string array for string 2
    boolean identical;                                                                  //declare boolean flag for string comparison (will be initialized in method)
    boolean nonNull;                                                                    //declare boolean flag for final anagram check (will be initialized in method)

    //constructor
    public Question10(String string1, String string2) {                         //accepts 2 string parameters
        this.string1 = string1;
        this.string2 = string2;
        stringArray1 = new String[string1.length()];                            //set array length for the arrays
        stringArray2 = new String[string2.length()];
    }

    //approach 1 method uses: boolean flags, null "flag", nested loops, string methods length and charAt
    public void checkIfAnagrams1() {
        //initial process is same for approaches 1 and 2

        //check for matching string lengths
        if (string1.length() != string2.length()) {                             //compare string length as first validation; end program with print statement if they don't match
            System.out.println("String 1 = \"" + string1 + "\"");
            System.out.println("String 2 = \"" + string2 + "\"");
            System.out.println("These strings are not anagrams--they have different lengths.");
        } else {                                                                //if string lengths match, proceed to identical string validation

            //flag if strings are identical
            boolean identical = true;                                           //initialize identical flag to true statement unless proves false
            for (int i = 0; i < string1.length(); i = i + 1) {                  //iterates through string 1
                if (string1.charAt(i) != string2.charAt(i)) {                   //checks for any mismatches at i between string 1 and 2
                    identical = false;                                          //if mismatch found, sets flag to false; whether true or false, proceeds to next conditional
                    break;                                                      //breaks loop when first mismatch found
                }
            }

            //report as identical or proceed to anagram check
            if (identical == true) {                                            //validation for identical strings--end program with print statement if identical
                System.out.println("String 1 = \"" + string1 + "\"");
                System.out.println("String 2 = \"" + string2 + "\"");
                System.out.println("These strings are not anagrams--they are identical.");
            } else {                                                            //if not identical, proceed to remainder of anagram check

                //create string arrays from strings--used for nulling approach 1, or sort/compare approach 2; can use char array instead for sorting approach, but not for nulling
                for (int j = 0; j < string1.length(); j = j + 1) {              //iterates through string 1
                    stringArray1[j] = string1.charAt(j)+"";                     //fills array with string 1 chars--concatenating "" turns char into string value
                }
                for (int k = 0; k < string2.length(); k = k + 1) {              //repeats above for string 2
                    stringArray2[k] = string2.charAt(k)+"";
                }

                //approach 1: use nested for-each loop to null common elements in 2nd array, then check if non-null elements

                //compare first string array against second, nulling the common instances in 2nd string
                for (int n = 0; n < stringArray1.length; n = n + 1) {           //iterates array1
                    for (int o = 0; o < stringArray2.length; o = o + 1) {       //for each index array1, iterates array2
                        if (stringArray1[n].equals(stringArray2[o])) {          //checks if array1 element appears in array2
                            stringArray2[o] = null;                             //if so, nulls (removes value) from that index in array 2
                            break;                                              //breaks after first match, so each index in array1 only nulls 1 instance in array2
                        }
                    }
                }

                //display results based on checking 2nd string for non-null elements
                boolean nonNull = false;                                        //sets boolean flag for nonNull false (i.e. array 2 is now empty)
                for (int p = 0; p < stringArray2.length; p = p + 1) {           //iterates array2
                    if (stringArray2[p] != null) {                              //checks for any non-null elements (any characters that weren't matched to array 1 and removed)
                        nonNull = true;                                         //if found, reassigns boolean flag to true
                        break;                                                  //break loop after first instance and flag set
                    }
                }
                if (nonNull == true) {                                          //final validation--if non-null elements remain, arrays didn't have same elements and strings aren't anagrams
                    System.out.println("String 1 = \"" + string1 + "\"");
                    System.out.println("String 2 = \"" + string2 + "\"");
                    System.out.println("These strings are not anagrams--they do not contain the same characters.");
                } else {
                    System.out.println("String 1 = \"" + string1 + "\"");
                    System.out.println("String 2 = \"" + string2 + "\"");
                    System.out.println("These strings are anagrams--their lengths match and they contain the same characters but are not identical.");
                }

                //DIAGNOSTIC: print strings and arrays for troubleshooting
//                System.out.println("String1: ");
//                for (int m = 0; m < string1.length(); m = m + 1) {
//                    System.out.print(string1.charAt(m) + "  ");
//                }
//                System.out.println();
//                System.out.println("charArray1: ");
//                for (int n = 0; n < charArray1.length; n = n + 1) {
//                    System.out.print(charArray1[n] + "  ");
//                }
//                System.out.println();
//                System.out.println("stringArray1: ");
//                for (int n = 0; n < stringArray1.length; n = n + 1) {
//                    System.out.print(stringArray1[n] + "  ");
//                }
//                System.out.println();
//                System.out.println("String2: ");
//                for (int o = 0; o < string1.length(); o = o + 1) {
//                    System.out.print(string2.charAt(o) + "  ");
//                }
//                System.out.println();
//                System.out.println("charArray2: ");
//                for (int p = 0; p < charArray2.length; p = p + 1) {
//                    System.out.print(charArray2[p] + "  ");
//                }
//                System.out.println();
//                System.out.println("stringArray2: ");
//                for (int p = 0; p < stringArray2.length; p = p + 1) {
//                    System.out.print(stringArray2[p] + "  ");
//                }
//                System.out.println();
//                System.out.println("Non-null status = " + nonNull);
            }
        }
    }

    //approach 2 method not developed yet--use manual array sorting method

    //approach 3 cheating method using predefined string and array methods to quickly accomplish approach 2: string.length, .equal, .toCharArray; array.sort, .equals
        //developed for comparing manual & predefined methods
    public void checkIfAnagrams3() {

        //string.length check for equal lengths
        if (string1.length() != string2.length()) {
            System.out.println("These strings are not anagrams--they have different lengths.");
        } else {

            // string.equal check for non-identical
            if (string1.equals(string2)) {
                System.out.println("These strings are not anagrams--they are identical.");
            } else {

                // toCharArray on strings to create char arrays
                char[] charArray1 = string1.toCharArray();
                char[] charArray2 = string2.toCharArray();

                // sort each array
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                // run equals on the arrays
                if (Arrays.equals(charArray1, charArray2) == false) {
                    System.out.println("These strings are not anagrams--they do not contain the same characters.");
                } else {
                    System.out.println("These strings are anagrams--their lengths match and they contain the same characters but are not identical.");
                }
            }
        }
    }
}