package ejercicios;

public class Jugador {

	
	   	private String nombre;
	    private int puntajeActual;
	    private int puntajeMaximo;

	    public Jugador(String nombre) {
	        this.nombre = nombre;
	        this.puntajeActual = 0;
	        this.puntajeMaximo = 0;
	    }

	    // Getter
	    public String getNombre() {
	        return nombre;
	    }

	    public int getPuntajeActual() {
	        return puntajeActual;
	    }

	    public int getPuntajeMaximo() {
	        return puntajeMaximo;
	    }

	    public void setPuntajeActual(int puntajeActual) {
	        if (puntajeActual >= 0) {
	            this.puntajeActual = puntajeActual;
	        } else {
	            System.out.println("El puntaje no puede ser negativo.");
	        }
	    }

	    public void actualizarPuntaje(int nuevoPuntaje) {
	        if (nuevoPuntaje < 0) {
	            System.out.println("El puntaje no puede ser negativo.");
	            return;
	        }

	        puntajeActual = nuevoPuntaje;


	        if (nuevoPuntaje > puntajeMaximo) {
	            puntajeMaximo = nuevoPuntaje;
	            System.out.println("¡Nuevo puntaje máximo alcanzado!");
	        }
	    }


	    public void mostrarDatos() {
	        System.out.println("Jugador: " + nombre);
	        System.out.println("Puntaje actual: " + puntajeActual);
	        System.out.println("Puntaje máximo: " + puntajeMaximo);
	    }
	
}
