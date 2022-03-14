package exercicio1;

public class TestaAnimal {
	
	public static void main(String []args) {
		Cachorro cachorro = new Cachorro();
		Preguiça preguica = new Preguiça();
		Cavalo cavalo = new Cavalo();
		
		cachorro.setNome("Rex");
		cachorro.setIdade(10);
		
		preguica.setNome("Soninho");
		preguica.setIdade(5);
		
		cavalo.setNome("Alazão Pocotó");
		cavalo.setIdade(7);
		
		
		System.out.println("\n"+cachorro.getNome()+" é um cachorro que tem "+cachorro.getIdade()+" anos ");
		cachorro.emitirSom();
		cachorro.correr();
		
		System.out.println("\n"+preguica.getNome()+" é uma preguiça que tem "+preguica.getIdade()+" anos ");
		preguica.emitirSom();
		preguica.subirArvore();
		
		System.out.println("\n"+cavalo.getNome()+" é um cavalo que tem "+cavalo.getIdade()+" anos ");
		cavalo.emitirSom();
		cavalo.correr();
	}
}
