import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CircleEqualityTests {
    public static final Point2D POINT_A = Point2D.at(0, 0);
    public static final Point2D POINT_B = Point2D.at(1, 1);

    @Test
    public void circlesWithSameCentreAndRadiiAreEqual() {
        assertThat(standardCircle().equals(standardCircle()), is(true));
    }

    @Test
    public void circlesShouldNotBeEqualToObjectOfDifferentType() {
        assertThat(standardCircle().equals(""), is(false));
    }

    @Test
    public void circlesShouldNotBeEqualToNull() {
        assertThat(standardCircle().equals(null), is(false));
    }

    @Test
    public void circlesWithDifferentCentresShouldNotBeEqual() {
        Circle circle1 = new Circle(POINT_A, 1);
        Circle circle2 = new Circle(POINT_B, 1);

        assertThat(circle1.equals(circle2), is(false));
    }

    @Test
    public void circlesWithDifferentRadiiShouldNotBeEqual() {
        Circle circle1 = new Circle(POINT_A, 1);
        Circle circle2 = new Circle(POINT_A, 2);

        assertThat(circle1.equals(circle2), is(false));
    }

    private Circle standardCircle() {
        return new Circle(POINT_A, 1);
    }
}
