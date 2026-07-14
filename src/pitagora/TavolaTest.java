package pitagora;


public class TavolaTest {

	public static void main(String[] args) {
		int numeroMax= 10, numeroAttuale=0, numeroIncrementale=0;
		
		for(int i=0;i<numeroMax;i++) {
			numeroAttuale++;
			numeroIncrementale=numeroAttuale;
			for(int j=0;j<numeroMax;j++) {
				System.out.printf("%4d", numeroIncrementale);
				numeroIncrementale += numeroAttuale;
			}
			System.out.println();
		}
	}

}
