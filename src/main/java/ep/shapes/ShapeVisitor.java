package ep.shapes;

public interface ShapeVisitor {

    public void visit(Line line);

    public void visit(Polygon polygon);

    public void visit(Circle circle);
}
