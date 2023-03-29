
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 15;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("vc tem mais de 18 anos");
			
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("vc nao tem 18, mas pode entrar com acompanhante");
			} else {
				
				System.out.println("não pode entrar");
			}
		}
	}

}
