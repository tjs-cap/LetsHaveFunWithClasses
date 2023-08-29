public class Bat extends Pet implements Flying{
    private boolean canFly;
    private float wingSpan;

    public Bat(String name, float weight, byte age, String description, float wingSpan) {
        super(name, weight, age, description);
        this.canFly = true;
        this.wingSpan = wingSpan;
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
        System.out.println("Clicking!");
    }
}
