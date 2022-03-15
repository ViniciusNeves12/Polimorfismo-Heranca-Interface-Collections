package exercicio2;

public class Preguica extends Animal {
	
	public String getNome() {
		
		return "A " + super.getNome() + " é uma preguiça de " + super.getIdade() + " anos, que faz " + super.getEmitirSom() + " e está " + super.getAcao();
		
	}
}
