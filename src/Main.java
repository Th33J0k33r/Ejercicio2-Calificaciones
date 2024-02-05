//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Variables
        int[] califAlumno = new int[5];
        double average = 0;
        char cf = 0;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingresa el nombre del estudiante: ");
        String nombAlumno = sc.nextLine();

        for (int i = 0; i < califAlumno.length; i++) {
        System.out.printf("Ingresa la calificación " + (i+1) + " :");
            int calif = sc.nextInt();
            if (calif <0 || calif >100) {
                System.out.println("Ingresa una calificación entre el rango de 0 - 100");
            } else {
                califAlumno[i] = calif;
            }
        }
        average = promedio(califAlumno);
        cf = cf(average);
        printInfo(nombAlumno,califAlumno,average,cf);
    }

    public static double promedio(int[] califAlumno){
        //int[] calif = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < califAlumno.length; i++) {
            sum += califAlumno[i];
        }
        double average = sum / califAlumno.length;
        return average;
    }

    public static char cf (double average){
        char cf = 0;
        if (average >=0 && average <=50){
            cf = 'F';
        }
        if (average >=51 && average <=60 ){
            cf = 'E';
        }
        if (average >=61 && average <=70 ){
            cf = 'D';
        }
        if (average >=71 && average <=80 ){
            cf = 'C';
        }
        if (average >=81 && average <=90 ){
            cf = 'B';
        }
        if (average >=91 && average <=100 ){
            cf = 'A';
        }
        return cf;
    }

    public static void printInfo(String nombAlumno, int[] califAlumno, double promedio, char cf){
        System.out.println("===================================================================");
        System.out.println("Nombre del estudiante: " + nombAlumno);
        for (int i = 0; i < califAlumno.length; i++) {
            System.out.println("Calificación " + (i+1) + ": " + califAlumno[i]);
            }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + cf);
    }
}

