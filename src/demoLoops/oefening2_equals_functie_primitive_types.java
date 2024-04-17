package demoLoops;

//bij reference types (string, scanner gebruik je de .equals functie en niet de ==
//bij primitive types (int, char, boolean, byte, short, float, long, double) kan je wel de == gebruiken
// == kijkt naar de inhoud van de zaken die je vergelijkt, om te zeggen of het gelijk is
// .equals kan er gekeken worden naar reference types en of hun inhoud gelijk is

public class oefening2_equals_functie_primitive_types {
    public static void main(String[] args) {
        String s = "hello";
        String t = "hell";
        t = t + "o";

        System.out.println(s);
        System.out.println(t);

        //if kan zonder {} als het op 1 enkele regel past, zo niet voeg {} toe
        //equals roep je aan door .equals
        if (s.equals(t)) System.out.println("gelijk");
        else System.out.println("ongelijk");
    }
}

