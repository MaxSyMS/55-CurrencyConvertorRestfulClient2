package telran.currency.item;

import telran.currency.interfaces.ICurrencyConverter;
import telran.view.InputOutput;

public class DisplayLatestRequestTimeItem extends Currencyitem {

	public DisplayLatestRequestTimeItem(InputOutput inputOutput, ICurrencyConverter converter) {
		super(inputOutput, converter);
	}

	@Override
	public String displayedName() {		
		return "Display  time of latest request";
	}

	@Override
	public void perform() {
		inputOutput.outputLine(converter.lastDateTimePresentation());

	}

}
