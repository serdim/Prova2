
public class ContoCorrenteConCarta extends ContoCorrente {

	//ATTRIBUTI
	public String NumeroCarta;
	public double SaldoMensile=1500;
	
	
	//COSTRUTTORI
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
