package demoLoops;

public class oefening4_if_statements {
    public static void main(String[] args) {
        // if statement voor 1 case
        if (3 < 4) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        // if statement voor meerdere cases, een switch statement is netter
        int i = 0;
        if (i==1){
            System.out.println("one");
        } else if (i==2){
            System.out.println("twoo");
        } else if (i==3) {
            System.out.println("three");
        }
    }
}
