package solucprob3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author franc
 */
public class SolucProb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int tamaño=Int("el tamaño de los arreglos: ");
        int [][] a = crearMatriz("A",tamaño);
        int [][] b = crearMatriz("B",tamaño);
        print(a,b);
        
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
       
    public static void print(int [][]a,int [][]b){
        if(Arrays.deepEquals(a,b)){
            System.out.println("Las matrices son iguales");}
        else{
            System.out.println("Las mastrices no son iguales");}
    }
    }
