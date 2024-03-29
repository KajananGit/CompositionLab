package garage.engine;

public class CombustionEngine implements IEngine {

    private int horsePower;
    private String lastOilChange;

    public CombustionEngine(int horsePower, String lastOilChange){
        this.horsePower = horsePower;
        this.lastOilChange = lastOilChange;
    }

    public String getLastOilChange() {
        return lastOilChange;
    }

    public void setLastOilChange(String lastOilChange) {
        this.lastOilChange = lastOilChange;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
