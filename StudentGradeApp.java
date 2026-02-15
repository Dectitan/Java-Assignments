// import java.util.*;

// class BookRecord {
//     private String name;
//     private String writer;
//     private String code;

//     public BookRecord(String name, String writer, String code) {
//         this.name = name;
//         this.writer = writer;
//         this.code = code;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getWriter() {
//         return writer;
//     }

//     public String getCode() {
//         return code;
//     }

//     public void printDetails() {
//         System.out.println("Book Name : " + name);
//         System.out.println("Author    : " + writer);
//         System.out.println("ISBN Code : " + code);
//         System.out.println("-------------------------");
//     }
// }

// class BookManager {
//     private List<BookRecord> collection;

//     public BookManager() {
//         collection = new ArrayList<>();
//     }

//     public void insertBook(String name, String writer, String code) {
//         collection.add(new BookRecord(name, writer, code));
//         System.out.println("Book successfully stored!");
//     }

//     public void findBook(String name) {
//         boolean found = false;

//         for (BookRecord b : collection) {
//             if (b.getName().equalsIgnoreCase(name)) {
//                 System.out.println("Book Located:");
//                 b.printDetails();
//                 found = true;
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("No such book exists.");
//         }
//     }

//     public void showBooks() {
//         if (collection.size() == 0) {
//             System.out.println("No books available in system.");
//             return;
//         }

//         System.out.println("\nAvailable Books:");
//         for (BookRecord b : collection) {
//             b.printDetails();
//         }
//     }
// }

// public class LibrarySystemApp {

//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         BookManager manager = new BookManager();

//         int option = 0;

//         while (option != 4) {

//             System.out.println("\n====== LIBRARY SYSTEM ======");
//             System.out.println("1 -> Insert Book");
//             System.out.println("2 -> Find Book");
//             System.out.println("3 -> Show All Books");
//             System.out.println("4 -> Quit");
//             System.out.print("Select option: ");

//             option = input.nextInt();
//             input.nextLine();

//             if (option == 1) {
//                 System.out.print("Book Name: ");
//                 String name = input.nextLine();

//                 System.out.print("Author Name: ");
//                 String writer = input.nextLine();

//                 System.out.print("ISBN Code: ");
//                 String code = input.nextLine();

//                 manager.insertBook(name, writer, code);

//             } else if (option == 2) {
//                 System.out.print("Enter book name to search: ");
//                 String name = input.nextLine();

//                 manager.findBook(name);

//             } else if (option == 3) {
//                 manager.showBooks();

//             } else if (option == 4) {
//                 System.out.println("Program Terminated.");

//             } else {
//                 System.out.println("Invalid input. Try again.");
//             }
//         }

//         input.close();
//     }
// }
import java.util.*;

class StudentInfo {

    String studentName;
    ArrayList<Double> marks = new ArrayList<>();

    void addMarks(double m) {
        marks.add(m);
    }

    double getAverage() {

        double total = 0;

        if (marks.size() == 0)
            return 0;

        for (int i = 0; i < marks.size(); i++) {
            total = total + marks.get(i);
        }

        return total / marks.size();
    }

    void showDetails() {
        System.out.println("\nStudent: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Average: " + getAverage());
    }
}

class ResultSystem {

    ArrayList<StudentInfo> list = new ArrayList<>();

    void addNewStudent(String name) {
        StudentInfo s = new StudentInfo();
        s.studentName = name;
        list.add(s);
    }

    StudentInfo searchStudent(String name) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).studentName.equalsIgnoreCase(name)) {
                return list.get(i);
            }
        }
        return null;
    }

    void printAll() {

        if (list.size() == 0) {
            System.out.println("No records found.");
            return;
        }

        for (StudentInfo s : list) {
            s.showDetails();
        }
    }
}

public class StudentGradeApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ResultSystem system = new ResultSystem();

        int ch;

        while (true) {

            System.out.println("\n--- Student Grade Menu ---");
            System.out.println("1 Add Student");
            System.out.println("2 Add Marks");
            System.out.println("3 Display Students");
            System.out.println("4 Exit");
            System.out.print("Choose: ");

            ch = input.nextInt();
            input.nextLine();

            if (ch == 1) {

                System.out.print("Enter name: ");
                String name = input.nextLine();

                system.addNewStudent(name);
                System.out.println("Student saved!");

            } 
            else if (ch == 2) {

                System.out.print("Student name: ");
                String name = input.nextLine();

                StudentInfo s = system.searchStudent(name);

                if (s != null) {
                    System.out.print("Enter marks: ");
                    double m = input.nextDouble();
                    input.nextLine();

                    s.addMarks(m);
                    System.out.println("Marks added!");
                } 
                else {
                    System.out.println("Student not found!");
                }
            } 
            else if (ch == 3) {
                system.printAll();
            } 
            else if (ch == 4) {
                System.out.println("Program closed.");
                break;
            } 
            else {
                System.out.println("Wrong choice.");
            }
        }

        input.close();
    }
}
