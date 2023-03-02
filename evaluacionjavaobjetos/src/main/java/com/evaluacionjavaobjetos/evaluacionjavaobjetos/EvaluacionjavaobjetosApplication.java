package com.evaluacionjavaobjetos.evaluacionjavaobjetos;

import java.util.ArrayList;
import java.util.Scanner;

import com.evaluacionjavaobjetos.evaluacionjavaobjetos.models.Alumno;

public class EvaluacionjavaobjetosApplication {


	//1.- Ingresar notas por estudiante y luego permita obtener el promedio de cada estudiante.
	public static Double promedioNotas(ArrayList<Double> notas){
		Double suma = 0.0;
		for(int i = 0; i < notas.size(); i++){
			suma += notas.get(i);
		}
		return suma/notas.size();
	}

	//2.- Guardar un ARRAY de x cantidad de alumnos por curso y que luego los muestre.

	public static void gestionCurso(){
		Alumno alumnoGestion = new Alumno();
		ArrayList<Alumno> alumnosCurso = new ArrayList<Alumno>();
		Scanner input = new Scanner(System.in);
		System.out.println("Por favor, indíque la cantidad de alumnos:");
		int numAlumnos = Integer.parseInt(input.nextLine()); 

		for(int i = 1; i <= numAlumnos; i++){

			do {
				
				System.out.println("Ingrese alumno nro " + i);
				System.out.println("Ingrese el nombre del alumno");
				alumnoGestion.setNombre(input.nextLine());

			} while (i>numAlumnos);
			alumnosCurso.add(alumnoGestion);
		}

		System.out.println(alumnosCurso);

	}


	//3.- dado un arreglo, obtener la mejor nota, la peor nota y el promedio





	public static void main(String[] args) {
	}

}
