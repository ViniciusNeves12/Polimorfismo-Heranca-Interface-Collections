package exercicio2;

public class testaAnimal {
	
	public static void main(String[]args) {
		Cachorro cach= new Cachorro();
		Cavalo cav= new Cavalo();
		Preguica preg= new Preguica();
		
		cach.setNome("Rex");
		cach.setIdade(6);
		cach.setEmitirSom("Au Au Au Au");
		cach.setAcao("Correndo...");
		
		cav.setNome("Pocotó Alazão");
		cav.setIdade(14);
		cav.setEmitirSom("Ihiiiiiii");
		cav.setAcao("Correndo...");
		
		preg.setNome("Soninho");
		preg.setIdade(11);
		preg.setEmitirSom("Sniiif Sniiif");
		preg.setAcao("Subindo em Arvores...");
		
		Animal[] cadaAnimal = new Animal[3];
		
		cadaAnimal[0]= cach;
		cadaAnimal[1]= cav;
		cadaAnimal[2]= preg;
		
		for(Animal animais:cadaAnimal) {
			System.out.println(animais.getNome());
		}
	}

}
