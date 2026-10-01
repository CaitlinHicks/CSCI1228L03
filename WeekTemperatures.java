public class WeekTemperatures {

    public static final int DAYS = 7;
    private final double[] highs;
    

    // Add the instance variable(s) your object needs.

    public WeekTemperatures(double[] highs) {
        // TODO
        this.highs = new double[DAYS];
        for (int i = 0; i < DAYS; i++) {
           this.highs[i] = highs[i];
    }

    }

    public double get(int day) {
        return highs[day];
    }

    public double[] toArray() {
        double[] copy = new double[DAYS];
        for( int l=0; l<DAYS; l++){
            copy[l] = this.highs[l];
        }
        return copy;
    }

    public double mean() {
        double total = 0.0;
        for (int l = 0; l < highs.length; l++){
            total += highs[l];
        }
        return (total/DAYS);
    }

   public int warmestDay() {
    int warmest = 0;  

    for (int i = 1; i < highs.length; i++) {
        if (highs[i] > highs[warmest]) {
            warmest = i;
        }
    }

    return warmest;
}


    public int countAbove(double threshold) {
        int count = 0;
        for (int i = 0; i < highs.length; i++) {
        if (highs[i] > threshold) {
            count++;
        }
    }
        return count;
    }
}
