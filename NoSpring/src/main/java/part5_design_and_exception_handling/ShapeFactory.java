package part5_design_and_exception_handling;

class ShapeFactory {
    public static Shape createShape(String type, double... args) {
        switch (type) {
            case "Circle":
                if (args.length != 1) {
                    throw new IllegalArgumentException("Invalid number of arguments for Circle");
                }
                return new Circle(args[0]);
            case "Rectangle":
                if (args.length != 2) {
                    throw new IllegalArgumentException("Invalid number of arguments for Rectangle");
                }
                return new Rectangle(args[0], args[1]);
            default:
                throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}
