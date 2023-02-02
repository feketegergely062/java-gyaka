import java.util.Scanner;



public class App {
    public static double calcRadius(double side, double alpha){  
        double rad = alpha * Math.PI/180;
        double radius = 1/2. * side * Math.sin(rad);
        return radius;
    }
    public static void feladat0312(){
        System.out.println("0312 megoldás");
        System.out.println("Rombuszba irható kor sugara: ");
        // Bekérés ---> scanner
        // A Scenar példányosítása
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oldal: ");
        // vegkénti bekérés ---> 
        double side = Double.parseDouble(scanner.nextLine());
        System.out.print("Alfa szog: ");
        double alpha = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double radius = calcRadius(side, alpha);
        System.out.println("Sugár: " + radius);
    }
    public static void main(String[] args) throws Exception {
        feladat0312();
    }
}
