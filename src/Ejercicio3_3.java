package src;
import java.util.*;

/*Hacer una array unidimensional que acepte ocho números enteros. Luego le pregunte al usuario
que ingrese un número a buscar, implementar una función que busque ese número, si lo
encuentra, debe retornar un valor de verdaderos, en caso contrario, retornar falso.*/

public class Ejercicio3_3 {

	public static void main(String[] args){
	Ejercicio3_3 t = new Ejercicio3_3();
	}

	//global a mi clase tarea1
	int[] elementos = new int[8];
	Scanner scanner = new Scanner(System.in);

	public Ejercicio3_3(){
	for(int i = 0 ; i<8; i++){
		pedirValor(i);
	}

	for(int i = 0 ; i<8; i++){
		mostrarDato(i);
	}


     for(int i = 0 ; i<1; i++){
		buscarValor(i);
	}

	}

	//	Se buscara el valor y se mostrara si existe o no
	public void buscarValor(int numero){

		System.out.println("\nIngrese el número que desea buscar: ");
		numero = scanner.nextInt();
		int m = 0;
		//aqui ya buscamos el valor

		while(m < 8  && elementos[m]<  numero){
			m++;
		}

		if (m == 8) {
			System.out.print("Número no encontrado");
		} else if (elementos[m] == numero) {
			System.out.println("Número encontrado, en posición: "+m);
		}
	}

	public void mostrarDato(int numero){
		System.out.println("El indice es "+numero+ " el valor es: "+ elementos[numero]);
	}

	public void pedirValor(int numero){
		System.out.print("\nIngres el valor número: "+numero+": ");
		elementos[numero] = scanner.nextInt();


	}
}