package Java1.el222ja_lab3;

public class AlarmMain {

	public static void main(String[] args) {

		AlarmClock ac = new AlarmClock(23,48); //Ställer väckarklockan på tiden 23.48

		ac.displayTime(); //Visar tiden
		ac.setAlarm(06,15);  //Ställer alarmet till kl. 6.15
		for(int i=0;i<500; i++){ //For-loop som gör att klockan går 500 minuter framåt
			ac.timeTick();}
		ac.displayTime(); //Visar tiden



	}

}
