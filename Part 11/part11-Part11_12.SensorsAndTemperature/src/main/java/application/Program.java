package application;

public class Program {

    public static void main(String[] args) {
        Sensor kumpula = new StandardSensor(20);
        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new StandardSensor(20);
        Sensor helsinkiVantaaAirport = new StandardSensor(20);
        
        

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);
        helsinkiRegion.setOn();
        System.out.println(kumpula.read() + " " + kaisaniemi.read() + " " + helsinkiVantaaAirport.read());
        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    }

}
