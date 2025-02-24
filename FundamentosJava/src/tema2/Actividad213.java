package tema2;

import java.util.Scanner;

public class Actividad213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int comidaDisp,numAnim,kilosAnimal;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("¿Cuantos kilos hay disponibles?");
		 comidaDisp=sc.nextInt();
		 System.out.println("¿Cuantos animales hay?");
		 numAnim=sc.nextInt();
		 System.out.println("¿Cuantos kilos de comida come cada animal?");
		 kilosAnimal=sc.nextInt();
		 int consumoTotal=numAnim*kilosAnimal;
		 if (comidaDisp-consumoTotal>=0  ){
			System.out.println("Tienes comida suficiente");
			System.out.println("Comida restante: "+(comidaDisp-consumoTotal));
	
		 }else {
			 int corresponde=comidaDisp/numAnim;
			 System.out.println("La cantidad que le corresponde a cada animal es "+corresponde);
		 }
	}

}
