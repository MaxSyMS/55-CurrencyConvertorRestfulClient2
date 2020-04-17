package telran.currency.item;
import telran.currency.interfaces.ICurrencyConverter;
import telran.view.InputOutput;
import telran.view.Item;

public abstract class Currencyitem implements Item {
	
	protected InputOutput inputOutput;
	protected ICurrencyConverter converter;
	
	public Currencyitem(InputOutput inputOutput, ICurrencyConverter converter) {
		super();
		this.inputOutput = inputOutput;
		this.converter = converter;
	}

}
