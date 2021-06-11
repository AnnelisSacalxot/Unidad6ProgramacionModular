package src;
import java.util.*;

/*Escribir un programa que multiplique por dos los elementos de la siguiente matriz:
5 6 13, 14 2 4, 21 7 6*/

public class Ejercicio6_3 {

	public static void main(String[] args){
	Ejercicio6_3 t = new Ejercicio6_3();
	}

	public Ejercicio6_3(){


	llenarMatriz();
	imprimirMatriz();
        
	}

//Empezamos declarando las varibales globales
	int [][] elementos = new int [3][3];
		

//En este metodo le asignare los valores que ya fueron dado
	public void llenarMatriz(){
            
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    elementos[0][0] =5;
                    elementos[0][1] =6;
                    elementos[0][2] =13;
                    elementos[1][0] =14; 
                    elementos[1][1] =2;   
                    elementos[1][2] =4;
                    elementos[2][0] =21;
                    elementos[2][1] =7;
                    elementos[2][2] =6;
                }
  
            }
            
            System.out.println("Posición (0,0): "+elementos[0][0]);
            System.out.println("Posición (0,1): "+elementos[0][1]);
            System.out.println("Posición (0,2): "+elementos[0][2]);
            System.out.println("Posición (1,0): "+elementos[1][0]);
            System.out.println("Posición (1,1): "+elementos[1][1]);
            System.out.println("Posición (1,2): "+elementos[1][2]);
            System.out.println("Posición (2,0): "+elementos[2][0]);
            System.out.println("Posición (2,1): "+elementos[2][1]);
            System.out.println("Posición (2,2): "+elementos[2][2]);
             
	
	      	
	}	

	public void imprimirMatriz(){

		            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    elementos[0][0] =5*2;
                    elementos[0][1] =6*2;
                    elementos[0][2] =13*2;
                    elementos[1][0] =14*2; 
                    elementos[1][1] =2*2;   
                    elementos[1][2] =4*2;
                    elementos[2][0] =21*2;
                    elementos[2][1] =7*2;
                    elementos[2][2] =6*2;
                }
  
            }
            
            System.out.println("\nAhora la misma matriz multipilcada por 2");
            System.out.println("Posición (0,0): "+elementos[0][0]);
            System.out.println("Posición (0,1): "+elementos[0][1]);
            System.out.println("Posición (0,2): "+elementos[0][2]);
            System.out.println("Posición (1,0): "+elementos[1][0]);
            System.out.println("Posición (1,1): "+elementos[1][1]);
            System.out.println("Posición (1,2): "+elementos[1][2]);
            System.out.println("Posición (2,0): "+elementos[2][0]);
            System.out.println("Posición (2,1): "+elementos[2][1]);
            System.out.println("Posición (2,2): "+elementos[2][2]);

	}	



}	
