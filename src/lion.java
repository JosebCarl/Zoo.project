public class lion extends Animal {

    private static int numOfLions;
    private double tailLength;
    private String colorOfCollar;

    public lion(String name, boolean hungry, double weight, int age, String birthday, double tailLength, String colorOfCollar){
        this.name = name;
        this.hungry = hungry;
        this.weight = weight;
        this.age = age;
        this.birthday = birthday;
        this.tailLength = tailLength;
        this.colorOfCollar = colorOfCollar;
        numOfLions++;
    }

    public double getTailLength() {
        return tailLength;
    }

    public String getColorOfCollar() {
        return colorOfCollar;
    }

    public static void numOfLions() {
        System.out.print(numOfLions);
    }

    public static void main(String[] args) {
        lion rawr = new lion("Jeff", true, 46.7, 22, "January 2nd", 11, "purple");
        System.out.println(rawr);
        lion.numOfLions();
    }
}
