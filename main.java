public class main {
    public static void main(String[] args) {
        try {
            // default triangle
            Triangle T1 = new Triangle();
            System.out.println(T1);
            System.out.println("------------------");

            // Equilateral Triangle
            Triangle T2 = new Triangle(2.3);
            System.out.println(T2);
            System.out.println("------------------");

            // Isosceles Triangle
            Triangle T3 = new Triangle(2.4, 2.9);
            System.out.println(T3);
            System.out.println("------------------");

            // Equal sides
            Triangle T4 = new Triangle(5.0, 3.0, 4.0);
            System.out.println(T4);
            System.out.println("------------------");

            // Copy Constructor
            Triangle T5 = new Triangle(T4);
            System.out.println(T5);
            System.out.println("------------------");

            // Practice
            // T5 = T4 ;
            // System.out.println(T4);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("There is an error while execution");
        }
    }
}
