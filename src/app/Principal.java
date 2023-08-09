package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import temperaturaMensal.TemperaturaMensal;
import temperaturaMensal.meses.Meses;

public class Principal {
	public static void main(String[] args) {
		
		List<TemperaturaMensal> temperaturas = new ArrayList<TemperaturaMensal>();
		
		Scanner scanner = new Scanner(System.in);
		boolean erro = false;
		double temperaturaMedia = 0;
		
		for (Meses mes: Meses.values()) {
			do {	
				System.out.println("Digite a temperatura obtida no mês de " + mes.getNome() + " em °C:");
			
				try {
					temperaturas.add(new TemperaturaMensal(mes, scanner.nextDouble()));
					
					temperaturaMedia += temperaturas.get(temperaturas.size()-1).getTemperatura();
					
					erro = false;
				} catch (Exception e) {
					System.out.println("Valor inválido, tente novamente");
					scanner.next();
					erro = true;
				}
			}while(erro);
		}
		
		temperaturaMedia /= temperaturas.size();
		
		System.out.println("Temperatura Média Semestral = " + temperaturaMedia);
		
		System.out.println("Meses com temperatura acima da média:");
		
		for (TemperaturaMensal temperatura : temperaturas) {
			if(temperatura.getTemperatura() > temperaturaMedia) {
				System.out.println("- " + temperatura.getMes().getNome());
			}
		}
		
		scanner.close();
	}
}
