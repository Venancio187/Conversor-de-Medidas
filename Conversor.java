package projeto;
import java.util.Scanner;

public class Conversor {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Escolha a conversão:");
	System.out.println("1. Metros para Quilometros");
	System.out.println("2. Celsius para Fahrenheit");
	System.out.println("3. Gramas para Quilogramas");
	
	int escolha = scanner.nextInt();
	
	switch(escolha) {
	
	case 1:
		System.out.println("Digite a quantidade em metros: ");
		double metros = scanner.nextDouble();
		double quilometros = metros / 1000;
		System.out.println(metros + "metros e igual a: " + quilometros);
		break;
		
	case 2: System.out.println("Digite a temperatura em celsius: ");
	        double celsius = scanner.nextDouble();
	        double fahrenheit = (celsius * 9/5) + 32;
	        System.out.println(celsius + "°C eh igual a °F " + fahrenheit);
	        break;
	        
	case 3: System.out.println("Digite a quantidade em gramas: ");
	        double gramas = scanner.nextDouble();
	        double quilogramas = gramas/1000;
	        System.out.println(gramas + "gramas eh igual a: " + quilogramas);
	        break;
   default:
	   System.out.println("Escolha invalida.");
	   
       }

	scanner.close();
   }

}
