package garage.air;

import garage.Vehicle;
import garage.engine.IEngine;

public class Helicopter extends Vehicle implements IAirVehicle, IEngine{

    private int numberOfBlades;
    private IEngine engine;

    public Helicopter(float weight, int maxSpeed, int numberOfBlades, IEngine engine) {
        super(weight, maxSpeed);
        this.numberOfBlades = numberOfBlades;
        this.engine = engine;
    }


    @Override
    public int getHorsePower() {
        return this.engine.getHorsePower();
    }

    @Override
    public void setHorsePower(int horsePower) {
        this.engine.setHorsePower(horsePower);
    }

    @Override
    public String fly() {
        return "Flying";
    }

    @Override
    public int getNumberOfBlades() {
        return this.numberOfBlades;
    }

    @Override
    public void setNumberOfBlades(int blades) {
        this.numberOfBlades = blades;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }
}
