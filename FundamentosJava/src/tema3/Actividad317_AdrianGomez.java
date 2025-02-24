package tema3;

import java.util.Scanner;

public class Actividad317_AdrianGomez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num,maximo;
		maximo=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escriba el primer numero");
		num1=sc.nextInt();
		System.out.println("Escriba el segundo numero");
		num2=sc.nextInt();
		num=num1;
		if (num2<num1) {
			System.out.println("El primer numero tiene que ser mas pequeño que el segundo");
			
			
		}else {
			while(num>=1) {
				
				if (num1%num==0 && num2%num==0 && num>maximo) {
					maximo=num;
				}
				num--;
				}
				System.out.println("El MCD es: "+ maximo);
				}
			}
		}
	


