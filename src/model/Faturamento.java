package model;

public class Faturamento {
	
	 public static void executar() {
	        double[] faturamento = {
	            2000.0, 3000.5, 0.0, 1500.0, 0.0, 2500.0, 3100.0,
	            1000.0, 0.0, 1800.0, 2700.0, 2300.0, 2900.0, 0.0,
	            3200.0, 3300.0, 4000.0, 0.0, 0.0, 2100.0,
	            2600.0, 2800.0, 2400.0, 0.0, 3000.0,
	            0.0, 3100.0, 3300.0, 2900.0, 2700.0
	        };

	        double menor = Double.MAX_VALUE;
	        double maior = Double.MIN_VALUE;
	        double soma = 0.0;
	        int diasComFaturamento = 0;

	        for (double valor : faturamento) {
	            if (valor > 0) {
	                if (valor < menor) menor = valor;
	                if (valor > maior) maior = valor;
	                soma += valor;
	                diasComFaturamento++;
	            }
	        }

	        double media = soma / diasComFaturamento;
	        int diasAcimaMedia = 0;

	        for (double valor : faturamento) {
	            if (valor > media) diasAcimaMedia++;
	        }

	        System.out.println("Menor faturamento: R$ " + menor);
	        System.out.println("Maior faturamento: R$ " + maior);
	        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
	    }

}
