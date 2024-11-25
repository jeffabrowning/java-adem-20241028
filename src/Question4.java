public class Question4 {

    //Question 4: Sum of Digits
    //Q: Write a program to find the sum of the digits of a number until it becomes a single digit.

    //fields                                                                                changes ints to longs to accommodate greater input numbers
    long x;                                                                                 //declare long variable for parameter
    long quotient = 0;                                                                      //the result of removing final digit from input number; becomes input for next inner iteration
    long remainder = 0;                                                                     //the final digit that is removed from input number; added to sum variable
    long sum = 0;                                                                           //variable which holds running sum of adding the input digits
    long finalSum = 0;                                                                      //copied from sum variable at end of inner loop for display at the end, since sum is later reassigned
    long carryover = 0;                                                                     //copied from sum variable at end of inner loop, to be returned as input to outer loop for next iteration
    int i = 1;                                                                              //inner loop iteration counter for display
    int j = 1;                                                                              //outer loop iteration counter for display

    //constructor
    public Question4(long x) {                                                              //accepts long parameter

        this.x = x;
    }

    //method uses: division and modulus for core operations, with a while loop nested in a do/while loop
        //could possibly simplify/consolidate the variables and assignments
    public void sumDigits() {
        long input = x;                                                                     //x is copied to input for display at the end, since x is later reassigned
        do {                                                                                //outer loop performs inner while loop at least once, and repeats if result of inner > 1 digit

            while (x > 9) {                                                                 //inner loop executed while input has > 1 digit
                System.out.println("Iteration " + j + "." + i + ":");                       //displays outer & inner iteration for tracking/debugging
                System.out.println("input = old x = " + x);                                 //displays initial input for inner loop  for tracking/debugging
                quotient = x / 10;                                                          //sets variable as input minus final digit
                remainder = x % 10;                                                         //sets variable as final digit of input
                sum = sum + remainder;                                                      //adds final digit to running sum
                x = quotient;                                                               //reassigns x for input into next inner loop iteration
                System.out.println("quotient = input minus final digit = new x = " + x);    //displays new value of x for tracking/debugging
                System.out.println("sum = " + sum);                                         //displays current value of sum for tracking/debugging
                System.out.println();
                i = i + 1;                                                                  //increments inner loop iteration counter
            }                                                                               //inner while loop completes when x is a single digit, and moves to post-loop block
            System.out.println("Iteration " + j + ".final:");                               //repeats similar operations to above one final time for x
            System.out.println("input = old x = " + x);
            sum = sum + x;
            x = 0;                                                                          //resets x to 0 for display after first iteration of while and post-while code is completed
            System.out.println("quotient = input minus final digit = new x = " + x);
            System.out.println("sum = " + sum);
            System.out.println();
            j = j + 1;                                                                      //increments outer loop iteration counter
            i = 1;                                                                          //resets inner loop iteration counter
            x = sum;                                                                        //reassigns x with the output of completed inner iteration, for input into outer loop
            carryover = sum;                                                                //copies inner output to new variable for condition check of outer loop
            finalSum = sum;                                                                 //copies inner output to new variable for display at end
            sum = 0;                                                                        //resets inner loop sum before beginning next outer iteration
        }                                                                                   //concludes "do" block of do-while loop
        while (carryover > 9);                                                              //triggers outer loop to pass sum back into inner loop if > 1 digit

        //displays when do/while is completed and user input has been summed to a single digit
        System.out.println("The sum of the digits of " + input + ", added until they are a single digit, is: " + finalSum + ".");
    }
}
