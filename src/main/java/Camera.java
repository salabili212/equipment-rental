import java.math.BigDecimal;

public class Camera extends Equipment{
    private int megapixels;
    private boolean tripodIncluded;

    Camera(String name,double dailyRate,int megapixels , boolean tripodIncluded){
        super(name,dailyRate);
        this.megapixels = megapixels;
        this.tripodIncluded = tripodIncluded;
    }

    @Override
    public BigDecimal calculateRentalCost(int day){
        BigDecimal total = BigDecimal.valueOf(this.getDailyRate()).multiply(BigDecimal.valueOf(day));
        if(tripodIncluded == true) total.add(BigDecimal.valueOf(10));
        return total;

    }

    public int getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public boolean isTripodIncluded() {
        return tripodIncluded;
    }

    public void setTripodIncluded(boolean tripodIncluded) {
        this.tripodIncluded = tripodIncluded;
    }
}
