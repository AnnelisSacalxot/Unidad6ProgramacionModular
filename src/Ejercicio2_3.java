package src;
import java.util.*;
import java.lang.Math;


/*Hacer un programa que llene un array de 10 enteros con números aleatorios del 0 al 99, luego
de eso los muestre en pantalla y diga cuál es el elemento mayor y cuántas veces se repite.*/

public class Ejercicio2_3{

	public static void main(String[] args){
		Ejercicio2_3 t = new Ejercicio2_3();
	}

	//Declarando mis variables globales
	int[] elementos = new int[10];

	public Ejercicio2_3(){

		for (int i =0;i<10 ;i++ ) {
			mostrarNumeros(i);
		}

        //Mostramos el número mayor del arreglo;
            int numeroMayor = repitenciaNumeroMayor();
            System.out.println("El  número mayor entre los 10 número es: "+numeroMayor);
	}

	public void mostrarNumeros(int numero){

		for (int j =0;j<10 ;j++ ) {
			elementos[j] = (int) (Math.random()*99+0);
		}

		System.out.println("Arreglo: "+(numero+1)+" y el número es: "+elementos[numero]);
	}

	//Obtener el número mayor del arreglo y la repitencia
	public int repitenciaNumeroMayor(){

		int numeroMayor = 0;
		for (int k = 0; k < elementos.length ; k++ ) {
			//Iremos comparando número a número es mayor al que se tiene en el numeroMayor

			if (elementos[k] > numeroMayor) {
				numeroMayor = elementos[k];
			}
		}
                
        return numeroMayor;
	}

}