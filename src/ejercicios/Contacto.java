package ejercicios;

public class Contacto {

	private String nombre;
	private String telefono;
	private String correo;
	
	public Contacto(String nombre, String numero, String correo) {
		super();
		this.nombre = nombre;
		setTelefono(numero);
		setCorreo(correo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String numero) {
		if (numero.length()==8) {
			this.telefono = numero;
		} else {
			System.out.println("El numero sobrepasa las dimensiones el numero debe ser de 8 digitos");
		}
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		if (correo.contains("@")) {
		this.correo = correo;
		} else {
			System.out.println("El correo es invalido ");

		}
	}
	
	public void mostrarContacto() {
		
		System.out.println("nombre "+this.nombre);
		System.out.println("tel. "+this.telefono);
		System.out.println("correo "+this.correo);

		
		
	}
	
	
	
}
