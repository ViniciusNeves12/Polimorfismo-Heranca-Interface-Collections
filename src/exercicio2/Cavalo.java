package exercicio2;

public class Cavalo extends Animal {
	
	public String getNome() {
			
		return "O " + super.getNome() + " � um cavalo de " + super.getIdade() + " anos, que faz " + super.getEmitirSom() + " e est� " + super.getAcao();
		
	}
}
