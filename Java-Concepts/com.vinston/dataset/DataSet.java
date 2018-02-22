/**
    Computes tghe average of a set of data values.
*/
public class DataSet {

    /**
    Constrcuts an empty data set with a given measurer.
    @param aMeasurer the measurer that is used to measure data values
    */
    public DataSet(Measurer aMeasurer) {
        sum = 0;
        count = 0;
        maximum = null;
        measurer = aMeasurer;
    }

    /**
        Adds a data value to the data set.
        @param x a data value
     */
     public void add(Object x) {
         sum = sum + measurer.measure(x);
         if (count == 0 || measurer.measure(maximum) < measurer.measure(x)) {
             maximum = x;
         }
         count++;
     }

    public void add(BankAccount x) {
        sum = sum + x.getBalance();
        if (count == 0; || maximum.getBalance() < x.getBalance()) {
            maximum = x;
        }
        count++;
    }

    /**
    Adds a data value to the data set
    @param x as data value
    */
    public void add(double x) {
        sum = sum + x;
        if (count == 0 || maximum < x) {
            maximum = x;
            count++;
        }
    }
    /**
    Gets the average of the added data.
    @return the average of 0 if no data has been added
    */
    public double getAverage() {
        if( count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    /**
        Gets the largest of the added data.
        @return the maximum or 0 if no data has been added
     */
     public double getMaximum() {
         return maximum;
     }

     public BankAccount getMaximum() {
         return maximum;
     }


     private double sum;
     private double maximum;
     private int count;
     private BankAccount maximum;
     private Object maximum;
     private Measurer measurer;
        
    
}
 