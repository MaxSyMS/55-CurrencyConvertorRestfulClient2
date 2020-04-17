package telran.currency.item;

import java.util.ArrayList;
import java.util.Set;

import telran.currency.interfaces.ICurrencyConverter;
import telran.view.InputOutput;

public class ConvertCurrencyItem extends Currencyitem {

	public ConvertCurrencyItem(InputOutput inputOutput, ICurrencyConverter converter) {
		super(inputOutput, converter);
	}

	@Override
	public String displayedName() {		
		return "Convert Currency";
	}

	@Override
	public void perform() {
		Set<String> codes = converter.getCodes();
		ArrayList<String> codesList = new ArrayList<String>(codes);
				
		String fromCurrency = inputOutput.inputString("Please enter currency From", codesList);
		if(fromCurrency==null) return;
		String toCurrency = inputOutput.inputString("Please enter currency To",  codesList);
		if(toCurrency==null) return;
		Double fromAmount = inputOutput.inputDouble("Please enter currency amount");
		if(fromAmount==null) return;
		double toAmount = converter.convert(fromCurrency, toCurrency, fromAmount);
		inputOutput.outputLine(
				String.format("%.2f %s = %.2f %s", 
						fromAmount,
						fromCurrency,
						toAmount,
						toCurrency));

	}

}
