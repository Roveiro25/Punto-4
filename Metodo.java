
import java.util.Scanner;

public class Metodo{
    public Obj[][] llenarMatriz(Obj[][] m , Scanner sc)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Obj obj = new Obj();
                System.out.print("Ingrese el numero del asciento: ");
                obj.setNumero(sc.nextInt());
                System.out.print("Ingrese la fila: ");
                obj.setFila(sc.nextInt());
                System.out.print("Igrese el precio: ");
                obj.setPrecio(sc.nextDouble());
                m[i][j]= obj;
            }
        }
        return m;
    }    
    public void mostrar(Obj[][] m)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Numero: " + m[i][j].getNumero());
                System.out.println("Fila: " + m[i][j].getFila());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("'----------------------------------------- '\n");
            }

        }
    }
    public Obj[][] Ordenar(Obj [][] m)
    {
        // recorre filas 
        for (int i = 0; i < m.length; i++) {
            //controla cuantas veces se repite el proceso de ordenamiento en esa fila 
            for (int k = 0; k < m.length; k++) {
                //-j significa que cada que el hace la iteracion deja el mayor al final 
                for (int j = 0; j < m.length -1 -k; j++) {
                    if (m[i][j].getPrecio() > m[i][j+1].getPrecio()) {
                        Obj t = m[i][j];
                        m[i][j] = m[i][j+1];
                        m[i][j+1] = t;
                    }
                }
            }
        }
        return m;
    }
}