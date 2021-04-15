
public class Main2 {

	public static void main(String[] args) {
		//Nivell 2: Declara una variable double. Assigna-li un valor amb 4 decimals
		//Declara variables de tipus: int, float i string
		//Fes un "cast" de la variable double a cada una de les variables que has creat anteriorment per inicialitzar-les
	
		double quatreDecimals = 1.6789;
		int numeroInt = (int) quatreDecimals;
		float numeroFloat = (float) quatreDecimals;
		String numeroString = String.valueOf(quatreDecimals);
		
		System.out.println("double: " + quatreDecimals + "\n"
				+ "int " + numeroInt + "\n"
				+ "float " + numeroFloat + "\n"
				+ "string " + numeroString);
	
	
	}

}
