package Ex4;

public class Animal {
    private String name;
    public int age;
    protected String sex;
    String unknownField;
    public Animal(){
        this.name = "Name";
        this.age = 5;
        this.sex = "male";
        unknownField = "unknown";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
