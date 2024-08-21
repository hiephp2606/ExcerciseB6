public class Employee extends Person{
    private Double experience;

    public Employee(int id, String name, int age, Double experience) {
        super(id, name, age);
        this.experience = experience;
    }


}
