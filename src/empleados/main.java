package empleados;

import java.util.concurrent.ThreadLocalRandom;

public class main {

	public static void main(String[] args) {
		
			
		empleado EmpleadoHam = new empleado("Calidoso", 700);
		EmpleadoHam.decirNombre();
	
		System.out.println(EmpleadoHam.getStrIDempleado()+ " Es su número");
		EmpleadoHam.setStrNombre("Hamilton");
		
			//este es un encapsulamiento ya que solo veo el atributo atravez del metodo
		EmpleadoHam.setStrNombre("Manuel");
		EmpleadoHam.decirNombre();
		//System.out.println("Mi nombre es " + EmpleadoHam.getStrNombre());

		
		
	}

}
