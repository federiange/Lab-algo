package capitolo2;

import java.text.DecimalFormat;

public interface Employee {

	final static DecimalFormat MONEY= new DecimalFormat("$0.00");		//nuovo formato per stipendio

	String getName();		//restituisce il nome dell'impiegato

	double getGrossPay();		//restituisce il salario lordi di questo impiegato

	String toString();		//restituisce una stringa che descrive l'impiegato

}//interface Employee
