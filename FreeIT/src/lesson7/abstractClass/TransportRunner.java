package lesson7.abstractClass;

public class TransportRunner {

	public static void main(String[] args) {
		Car audi = new Car(120, 280, 600, "Audi", 4, 6, "cupe", 5);
		System.out.println(audi.description());
		audi.countKmAndLitersOnMaxSpeed(5);
		Truck truck = new Truck(150, 120, 3000, "Scania", 10, 20, 22);
		System.out.println(truck.description());
		truck.checkCapacity(15);
		truck.checkCapacity(10);
		CivilAirTransport boeing = new CivilAirTransport(1500, 1000, 5000, "Boeing", 25, 100, 120, true);
		System.out.println(boeing.description());
		boeing.checkCapacity(100);
		boeing.checkCapacity(20);
		boeing.checkCapacity(1);
		MilitaryAirTransport mig = new MilitaryAirTransport(2000, 2000, 2000, "Mig", 15, 25, true, 1);
		System.out.println(mig.description());
		mig.ejection();
		mig.shot();
		mig.shot();
	}

}
