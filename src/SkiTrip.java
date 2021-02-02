public class SkiTrip extends Trip {
    private String equipment;
    private String liftCard;

    public String getEquipment() {
        return equipment;
    }

    @Override
    public String toString() {
        return "SkiTrip{" +
                "equipment='" + equipment + '\'' +
                ", liftCard='" + liftCard + '\'' +
                '}';
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getLiftCard() {
        return liftCard;
    }

    public void setLiftCard(String liftCard) {
        this.liftCard = liftCard;
    }

    public SkiTrip(String country, int duration, int price, String guide, String equipment, String liftCard) {
        super(country, duration, price, guide, equipment, liftCard);
        this.equipment = equipment;
        this.liftCard = liftCard;

    }
}
