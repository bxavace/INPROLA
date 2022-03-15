// Write a class named ShowStudent that instantiates a Student object from the class you created and assign values to its fields. Compute the Student grade point average, and then display all the values associated with the Student. 

public class ShowStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(2);
        student1.setUnits(3);
        student1.setGrade(4.0);
        student1.setPoints(student1.getUnitGrade(), student1.getUnits());

        System.out.println("Student ID: " + student1.getId());
        System.out.println("No. of Units: " + student1.getUnits());
        System.out.println("Student points: " + student1.getPoints());
        System.out.println("The GPA is " + student1.computeGPA());
    }
}
