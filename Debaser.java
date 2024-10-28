/**
 * Class that converts a number from base value into base n, and the value from base n into base 10
 * @param int value the value that is stored in the class
 * */
public class Debaser {
    int value;
    /**
     * Constructor for the Debaser class that sets value to 0
     * */
    public Debaser(){
        value = 0;
    }
    /**
     * Constructor for the Debaser class that sets the value in this instance to value
     * @param int value the value that we set the value in this instance to equal
     * */
    public Debaser(int value){
        this.value = value;
    }
    /**
     * Method that sets the current value to a new value
     * @param int value the new value that we set the value in this instance to equal
     * */
    public void setValue(int value){
        this.value = value;
    }
    /**
     * Method that returns the stored value
     * @return int value the value that we are storing in this instance
     * */
    public int getValue(){
        return value;
    }
    /**
     * Method that converts the stored value, which is assumed to be in base 10, and converts it into base n. It then returns this value.
     * We assume that 2<=n<=9, and that the stored value is less than n^6 (will have at most 6 digits in base n).
     * @param int n the base that we convert value into
     * @return int value the value that we return after it is converted into base n
     * */
    public int convertToBaseN(int n){
        int newValue = 0;

        int digit = value/(int)Math.pow(n, 6);
        value %= (int)Math.pow(n, 6);
        newValue += (int)Math.pow(10, 6)*digit;

        digit = value/(int)Math.pow(n, 5);
        value %= (int)Math.pow(n, 5);
        newValue += (int)Math.pow(10, 5)*digit;

        digit = value/(int)Math.pow(n, 4);
        value %= (int)Math.pow(n, 4);
        newValue += (int)Math.pow(10, 4)*digit;

        digit = value/(int)Math.pow(n, 3);
        value %= (int)Math.pow(n, 3);
        newValue += (int)Math.pow(10, 3)*digit;

        digit = value/(int)Math.pow(n, 2);
        value %= (int)Math.pow(n, 2);
        newValue += (int)Math.pow(10, 2)*digit;

        digit = value/n;
        value %= n;
        newValue += 1*digit;

        newValue += value;

        value = newValue;
        return value;
    }
    /**
     * Method that converts the stored value, which is assumed to be in base n, and converts it to base 10, then returns the converted value.
     * */
}
