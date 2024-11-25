public class Question3 {

    //Question 3: Find Maximum in an Array
    //Q: Write a program to find the maximum number in an array.
        //Modified from Assignment 1: Question 8

    //fields
    int[] array;                                                                        //declare array variable for parameter (contents of array)
    int maximum;                                                                        //create a variable to hold the maximum value

    //constructor
    public Question3(int[] array) {                                                     //accepts array as parameter
        this.array = array;
    }

    //method uses:  for-each loop and if statement
    public void findArrayMaximum() {

        maximum = array[0];                                                             //initialize maximum to first element of array
        for (int i : array) {                                                           //for-each loop iterates each array element
            if( i > maximum ) {                                                         //compares current index to existing maximum value (which starts out array[0])
                maximum = i;                                                            //sets maximum to i if i is greater than existing maximum value
            }                                                                           //no action if i is not maximum
        }

        System.out.println("The maximum number of the below array is " + maximum +".");    //displays array and maximum value
        for (int j : array) {
            System.out.print(j + "  ");
        }
    }
}
