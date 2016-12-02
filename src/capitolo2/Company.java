/*
 * Si descrive la classe Company che rapprensenta una azienda che cerca l'impiegato con lo stipendio più alto
 */
package capitolo2;

import java.util.*;
import java.io.*;

public class Company {

  public static void main(String[] args) throws FileNotFoundException {
      new Company().run();
  }//metodo main

  public void run() throws FileNotFoundException{

    final String INPUT_PROMPT = "Please enter the path for the file of the employees: " ;
    final String BEST_PAID_MESSAGE = "\n\nThe best-paid employee (and gross pay) is ";
    final String NO_INPUT_MESSAGE = "\n\n Error...non ci sono impiegati";

    String filename;

    System.out.print(INPUT_PROMPT);
    filename = new Scanner(System.in).nextLine();
    File file = new File(filename);
    Scanner sc = new Scanner(file);


  /*
   * Scanner keyboard = new Scanner(System.in);
    String filename = keyboard.nextLine();
    File file = new File(filename);
    Scanner inputFile = new Scanner(file);
   */

    FullTimeEmployee bestPaid = findBestPaid(sc);

    if (bestPaid == null)
      System.out.println(NO_INPUT_MESSAGE);
    else
      System.out.println(BEST_PAID_MESSAGE + bestPaid.toString());
  }//metodo run = esecuzion più stampa risultato => dipendente con stipendio più alto


  public FullTimeEmployee findBestPaid(Scanner sc){

    FullTimeEmployee full,
                      bestPaid = new FullTimeEmployee();
    while(sc.hasNext()){
      full = getNextEmployee(sc);
      if (full.getGrossPay() > bestPaid.getGrossPay())
        bestPaid = full;
    }//while
    if (bestPaid.getGrossPay() == 0.0)
      return null;
    return bestPaid;
  }// metodo findBestPaid


  protected FullTimeEmployee getNextEmployee(Scanner sc){
    Scanner lineScanner = new Scanner(sc.nextLine());
    String name = lineScanner.next();
    double grossPay = lineScanner.nextDouble();
    return new FullTimeEmployee(name, grossPay);
  }//metodo getNextEmployee

}//class Company
