import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointEqualityTests {

    @Test
    public void pointDoesNotEqualNull() {
        assertThat(Point2D.at(0, 0).equals(null), is(false));
    }

    @Test
    public void pointDoesNotEqualObjectOfDifferentType() {
        assertThat(Point2D.at(0, 0).equals(""), is(false));
    }

    @Test
    public void pointsAreNotEqualIfCoordinatesAreDifferent() {
        assertThat(Point2D.at(0, 0).equals(Point2D.at(1, 0)), is(false));
        assertThat(Point2D.at(0, 0).equals(Point2D.at(0, 1)), is(false));
    }

    @Test
    public void pointsAreEqualIfCoordinatesAreSame() {
        assertThat(Point2D.at(1, 1).equals(Point2D.at(1, 1)), is(true));
    }

}
