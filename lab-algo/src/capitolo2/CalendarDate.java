package capitolo2;

public class CalendarDate {

	int day;
	static final String[] months = {"Gennaio", "Febbraio" , "Marzo" , "Aprile",
	 							   "Maggio", "Giugno", "Luglio", "Agosto",
	 							   "Settembre", "Ottobre", "Novembre", "Dicembre"};
	String month;
	int year;
	String WRONG_DATE = new String("Data sbagliata!!\n");

	public void setBaseDate(){
		this.day = 1;
		this.month = months[0] ;
		this. year = 2012;
	}

	public void controlloData(int mese){
		switch (mese) {
        case 1:  if(this.day <=0 || this.day > 31){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
                 break;
        case 2:  if(this.day <=0 || this.day > 29){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
				 				 break;
        case 3:  if(this.day <=0 || this.day > 31){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
								 break;
        case 4:  if(this.day <=0 || this.day > 30){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
                 break;
        case 5:  if(this.day <=0 || this.day > 31){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
                 break;
        case 6:  if(this.day <=0 || this.day > 30){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
                 break;
        case 7:  if(this.day <=0 || this.day > 31){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
                 break;
        case 8:  if(this.day <=0 || this.day > 31){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
                 break;
        case 9:  if(this.day <=0 || this.day > 30){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
                 break;
        case 10: if(this.day <=0 || this.day > 31){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
                 break;
        case 11: if(this.day <=0 || this.day > 30){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
                 break;
        case 12: if(this.day <=0 || this.day > 31){
					System.out.println(WRONG_DATE);
					setBaseDate();
					}
                 break;
        default: System.out.println(WRONG_DATE);
        		 setBaseDate();
                 break;
    	}//switch
	}//metodo controlloData


	public CalendarDate(){
		setBaseDate();
	}

	public CalendarDate( int day, String month, int year ){
		this.day = day;
		int mese = 0;
		for(int i = 0; i < 12; i++){
			if(month.equalsIgnoreCase(months[i])){
				mese = i ;
			}
		}
		this.month = months[mese];
		this. year = year;
		controlloData(mese+1);
	}//metodo Costruttore con parametro mese = Stringa

	public CalendarDate( int day, int mese, int year ){
		if (mese > 12){
			System.out.println("Hai inserito la data sbagliata\n");
			setBaseDate();
		}//if
		else{
			this.day = day;
			this.month = months[mese-1] ;
			this. year = year;
		}//else
		if(mese <= 12 && mese > 0){
			controlloData(mese);
		}//if
	}//metodo costruttore con parametro mese = int

	public String stampaData(){
		String data = new String();
		data = day + " " + month + " " + year;
		return data;
	}

	public void run(){
		System.out.println( "La data di questo calendario è: " + stampaData() + "\n");
	}//metodo run

	public static void main(String[] args) {
		new CalendarDate().run();
		new CalendarDate(30, "novembre", 2016 ).run();
		new CalendarDate(31, 4, 2016 ).run();
	}

}
