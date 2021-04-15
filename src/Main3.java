
public class Main3 {

	public static void main(String[] args) {
		//Nivell 3: Declara un array de numeros int e inicialitzala amb valors del 1 al 10
		//Rota l’array sense utilitzar un array auxiliar ni llibreries. 
		//Pots utilizar una variable auxiliar.
		
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		for (int  i : array) {
			System.out.println(i);
		}
		int aux;
		for (int i = 0; i < array.length / 2; i++) {
			aux = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = aux;
		}
		for (int  i : array) {
			System.out.println(i);
		}
	}

}
