package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		
		//questao 1
		
		int indice = 13;
		int soma = 0;
		int k = 0;
		
		while(k<indice) {
			k = k + 1;
			soma = soma + k;
		}
		
		System.out.println("Questao 1");
		System.out.println("Resposta: Soma: "+soma);
		System.out.println("Resposta da 1° - 91");
		
		
		//questao 2
		
		System.out.println("\n\nQuestao 2");
		Scanner x = new Scanner(System.in);
	    System.out.print("Digite o número ao qual quer testar: ");
	    int numeroTestado = x.nextInt();
	    
	    int num1 = 1;
	    int num2 = 0;
	    
	    List<Integer> fibo = new ArrayList<>();
	    fibo.add(num2);
	    fibo.add(num1);

        for(int i = 0; i < numeroTestado; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            fibo.add(num1);
        }
        
        boolean fazParte = false;
        for(Integer z:fibo) {
        	
        	if(fazParte == false) {
        		if(z==numeroTestado) {
        			fazParte = true;
            		System.out.println("Faz parte!");
            	}
        	}
        	
        }
        
        if(fazParte == false) {
        	System.out.println("Nao faz parte!");
        }
        
        //questao 3
        
        System.out.println("\n\nQuestao 3");
        System.out.println("Resposta da 3° - a= 9, b=128, c=49, d=100, e=13");
        
        //questao 4
        
        System.out.println("\n\nQuestao 4");
        System.out.println("Resposta da 4° - Supondo que os pedágios sejam na entrada/saída de cada cidade e acrescendo o tempo ao tempo total de viagem, "
        		+ "\no carro andará 1,57km/min e o caminhao 1,33km/min ambos em velocidade constante. Sendo assim, quando o eles estiverem no minuto 34,5 aproximadamente,"
        		+ " \neles se encontrarão e o carro estará mais próximo de seu destino, percorrido 54,1 km e o caminhao 45,9.");
        
      //questao 5
        
        System.out.println("\n\nQuestao 5");
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        List<String> listaStrings = new ArrayList<>();
        listaStrings.add(a);
        listaStrings.add(b);
        listaStrings.add(c);
        listaStrings.add(d);
        listaStrings.add(e);
        int cont = listaStrings.size() -1;
        while(cont >= 0) {
        	System.out.println(listaStrings.get(cont));
        	cont= cont-1;
        	
        }
       
	}
	
	
}
