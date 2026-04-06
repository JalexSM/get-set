package ejercicios;

class Curso {

	private String nombreCurso;
	private int nota1;
	private int nota2;
	private int nota3;
	
	






	public Curso(String nombreCurso, int nota1, int nota2, int nota3) {
		super();
		this.nombreCurso = nombreCurso;
		setNota1(nota1);
		setNota2(nota2);
		setNota3(nota3);
	}


	public String getNombreCurso() {
		return nombreCurso;
	}


	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}


	public int getNota1() {
		return nota1;
	}


	public void setNota1(int nota1) {
		if (nota1>= 0 && nota1<=100) {
			this.nota1 = nota1;
		}else{
            System.out.println("Error: Nota1 fuera de rango (0-100)");
        }
		
	}


	public int getNota2() {
		return nota2;
	}


	public void setNota2(int nota2) {
		if (nota2>=0 &&nota2<=100) {
			this.nota2 = nota2;
		}else{
            System.out.println("Error: Nota2 fuera de rango (0-100)");
        }
	}


	public int getNota3() {
		return nota3;
	}


	public void setNota3(int nota3) {
		if (nota3>=0 &&nota3<=100) {
			this.nota3 = nota3;
		}else{
            System.out.println("Error: Nota3 fuera de rango (0-100)");
        }
	}
	
	public double promedio() {
		double promedio;
		promedio=(nota1+nota2+nota3)/3;
		return promedio;
	}
	
	public String estado() {
        if (promedio() >= 61) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
	  }
	
	
	
}
