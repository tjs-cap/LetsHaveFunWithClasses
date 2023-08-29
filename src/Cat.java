public class Cat extends Pet implements PlayWithBall{
    // name, age, weight, description, colour, tail
    private String colour;
    private boolean tail;

    public Cat(String name, float weight, byte age, String description, String colour, boolean tail) {
        super(name, weight, age, description);
        this.colour = colour;
        this.tail = tail;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    void sleeps(){
        System.out.println("All the time!");
    }

    void eats(){
        System.out.println("Purr!");
    }


    void makesSound(){
        System.out.println("Meow!");
    }
}
