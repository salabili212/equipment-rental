import java.math.BigDecimal;

public abstract class Equipment {
    private String name;
    private double dailyRate;


    public Equipment(String name,double dailyRate){
        this.name = name;
        this.dailyRate = dailyRate;
    }

    public void printName(){
        System.out.println("Equipment: " + this.name);
    }

    public BigDecimal calculateRentalCost(int day){
        return BigDecimal.valueOf(this.dailyRate).multiply(BigDecimal.valueOf(day));
    }


    @Override
    public String toString(){
        return "Name: " + this.name + "\n" + "DailyRate: " + this.dailyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }


}
