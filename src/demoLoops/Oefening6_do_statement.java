package demoLoops;

import java.util.Scanner;

public class Oefening6_do_statement {
    public static void main(String[] args) {
        //initieer je variabelen en scanner
        Scanner input = new Scanner(System.in);
        int getal;
        // geef aan wat de functie moet doen
        do {
            System.out.println("Geef een getal tussen de 1 en 10:");
            getal = input.nextInt();
            //als
            if (getal < 1 | getal > 10){
                System.out.println("Fout, het getal moet tussen de 1 en 10 zijn.");
            }
        //wanneer
        } while (getal < 1 | getal > 10);
    }
}
