package Ex3;

public class Test {
    private String stringField;
    private int intField;
    final private double doubleField;

    public Test(String stringField, int intField) {
        this.stringField = stringField;
        this.intField = intField;
        this.doubleField = 0.5d;
    }

    public String getStringField() {
        return stringField;
    }

    public int getIntField() {
        return intField;
    }

    @Override
    public String toString() {
        return "Test{" +
                "stringField='" + stringField + '\'' +
                ", intField=" + intField +
                ", doubleField=" + doubleField +
                '}';
    }
}
