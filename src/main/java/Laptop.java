import java.math.BigDecimal;

public class Laptop extends Equipment{
    private int ramGB;
    private boolean insuranceSelected;

    Laptop(String name,double dailyRate,int ramGB, boolean insuranceSelected){
        super(name,dailyRate);
        this.ramGB = ramGB;
        this.insuranceSelected = insuranceSelected;
    }


    @Override
    public BigDecimal calculateRentalCost(int day){
        BigDecimal total = BigDecimal.valueOf(this.getDailyRate()).multiply(BigDecimal.valueOf(day));
        if(insuranceSelected == true) total.add(BigDecimal.valueOf(5));
        return total;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public boolean isInsuranceSelected() {
        return insuranceSelected;
    }

    public void setInsuranceSelected(boolean insuranceSelected) {
        this.insuranceSelected = insuranceSelected;
    }
}
