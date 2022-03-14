package exercicio1;

public class TestaAnimal {
	
	public static void main(String []args) {
		Cachorro cachorro = new Cachorro();
		Pregui�a preguica = new Pregui�a();
		Cavalo cavalo = new Cavalo();
		
		cachorro.setNome("Rex");
		cachorro.setIdade(10);
		
		preguica.setNome("Soninho");
		preguica.setIdade(5);
		
		cavalo.setNome("Alaz�o Pocot�");
		cavalo.setIdade(7);
		
		
		System.out.println("\n"+cachorro.getNome()+" � um cachorro que tem "+cachorro.getIdade()+" anos ");
		cachorro.emitirSom();
		cachorro.correr();
		
		System.out.println("\n"+preguica.getNome()+" � uma pregui�a que tem "+preguica.getIdade()+" anos ");
		preguica.emitirSom();
		preguica.subirArvore();
		
		System.out.println("\n"+cavalo.getNome()+" � um cavalo que tem "+cavalo.getIdade()+" anos ");
		cavalo.emitirSom();
		cavalo.correr();
	}
}
