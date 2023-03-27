
public class TestaConversao {
	public static void main(String[] args) {
	//Esse tipo de conversao nao dá erro pq vc perde a precisao, mas é possível forçar a conversão por meio do casting (int), mas o contrário acontece:
	double salario = 1270.50;
	int valor = (int)salario;
	System.out.println(valor);
	
	//guarda numero de 64 bites
	long numeroGrande = 123456789L;
	//guarda numero menores que 16bite
	short numeroPequeno;
	byte b = 127;
	
	}
	
}
