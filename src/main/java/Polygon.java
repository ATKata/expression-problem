import java.util.Arrays;
import java.util.List;

public class Polygon implements Shape {

    private final List<Point2D> points;

    public Polygon(Point2D... points) {
        if (points.length < 3) {
            throw new IllegalArgumentException("Polygon must have at least 3 points. Number of points: " + points.length);
        }

        this.points = Arrays.asList(points);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Polygon)) {
            return false;
        }

        Polygon other = (Polygon) obj;
        return other.points.equals(points);
    }
}
