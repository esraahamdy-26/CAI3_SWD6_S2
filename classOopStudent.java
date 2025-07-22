public class classOopStudent {
    private String name;
    private int age;
    private double gpa;
    private String fieldName;

    // Constructor
    classOopStudent(String name, int age, String fieldName)
    {
        this.name = name;
        this.age = age;
        this.fieldName = fieldName;
    }

    classOopStudent(String name, int age)
    {
        this(name,age,"Engineering");
    }

    // Methods
    public void displayInfo()
    {
        System.out.print("Student name is "+ name + " and his age is " + age+ ". His GPA is "+ gpa);
        Study();
    }

    private void Study()
    {
        System.out.println(" is studying "+ fieldName +".");
    }

    // Setter
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public String getFieldName() {
        return fieldName;
    }
}
