import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Equipment> equipments = new ArrayList<Equipment>();

        //first will do the inherited
        //adding all the Camera objects to the arrayList
        Camera camera1 = new Camera("Travel Camera", 25.00, 24, false);
        Camera camera2 = new Camera("Studio Camera", 60.00, 45, true);
        Equipment camera3 = new Camera("Action Camera", 15.00, 12, false);
        Equipment camera4 = new Camera("Portrait Camera", 40.00, 33, true);
        equipments.add(camera1);
        equipments.add(camera2);
        equipments.add(camera3);
        equipments.add(camera4);



        //Adding all the laptop objects to hte arrayList
        Laptop laptop1 = new Laptop("Student Laptop", 20.00, 8, false);
        Laptop laptop2 = new Laptop("Business Laptop", 35.00, 16, true);
        Equipment laptop3 = new Laptop("Gaming Laptop", 55.00, 32, true);
        equipments.add(laptop1);
        equipments.add(laptop2);
        equipments.add(laptop3);


        //loop through all the equipments
        for (Equipment e: equipments){
            System.out.println(e.toString());
            System.out.println("Equipment rental for three days: $" + e.calculateRentalCost(3));
            System.out.println(e.getClass().getSimpleName());
            e.printName();
            e.calculateRentalCost(4);

        }

        //downCasting calls and search
        for (Equipment e: equipments){
            if(e instanceof Equipment && (e.getClass() == Laptop.class)){

                System.out.println("Laptops:");
                System.out.println(e.getName());
                System.out.println("Insurance status: " + ((Laptop)e).isInsuranceSelected());
                Laptop laptop = (Laptop) e;
                System.out.println("Casting one:");
                System.out.println(laptop.getRamGB());
                System.out.println("Casting two:");
                System.out.println(((Laptop) e).getRamGB());
                System.out.println("Casting one:");
                Laptop laptop12 = (Laptop) e;
                System.out.println(laptop12.isInsuranceSelected());
                System.out.println("Casting two:");
                System.out.println("Insurance is: " + ((Laptop) e).isInsuranceSelected());

            }
        }





    }
}
