public class Dog extends Pet implements Running, PlayWithBall{
    // name, age, weight, description, colour, size, tail
    private String colour;
    private String size;
    private boolean tail;

    public Dog(String name, float weight, byte age, String description, String colour, String size, boolean tail) {
        super(name, weight, age, description);
        this.colour = colour;
        this.size = size;
        this.tail = tail;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    void eats(){
        System.out.println("GMSLDFMASDF!");
    }


    public void makesSound(){
        System.out.println("Woof!");
    }
}
