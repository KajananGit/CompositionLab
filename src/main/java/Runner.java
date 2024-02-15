import garage.air.Helicopter;
import garage.air.Plane;
import garage.land.Car;
import garage.engine.CombustionEngine;
import garage.engine.ElectricEngine;
import garage.engine.IEngine;
import garage.water.CargoShip;

public class Runner {

    public static void main(String[] args) {

        IEngine combustionEngine = new CombustionEngine(570,"10/01/2024");
        Car porsche911 = new Car(1000, 220, "coupe", combustionEngine);
        System.out.println(porsche911.getHorsePower());

        IEngine electricEngine = new ElectricEngine(650, 80);
        porsche911.setEngine(electricEngine);
        System.out.println(porsche911.getHorsePower());


        CargoShip everGreen = new CargoShip(15000, 70, 150, combustionEngine, "steel");
        System.out.println(everGreen.getHorsePower());

        everGreen.setEngine(electricEngine);
        System.out.println(everGreen.getHorsePower());


        Helicopter helicopter = new Helicopter(2000, 150, 4, combustionEngine);
        System.out.println(helicopter.getHorsePower());

        helicopter.setEngine(electricEngine);
        System.out.println(helicopter.getHorsePower());

        Plane plane = new Plane(2000, 400, 8, combustionEngine);
        System.out.println(plane.getHorsePower());

        plane.setEngine(electricEngine);
        System.out.println(plane.getHorsePower());
        System.out.println(plane.fly());


    }

}
