public class Question5 {

    //Question 5: Merge Two Sorted Arrays
    //Q: Write a program to merge two sorted arrays into a single sorted array.

    //fields
    int[] sortedArray1;                                                                 //declare array for parameter 1
    int[] sortedArray2;                                                                 //declare array for parameter 2
    int[] mergedSortedArray;                                                            //declare new array to have length set in constructor
    int i = 0;                                                                          //index for user array 1
    int j = 0;                                                                          //index for user array 2
    int k = 0;                                                                          //index for merged array

    //constructor
    public Question5(int[] sortedArray1, int[] sortedArray2) {                          //accepts 2 array parameters
        this.sortedArray1 = sortedArray1;
        this.sortedArray2 = sortedArray2;
        mergedSortedArray = new int[sortedArray1.length + sortedArray2.length];
    }
    //setting length of new array did not work with direct instantiation above, and I did not want to repeat the action in each individual method below

    //method uses: if/else statement inside if/else statement inside while loop
    public void mergeSortedArrays() {

        while (i < sortedArray1.length || j < sortedArray2.length) {                    //loop iterates as long as both arrays have not reached the end (handles unequal/unknown length)
            if (i >= sortedArray1.length) {                                             //if array1 is exhausted
                addArray2();                                                            //call method to add array2 element to merged array, and increment array2 and merged array
            } else if (j >= sortedArray2.length) {                                      //if array2 is exhausted
                addArray1();                                                            //call method to add array2 element to merged array, and increment array2 and merged array
            } else {                                                                    //if neither array is exhausted, then array comparison block is performed with if conditions

                if (sortedArray1[i] <= sortedArray2[j]) {                               //if array1 element is lesser, it is added to merged array; array1 and merged array indices incremented
                    addArray1();                                                        //call method to add array1 element to merged array, and increment array1 and merged array
                } else if (sortedArray2[j] < sortedArray1[i]) {                         //if array2 element is lesser, it is added to merged array; array1 and merged array indices incremented
                    addArray2();                                                        //call method to add array2 element to merged array, and increment array2 and merged array
                } else {                                                                //error message if neither condition met
                    System.out.println("Error");
                }
            }
        }                                                                               //while loop repeats until both arrays exhausted
        printResults();                                                                 //upon completion, calls method to display array data
    }

    //separate methods to add elements from array1 or array2 to merged array, to limit redundant code in primary method
    public void addArray1() {                                                           //method called when array1 element is lesser or array2 is exhausted
        mergedSortedArray[k] = sortedArray1[i];                                         //current array1 element added to end of merged array
        i = i + 1;                                                                      //array1 index incremented
        k = k + 1;                                                                      //merged array index incremented
    }

    public void addArray2() {                                                           //method called when array2 element is lesser or array1 is exhausted
        mergedSortedArray[k] = sortedArray2[j];                                         //current array2 element added to end of merged array
        j = j + 1;                                                                      //array2 index incremented
        k = k + 1;                                                                      //merged array index incremented
    }

    //separate method to print final results of the 3 arrays, to keep primary method smaller
    public void printResults() {

        System.out.println("\nArray lengths and elements:\n");
        System.out.println("sortedArray1 length: " + sortedArray1.length);
        System.out.println("sortedArray1 final index i: " + i);
        System.out.print("sortedArray1 elements: ");
        for (int x : sortedArray1) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("sortedArray2 length: " + sortedArray2.length);
        System.out.println("sortedArray2 final index j: " + j);
        System.out.print("sortedArray2 elements: ");
        for (int y : sortedArray2) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("mergedSortedArray length: " + mergedSortedArray.length);
        System.out.println("mergedSortedArray final index k: " + k);
        System.out.print("mergedSortedArray elements: ");
        for (int z : mergedSortedArray) {
            System.out.print(z + " ");
        }
    }
}