package telran.currency.item;

import telran.currency.interfaces.ICurrencyConverter;
import telran.view.InputOutput;

public class DisplayRefreshPeriodTimeItem extends Currencyitem {

	public DisplayRefreshPeriodTimeItem(InputOutput inputOutput, ICurrencyConverter converter) {
		super(inputOutput, converter);
	}

	@Override
	public String displayedName() {		
		return "Display  refresh period time";
	}

	@Override
	public void perform() {
		inputOutput.outputLine(converter.displayRefreshPeriodTime());

	}

}
