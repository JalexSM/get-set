package ejercicios;
import java.util.Scanner;

public class Main {
	
	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args) {
	
		ejercicio1();
		ejercicio2();
		
		
		
	}
	
	 public static void ejercicio1() {
		 
		Persona per1 = new Persona("alex","samayoa",24);
		Persona per2 = new Persona("dani","medrano",32);
		Persona per3 = new Persona("javier","monroy",-32);
				
        System.out.println("----- Persona 1 -----");
        per1.mostrar();

        System.out.println("\n----- Persona 2 -----");
        per2.mostrar();

        System.out.println("\n----- Persona 3 -----");
        per3.mostrar();
		 
		 
	 }
	
	 public static void ejercicio2() {
		 Producto p1 = new Producto("001", "Laptop", 5000, 10);

	        p1.vender(3); 
	        p1.vender(8); 
	        p1.setPrecio(-100);
	        p1.setStock(-5);  
	 }
	

}
