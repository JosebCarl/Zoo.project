public class janitor extends employee {
    private int trash;
    private boolean isCleaning;
    
    public janitor(String name, int age, String address, boolean atWork, int trash, Boolean isCleaning) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.atWork = atWork;
        this.wage = 35000;
        this.isCleaning = isCleaning;
        this.job = "zookeeper";
        this.trash = trash;
    }
}
