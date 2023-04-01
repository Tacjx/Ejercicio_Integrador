package ar.edu.utn.ap40;

import java.util.ArrayList;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Inscripcion {
	
	public Alumno alumno;
	
	public Materia materia;
	
	private Date fecha;
	
	public Inscripcion() {
		
	}
	public Inscripcion(Alumno alumno, Materia materia) {
		this.alumno=alumno;
		this.materia=materia;
		
	}
	
	
	public boolean aprobada() {
		boolean resultado=false;
		Alumno a=this.alumno;
		Materia m=this.materia;
		resultado=m.puedeCursar(a);
		return resultado;
	}
			
	}
