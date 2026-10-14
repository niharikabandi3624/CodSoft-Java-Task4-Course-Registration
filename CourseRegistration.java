import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class CourseRegistration {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>(
            Arrays.asList("Java", "Python", "Web Development"));
            ArrayList<String> registered = new ArrayList<>();
            System.out.println("Available Courses: " + courses);
            System.out.print("Enter course to register: ");
            String course = sc.nextLine();
            if(courses.contains(course) && ! registered.contains(course)) {
                registered.add(course);
                System.out.println("Registration Successful!");
            } else {
                System.out.println("Invalid course!");
            }
            System.out.println("Registered Courses: " + registered);
            System.out.print("Enter course to remove  (or press Enter to skip): ");
            String remove = sc.nextLine();
            if(registered.remove(remove))
            System.out.println("Course removed successfully!");
            System.out.println("Final Registration: " + registered);
            sc.close();

        
    }
}
