
public class Aplicacao {

	public static void main(String[] args) {
		
		System.out.println("---------------Carro-----------------");
		Carro v = new Carro();
		v.setMarca("HONDA");
		v.setModelo("City");
		v.setAno(2020);	
		
		
		v.buzinar();
		v.imprimirDados();
		
		System.out.println("---------------Caminhão-----------------");
		Caminhao c = new Caminhao();
		c.setMarca("HHHH");
		c.setModelo("AAA");
		c.setAno(1990);
		
		c.imprimirDados();
		c.buzinar();
		
		System.out.println("---------------Motocicleta-----------------");
		Motocicleta m = new Motocicleta();
		m.setMarca("FFFFF");
		m.setModelo("CCCC");
		m.setAno(2000);
		
		m.imprimirDados();
		m.buzinar();
		m.empinar();
		
		
	}
	
	
}
