import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    float Sueldo;
    double New_Sueldo=0;
	  int cat;
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese su sueldo básico: ");
    Sueldo=s.nextFloat();
    System.out.println("Ingrese su categoria: ");
    cat=s.nextInt();

    switch(cat){
		case 1:
			New_Sueldo = Sueldo + (Sueldo * 0.15);
		break;
		case 2:
			New_Sueldo = Sueldo + (Sueldo * 0.10);
		break;
		case 3:
			New_Sueldo = Sueldo + (Sueldo * 0.08);
		break;
		case 4:
			New_Sueldo = Sueldo + (Sueldo * 0.07);
		break;
		default:
			System.out.println("Por favor, ingrese una categoria valida ");
		break;
	  }
    System.out.println("Su categoria es: "+cat);
    System.out.println("Su sueldo anterior es: "+Sueldo+"$");
    System.out.println("Su nuevo sueldo es: "+New_Sueldo+"$");
  }
}