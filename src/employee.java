public class employee {
    //TODO: create employee class variables
    protected String name;
    protected int age;
    protected String address;
    protected boolean atWork;
    protected int wage;
    protected String job;

    public employee() {}

    //TODO: create constructors
    public employee(String name, int age, String address, boolean atWork, int wage) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.atWork = atWork;
        this.wage = wage;
    }

    //TODO: create getters and setters
    public boolean checkedIn() {
        return atWork;
    }

    public void onBreak() {
        this.atWork = false;
    }

    public void atWork() {
        this.atWork = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public int getWage() {
        return this.wage;
    }

    //TODO: any other methods?
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nCurrently at work: " + address + "\nWage: " + wage;
    }

    //TODO: create main method test
    public static void main(String[] args) {
        employee Bob = new employee("Bob",31,"534 Bass st.",true,35000);
        System.out.println(Bob);
        Bob.onBreak();
        System.out.println(Bob.atWork);
    }
}
