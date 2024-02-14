package garage.water;

import garage.Vehicle;
import garage.engine.IEngine;

public class CargoShip extends Vehicle implements IWaterVehicle, IEngine{

    private int numberOfContainers;
    private String hullType;
    private IEngine engine;

    public CargoShip(float weight, int maxSpeed, int numberOfContainers, IEngine engine){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
        this.hullType = hullType;
        this.engine = engine;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    @Override
    public int getHorsePower() {
        return this.engine.getHorsePower();
    }

    @Override
    public void setHorsePower(int horsePower) {
        this.engine.setHorsePower(horsePower);
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }
}
