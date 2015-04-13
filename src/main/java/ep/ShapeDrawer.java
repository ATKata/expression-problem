package ep;

import ep.shapes.*;

public class ShapeDrawer implements ShapeVisitor {

    private StringBuilder pollen = new StringBuilder();

    @Override
    public void visit(Line line) {
        pollen.append(String.format("\nLine [Start = %s, End = %s]", stringForPoint(line.start), stringForPoint(line.end)));
    }

    @Override
    public void visit(Polygon polygon) {

    }

    @Override
    public void visit(Circle circle) {

    }

    private String stringForPoint(Point2D point) {
        return String.format("(%s,%s)",(int) point.x,(int) point.y);
    }

    public String getShapeStrings() {
        return pollen.toString();
    }
}
