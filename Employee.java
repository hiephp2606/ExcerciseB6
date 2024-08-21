public class Employee extends Person{
    private Double experience;

    public Employee(int id, String name, int age, Double experience) {
        super(id, name, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee [" +
                " id: " + getId() +
                ", name: " + getName() +
                ", age: " + getAge() +
                ", experience=" + experience +
                " ]";
    }
}
