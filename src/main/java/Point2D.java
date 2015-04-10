public class Point2D {
    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point2D)) {
            return false;
        }

        Point2D point = (Point2D) obj;
        return point != null
                && point.x == x
                && point.y == y;
    }
}
