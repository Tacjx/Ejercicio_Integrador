package ar.edu.utn.ap40;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Alumno {
	
	private String nombre;
	private String legajo;
	
	private ArrayList<Materia>materiasAprobadas;
	
	public Alumno(){
		this.materiasAprobadas=new ArrayList<Materia>();
	}
	
	public Alumno(String nombre,String legajo) {
		this.nombre=nombre;
		this.legajo=legajo;
	}
	
	public void agregarAprobada(Materia a) {
		this.materiasAprobadas.add(a);
		
	}
	
	public void quitarAprobada(Materia a) {
		this.materiasAprobadas.remove(a);
	}
	
	public List<Materia>getAprobadas(){
		return materiasAprobadas;
	}
	

}
