package ep.shapes;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PolygonEqualityTests {
    private static final Point2D POINT_A = Point2D.at((double) 0, (double) 0);
    private static final Point2D POINT_B = Point2D.at((double) 0, (double) 1);
    private static final Point2D POINT_C = Point2D.at((double) 1, (double) 1);

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void polygonMustHaveAtLeast3Sides() {
        // Expect
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("ep.shapes.Polygon must have at least 3 points. Number of points: 2");

        // When
        new Polygon(
                Point2D.at((double) 0, (double) 0),
                Point2D.at((double) 0, (double) 1));
    }

    @Test
    public void polygonsAreEqualIfTheyContainTheSamePointsInTheSameOrder() {
        assertThat(standardPolygon().equals(standardPolygon()), is(true));
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
        Polygon polygon1 = new Polygon(POINT_A, POINT_B, POINT_C);
        Polygon polygon2 = new Polygon(POINT_B, POINT_C, POINT_A);

        assertThat(polygon1.equals(polygon2), is(false));
    }

    private static Polygon standardPolygon() {
        return new Polygon(POINT_A, POINT_B, POINT_C);
    }
}
