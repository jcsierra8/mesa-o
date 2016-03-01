import java.util.*;
public class mesaño {

	public static void main(String []args){
	int mes;
	
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Introduce el mes (1-12)");
	mes=teclado.nextInt();
	teclado.nextLine();
	
	switch(mes)
	{
		case 1:
			System.out.println("Enero");
		break;
		
		case 2:
			System.out.println("Febrero");
		break;
		
		default:
			System.out.println("No es un número correcto");
	}
	teclado.close();
	}
}
