package listaAttori;

import java.util.ArrayList;

public class AttoriPreferiti {
	public ArrayList<String> miaLista;
	public String nome;
	public void inizializzazione(){
	miaLista = new ArrayList<>();
	}
	
	public void aggiungiAttori() {
		miaLista.add(nome);
	}
	public void stampaLista() {
		for(int i=0;i<miaLista.size();i++){
			System.out.println("Elemento n"+i+": "+miaLista.get(i));
		}
	}
	
	public void rimuoviAttori() {
		
	}
	
}
