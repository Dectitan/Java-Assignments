//Write a program in java to print your name, roll_no, address in 3 different lines.
public class Assignment2HW {
    public static void main(String[] args){
        String name="Omar Patel";
        long PRN=24070122126L;
        String address="Vadodara";
        System.out.println("Name is:"+name);
        System.out.println("PRN is:"+PRN);
        System.out.println("address is:"+address);
    }
}





//2.Divide two numbers with divide-by-zero check
public class Assignment2HW {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Division by zero is not allowed");
        }
    }
}



//3.Pass two float variables to a function, add them in main using double
public class Assignment2HW{
    static float add(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {
        float a = 5.5f;
        float b = 4.5f;

        double result = add(a, b);
        System.out.println(result);
    }
}





//4.Child class inheriting properties of parent class

class Parent {
    int x = 10;
}

public class Assignment2HW extends Parent {
    int y = 20;

    public static void main(String[] args) {
        asignmnt01 obj = new asignmnt01();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}



//5 Method overloading (same method name, different parameters
public class Assignment2HW {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5.5, 4.5));
    }
}