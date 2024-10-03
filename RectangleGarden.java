public class RectangleGarden {                  //programmer:Carlos Miguel B Perez
                                                //project:Calculating the Area and Perimeter of a Rectangle

    public static void main(String[] args) {
        // Given values
        double length = 10.0; // Change this value to the desired length in meters
        double width = 5.0;   // Change this value to the desired width in meters

        // Calculations
        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);

        // Output
        displayResults(length, width, area, perimeter);
    }

    // Method to calculate the area of the rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Method to display the results
    public static void displayResults(double length, double width, double area, double perimeter) {
        System.out.println("Garden Dimensions:");
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Area: " + area + " square meters");
        System.out.println("Perimeter: " + perimeter + " meters");
    }
}
