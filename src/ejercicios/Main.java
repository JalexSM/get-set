package ejercicios;
import java.util.Scanner;

public class Main {
	
	static Scanner sc= new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[]args) {
	
		 int opcion = 0;

         while (opcion != 11) {
        	 System.out.println("\n===== MENÚ PRINCIPAL =====");
             System.out.println(" 1.Persona Encapsulada 	");
             System.out.println(" 2.Producto con Validaciones 	");
             System.out.println(" 3.Cuenta con PIN	");
             System.out.println(" 4.Curso y Calificaciones	");
             System.out.println(" 5.Estudiante y Beca	");
             System.out.println(" 6.Termómetro Inteligente	");
             System.out.println(" 7.Reloj con Formato	");
             System.out.println(" 8.Contacto con Teléfono	");
             System.out.println(" 9.	");
             System.out.println(" 10.	");
             System.out.println(" 11. SALIR");
             System.out.print("Seleccione una opción: ");
             
             try {
                 opcion = sc.nextInt();

                 switch (opcion) {
                     case 1:
                    	 ejercicio1();
                         break;
                     case 2:
                    	 ejercicio2();
                         break;
                     case 3:
                    	 ejercicio3();

                         break;
                     case 4:
                    	 ejercicio4();
                         break;
                     case 5:
                    	 ejerciocio5();
                     break;
                     case 6:
                    	 ejerciocio6();
                      break;
                     case 7:
                    	 ejerciocio7();
                      break;
                     case 8:
                    	 ejerciocio8();
                    	 
                         break;
                     case 9:
                   	  
                         break;
                     case 10:
                   	  
                         break;
                     case 11:
                    	    System.out.println("saliendo ... ");
                      break;
                     default:
                         System.out.println("Opción inválida.");
                 }
             
                 } catch (Exception e) {
                     System.out.println("Debe ingresar un número válido.");
                     sc.nextLine(); 
                 }
             }
		
		
		
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
		 Producto prod1 = new Producto("001", "Laptop", 5000, 10);

	        prod1.vender(3); 
	        prod1.vender(8); 
	        prod1.setPrecio(-100);
	        prod1.setStock(-5);  
	 }
	 
	 
	 public static void ejercicio3() {
		 
		 
		 System.out.println("\n----- cuenta 1-----");
		 CuentaBancaria cnta1 = new CuentaBancaria("alexander",2000,1234);
		 cnta1.retirar(1000, 1234);
		 cnta1.mostrarSaldo();
		 
		 
		 System.out.println("\n----- cuenta 2 -----");
		 CuentaBancaria cnta2 = new CuentaBancaria("Javier",10000,4321);
		 cnta2.retirar(1000, 1431);
		 cnta2.mostrarSaldo();
		 
	 }
	 
	public static void ejercicio4(){
		
		System.out.println("\n----- curso 1 -----");

	 Curso curso1 = new Curso("Programación", 70, 65, 80);

     System.out.println("Curso: " + curso1.getNombreCurso());
     System.out.println("Promedio: " + curso1.promedio());
     System.out.println("Estado: " + curso1.estado());
     
     	System.out.println("\n----- curso 2 -----");


     Curso curso2 = new Curso("Matemática", -100, -20, 90);

     System.out.println("\nCurso: " + curso2.getNombreCurso());
     System.out.println("Promedio: " + curso2.promedio());
     System.out.println("Estado: " + curso2.estado());
	 }
	 
	
	public static void ejerciocio5() {
		
		
		System.out.println("----- estudiante 1 -----");
		Estudiante estudiante1 = new Estudiante(21212,"alexander",86);
		estudiante1.mostrarBecado();
		
		System.out.println("----- estudiante 2 -----");
		Estudiante estudiante2 = new Estudiante(23112,"javier",82);
		estudiante2.mostrarBecado();
	}
	
	public static void ejerciocio6() {
		
		Termometro t1 = new Termometro(25);
		
		System.out.println("----- ----- Temperatura 1 ----- ----- ");

       
        System.out.println("Temperatura en Celsius: " + t1.getCelsius());
        System.out.println("Temperatura en Fahrenheit: " + t1.getFahrenheit());
        
        System.out.println("----- ----- Temperatura 2 ----- ----- ");

        Termometro t2 = new Termometro(-300);
        
        
		
	}
	
	public static void ejerciocio7() {
		
	
			System.out.println("----- Hora 1-----");
	        Reloj reloj1 = new Reloj(14, 30, 45);
	        System.out.println("Hora: " + reloj1.mostrarHora());

	        System.out.println("----- Hora 2 -----");
	        Reloj reloj2 = new Reloj(25, 70, -5);
	        System.out.println("Hora 2: " + reloj2.mostrarHora());
	    }
		
	
	public static void ejerciocio8() {
		System.out.println("----- Contacto 1-----");
		Contacto cont1 = new Contacto("alexander","24354312","alcas@gmail.com");
		cont1.mostrarContacto();
		
		
		
		
		
		System.out.println("----- Contacto 2-----");
		Contacto cont2 = new Contacto("jarmir","2435433212","wuilvcagmail.com");
		cont2.mostrarContacto();
		
		
		
	}
	
	
	
	
	}



