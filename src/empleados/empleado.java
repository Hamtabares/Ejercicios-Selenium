package empleados;

import java.util.concurrent.ThreadLocalRandom;

public class empleado extends persona {

	private String strIDempleado;
	private String StrCargo;
	private double dblSalario;
	private double dblPrestaciones;
	private double dblAumento;
	
	public empleado (String strCargo, double dblSalario) {
		generarIDempleadoDinamico();
		this.StrCargo= strCargo;
		this.dblSalario=dblSalario;
	}
	public empleado() {
		//Asi no se declara la variable en el main puede ir ()
		//generarIDempleadoDinamico();
	}
	
	public String getStrIDempleado() {
		return strIDempleado;
	}
	//public void setStrIDempleado(String strIDempleado) {
	//	this.strIDempleado = strIDempleado;
	//}
	public String getStrCargo() {
		return StrCargo;
	}
	public void setStrCargo(String strCargo) {
		StrCargo = strCargo;
	}
	public double getDblSalario() {
		return dblSalario;
	}
	public void setDblSalario(double dblSalario) {
		this.dblSalario = dblSalario;
	}
	public double getDblPrestaciones() {
		return dblPrestaciones;
	}
	public void setDblPrestaciones(double dblPrestaciones) {
		this.dblPrestaciones = dblPrestaciones;
	}
	public double getDblAumento() {
		return dblAumento;
	}
	public void setDblAumento(double dblAumento) {
		this.dblAumento = dblAumento;
	}
	private void generarIDempleadoDinamico() {
		//consultar como se crea un numero aleatorio de n cantidad de digitos
		//strIDempleado = numero random;
		int intNumero = ThreadLocalRandom.current().nextInt(10000, 99999);
		strIDempleado = Integer.toString(intNumero);
	}
	
	
	
	
}
