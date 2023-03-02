package com.evaluacionjavaobjetos.evaluacionjavaobjetos;

import java.util.ArrayList;
import java.util.HashMap;
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
	public static void gestionNota(ArrayList<Double> notas){
		Double mayor =  notas.get(0);
		Double menor = notas.get(0);
		for(int i = 1; i < notas.size(); i++){
			if(notas.get(i) > mayor){
				mayor = notas.get(i);
			}
			if(notas.get(i) < menor){
				menor = notas.get(i);
			}
		}
		System.out.println("La nota más alta fué: " + mayor);
		System.out.println("La nota más baja fué: " + menor);
	}




	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int userOption = 1;
		while(userOption != 0){
			do {
				System.out.println("Bienvenido!");
				System.out.println("Ingrese '1' si quiere ver el promedio por alumno");
				System.out.println("Ingrese '2' si quiere guardar un curso");
				System.out.println("Ingrese '3' si quiere guardar notas y evaluarlas");
				System.out.println("Ingrese '0' para salir del menú");
				System.out.print("Ingrese su opción: ");
				userOption=input.nextInt();
			} while (userOption < 0 || userOption > 3);

			if(userOption == 1){

				HashMap <String,ArrayList<Double>> notas = new HashMap<>();
				int cantAlum;
				int cantNotas;
				System.out.print("Indique cantidad de alumnos a ingresar : ");
				cantAlum = input.nextInt(); 
				System.out.print("Indique cantidad de notas a ingresar : ");
				cantNotas = input.nextInt();

				for (int i = 1; i <= cantAlum; i++) {
					
					ArrayList<Double> notasAlumnos = new ArrayList<Double>(); 

					Alumno alumno = new Alumno();

					System.out.print("Ingrese nombre del alumno: ");
					alumno.setNombre(input.nextLine());

					for (int x = 1; x <= cantNotas; x++) {

						System.out.print("Ingrese nota nro "+x+" del alumno "+alumno.getNombre()+" :");
						notasAlumnos.add(Double.parseDouble(input.nextLine()));
						
					}

					notas.put(alumno.getNombre(), notasAlumnos);

				}

				for(String i : notas.keySet()){
				
		            System.out.println("El promedio del alumno "+ i + " es de:" + promedioNotas(notas.get(i)));
				}

			}else if(userOption == 2){

			}


		}
	}
}
