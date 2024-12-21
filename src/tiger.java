public class tiger extends Animal {
    private static int numOfTigers;
    private int numOfStripes;
    private String favToy;

    public tiger(String name, boolean hungry, double weight, int age, String birthday, int numOfStripes, String favToy){
        this.name = name;
        this.hungry = hungry;
        this.weight = weight;
        this.age = age;
        this.birthday = birthday;
        this.numOfStripes = numOfStripes;
        this.favToy = favToy;
        numOfTigers++;
    }
}
