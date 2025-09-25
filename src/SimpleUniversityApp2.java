import java.io.*;
import java.util.*;

public class SimpleUniversityApp2 {

        static Scanner reader = new Scanner(System.in);
        static String studentFile = "students.txt";
        static String teacherFile = "teachers.txt";
        static String courseFile = "courses.txt";
        static ArrayList<Student> students = new ArrayList<Student>();
        static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        static ArrayList<Course>  courses = new ArrayList<Course>();

        public static void addStudent() {
             System.out.println("Student Entry");
             System.out.print("Please enter  name: ");
             String name = reader.nextLine();
             System.out.print("Please enter family: ");
             String family = reader.nextLine();
             System.out.print("Please enter nationalCode: ");
             String nationalCode = reader.nextLine();
             Student s = new Student(name, family, nationalCode);
             saveToFile(studentFile,s.toString());}

         public static void addTeacher() {
             System.out.println("Teacher Entry");
             System.out.print("Please enter  name: ");
             String name = reader.nextLine();
             System.out.print("Please enter family: ");
             String family = reader.nextLine();
             System.out.print("Please enter nationalCode: ");
             String nationalCode = reader.nextLine();
             System.out.print("Please enter teacherCode: ");
             String teacherCode = reader.nextLine();
             Teacher t = new Teacher(name, family, nationalCode, teacherCode);
             saveToFile(teacherFile,t.toString());}


         public static void addCourse() {
            System.out.println("Course Entry");
            System.out.print("Please enter  courseName: ");
            String courseName = reader.nextLine();
            System.out.print("Please enter courseCode: ");
            String courseCode = reader.nextLine();
            Course c = new Course(courseName, courseCode);
            saveToFile(courseFile,c.toString());}

        public static void printStudent() {
            System.out.println("\n");
            System.out.println("name\tfamily\tnationalCode");
            for (Student s : students) {
                System.out.println(s.name + "\t" + s.family + "\t" + s.nationalCode);
                System.out.println("\n");}
        }
        public static void PrintTeacher() {
            System.out.println("\n");
            System.out.println("name\tfamily\tnationalCode\tteacherCode");
            for(Teacher t : teachers) {
                System.out.println(t.name + "\t" + t.family + "\t" + t.nationalCode + " \t "  +  t.teacherCode);
                System.out.println("\n");}
        }
        public static void PrintCourse() {
            System.out.println("\n");
            System.out.println("courseName\tcourseCode");
            for (Course c : courses) {
                System.out.println(c.courseName + "\t" + c.courseCode);
                System.out.println("\n");
            }
        }

        public static void saveToFile(String fileName, String text) {
            try (FileWriter fw = new FileWriter(fileName,true)) {
                fw.write(text+ "\n");}
            catch (IOException e) {
                System.out.println("Error writing to file");
            }
        }

        public static void PrintFile(String filename,String header){
            System.out.println(header);
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("No data found!");
            }
        }
        public static void main(String[]args){
                while(true){
                    System.out.println("\n");
                    System.out.println("--- MENU ---");
                    System.out.println("1. Student entry");
                    System.out.println("2. Teacher entry");
                    System.out.println("3. Course entry");
                    System.out.println("4. Print students");
                    System.out.println("5. Print teachers");
                    System.out.println("6. Print courses");
                    System.out.println("7. Exit");
                    System.out.println("8. Please enter your choice: ");

                    String choice = reader.nextLine();

                    switch (choice) {
                        case"1":
                            addStudent();
                            break;
                        case"2":
                            addTeacher();
                            break;
                        case"3":
                            addCourse();
                            break;
                        case"4":
                            PrintFile(studentFile, "NAME    FAMILY    NATIONALCODE");
                            break;
                        case"5":
                            PrintFile(teacherFile, "NAME    FAMILY    NATIO2NALCODE    TEACHERCODE");
                            break;
                        case"6":
                            PrintFile(courseFile, "COURSECODE    COURSENAME");
                            break;
                        case"7":
                            System.out.println("Exit");
                            return;
                            default:
                                System.out.println("Invalid choice");
                    }
                }
        }

}
