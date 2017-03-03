public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        float temp1 = tipPercent * (float)mealCost/100;
        float temp2 = taxPercent * (float)mealCost/100;
        
        float temp3 = (float)mealCost + temp1 + temp2;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(temp3);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}