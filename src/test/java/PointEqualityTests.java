import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointEqualityTests {

    @Test
    public void pointDoesNotEqualNull() {
        assertThat(point(0, 0).equals(null), is(false));
    }

    @Test
    public void pointDoesNotEqualObjectOfDifferentType() {
        assertThat(point(0, 0).equals(""), is(false));
    }

    @Test
    public void pointsAreNotEqualIfCoordinatesAreDifferent() {
        assertThat(point(0, 0).equals(point(1, 0)), is(false));
        assertThat(point(0, 0).equals(point(0, 1)), is(false));
    }

    @Test
    public void pointsAreEqualIfCoordinatesAreSame() {
        assertThat(point(1, 1).equals(point(1, 1)), is(true));
    }

    private Point2D point(double x, double y) {
        return new Point2D(x, y);
    }
}
