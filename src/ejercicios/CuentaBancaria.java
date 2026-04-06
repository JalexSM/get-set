package ejercicios;

public class CuentaBancaria {

	
	private String titular;
	private double saldo;
	private int pin;
	
	
	
	public CuentaBancaria(String titular, double saldo, int pin) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.pin = pin;
	}
	
	public void retirar(double monto, int pinIngresado){
		if(pinIngresado != this.pin) {
			System.out.println("El pin es incorrecto");
			return;
		}
		if (monto <= 0) {
            System.out.println("El monto debe ser mayor a 0.");
            return;
        }

        if (monto > saldo) {
            System.out.println(" Saldo insuficiente.");
            return;
        }
        saldo -= monto;
        System.out.println(" Retiro exitoso. Saldo restante: Q" + saldo);
		
	}
	
	public void mostrarSaldo(){
		
		System.out.println(" Saldo actual de " + titular + ": Q" + saldo);
		
	}
	
	
	
	
}
