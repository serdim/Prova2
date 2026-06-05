/**
 * La classe ContoCorrenteConCarta rappresenta un conto corrente che include una carta di credito associata.
 * Questa classe estende la classe ContoCorrente, ereditando le sue caratteristiche e aggiungendo funzionalità specifiche per la gestione della carta di credito, come il numero della carta e il saldo mensile disponibile per le spese.
 */
public class ContoCorrenteWithCard extends ContoCorrente {

	/** Il numero della carta di credito associata al conto corrente */
	public String CardNumber;
	/** Il saldo mensile disponibile per le spese */
	public double MonthlyBalance=9999.00;
	
	
	/**
	 * Costruttore per creare un conto corrente con carta, che eredita le caratteristiche del conto corrente e aggiunge il numero della carta
	 * @param newIBAN
	 * @param newIntestatario
	 * @param newNumeroCarta
	 */
	public ContoCorrenteConCarta(String newIBAN, Persona newIntestatario, String newNumeroCarta) {
		super(newIBAN, newIntestatario);
		NumeroCarta = newNumeroCarta;
		
		
		
	}
	
	/**
	 * Metodo per aggiungere una spesa al conto corrente con carta, sottraendo l'importo della spesa al saldo mensile
	 * @param spesa
	 */
	public void aggiungiSpesa(double spesa) {
		if (spesa>0)
			SaldoMensile-=spesa;
	}
	
	

	/**
	 * Metodo toString per visualizzare le informazioni del conto corrente con carta
	 */
	public String toString() {
		return "Conto: "+IBAN+" con Saldo: "+Saldo+" con Carta Numero "+NumeroCarta+ " e saldo mensile: "+SaldoMensile;
	}
}
