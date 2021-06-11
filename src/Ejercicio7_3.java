package src;
import java.util.*;
 import java.util.Random;

/* Hacer un array 4x3 de enteros que se llene aleatoriamente entre [0,555]. Al final,
 debe mostrar la suma de todos los números que estén en una fila par.*/

public class Ejercicio7_3 {

	public static void main(String[] args){
	Ejercicio7_3 t = new Ejercicio7_3();
	}

	public Ejercicio7_3(){


	llenarMatriz();
	imprimirSumaMatriz();
        
	}

//Empezamos declarando las varibales globales
	int [][] elementos = new int [4][3];
	Random aleatorio = new Random();
		

//En este metodo le asignare los valores aleatorios y lo imprimire
	public void llenarMatriz(){

		String respuesta = "";
            
            for (int i = 0; i < elementos.length; i++) {
                for (int j = 0; j < elementos.length; j++) {
                  elementos [i][j] = aleatorio.nextInt(555);  
                }
  
            }

             for (int i = 0; i < elementos.length; i++) {
            	 for (int j = 0; j < elementos.length; j++) {
                    respuesta = respuesta+","+elementos [i][j];
                }
  						respuesta = respuesta+"\n";
            }
            
            System.out.println(respuesta);
	
	      	
	}	

	public void imprimirSumaMatriz(){

		            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {

  
            }
            

		}	

	}
}


