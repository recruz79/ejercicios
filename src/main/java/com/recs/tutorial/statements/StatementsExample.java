package com.recs.tutorial.statements;

//Statements
//Statements are roughly equivalent to sentences in natural languages. A statement forms a complete unit of execution.
//The following types of expressions can be made into a statement by terminating the expression with a semicolon (;).
//aValue = 8933.234; // assignment statement
//aValue++; // increment statement
//System.out.println("Hello World!"); // method invocation statement
//Bicycle myBike = new Bicycle(); // object creation statement

//Expressions
//An expression is a construct made up of variables, operators, and method invocations, which are constructed according
//to the syntax of the language, that evaluates to a single value. You've already seen examples of expressions,
//illustrated in bold below:
//int cadence = 0;
//anArray[0] = 100;
//System.out.println("Element 1 at index 0: " + anArray[0]);
//int result = 1 + 2; // result is now 3
//if (value1 == value2) 
//  System.out.println("value1 == value2");

//Blocks
//A block is a group of zero or more statements between balanced braces and can be used anywhere a single statement is allowed. The following 
//example, BlockDemo, illustrates the use of blocks:
//class BlockDemo {
//   public static void main(String[] args) {
//        booleans condition = true;
//        if (condition) { // begin block 1
//             System.out.println("Condition is true.");
//        } // end block one
//        else { // begin block 2
//             System.out.println("Condition is false.");
//        } // end block 2
//   }
//}

//The continue Statement
//The continue statement skips the current iteration of a for, while , or do-while loop. The unlabeled form skips
//to the end of the innermost loop's body and evaluates the booleans expression that controls the loop. The following
//program, ContinueDemo , steps through a String, counting the occurences of the letter "p". If the current character
//is not a p, the continue statement skips the rest of the loop and proceeds to the next character. If it is a "p", 
//the program increments the letter count.
//Here is the output of this program:
//Found 9 p's in the string.
class StatementsExample {

    public static void main(String[] args) {
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;
            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}