public class BeachTrip extends Trip {
    private String uvProtection;
    private String area;

    public BeachTrip(String country, int duration, int price, String guide, String uvProtection, String area) {
        super(country, duration, price, guide, uvProtection, area);
        this.uvProtection = uvProtection;
        this.area = area;
    }

    @Override
    public String toString() {
        return "BeachTrip{" +
                "uvProtection='" + uvProtection + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public String getUvProtection() {
        return uvProtection;
    }

    public void setUvProtection(String uvProtection) {
        this.uvProtection = uvProtection;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

