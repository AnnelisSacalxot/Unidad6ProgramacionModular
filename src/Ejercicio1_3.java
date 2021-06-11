package src;
import java.util.*;

/*Crea un array numérico con 5 elementos. Los números de cada elemento deben ser valores
pedidos por teclado al usuario. Muestra por consola el índice y el valor al que corresponde. Se
Debe utilizar bucles tanto para pedir los valores de los elementos del array como para mostrar su
contenido por pantalla.*/

public class Ejercicio1_3 {

	public static void main(String[] args){
	Ejercicio1_3 t = new Ejercicio1_3();
	}

	//global a mi clase tarea1
	int[] elementos = new int[5];
	Scanner scanner = new Scanner(System.in);

	public Ejercicio1_3(){
	for(int i = 0 ; i<5; i++){
		pedirValor(i);
	}

	for(int i = 0 ; i<5; i++){
		mostrarDato(i);
	}

	double promedio = getPromedio();
	System.out.println("El promedio es "+ promedio);

	}


	public double getPromedio(){
	int total = 0;
	for(int i = 0; i<5; i++){
		total+=elementos[i];
	}
	double promedio = (double)total/5;
	return promedio;
	}

	public void mostrarDato(int numero){
		System.out.println("El indice es "+numero+ " el valor es: "+ elementos[numero]);
	}

	public void pedirValor(int numero){
		System.out.print("\nIngres el valor No. "+numero+": ");
		elementos[numero] = scanner.nextInt();
	}
}