public class CircularCounter extends Counter{
    private int limit;

    public CircularCounter(int limit) {
        super(0);
        this.limit = limit;
    }

    public void decrement() {
        int currVal = super.getValue();
        if (currVal == 0) {
            super.setValue(limit);
        } else {
            super.setValue(--currVal);
        }
    }

    public void increment() {
        int currVal = super.getValue();
        if (currVal == limit) {
            super.setValue(0);
        } else {
            super.setValue(++currVal);
        }
    }
}
