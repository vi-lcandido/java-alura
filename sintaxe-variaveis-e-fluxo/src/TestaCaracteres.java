
public class TestaCaracteres {
	public static void main (String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		
		//concatena o número com o texto transformando o número em string
		palavra = palavra + 2020;
		System.out.println(palavra);
				
		char valor = 65; //compila
		System.out.println(valor); //printa A
		
//		valor = valor + 1; nao compila essa soma, jaba transforma para o maior tipo, que é int já que 1 é um inteiro. Pra compilar preciso do casting
	 
		
		valor = (char)(valor + 1); // compila pois com char mostra que quero um resultado dessa soma em char
		System.out.println(valor);
	}
}
