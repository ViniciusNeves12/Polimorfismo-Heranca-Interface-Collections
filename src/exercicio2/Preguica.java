package exercicio2;

public class Preguica extends Animal {
	
	public String getNome() {
		
		return "A " + super.getNome() + " � uma pregui�a de " + super.getIdade() + " anos, que faz " + super.getEmitirSom() + " e est� " + super.getAcao();
		
	}
}
