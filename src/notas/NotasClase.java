package notas;

import javax.swing.JOptionPane;

public class NotasClase {


	public static void main(String[] args) {
		int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "  + "Cantidad de estudiantes"));
		int numeroNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "  + "Cantidad de notas"));
		double [] [] notas = new double[filas][numeroNotas+1];
		
		for(int i = 0; i < filas; i++) {
			double sumatoriaNotas = 0;
			
			for(int j = 0; j < numeroNotas; j++) {
				notas [i][j]= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + (j+1)));
				
				while (notas[i][j]>5 && notas [i][j] < 0) {
					notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog(" la nota debe ser entre 0 y 5 " + (j+1)));
				}
				sumatoriaNotas += notas [i][j];
				
				//notas [i][numeroNotas]= notas[i][j]/numeroNotas;
			}
			notas [i][numeroNotas] = sumatoriaNotas / numeroNotas;
	
		}
	}

}
