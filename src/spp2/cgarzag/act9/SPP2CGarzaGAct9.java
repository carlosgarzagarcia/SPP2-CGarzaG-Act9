/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgarzag.act9;
import java.util.Scanner;
/**
 *
 * @author Carlos Rafael
 */
public class SPP2CGarzaGAct9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int matriz[][];
       int filas, columnas, datos;
       
     Scanner reader=new Scanner(System.in);
      reader=new Scanner(System.in);
      System.out.print("Introduzca el número de filas: ");
      filas=reader.nextInt();
      System.out.print("Introduzca el número de columnas: ");
      columnas=reader.nextInt();
      System.out.println("Ha creado una matriz "+filas+"x"+columnas+".");

      
        matriz=new int[filas][columnas];
        for(int j=0; j<filas; j++){
            for(int i=0; i<columnas; i++){
                System.out.print("Introduzca la componente ("+j+", "+i+"): ");
                matriz[j][i]=reader.nextInt();
            }
        }
        System.out.println("La matriz es: ");
        for(int j=0; j<filas; j++){
            for(int i=0; i<columnas; i++){
                System.out.print(matriz[j][i]+" ");
                  int suma;
                  suma=0;
                  
                  suma += matriz[i][j];
                  
            }
            System.out.println();
            
        }
        
    }
    }

