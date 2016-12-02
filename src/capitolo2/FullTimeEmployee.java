/*
 * Si descrive la classe impiegato a tempo pieno con i suoi metodi implementati dall'interfaccia Employee 
 */
package capitolo2;

public class FullTimeEmployee implements Employee{

	protected String name;
	protected double grossPay;

	public FullTimeEmployee(){
		final String EMPTY_STRING = "";
		name = EMPTY_STRING;
		grossPay = 0.0;
	}//costruttore di default

	public FullTimeEmployee(String name, double grossPay){
		this.name = name;
		this.grossPay = grossPay;
	}//costruttore con due parametri

	public String getName() {
		return name;
	}//metodo getName

	public double getGrossPay() {
		return grossPay;
	}//metodo grossPay

	public String toString(){
		final String EMPLOYEE_STATUS = "FULL TIME";
		return this.name + " " + MONEY.format(this.grossPay) + " " + EMPLOYEE_STATUS;
	}//metodo toString

}//classe FullTimeEmployee
