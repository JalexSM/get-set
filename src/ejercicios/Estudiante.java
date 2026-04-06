package ejercicios;

public class Estudiante {

	private int carnet;
	private String nombre;
	private double promedio;
	
	
	
	
	public Estudiante(int carnet, String nombre, double promedio) {
		super();
		this.carnet = carnet;
		this.nombre = nombre;
		setPromedio(promedio);
	}




	public int getCarnet() {
		return carnet;
	}




	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public double getPromedio() {
		return promedio;
	}




	public void setPromedio(double promedio) {
		if (promedio>=0 &&promedio<=100) {
			this.promedio = promedio;
		}else{
            System.out.println("Promedio no esta dentro de los limites (0-100)");
        }
		
		
	} 
	
	public boolean esBecado() {
		if (this.promedio>=85) {
			return true;
		}else {
			return false ;	
		}
	}
	
	public void mostrarBecado() {
		
	boolean becado = esBecado();
	
	if(becado) {
		System.out.println("el estudiante "+this.nombre+" Es becado con un promedio de "+ this.promedio );
		
	} else {
		System.out.println("el estudiante "+this.nombre+" No es becado con un promedio de "+ this.promedio );
		}
	}
}
