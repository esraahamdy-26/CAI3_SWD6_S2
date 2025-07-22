public class mainOopStudent {
    public static void main(String[] args) {
        classOopStudent std1 = new classOopStudent("Ahmed", 20, "Medical");
        std1.displayInfo();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        classOopStudent std2 = new classOopStudent("Mohamed", 25);
        std2.setGpa(3.7);
        System.out.println("name is "+ std2.getName());
        System.out.println("age is "+ std2.getAge());
        System.out.println("Field name is "+ std2.getFieldName());
        System.out.println("GPA is "+ std2.getGpa());


    }
}
