package PracticalTasksVideoWithSolutions.Students;

import static PracticalTasksVideoWithSolutions.Students.Main.SCANNER;

public class Student {
    static private int totalRating;
    static private int totalStudents;

    private String name;
    private int rating;

    public Student() {
        this("N/A", 0);
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        totalStudents++;
        totalRating += rating;
    }

    static public double avgRating() {
        return totalRating / (double) totalStudents;
    }

    static public int getTotalRating() {
        return totalRating;
    }

    public static void printStudentStats() {
        System.out.println("Total rating = " + Student.getTotalRating());
        System.out.println("Average rating = %.2f".formatted(Student.avgRating()));
    }

    public static void promptParameters(Student student) {
        System.out.println("Input name:");
        String name = SCANNER.nextLine();
        student.setName(name);
        System.out.println("Input rating for student '" +
                student.getName() + "':");
        int rating = SCANNER.nextInt();
        SCANNER.nextLine();
        student.setRating(rating);
    }

    /**
     * Compare myself with other student by rating
     *
     * @param other - the other student to compare with
     * @return whether I am better by rating than the other
     */
    public boolean betterStudent(Student other) {
        return rating > other.rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        totalRating -= this.rating;
        this.rating = rating;
        totalRating += this.rating;
    }
}
