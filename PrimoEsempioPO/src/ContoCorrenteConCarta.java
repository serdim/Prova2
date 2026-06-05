
public class ContoCorrenteConCarta extends ContoCorrente {

	//ATTRIBUTI
	public String NumeroCarta;
	public double SaldoMensile=1500;
	
	
	//COSTRUTTORI
	public ContoCorrenteConCarta(String newIBAN, Persona newIntestatario, String newNumeroCarta) {
		super(newIBAN, newIntestatario);
		NumeroCarta = newNumeroCarta;
		
		
		
	}
	
	//METODI
	public void aggiungiSpesa(double spesa) {
		if (spesa>0)
			SaldoMensile-=spesa;
	}
	
	


	public String toString() {
		return "Conto: "+IBAN+" con Saldo: "+Saldo+" con Carta Numero "+NumeroCarta+ " e saldo mensile: "+SaldoMensile;
	}
}
