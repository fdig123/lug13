package arrayInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	public ArrayList<String> miaLista;
	public String nome;
	Scanner input = new Scanner(System.in);
	public void inizializzazione(){
	miaLista = new ArrayList<>();
	}
	
	public void aggiungi() {
		System.out.print("Inserisci il nome: ");
		String nome = input.nextLine();
		while(!nome.equalsIgnoreCase("stop")) {
			miaLista.add(nome);
			System.out.print("Inserisci il nome: ");
			nome = input.nextLine();
		}	
	}
	public void stampa() {
			System.out.println("I nomi inseriti sono:");
		for(String nome : miaLista) {
			System.out.println(nome);
		}
	}
	
}
