package capitolo2;

public class HourlyEmployee extends FullTimeEmployee  {

  //per dipendenti a tempo pieno con paga oraria

  protected int hoursWorked;
  protected double payRate,
  				   regularPay,
  				   overtimePay;

  public final static int MAX_REGULAR_HOURS = 40;
  public final static double OVERTIME_FACTOR = 1.5;

  public HourlyEmployee(){
    hoursWorked = 0;
    payRate = 0.0;
    regularPay = 0.0;
    overtimePay = 0.0;
  }// costruttore di default

  public HourlyEmployee(String name, int hoursWorked, double payRate){
    this.name = name;
    this.hoursWorked = hoursWorked;
    this.payRate = payRate;

    if (hoursWorked <= MAX_REGULAR_HOURS){
      regularPay = hoursWorked * payRate;
      overtimePay = 0.0;
    }// if
    else{
      regularPay = MAX_REGULAR_HOURS * payRate;
      overtimePay = (hoursWorked - MAX_REGULAR_HOURS) * (payRate * OVERTIME_FACTOR);
    }//else
    grossPay = regularPay + overtimePay;
  }//costruttore con tre parametri

  public int getHoursWorked(){
    return hoursWorked;
  }//metodo getHoursWorked

  public double getPayRate(){
    return payRate;
  }//metodo getPayRate

  public double getRegularPay(){
    return regularPay;
  }//metodo getRegularPay

  private double getOvertimePay(){
	  return overtimePay;
  }//metodo getOvertimePay

  public String toString(){
		final String EMPLOYEE_STATUS = "HOURLY";
		return super.toString() + " " + EMPLOYEE_STATUS;
  }//metodo toString

  public static void main(String[] args) {
    HourlyEmployee tizio = new HourlyEmployee("mino", 2, 1.5);
    System.out.println(tizio.toString());
  }//metodo main

}//class HourlyEmployee
