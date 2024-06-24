public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();
        Shape octagon = new Octagon();

        printer.printShapeName(circle);
        printer.printShapeName(quad);
        printer.printShapeName(triangle);
        printer.printShapeName(hexagon);
        printer.printShapeName(octagon);
    }
}