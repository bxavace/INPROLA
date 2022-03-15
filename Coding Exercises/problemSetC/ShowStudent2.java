// Create a constructor for the Student class you created. The constructor should initialize each Student’s ID number to 9999, his or her points earned to 12, and credit units to 3 (resulting in a grade point average of 4.0). Write a program that demonstrates that the constructor works by instantiating an object and displaying the initial values. 

public class ShowStudent2 {
    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println("Student ID: " + student1.getId());
        System.out.println("No. of Units: " + student1.getUnits());
        System.out.println("Student points: " + student1.getPoints());
        System.out.println("The GPA is " + student1.computeGPA());
    }
}
