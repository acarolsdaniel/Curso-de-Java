
public class Aplicacao {

	public static void main(String[] args) {

		// s� consigo chamar o m�todo morder se o tipo da vari�vel for o mesmo da classe
		// onde o m�todo est�
		System.out.println("----------------------------------------------------------------");
		Cachorro a = new Cachorro();
		a.falar();
		a.morder();
		
		
		//catch
		System.out.println("----------------------------------------------------------------");
		Animal c = new Cachorro();
		c.falar();
		if(c instanceof Cachorro) {
			Cachorro b = (Cachorro)c;
			b.morder();
						
		}
		
		Cachorro d = new Cachorro();
		Gato g = new Gato();
		System.out.println("----------------------------------------------------------------");
		falar(d);
		System.out.println("----------------------------------------------------------------");
		falar(g);
		
		
	
	}
	//catch implicito
	private static void falar(Animal a) {
		a.falar();
		
	}
}
