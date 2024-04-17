package demoLoops;

//soms hoeft je de functie niet ten minste 1 keer uitvoeren
//de while test eerst de conditie en als het false is, is hij meteen klaar. Als het niet false is, dan wordt de body uitgevoerd. Bij een while statement staat de conditie aan het begin

public class Oefening7_while_statement {
    public static void main(String[] args) {
        int g1 = 845;
        int g2 = 334;

        while (g1 != g2 && g1>0){
            if (g1< g2){
                g2 = g2 - g1;
            } else {
                g1 = g1 - 22;
            }
            System.out.println(g1);
        }

    }

}
