/************************************************************/
/*Program:   Traingles                                      */
/*CIS163AA                                                  */
/*Edward Muniz                                              */
/*2020-03-03                                                */
/*Display triangles in pattern using for loops!             */
/************************************************************/
public class App {
    public static void main(String[] args) throws Exception {
        for (int r = 1; r <= 10; r++) {
            // Draw triangle 1
            for (int c = 1; c <= r; c++)
                System.out.print("*");
            for (int c = r + 1; c <= 10; c++)
                System.out.print(" ");
            System.out.print("  ");
            // Draw triangle 2
            for (int c = 1; c <= (11 - r); c++)
                System.out.print("*");
            for (int c = (11 - r) + 1; c <= 10; c++)
                System.out.print(" ");
            System.out.print("  ");
            // Draw triangle 3
            for (int c = 1; c <= r; c++)
                System.out.print(" ");
            for (int c = r + 1; c <= 11; c++)
                System.out.print("*");
            System.out.print("  ");
            // Draw triangle 4
            for (int c = 1; c <= (10 - r); c++)
                System.out.print(" ");
            for (int c = (10 - r) + 1; c <= 10; c++)
                System.out.print("*");
            System.out.print(" ");
            System.out.println();
        } // end of for r
    }
}