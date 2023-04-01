package ar.edu.utn.ap40;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {


	public static void main(String[] args) throws IOException {
		
		Materia m1=new Materia();
		Materia m2=new Materia();
		Materia m3=new Materia();
		Materia m4=new Materia();
		
		m1.setNombre("Introduccion a la Matematica");
		m2.setNombre("Matematica 1");
		m3.setNombre("Introduccion a la Economia");
		m4.setNombre("Principios y Esctructura de la Economia");
		
		m2.agregarMateria(m1);
		
		m4.agregarMateria(m3);
		
		ArrayList<Materia>materias=new ArrayList<Materia>();
		materias.add(m1);
		materias.add(m2);
		materias.add(m3);
		materias.add(m4);
		
		Alumno a1=new Alumno();
		Alumno a2=new Alumno();
		Alumno a3=new Alumno();
		
		a1.setNombre("Tomas");
		a1.setLegajo("123");
		a1.agregarAprobada(m1);
		a1.agregarAprobada(m3);
		
		
		a2.setNombre("Agustin");
		a2.setLegajo("456");
		a2.agregarAprobada(null);
		
		a3.setNombre("Ticiano");
		a3.setLegajo("789");
		a3.agregarAprobada(m1);
		a3.agregarAprobada(m2);
		
		ArrayList<Alumno>alumnos=new ArrayList<Alumno>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		
		
		
		ArrayList<Inscripcion>inscripciones=new ArrayList<Inscripcion>();

		String archivo=new File("C:\\Users\\Usuario\\Desktop\\Git\\Inscripciones.csv").getAbsolutePath();


		try {
			for (String linea : Files.readAllLines(Paths.get(archivo))) {
				
				String values = linea.split(",");
				

				String nombre = values[0];
				String materia = values[1];
				int indentificador=values[2];
				
				
				int i=0;
				Inscripcion ins=new Inscripcion();
				ins.alumno=alumnos.get(i);
				ins.materia=materias.get(indentificador);
				
				ins.aprobada();
				inscripciones.add(ins);
				
				
				
				
				
				i++;



			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
