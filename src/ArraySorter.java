public class ArraySorter {

    //Bonus question from 11/13/24 Adem feedback
    //Q: Write a method to sort arrays of ints and strings

    //fields
    int s = 0;                                                                                  //counter for sorted array
    int n = 0;                                                                                  //offset to move inward from end of sorted array during comparison loop
    int x = 0;                                                                                  //offset to move inward from end of sorted array during sorted array assignment loop


    //overloaded method based on input array type uses: outer for loop containing if/else which contains a do/while which contains an if statement
    public void sortArray(int[] unsorted) {                                                     //accepts int array

        //sets first element of sorted as first element of unsorted; next will compare unsorted[1] & sorted [0]
        int[] sorted = new int[unsorted.length];
        sorted[s] = unsorted[0];

        //iterates through unsorted starting at [1]
        for (int i = 1; i < unsorted.length; i++) {

            //if new unsorted is bigger than or equal to biggest (rightmost) sorted, add to end of sorted and increment sorted counter; repeat loop
            if (unsorted[i] >= sorted[s]) {
                sorted[s + 1] = unsorted[i];
                s++;

                //if new unsorted is not bigger than biggest sorted
            } else {

                //loop to move inward from end of sorted array one step at a time, checking against unsorted value
                do {                                                                            //loop increments counter and performs check
                    n++;                                                                        //counter to step inward from end of sorted
                    if (((s - n) < 0) || (unsorted[i] >= sorted[s - n])){                       //checks if reached sorted[0] or if unsorted value is bigger than this value of sorted
                        while ((s - x > s - n)) {                                               //loop continues in from the right end until it reaches the point where comparison was made
                            sorted[s - x + 1] = sorted[s - x];                                  //when true, while loop shifts each value of sorted loop to the right starting at the right end
                            x++;                                                                //increments assignment counter and reloops
                        }
                        sorted[s - n + 1] = unsorted[i];                                        //assigns value of unsorted array to the now vacant spot in sorted array
                        s++;                                                                    //increments counter of sorted array
                        n = 0;                                                                  //resets comparison counter
                        x = 0;                                                                  //resets reassignment counter
                        break;                                                                  //breaks out of inner loop back to outer while loop
                    }                                                                           //keeps looping until successful comparison or sorted[0]
                }
                while ((s - n) >= 0);
            }
        }                                                                                       //repeat the nested loop for each element in unsorted array
        System.out.println("\nOriginal array: ");                                               //once complete, print results
        for (int i : unsorted) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println("\nSorted array: ");
        for (int j : sorted) {
            System.out.print(j + "  ");
        }
        System.out.println();
    }

    public void sortArray(String[] unsorted) {                                                  //same as int method but uses .compareTo string method instead of directly using logical operators on two strings

        String[] sorted = new String[unsorted.length];
        sorted[s] = unsorted[0];

         for (int i = 1; i < unsorted.length; i++) {

            if (unsorted[i].compareTo(sorted[s]) >= 0) {                                        //String equivalent of unsorted[1] >= sorted[s]
                sorted[s + 1] = unsorted[i];
                s++;

            } else {

                //
                do {
                    n++;
                    if (((s - n) < 0) || (unsorted[i].compareTo(sorted[s - n]) >= 0)){          //String equivalent of unsorted[1] >= sorted[s - n]
                        while ((s - x > s - n)) {
                            sorted[s - x + 1] = sorted[s - x];
                            x++;
                        }
                        sorted[s - n + 1] = unsorted[i];
                        s++;
                        n = 0;
                        x = 0;
                        break;
                    }
                }
                while ((s - n) >= 0);
            }
        }
        System.out.println("Original array: ");
        for (String i : unsorted) {
            System.out.print(i + "  ");
        }
        System.out.println("\nSorted array: ");
        for (String j : sorted) {
            System.out.print(j + "  ");
        }
    }
}
