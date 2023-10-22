import java.util.Scanner;

public class Primera {

	public static void main(String[] args) {
		
		int [] array_1 = new int[3];
	    array_1[0] = 11;
	    System.out.println(array_1[0]);
		
	    double  num1 = 10D;
	    float   num2 = (float) num1;
	    long    num3 = (long) num2;
		int     num4 = (int) num3;
		short   num5 = (short) num4;
		byte    num6 = (byte) num5;
		System.out.println("el numero es : "+num6+" byte");
		
		
		int [] array2 = {2,3,4};
		System.out.println(array2[1]);
		System.out.println("el tamaño del array2 es : "+array2.length);
		
		
		
		int[][] array3 = {
				{9,8,7},
				{6,5,4,5,6,4,5},
				{3,2,1}
		};
		
		System.out.println("la capacidad de la primera dimension es : "+array3.length);
		System.out.println("la capacidad de la segunda dimension es : "+array3[1].length);
		
		System.out.println("hola\t\t adios\t\t espera\t\t no se");
		System.out.println("hola\n\n adios\n espera\n no se");
		System.out.println("hola \"adios\" espera");
		System.out.println("hola \\adios \\espera");
		
		
		
		
		String palabra = "palabra";
		char letra = palabra.charAt(2);
		System.out.println("el valor de letra es : "+letra);
		String mayusculas = palabra.toUpperCase();
		System.out.println(mayusculas);
		String minusculas = mayusculas.toLowerCase();
		System.out.println(minusculas);
		
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("escribe una palabra : ");
		String palabra2 = lector.next();
		System.out.println("la palabreja es : "+palabra2);
		
		
		
		System.out.println("escribe una palabra : ");
		String palabra3 = lector.next();
		char letra2 = palabra3.charAt(0);
		System.out.println("la primera letra es : "+letra2);
		
		
		
		
		
		System.out.println("escribe una palabra : ");
		String palabra4 = lector.next();
		System.out.println("escribe la posicion de la letra : ");
		int num = lector.nextInt();
		char letra3 = palabra4.charAt(num);
		System.out.println("la primera letra es : "+letra3);
		
		
		
		
		
		
	}

}
