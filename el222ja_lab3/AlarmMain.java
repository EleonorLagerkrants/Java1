package Java1.el222ja_lab3;

public class AlarmMain {

	public static void main(String[] args) {

		AlarmClock ac = new AlarmClock(23,48); //St�ller v�ckarklockan p� tiden 23.48

		ac.displayTime(); //Visar tiden
		ac.setAlarm(06,15);  //St�ller alarmet till kl. 6.15
		for(int i=0;i<500; i++){ //For-loop som g�r att klockan g�r 500 minuter fram�t
			ac.timeTick();}
		ac.displayTime(); //Visar tiden



	}

}
