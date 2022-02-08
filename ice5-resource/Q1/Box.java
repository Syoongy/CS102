public class Box {
    private int length, breadth, height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    protected Object clone() {
        return new Box(this.length, this.breadth, this.height);
    }

    @Override
    public boolean equals(Object another) {
        // Can we also use this instead? since it compares the same values as a string and is less verbose
        // return (another instanceof Box) && another.toString().equals(this.toString());
        
        Box b = (Box) another;
        return (another instanceof Box) && this.height == b.height && this.length == b.length
                && this.breadth == b.breadth;
    }

    @Override
    public String toString() {
        return String.format("height: %d, breadth: %d, length: %d", this.height, this.breadth, this.length);
    }

}
