public class Main {
    // area of circle
    double radius;
    double area;

    //making a constructor same name as class name
    public Main(int r) {
        radius = r;
        area = 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        // constructor are made and called from inside main function
        Main square = new Main(5);
        System.out.println(square.area);
    }
}