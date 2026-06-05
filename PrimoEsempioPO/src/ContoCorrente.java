
public class ContoCorrente {
	
	//ATTRIBUTI
	public String IBAN;
	Persona Intestatario;
	protected double Saldo;
	
	// COSTRUTTORI
	
	
	public ContoCorrente(String IBAN, Persona Intestatario) {
		this.IBAN = IBAN;
		this.Intestatario = Intestatario;
		Saldo = 0.0;	
		
		Intestatario.aggiungiContoCorrente(this);
		
	}
	
		
	//METODI
	public void Versa(double ImportoDaVersare) throws VersamentoErratoException
	{  //min 0, max 1000
		if (ImportoDaVersare<=0)
			throw new VersamentoErratoException("Attenzione, non è possibile versare importi minori o uguali a zero");
			
		if(ImportoDaVersare>1000)
			throw new VersamentoErratoException("Attenzione, non è possibile versare importi maggiori di 1000");	
					
		Saldo = Saldo + ImportoDaVersare;

	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IBAN == null) ? 0 : IBAN.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContoCorrente other = (ContoCorrente) obj;
		if (IBAN == null) {
			if (other.IBAN != null)
				return false;
		} else if (!IBAN.equals(other.IBAN))
			return false;
		return true;
	}


	public boolean Preleva(double ImportoDaPrelevare){ //min 0, max 250
		if(ImportoDaPrelevare<0||ImportoDaPrelevare>250||ImportoDaPrelevare>Saldo)
			return false;
		else
		{
			Saldo = Saldo -ImportoDaPrelevare;
			return true;
		}
		
	}
	
	@Override
	public String toString() {
		return "Conto: "+IBAN+" con Saldo: "+Saldo;
	}
}
