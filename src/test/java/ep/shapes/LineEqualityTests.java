package ep.shapes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LineEqualityTests {

    public static final Point2D POINT_A = Point2D.at(0, 0);
    public static final Point2D POINT_B = Point2D.at(1, 1);

    @Test
    public void linesWithSamePointsShouldBeEqual() {
        assertThat(standardLine().equals(standardLine()), is(true));
    }

    @Test
    public void lineShouldNotBeEqualToNull() {
        assertThat(standardLine().equals(null), is(false));
    }

    @Test
    public void lineShouldNotBeEqualToObjectOfDifferentType() {
        assertThat(standardLine().equals(""), is(false));
    }

    @Test
    public void linesWithPointsInDifferentOrderShouldNotBeEqual() {
        Line line1 = new Line(POINT_A, POINT_B);
        Line line2 = new Line(POINT_B, POINT_A);

        assertThat(line1.equals(line2), is(false));
    }

    private Line standardLine() {
        return new Line(POINT_A, POINT_B);
    }
}
