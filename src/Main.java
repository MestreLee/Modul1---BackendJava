

public class Main {

	public static void main(String[] args) {
		//Nivell 1
		//Fase 1: printejar per pantalla nom i cognoms i dia, mes i any de naixement
		
		String nom = "Bernat", cognom1 = "Cócera", cognom2 = "Saló";
		int dia = 8, mes = 2, any = 1985;
		System.out.println(cognom1 + " " + cognom2 + "," + nom);
		System.out.println(dia + "/" + mes +"/" + any);
		
		//Fase 2: calcular i mostrar anys de traspàs entre 1948 i l'any de naixement
		
		final int anyInici = 1948;
		int numAnysTraspas = 0; //variable per les posicions de l'array d'anys de traspàs
		System.out.println("Anys de traspàs entre " + anyInici + " i " + any + ":");
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
		
		System.out.println("Número d'anys de traspàs entre " + anyInici +" i " + any + ": " + numAnysTraspas);
		
		//Fase 3: Crear booleà true o false segons si l'any de naixement és o no de traspàs
		
		boolean anyNaixement;
		String fraseTrue = "L'any " + any + " va ser un any de traspàs";
		String fraseFalse = "L'any " + any + " NO va ser un any de traspàs";
		
		//és de traspàs cada any múltiple de quatre, excepte els múltiples de cent, que no ho són, 
		//i excepte els múltiples de 400, que sí que ho són.
		
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
		
		System.out.println("El meu nom complet és " + nomComplet + ".\n"
				+ "Vaig néixer el " + anyComplet + ".\n"
				+ fraseCompleta);
		
	}
}

