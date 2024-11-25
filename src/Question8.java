public class Question8 {

    //Question 8: Rotate an Array
    //Q: Write a program to rotate an array to the right by a given number of steps.

    //fields
        //no declarations since passing arguments directly to methods, and method-specific variables declared/instantiated within methods

    //constructor
        //use default implicit constructor; class instantiation required to call non-static methods, but arguments being passed directly to methods instead of class constructor

    //overloaded method based on input array type uses: while loop inside if/else statement inside for loop
        //could possibly use generics or other means to reduce redundancy or otherwise optimize overloading
    public void rotateArray(int steps, String[] input) {        //overloaded method for string array; accepts steps count and array parameters

        String[] output = new String[input.length];             //declare output (rotated) array with same length as input

        for (int i = 0; i < input.length; i = i +1) {           //for each index in input array

            int j = i + steps;                                  //calculates target index in rotated array based on steps provided

            if (j >= input.length) {                            //if target index exceeds array length
                while (j >= input.length) {                     //decrements target index by array length until target falls within array length
                    j = j - input.length;
                }
                output[j] = input[i];                           //then assigns element from input array to rotated position in output array
            } else {
                output[j] = input[i];                           //if target index did not initially exceed array length, directly assigned to rotated position in output array
            }                                                   //repeats for length of input array
        }

        System.out.println("Original array:");                  //upon loop completion, prints elements of original (input) and rotated (output) arrays
        for (String i : input) {
            System.out.print(i + "  ");
        }
        System.out.println("\n\nArray rotated to the right by " + steps + " steps:");
        for (String i : output) {
            System.out.print(i + "  ");
        }
        System.out.println("\n");
    }

    public void rotateArray(int steps, char[] input) {          //overloaded method for char array; accepts steps count and array parameters

        char[] output = new char[input.length];

        for (int i = 0; i < input.length; i = i +1) {

            int j = i + steps;

            if (j >= input.length) {
                while (j >= input.length) {
                    j = j - input.length;
                }
                output[j] = input[i];
            } else {
                output[j] = input[i];
            }
        }

        System.out.println("Original array:");
        for (char i : input) {
            System.out.print(i + "  ");
        }
        System.out.println("\n\nArray rotated to the right by " + steps + " steps:");
        for (char i : output) {
            System.out.print(i + "  ");
        }
        System.out.println("\n");
    }

    public void rotateArray(int steps, int[] input) {           //overloaded method for int array; accepts steps count and array parameters

        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i = i +1) {

            int j = i + steps;

            if (j >= input.length) {
                while (j >= input.length) {
                    j = j - input.length;
                }
                output[j] = input[i];
            } else {
                output[j] = input[i];
            }
        }

        System.out.println("Original array:");
        for (int i : input) {
            System.out.print(i + "  ");
        }
        System.out.println("\n\nArray rotated to the right by " + steps + " steps:");
        for (int i : output) {
            System.out.print(i + "  ");
        }
        System.out.println("\n");
    }
}
