import java.util.*;

public class Avvio {

		
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Mario", "Rossi", "DFGH5476", "80120");
		ContoCorrente c1= new ContoCorrente("Conto1", p1);	
		
		ContoCorrente c2= new ContoCorrente("Conto2", p1);
		ContoCorrente c3= new ContoCorrente("Conto3", p1);
		ContoCorrenteConCarta cc1= new ContoCorrenteConCarta("IT34567", p1, "1234567890987654");
		
		
		LinkedList<ContoCorrente> elencoContiBanca = new LinkedList<ContoCorrente>();
		elencoContiBanca.add(c1);
		elencoContiBanca.add(null);
		elencoContiBanca.add(c3);
		elencoContiBanca.add(cc1);
		
		try {
			c1.Versa(300);
			c2.Versa(200);
			c3.Versa(-100);
			c1.Versa(200);
		}
		catch(VersamentoErratoException ex) {
			System.out.println(ex.getMessage());
		}
		

//		int[] vettore = new int[10];
		
		
//		Scanner tastiera = new Scanner(System.in);
//		System.out.println("Numero iterazioni sul vettore:");
//	
//		
//		try {	
//			int	bound = tastiera.nextInt();	
//			for(int i=0; i<bound; i++)
//				vettore[i]=3;
//		}	
//		catch(ArrayIndexOutOfBoundsException OutOfBounds) {
//			System.out.println("Hai inserito un limite non valido: "+OutOfBounds.getMessage());
//		}
//		catch(InputMismatchException inputMism) {
//			System.out.println("Devi inserire un valore numerico");
//		}
//		catch(Exception ex) {
//			System.out.println("Errore Generico");
//		}
		
		
		

		System.out.println("Continua programma normalmente");

	

		
//		p1.aggiungiContoCorrente(c2);
//		p1.aggiungiContoCorrente(c1);

		
//		
//		cc1.Versa(300);
//		cc1.aggiungiSpesa(200);
//	
//			
//		ContoCorrente[] vettoreContiBanca = new ContoCorrente[3];
//		vettoreContiBanca[0]=c1;
//		vettoreContiBanca[1]=c2;	
//		vettoreContiBanca[2]=cc1;
//		
//		
//		for(ContoCorrente c:vettoreContiBanca) {
//			System.out.println(c);
//		}
			
		System.out.println("Programma terminato correttamente");
	}




	
	
	
	private static void stampaDettagliBanca() {
		Persona[] banca;
		
		Persona p1 = new Persona("Mario", "Rossi", "DFGH5476", "80120");
		ContoCorrente c1= new ContoCorrente("IT12345", p1);
		ContoCorrente c2= new ContoCorrente("IT67845", p1);
		p1.aggiungiContoCorrente(c1);
		p1.aggiungiContoCorrente(c2);
		
		
		
		Persona p2 = new Persona("Giulia", "Bianchi", "BNG43567", "80125");
		ContoCorrente c3= new ContoCorrente("IT45644", p2);
		p2.aggiungiContoCorrente(c3);
		
		
		Persona p3 = new Persona("Silvia", "Verdi", "GRTG465466", "80128");
		ContoCorrente c4= new ContoCorrente("IT97657", p3);
		ContoCorrente c5= new ContoCorrente("IT43223", p3);
		ContoCorrente c6= new ContoCorrente("IT32123", p3);
		ContoCorrente c7= new ContoCorrente("IT54545", p3);
		p3.aggiungiContoCorrente(c4);
		p3.aggiungiContoCorrente(c5);
		p3.aggiungiContoCorrente(c6);
		p3.aggiungiContoCorrente(c7);
		
		
		banca = new Persona[3];
		
		banca[0]=p1;
		banca[1]=p2;
		banca[2]=p3;
		
		
		for(Persona p:banca) {
			System.out.println(p);
			System.out.println("--------------------------------------------------------------");
		}
	}

}

