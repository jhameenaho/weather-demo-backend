package jhameenaho.weatherdemo.model.weatherapi;

public class WindSpeed {
    private Double mps;
    private String unit;
    private String name;

    public Double getMps() {
        return mps;
    }

    public void setMps(Double mps) {
        this.mps = mps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
