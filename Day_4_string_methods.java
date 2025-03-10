// STRING OPERATIONS

class Day_4_string_methods {
    public static void main( String[] args)
    {
        String str = "Hello there! I am AI";
        System.out.println("\nOriginal String: "+str);
        System.out.printf("\nPerforming String METHODS on %s :", str);

        System.out.println("\n1. name.length()");
        System.out.println("length of string ="+ str.length());

        System.out.println("\n2. name.toLowerCase()");
        System.out.println("Lowercase string: "+ str.toLowerCase());

        System.out.println("\n3. name.toUpperCase()");
        System.out.println("Uppercase string: "+ str.toUpperCase());

        System.out.println("\n4. name.trim()- removes spaces from string from front and back");
        System.out.println("Trimmed string: "+ str.trim());

        System.out.println("\n5. name.substring()");
        System.out.println("Substring with starting index 2: "+ str.substring(2));
        System.out.println("Substring with start and end index as 2,6: "+ str.substring(2,6));

        System.out.println("\n6. name.replace()");
        System.out.println("replacing string character: "+ str.replace('a','e'));
        System.out.println("replacing string word: "+ str.replace("AI","Computer"));

        System.out.println("\n7. name.charAt()");
        System.out.println(" string: "+ str.charAt(4));

        System.out.println("\n8. name.startsWith() - returns true if String starts with the provided characters or word");
        System.out.println("string starts with \"hel\": "+ str.startsWith("Hel"));

        System.out.println("\n9. name.endsWith()");
        System.out.println("string ends with \"Ay\": "+ str.endsWith("Ay"));

        System.out.println("\n10. name.equalsIgnoreCase(\"hello\")");

        System.out.println("\n11. name.LastIndexOf(\"char\")");
        System.out.println("Last index of first occurrence : "+ str.lastIndexOf("l"));
        System.out.println("Last index of first occurrence string within index 5: "+ str.lastIndexOf("o",5));
        System.out.println("If any of the above returns -1 then it is not present in the string or within the given index");
    }
}
