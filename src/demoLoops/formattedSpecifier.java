package demoLoops;
// printformatted is handig als je een tabel wil maken
// percentage specifiers: %s = string, %d = getallen, %n = nieuwe regel en %f = een float.
public class formattedSpecifier {
    public static void main(String[] args) {
        //souf kan je gebruiken om met %s een string mee te geven en met %d een getal en met %n het einde van de tekst
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s dit is %f de format %d tekst%n", "Beste lezer, ", 67.67, i);
        }
    }
}
