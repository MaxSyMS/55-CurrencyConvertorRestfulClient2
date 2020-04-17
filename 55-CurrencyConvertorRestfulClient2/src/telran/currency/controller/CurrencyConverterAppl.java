package telran.currency.controller;

import telran.currency.interfaces.ICurrencyConverter;
import telran.currency.item.ConvertCurrencyItem;
import telran.currency.item.DisplayCurrencyCodeItem;
import telran.currency.item.DisplayLatestRequestTimeItem;
import telran.currency.item.DisplayRefreshPeriodTimeItem;
import telran.currency.service.ConvertorRestProxy;
import telran.view.ConsoleInputOutput;
import telran.view.ExitItem;
import telran.view.InputOutput;
import telran.view.Item;
import telran.view.Menu;

public class CurrencyConverterAppl {

	public static void main(String[] args) {
		InputOutput inputOutput = new ConsoleInputOutput();
		ICurrencyConverter convertor =  new ConvertorRestProxy();
		
		Item[] items = {new DisplayCurrencyCodeItem(inputOutput, convertor),
			new DisplayLatestRequestTimeItem(inputOutput, convertor),
			new ConvertCurrencyItem(inputOutput, convertor),
			new DisplayRefreshPeriodTimeItem(inputOutput, convertor),
			new ExitItem()
		};
		Menu menu = new Menu(items, inputOutput);
		menu.runMenu();
	}
}
