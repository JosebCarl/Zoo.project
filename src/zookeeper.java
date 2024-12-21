public class zookeeper extends employee {
    private String animal;
    private Boolean hasFood;

    public zookeeper(String name, int age, String address, boolean atWork, int wage, String animal, Boolean hasFood) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.animal = animal;
        this.wage = 80000;
        this.hasFood = hasFood;
        this.job = "zookeeper";
    }

    public String animal() {
        return animal;
    }

    public void getFood() {
        hasFood = true;
    }

    public void useFood() {
        hasFood = false;
    }

    public Boolean hasFood() {
        return hasFood;
    }

    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nAddress: " + this.address + "\nCurrently at work: " + this.atWork + "\nWage: " + wage + "\nAnimal they are taking care of: " + this.animal + "\nHas animal food: " + this.hasFood;
    }

    public static void main(String[] args) {
        zookeeper Bobby = new zookeeper("Bobby",46,"208 Chandlier st.",true,40000, "Lion", true);
        System.out.println(Bobby);
        Bobby.onBreak();
        System.out.println(Bobby.atWork);
    }
}
