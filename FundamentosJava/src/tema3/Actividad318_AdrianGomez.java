package tema3;

import java.util.Scanner;

public class Actividad318_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,minimo,num;
		minimo=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escriba el primer numero");
		num1=sc.nextInt();
		System.out.println("Escriba el segundo numero");
		num2=sc.nextInt();
		num=num2;
		if (num2<num1) {
			System.out.println("El segundo numero tiene que ser mas grande que el primero");
		}else {
			while(num>minimo) {
				
				if (num%num1==0 && num%num2==0 && num>minimo) {
					minimo=num;
					break;
				}
				num++;
				}
				System.out.println("El MCM es: "+ minimo);
				}
			
		}
	}


