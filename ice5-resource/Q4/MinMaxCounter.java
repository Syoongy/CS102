public class MinMaxCounter extends Counter {
    private int min, max;

    public MinMaxCounter(int min, int max) {
        super(min);
        this.min = min;
        this.max = max;
    }

    public void decrement() {
        int currVal = super.getValue();
        if (currVal > this.min) {
            super.setValue(--currVal);
        }
    }

    public void increment() {
        int currVal = super.getValue();
        if (currVal < this.max) {
            super.setValue(++currVal);
        }
    }

}
