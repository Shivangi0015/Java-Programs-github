/* printing:
            * //\n
            * * //\n
            * * * //\n
            * * * * //\n
            * * * * * //\n
 */


public class pattern_using_method {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


