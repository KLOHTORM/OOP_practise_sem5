package Data;

public class Student extends User{
    private Integer id;
    private Integer averageScore;

    public Student(String name, Integer age, String address, Integer id) {
        super(name, age, address);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", averageScore=" + averageScore +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
