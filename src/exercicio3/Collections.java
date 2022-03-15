package exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections {
	
	public static void main(String[] args) {
		
		Collection<String> estoqueLoja = new ArrayList<String>();
		estoqueLoja.add("Cal�a Jogger");
		estoqueLoja.add("Regata Branca");
		estoqueLoja.add("Camiseta Amarela");
		estoqueLoja.add("Bon� Preto");
		estoqueLoja.add("Moletom Cinza");
		
		Collection<String> estoqueAcessorios = Arrays.asList("pulseira","colar", "rel�gio");
		
		
		System.out.println("1: "+estoqueLoja);
		
		estoqueLoja.remove("Moletom Cinza");
		System.out.println("2: "+estoqueLoja);
		
		System.out.println("3 - Consulta - Bon� Preto: "+estoqueLoja.contains("Bon� Preto"));
		
		estoqueLoja.addAll(estoqueAcessorios);
		System.out.println("4 - lista geral : "+estoqueLoja);		
		
		
		estoqueLoja.clear();
		System.out.println("5 - sem nada: "+estoqueLoja);


	}
}
