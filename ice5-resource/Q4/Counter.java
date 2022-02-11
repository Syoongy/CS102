public abstract class Counter {
    private int value;

    protected Counter(int value) {
        this.value = value;
    };

    abstract void decrement();

    abstract void increment();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
