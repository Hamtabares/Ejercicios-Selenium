package palindromo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String strFrase = JOptionPane.showInputDialog("Ingrese las palabras");
		strFrase = strFrase.trim();
		strFrase = strFrase.replace(" ","");
		strFrase = strFrase.toLowerCase();
		strFrase = strFrase.replace(",","");
		strFrase = strFrase.replace("�", "a");
		strFrase = strFrase.replace("�", "e");
		strFrase = strFrase.replace("�", "i");
		strFrase = strFrase.replace("�", "o");
		strFrase = strFrase.replace("�", "u");
		
		
		int j = strFrase.length()-1;
		boolean bandera = true;
		for (int i = 0; i < strFrase.length(); i++) {
			if(strFrase.charAt(i) == strFrase.charAt(j)) {
				bandera = true;
				j--;
			}
			else {
				bandera = false;
				break;
			}
		}

		if (bandera == true) {
			System.out.println("Si es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}

}
