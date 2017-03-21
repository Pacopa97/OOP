package soluciondeprob;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class SolucionDeProb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int tamaño=Int("el tamaño de los arreglos: ");
        int [][] a=crearMatriz("A",tamaño);
        Matrix(a);
        
    }
    
    public static int Int(String mensaje){
        Scanner teclado = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        varEntera = teclado.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag=true;
            teclado.nextLine();
    } 
  } while (flag); 
    return varEntera;
    
    }
       public static int [][] crearMatriz(String mensaje, int tamaño){
        System.out.println("\nIntroduzca el contenido de la matriz "+mensaje);
        int[][]Matrix=new int[tamaño][tamaño];
        int valor;
        System.out.println("El tamaño de la matriz es "+Matrix.length);
        for (int i=0; i<Matrix.length; i++){
            for (int j=0; j<Matrix[i].length; j++){
            Matrix[i][j]=Int("el valor ("+i+","+j+"): ");
            }
        }
        return Matrix;
        }
 public static void Matrix (int [][]a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                for(int k=1;k<=a[i][j];k++){
                    System.out.print("*");
                }
                if(!(j==(a[0].length-1)))System.out.print(" - ");
            }
            System.out.print("\n");
        }
    }
}