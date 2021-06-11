package src;
import java.util.*;

/*Leer 10 valores de un array de enteros y deducir cuál es la distancia que les separa del número
mayor. Los números ingresados en el array deben de generarse aleatoriamente.*/

public class Ejercicio4_3{

	public static void main(String[] args){
		Ejercicio4_3 t = new Ejercicio4_3();
	}

	//Declarando mis variables globales
	int[] elementos = new int[10];

	public Ejercicio4_3(){

		for (int i =0;i<10 ;i++ ) {
			mostrarNumeros(i);
		}

		for (int i =0;i<10 ;i++ ) {
			diferenciaNumero();
		}
		 //Mostramos el número mayor del arreglo;
            int numeroMayor = mostrarNumeroMayor();
            System.out.println("El  número mayor entre los 10 número es: "+numeroMayor);
	}

	public void mostrarNumeros(int numero){

		for (int j =0;j<10 ;j++ ) {
			elementos[j] = (int) (Math.random()*99+0);
		}

		System.out.println("Arreglo: "+(numero+1)+" y el número es: "+elementos[numero]);
	}

	//Obtener el número mayor del arreglo y la repitencia

	public int mostrarNumeroMayor() {

		int numeroMayor = 0;
		for (int k = 0; k < elementos.length ; k++ ) {
			//Iremos comparando número a número es mayor al que se tiene en el numeroMayor

			if (elementos[k] > numeroMayor) {
				numeroMayor = elementos[k];
			}
		}
                
        return numeroMayor;
	}

//Se hará la diferencia de el valor mayor y el valor random
	public void diferenciaNumero(){

            int mayor= 0, menor=0, resultado=0;
            resultado = mayor - menor;

		mayor=menor=elementos[0];
        for (int l = 0; l < elementos.length; l++) {
            if(elementos[l]>mayor){
                mayor=elementos[l];
            }
            if(elementos[l]<menor){
                menor=elementos[l];
            }
        } 
        
            System.out.println("La diferencia entre el número es:"+resultado);

		}

}