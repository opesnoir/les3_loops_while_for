package demoLoops;

public class oefening3_afronden_decimalen {
    public static void main(String[] args) {
        double d = 34.43234555;
        //zonder af te ronden printen
        System.out.println(d);
        //met afronding printen, gebruik Math functie
        System.out.println(Math.round(d));

        // afronden op 2 cijfers achter de komma, zorg ervoor dat je met een double werkt door een double in de formule te plaatsen, anders rond hij niet af
        System.out.println(Math.round(d*100)/100.0);
    }
}
