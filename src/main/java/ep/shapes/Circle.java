package ep.shapes;

public class Circle implements Shape {
    private final Point2D centre;
    private final int radius;

    public Circle(Point2D centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }

        Circle other = (Circle) obj;
        return other.centre.equals(centre)
                && other.radius == radius;
    }

    @Override
    public void visit(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}
