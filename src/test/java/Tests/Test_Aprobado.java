package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.utn.ap40.Alumno;
import ar.edu.utn.ap40.Inscripcion;
import ar.edu.utn.ap40.Materia;

class Test_Aprobado {

	Alumno a1 = null;

	@BeforeEach
	public void setup() {
		this.a1 = new Alumno("Tomas", "123456");
	}

	@DisplayName("Una materia sin correlativas")
	@Test
	public void test1() {
		Materia m1 = new Materia("Introduccion a la Matematica", null);
		Inscripcion inscripcion = new Inscripcion(a1, m1);
		Assertions.assertEquals(true, inscripcion.aprobada());
	}
	
	

	@DisplayName("Una materia con correlativas y que el alumno las tenga")
	@Test
	public void test2() {
		Materia m1 = new Materia("Introduccion a la Economia", null);
		List<Materia> materiasprueba = new ArrayList<Materia>();
		materiasprueba.add(m1);
		Materia m2 = new Materia("Principio y Estructura de la Economia", materiasprueba);
		this.a1.agregarAprobada(m1);
		Inscripcion inscripcion = new Inscripcion(this.a1, m2);
		Assertions.assertEquals(true, inscripcion.aprobada());
	}

	@DisplayName("Otra materia con correlativas, y que el alumno no las tenga")
	@Test
	public void test3() {
		Materia m3 = new Materia("Matematica Discreta", null);
		List<Materia> materiasprueba = new ArrayList<Materia>();
		materiasprueba.add(m3);
		Materia m4 = new Materia("Arquitectura de Computadoras", materiasprueba);
		Inscripcion inscripcion = new Inscripcion(a1, m4);
		Assertions.assertEquals(false, inscripcion.aprobada());
	}

}
