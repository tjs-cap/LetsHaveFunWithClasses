public class Budgie extends Pet implements Flying{
    private String colour;
    private boolean canFly;
    private float wingSpan;

    public Budgie(String name, float weight, byte age, String description, String colour, float wingSpan) {
        super(name, weight, age, description);
        this.colour = colour;
        this.canFly = true;
        this.wingSpan = wingSpan;
    }

    public String getColour() {
        return colour;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public float getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(float wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    void makesSound(){
        System.out.println("Tweet!");
    }
}
