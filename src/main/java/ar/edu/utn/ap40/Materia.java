package ar.edu.utn.ap40;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Materia {
	private String nombre;
	
	private ArrayList<Materia> correlativas;
	
	
	public Materia() {
		this.correlativas=new ArrayList<Materia>();
	}
	
	public void agregarMateria(Materia m) {
		this.correlativas.add(m);
		
	}
	
	public void quitarMateria(Materia m) {
		this.correlativas.remove(m);
	}
	
	public List<Materia> getCorrelativas(){
		return correlativas;
	}
	
	

	public boolean puedeCursar(Alumno alumno  ) {
		boolean cursar=true;
		int i=0;
		if(this.correlativas!=null) {
			while(cursar && i<this.correlativas.size()) {
				cursar=alumno.getAprobadas().contains(this.correlativas.get(i));
				i++;
			}
			
		}
		
		return cursar;
	}

	public Materia(String string, List<Materia> materiasprueba) {
		// TODO Auto-generated constructor stub
	}
	
	

}
