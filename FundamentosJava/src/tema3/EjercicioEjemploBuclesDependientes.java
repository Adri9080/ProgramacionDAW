package tema3;
public class EjercicioEjemploBuclesDependientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for (i=1; i<=3; i++) {
			System.out.println("Bucle externo, i=" +i);
			j=1;
			while(j<=i) {
				System.out.println("...Bucle Interno, j=" +j);
				j++;
			}
		}
	}

}
