package tema6;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

public class Actividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabraString = "hola mundo";
		String [] listaStrings = palabraString.split(" ");
		//palabraString.tri
		char [] lista= palabraString.toCharArray();
		System.out.println(Arrays.toString(lista));
		System.out.println(Arrays.toString(listaStrings));
		
	}

}
