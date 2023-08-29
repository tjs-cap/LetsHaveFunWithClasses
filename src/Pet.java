public abstract class Pet {

    private String name;
    private float weight;  // kgs
    private byte age; // years
    private String description;

    // This is my constructor for the Pet class
    public Pet(String name, float weight, byte age, String description) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.description = description;
    }

    // This is where I know the name and the age, but nothing else
    public Pet(String name, byte age){
        this.name = name;
        this.weight = 0f;
        this.age = age;
        this.description = "";
    }

    // These are my getters and setters, with no set for name or age.
    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Use this on the pet's birthday
    void getsOlder(){
        age++;
    }

    void eats(){
        System.out.println("Nom nom nom!");
    }

    void sleeps(){
        System.out.println("Zzzzzzzzzz!");
    }

    abstract void makesSound();
}
