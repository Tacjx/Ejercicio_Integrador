package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import ar.edu.utn.ap40.Alumno;
import ar.edu.utn.ap40.Inscripcion;
import ar.edu.utn.ap40.Materia;

class Test_Aprobado {

	@Test
	public void test() {
		Inscripcion test1=new Inscripcion();	
		
		boolean resultado1=test1.aprobada();
		boolean expected=true;
		assertEquals(expected,resultado1);
	}
	
	@Test
	public void test2() {
		Inscripcion test2=new Inscripcion();
		
		
	}

}
