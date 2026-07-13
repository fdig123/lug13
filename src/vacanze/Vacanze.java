package vacanze;

public class Vacanze {
	public int[] giorniVacanze;
	public int anniDiServizio;
	
	public void setVacanze() {
		giorniVacanze = new int[] {10,15,20,25};
	}
	
	public void mostraGiorniVacanze() {
/*		STANDARD	
 * 	int a;
		if(anniDiServizio<1) {
		a=0;
	}else if(anniDiServizio<=3){
		a=1;
	}else if(anniDiServizio<=5) {
		a=2;
	}else {
		a=3;
	}
		*/
		if(anniDiServizio<0) {
			System.out.println("Errore");
		}else {
			int a = 	
							(anniDiServizio <1) ? 0 
					      : (anniDiServizio <= 3) ? 1 
					      : (anniDiServizio <= 5) ? 2 
					      : 3;
			System.out.println("I giorni di vacanza sono:"+giorniVacanze[a]);
		}
	}
		
}

