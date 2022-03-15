package exercicio2;

public class Cavalo extends Animal {
	
	public String getNome() {
			
		return "O " + super.getNome() + " é um cavalo de " + super.getIdade() + " anos, que faz " + super.getEmitirSom() + " e está " + super.getAcao();
		
	}
}
