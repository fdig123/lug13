package listaAttori;

public class AttoriPreferitiTest {

	public static void main(String[] args) {
		AttoriPreferiti attori = new AttoriPreferiti();
		attori.inizializzazione();
		attori.nome = "Francesco";
		attori.aggiungiAttori();
		attori.nome = "Paula";
		attori.aggiungiAttori();
		attori.nome = "David";
		attori.aggiungiAttori();
		attori.stampaLista();
		
		attori.nome = "Francesco";
		attori.miaLista.remove(attori.nome);
		attori.stampaLista();
		attori.miaLista.add(2,attori.nome);
		attori.stampaLista();
		
	}

}
