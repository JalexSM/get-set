package ejercicios;

public class Reloj {
	
	
	
	private int hora;
    private int minuto;
    private int segundo;

    
    public Reloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    
    

    
    
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Error: La hora debe estar entre 0 y 23.");
        }
    }

 
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Error: El minuto debe estar entre 0 y 59.");
        }
    }


    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Error: El segundo debe estar entre 0 y 59.");
        }
    }


    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
    

}
