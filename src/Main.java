

public class Main {

	public static void main(String[] args) {
		//Nivell 1
		//Fase 1: printejar per pantalla nom i cognoms i dia, mes i any de naixement
		
		String nom = "Bernat", cognom1 = "C�cera", cognom2 = "Sal�";
		int dia = 8, mes = 2, any = 1985;
		System.out.println(cognom1 + " " + cognom2 + "," + nom);
		System.out.println(dia + "/" + mes +"/" + any);
		
		//Fase 2: calcular i mostrar anys de trasp�s entre 1948 i l'any de naixement
		
		final int anyInici = 1948;
		int numAnysTraspas = 0; //variable per les posicions de l'array d'anys de trasp�s
		System.out.println("Anys de trasp�s entre " + anyInici + " i " + any + ":");
		/*
		for (int i = anyInici; i <= any; i = i + 4) {
			System.out.println(i);
			numAnysTraspas++;				
		}*/
		for (int i = anyInici; i <= any; i = i + 4) {
			if (i % 400 == 0 || i % 4 == 0) {
				System.out.println(i);
				numAnysTraspas++;
			}
		}
		
		System.out.println("N�mero d'anys de trasp�s entre " + anyInici +" i " + any + ": " + numAnysTraspas);
		
		//Fase 3: Crear boole� true o false segons si l'any de naixement �s o no de trasp�s
		
		boolean anyNaixement;
		String fraseTrue = "L'any " + any + " va ser un any de trasp�s";
		String fraseFalse = "L'any " + any + " NO va ser un any de trasp�s";
		
		//�s de trasp�s cada any m�ltiple de quatre, excepte els m�ltiples de cent, que no ho s�n, 
		//i excepte els m�ltiples de 400, que s� que ho s�n.
		
		if (any % 400 == 0 || any % 4 == 0) {
			anyNaixement = true;
		} else {
			anyNaixement = false;
		}
		
		if (anyNaixement == true) {
			System.out.println(fraseTrue);
		}else {
			System.out.println(fraseFalse);
		}
		
		//Fase 4
		
		String nomComplet = nom + " " + cognom1 + " " + cognom2;
		String anyComplet = dia + "/" + mes +"/" + any;
		String fraseCompleta = (anyNaixement == true) ? fraseTrue : fraseFalse;
		
		System.out.println("El meu nom complet �s " + nomComplet + ".\n"
				+ "Vaig n�ixer el " + anyComplet + ".\n"
				+ fraseCompleta);
		
	}
}

