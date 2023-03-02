package com.evaluacionjavaobjetos.evaluacionjavaobjetos;

import java.util.ArrayList;

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




	//3.- dado un arreglo, obtener la mejor nota, la peor nota y el promedio





	public static void main(String[] args) {
	}

}
