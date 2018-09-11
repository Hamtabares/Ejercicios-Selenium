package empleados;

public class persona {

	private String strCedula;
	private String strNombre;
	private int intEdad;
	
	public persona() {
		strCedula = "1128467638";
		strNombre = "Hamilton";
		intEdad = 29;		
				
	}
	
	public String getStrCedula() {
		return strCedula;
	}
	public void setStrCedula(String strCedula) {
		this.strCedula = strCedula;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public int getIntEdad() {
		return intEdad;
	}
	public void setIntEdad(int intEdad) {
		this.intEdad = intEdad;
	}
	
	public void decirNombre() {
		System.out.println("Mi nombre es " +  strNombre);
		
	}
	public boolean esMayorEdad() {
		return intEdad>18;
		
	}
}
