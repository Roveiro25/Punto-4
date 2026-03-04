
import java.util.Scanner;

public class Teatro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodo met = new Metodo();
        int n=0;
        System.out.print("ingrese la dimensión de la matriz: ");
        n = sc.nextInt();

        Obj [][] m = new Obj[n][n];
        m = met.llenarMatriz(m, sc);
        m = met.Ordenar(m);
        met.mostrar(m);
    }
}