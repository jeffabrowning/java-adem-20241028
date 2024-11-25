public class Question7 {

    //Question 7: Find Second Largest Number
    //Q: Write a program to find the second largest number in an array.
        //modified from Assignment 2: Question 3

    //fields
    int[] array;                                                            //declare int array for parameter
    int largest;                                                            //create a variable to hold the largest value for comparison to array elements
    int nextLargest;                                                        //create a variable to hold the second largest value for comparison to array elements

    //constructor
    public Question7(int[] array) {                                         //accepts array parameter
        this.array = array;
        largest = array[0];                                                 //initialize largest to first element of array; nextLargest initialized by method
    }

    //method uses: if/else inside for-each loop
    public void findArraySecondLargest() {

        for (int i : array) {                                               //for-each loop iterates each array element
            if( i > largest ) {                                             //compares element to existing largest value (which starts out array[0])
                nextLargest = largest;                                      //if i is greater than existing largest, sets nextLargest to current value of largest (which has become second largest)
                largest = i;                                                //then sets new largest value to i
            } else if (i > nextLargest) {                                   //if i is not greater than largest but is greater than nextLargest
                nextLargest = i;                                            //then sets nextLargest to i without updating largest
            }
        }                                                                   //if i is greater than neither largest nor nextLargest, then no change

        System.out.println("The second largest number of the below array is " + nextLargest +".");     //prints array and nextLargest value
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}
