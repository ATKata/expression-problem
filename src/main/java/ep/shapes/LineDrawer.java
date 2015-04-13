package ep.shapes;

public class LineDrawer implements Drawer {

    private final Line line;

    public LineDrawer(Line line) {
        this.line = line;
    }

    @Override
    public String draw() {
        return String.format("Line [Start = %s, End = %s]", stringForPoint(line.start), stringForPoint(line.end));
    }

    private String stringForPoint(Point2D point) {
        return String.format("(%s,%s)",(int) point.x,(int) point.y);
    }
}
