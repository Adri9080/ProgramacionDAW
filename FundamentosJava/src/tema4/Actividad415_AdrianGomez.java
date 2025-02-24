package tema4;

import java.util.Scanner;

public class Actividad415_AdrianGomez {

	public static void main(String[] args) {
		int hora1,minuto1,hora2,minuto2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba las horas del primer intervalo");
		hora1=sc.nextInt();
		System.out.println("Escriba los minutos del primer intervalo");
		minuto1=sc.nextInt();
		System.out.println("Escriba las horas del segundo intervalo");
		hora2=sc.nextInt();
		System.out.println("Escriba los minutos del segundo intervalo");
		minuto2=sc.nextInt();
		if (diferenciaMin(hora1, minuto1, hora2, minuto2)==-1) {
			System.out.println("No se puede convertir");
			
		}else {
			System.out.println("La diferencia de minutos es "+diferenciaMin(hora1, minuto1, hora2, minuto2));
		}
		sc.close();
	}
static int diferenciaMin(int hora1,int minuto1,int hora2,int minuto2) {
	int minutos1res,minuto2res,resultado;
	if (hora1 ==0) {
		hora1=24;
	}else {
		if (hora2==0) {
			hora2=24;
		}
	}
	if (hora1<0 || hora1>24 || hora2<0 || hora2>24 ) {
		return -1;
	}else {
		if (minuto1<0 || minuto1>60 || minuto2<0 || minuto2>60) {
			return -1;
		}else {
			minutos1res=(hora1*60)+minuto1;
			minuto2res=(hora2*60)+minuto2;
			resultado= minutos1res-minuto2res;
			
		}if (resultado<0) {
			resultado*=-1;
			return resultado;
		}else {
			return resultado;
		}
	}
}
}
