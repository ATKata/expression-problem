import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PolygonEqualityTests {
    private static final Point2D POINT_A = point(0, 0);
    private static final Point2D POINT_B = point(0, 1);
    private static final Point2D POINT_C = point(1, 1);

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void polygonMustHaveAtLeast3Sides() {
        // Expect
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Polygon must have at least 3 points. Number of points: 2");

        // When
        new Polygon(
                point(0,0),
                point(0,1));
    }

    @Test
    public void polygonsAreEqualIfTheyContainTheSamePointsInTheSameOrder() {
        // Given
        Polygon polygon = standardPolygon();
        Polygon samePolygon = standardPolygon();

        // Then
        assertThat(polygon.equals(samePolygon), is(true));
    }

    @Test
    public void polygonDoesNotEqualNull() {
        assertThat(standardPolygon().equals(null), is(false));
    }

    @Test
    public void polygonDoesNotEqualObjectOfDifferentType() {
        assertThat(standardPolygon().equals(""), is(false));
    }

    @Test
    public void polygonDoeNotEqualPolygonWithPointsInADifferentOrder() {
        // Given
        Polygon polygon = new Polygon(
                POINT_A,
                POINT_B,
                POINT_C);

        Polygon otherPolygon = new Polygon(
                POINT_B,
                POINT_C,
                POINT_A);

        // Then
        assertThat(polygon.equals(otherPolygon), is(false));
    }

    private static Polygon standardPolygon() {
        return new Polygon(
                POINT_A,
                POINT_B,
                POINT_C);
    }

    private static Point2D point(double x, double y) {
        return new Point2D(x, y);
    }
}
