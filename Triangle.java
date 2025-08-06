import java.util.Arrays;

public class Triangle {
    private double sideA, sideB, sideC;
    private static int object = 0;

    // Default constructor which creates a Triangles of all sides being of 1.0
    public Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        object++;
    }

    // A-one Parameter which takes one argument and create an equilateral triangle
    public Triangle(double x) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = x;
        object++;
    }

    // A-two Parameter which takes two arguments and create an isosceles triangle
    public Triangle(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        object++;
    }

    // A-three Parameter which takes three arguments and create a triangle with
    // sides equals to x , y and z
    public Triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        object++;
    }

    // A copy constructor
    public Triangle(Triangle other) {
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
        object++;
    }

    // Getters and Setters
    public void setSideA(double x) {
        this.sideA = x;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    // Object
    public static int objectCount() {
        return object;
    }

    // Perimeter of the triangles
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    // Method to check right angled triangle
    public boolean isRightAngled() {
        // using pythagoras formula
        double[] sides = { sideA, sideB, sideC };

        Arrays.sort(sides);

        double p = sides[0]; // perpendicular
        double b = sides[1]; // base
        double h = sides[2]; // hypotenuse

        if ((p * p + b * b == h * h)) { // PYTHAGORAS
            return true;
        } else {
            return false;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "For Triangle : " + object +
                " \n Side A is : " + sideA + ", Side B is : " + sideB + ", Side C is : " + sideC +
                "\n Perimeter of this triangle is " + perimeter() +
                " \n Is Triangle " + object+ " Right angled ? : " + isRightAngled();
    }
}
