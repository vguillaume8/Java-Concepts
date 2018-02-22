/**
    This program tests the DataSet class.
 */
 public class DataSetTester {
     
     public static void main(String[] args) {
         DataSet bankData = new DataSet();

         bankData.add(new BankAccount(0));
         bankData.add(new BankAccount(10000));
         bankData.add(new BankAccount(2000));

         System.out.println("Average balance: " + bankData.getAverage());
         System.out.println("Expected: 4000");
         
     }
 }