
public class Aplicacao {

	public static void main(String[] args) {
		
		//exemplo de polimorfismo, o m�todo preparar bebidas � utilizado por diferentes tipos de bebidas
		
		LeiteQuente leite = new LeiteQuente();
		Preparador preparador = new Preparador();
		preparador.prepararBebida(leite);
		
		System.out.println("----------------------------------------------------------------");
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
	}
	
		
		
}
