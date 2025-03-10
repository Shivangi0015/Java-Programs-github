public class PrecedenceOfOperators {
    public static void main( String[] args)
    {
        System.out.println("Highest precedence -14");
        System.out.println("Associativity : Left to right");
        System.out.println("'()'");
        System.out.println("'[]'");
        System.out.println("'.'");
        System.out.println("'arrow operator ->'");

        System.out.println("\n\nPrecedence - 13");
        System.out.println("Associativity: Right to left");
        System.out.println("(!)");
        System.out.println("(-)");
        System.out.println("(minus -)");
        System.out.println("(++)");
        System.out.println("(--)");
        System.out.println("(sizeof)");


        System.out.println("\n\nPrecedence - 12");
        System.out.println("Associativity: left to right");
        System.out.println("*");
        System.out.println("/");
        System.out.println("%");

        System.out.println("\n\nPrecedence: 11");
        System.out.println("Associativity: left to right");
        System.out.println("+");
        System.out.println("-");

        System.out.println("\n\nPrecedence: 10");
        System.out.println("Associativity: left to right");
        System.out.println("<<");
        System.out.println(">>");

        System.out.println("\n\nPrecedence: 9");
        System.out.println("Associativity: left to right");
        System.out.println("<");
        System.out.println("<=");
        System.out.println(">");
        System.out.println(">=");

        System.out.println("\n\nPrecedence: 8");
        System.out.println("Associativity: left to right");
        System.out.println("Equal to (==)");
        System.out.println("Not equal to(!=)");

        System.out.println("\n\nPrecedence: 7");
        System.out.println("Associativity: left to right");
        System.out.println("Bitwise AND (&)");

        System.out.println("\n\nPrecedence: 6");
        System.out.println("Associativity: left to right");
        System.out.println("Bitwise XOR (^)");

        System.out.println("\n\nPrecedence: 5");
        System.out.println("Associativity: left to right");
        System.out.println("Bitwise OR (|)");

        System.out.println("\n\nPrecedence: 4");
        System.out.println("Associativity: left to right");
        System.out.println("Logical AND (&&)");

        System.out.println("\n\nPrecedence: 3");
        System.out.println("Associativity: left to right");
        System.out.println("Logical OR (||)");

        System.out.println("\n\nPrecedence: 2");
        System.out.println("Associativity: right to left ");
        System.out.println("Conditional operators: (?,:)");

        System.out.println("\n\nPrecedence: 1 ");
        System.out.println("Associativity: right to left ");
        System.out.println("Assignment Operators- (=,+=,-=,etc.)");

        System.out.println("\n\nPrecedence: 0 (lowest)");
        System.out.println("Associativity: left to right");
        System.out.println("Comma(,)");
    }
}
