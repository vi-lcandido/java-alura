
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 15;
		int quantidadePessoas = 1;
		
		boolean acompanhado; // a variável precisa ser iniciliazada antes do escopo para que ela não fique apenas nele e não possa ser utilizada em outro.
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado é: " + acompanhado);
		
		if (idade >= 18 || acompanhado) {
			System.out.println("seja bem vindo");
			
		} else {	
				System.out.println("não pode entrar");
			}
		}

}
