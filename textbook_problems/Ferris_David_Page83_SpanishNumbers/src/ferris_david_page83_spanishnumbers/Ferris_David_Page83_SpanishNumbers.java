package ferris_david_page83_spanishnumbers;

public class Ferris_David_Page83_SpanishNumbers {

    public static void SpanishNumbers(int input) {
        switch (input) {
            case 1:
                System.out.format("%-3s %3s", input, "uno");
                break;
            case 2:
                System.out.format("%-3s %3s", input, "dos");
                break;
            case 3:
                System.out.format("%-3s %3s", input, "tres");
                break;
            case 4:
                System.out.format("%-3s %3s", input, "cuatro");
                break;
            case 5:
                System.out.format("%-3s %3s", input, "cinco");
                break;
            case 6:
                System.out.format("%-3s %3s", input, "seis");
                break;
            case 7:
                System.out.format("%-3s %3s", input, "siete");
                break;
            case 8:
                System.out.format("%-3s %3s", input, "ocho");
                break;
            case 9:
                System.out.format("%-3s %3s", input, "nueve");
                break;
            case 10:
                System.out.format("%-3s %3s", input, "diez");
                break;
            default:
                System.out.println("Spanish Numbers will now die.");
                break;
        }
        
        System.out.println();
    }

    public static void main(String[] args) {

        for (int d = 1; d <= 10; d++) {
            SpanishNumbers(d);
        }

    }
}