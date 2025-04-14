public class GreenCrud {
    /**
     * Calculates the crud population after a given number of days.
     * The growth follows a Fibonacci-like pattern, increasing every 5 days.
     *
     * @param initialSize the initial population size of the crud
     * @param days the number of days to simulate population growth
     * @return the estimated population after the given number of days
     */
    public int calPopulation(int initialSize, int days){
        if(days < 5)
            return initialSize;
        int[] a = new int[days/5+1];
        a[0] = initialSize;
        a[1] = initialSize;
        for(int i = 2; i<=days/5; i++){
            a[i] = a[i-1] + a[i-2];
        }
        return a[days/5];
    }
}
