package ejercicios;

public class Termometro {
	
	 private double celsius;

	 
	 
	 
	 
	 
	    public Termometro(double celsius) {
		
		setCelsius(celsius);
	}


		public void setCelsius(double temperatura) {
	        if (temperatura >= -273.15) {
	            this.celsius = temperatura;
	        } else {
	            System.out.println("Error: La temperatura no puede ser menor a -273.15 °C (cero absoluto).");
	        }
	    }

	    
	    public double getCelsius() {
	        return celsius;
	    }

	    
	    public double getFahrenheit() {
	        return (celsius * 9 / 5) + 32;
	    }
}
