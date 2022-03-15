package exercicio2;

public class Cachorro extends Animal {
	
	public String getNome() {
		
		
		return "O " + super.getNome() + " é um cachorro de " + super.getIdade() + " anos, que faz " + super.getEmitirSom() + " e está " + super.getAcao();
		
	}
}
