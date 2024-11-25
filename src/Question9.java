public class Question9 {

    //Question 9: Find Common Elements in Two Arrays
    //Q: Write a program to find common elements in two arrays.

    //fields
    String[] array1;                                                    //declare array param 1
    String[] array2;                                                    //declare array param 2
    String[] output;                                                    //declare output array for common elements, length to be set within method
    int x = 0;                                                          //output array incrementor
    boolean exists = false;                                             //boolean flag for checking presence of common element in output array; default value false

    //constructor
    public Question9(String[] array1, String[] array2) {                //accepts 2 array parameters (method configured for String type, but could be repurposed for char or int arrays
        this.array1 = array1;
        this.array2 = array2;
    }

    //method primary block uses: if nested inside for, nested inside if, nested inside for, nested inside for, with boolean flag
        //could possibly assign output length outside of method in constructor or otherwise
    public void findCommonElements() {

        //assign length of output array
        if (array1.length > array2.length) {                            //compares length of user arrays
            output = new String[array1.length];                         //if array1 is longer, becomes length of output array
        } else {
            output = new String[array2.length];                         //if array2 is longer, becomes length of output array
        }

        //checks to see if each array1 element appears in array2
        for (String i : array1) {                                       //for each element in array1
            for (String j : array2) {                                   //iterates through elements of array2
                if (i.equals(j)) {                                           //to check for matches (common element)

                    //if common element found, checks to see if common element already in output array
                    for (String k : output) {                           //iterates through output array
                        if (j.equals(k)) {                                   //checks to see if common element is already in output array
                            exists = true;                              //if so, sets boolean flag to true
                            break;
                        }
                    }
                    if (exists == false) {                              //if boolean flag remained false (common element not already in output array)
                        output[x] = j;                                  //then adds common element to output array
                        x = x + 1;                                      //and increments output array index
                    } else {
                        exists = false;                                 //if common element was already in output array, resets flag to false and does not add to output array again
                    }
                }
            }
        }

        //displays output array = common elements
        System.out.println("Array 1: ");                                                //display array1
        for (String l : array1) {
            System.out.print(l + "  ");
        }
        System.out.println("\n\nArray 2: ");                                            //display array2
        for (String m : array2) {
            System.out.print(m + "  ");
        }
        System.out.println("\n\nElements common to both arrays: ");
        for (String n : output) {                                                       //iterates through output array (i.e. the common elements)
            if (n != null) {                                                            //for all assigned (non-null) array elements
                System.out.print(n + "  ");                                             //they are displayed
            }
        }
    }
}
