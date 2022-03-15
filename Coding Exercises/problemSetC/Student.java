// Create a class named Student that has fields for an ID number, number of units earned, and number of points earned. (For example, in APC, for a three- unit class in which a student earns a 4.0, the total points is 12). Include methods to set values to all fields. A Student also has a field for grade point average. Include a method to compute the grade point average field by dividing points by total credit units earned. Write methods to get the values in each Student field. 

public class Student {
    // Fields
    private int studentId;
    private int studentUnits;
    private double studentPoints;
    private double unitGrade;

    // Constructor
    public Student()
    {
        studentId = 9999;
        studentUnits = 3;
        studentPoints = 12.0;
    }

    // Setter [id]
    public void setId(int id)
    {
        studentId = id;
    }

    // Setter [unit]
    public void setUnits(int units)
    {
        studentUnits = units;
    }

    // Setter [unit grade]
    public void setGrade(double grade)
    {
        unitGrade = grade;
    }

    // Setter [points]
    public void setPoints(double grade, int units)
    {
        studentPoints = grade * units;
    }

    // Getter [id]
    public int getId()
    {
        return studentId;
    }

    // Getter [unit]
    public int getUnits()
    {
        return studentUnits;
    }

    // Getter [points]
    public double getPoints()
    {
        return studentPoints;
    }

    // Getter [unit grade]
    public double getUnitGrade()
    {
        return unitGrade;
    }

    // Computing GPA
    public double computeGPA()
    {
        return studentPoints / studentUnits;
    }
}