package ejercicio2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalificacionNotas {

	public static void main(String[] args) {
		
		int cantPreguntas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Preguntas del Examen"));
		String[] resEstudiante = new String[cantPreguntas];
		String[] resCorrectas = new String[cantPreguntas];
		double valorRespuesta= 5/cantPreguntas;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < resCorrectas.length; i++) {
			System.out.println("PROFE ingresemos por favor la respuesta correcta a la pregunta #: " + (i + 1));
			resCorrectas[i] = scanner.nextLine().toUpperCase();
		}

		for (int i = 0; i < resEstudiante.length; i++) {

			System.out.println("ESTUDIANTE Ingrese la respuesta seleccionada entre A B C D y E de la pregunta #: " + (i + 1));
			String aux = scanner.nextLine().toUpperCase();

			if (aux.equals("A") || aux.equals("B") || aux.equals("C") || aux.equals("C") || aux.equals("D")
					|| aux.equals("E")) {
				resEstudiante[i] = aux;
			} else {
				System.out.println("La respuesta ingresada NO fue una respuesta valida");
				resEstudiante[i] = "X";
			}
		}
		System.out.println("Las Respuestas del Estudiante Fueron:");
		for (int i = 0; i < resCorrectas.length; i++) {
			
			System.out.print(resEstudiante[i] + " ");
			System.out.print(resCorrectas[i] + " ");
		}
		int cont =0;
		for (int i = 0; i < resCorrectas.length; i++) {
			if (resCorrectas[i].equals(resEstudiante[i])) {
				cont++;
			}
		}
		double nota = cont*valorRespuesta;

		System.out.println("la calificacion del examen del estudiante es: " + nota);

	}
} 
