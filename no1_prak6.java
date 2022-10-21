//public class no1_prak6 {
//    public static void main(String[] args) {
//        Truck truck_1 = new Truck();
//        RiverBarge riverBarge_1 = new RiverBarge();
//
//        System.out.println(">>>Truck ");
//        truck_1.getLoad(12);
//        truck_1.getMaxLoad(120);
//        truck_1.addBox(12);
//        truck_1.calcFuelEffieciency(120);
//        truck_1.calcTripDistance(12000);
//        System.out.println("\n");
//
//        System.out.println(">>>River Barge");
//        riverBarge_1.getLoad(22);
//        riverBarge_1.getMaxLoad(220);
//        riverBarge_1.addBox(42.5);
//        riverBarge_1.calcFuelEffieciency(220);
//        riverBarge_1.calcTripDistance(20000);
//        System.out.println("\n");
//
//    }
//}
//
//class Vehicle{
//    double load = 0;
//    double max_load = 0;
//
//    void getLoad(double load) {
//        System.out.println("Load : " + load);
//    }
//    void getMaxLoad(double max_load) {
//        System.out.println("Max Load : " + max_load);
//    };
//
//    void addBox(double weight) {
//        System.out.println("Add Box : " + weight);
//    };
//
//    public void calcFuelEffieciency(double fuel) {
//        System.out.println("Fuel Effieciency : " + fuel);
//    }
//
//    void calcTripDistance(double trip) {
//        System.out.println("Trip Distance : " + trip);
//    }
//}
//
//class Truck extends Vehicle {
//    public void calcFuelEffieciency(double fuel) {
//        System.out.println("Fuel Effieciency : " + fuel);
//    }
//
//    void calcTripDistance(double trip) {
//        System.out.println("Trip Distance : " + trip);
//    }
//}
//
//class RiverBarge extends Vehicle {
//    public void calcFuelEffieciency(double fuel) {
//        System.out.println("Fuel Effieciency : " + fuel);
//    }
//
//    void calcTripDistance(double trip) {
//        System.out.println("Trip Distance : " + trip);
//    }
//}