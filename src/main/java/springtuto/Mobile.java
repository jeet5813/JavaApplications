package springtuto;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();
		Vodaphone voda = new Vodaphone();
		voda.calling();
		voda.data();
	}

}
