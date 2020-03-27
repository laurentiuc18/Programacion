package Ejercicio8_1;

import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String frase;
		 int cont = 1, posicion;
		 
		 
		System.out.println("Introduzca la frase a deseada");
		frase=sc.nextLine();
				
		   
		 frase = frase.trim();
		    
		    
		    if (frase.isEmpty()) { 
		        cont = 0;
		    } else {
		                posicion = frase.indexOf(" ");
		                while (posicion != -1) {
		                           cont++;
		                           posicion = frase.indexOf(" ", posicion + 1);
		                }                                               
		    }
		    System.out.println("La frase intruducidaque has introducido  :"+ frase +" \n tiene "+ cont +" palabras");
		

	}
	}