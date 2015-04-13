package ep;

import ep.shapes.Circle;
import ep.shapes.Line;
import ep.shapes.Point2D;
import ep.shapes.Shape;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DrawingEqualityTests {
    private static final Shape CIRCLE = new Circle(Point2D.at(0, 0), 1);
    private static final Shape LINE = new Line(Point2D.at(0, 0), Point2D.at(1, 1));

    @Test
    public void drawingsWithNoShapesAreEqual() {
        assertThat(Drawing.withShapes().equals(Drawing.withShapes()), is(true));
    }

    @Test
    public void drawingIsNotEqualToObjectOfDifferentType() {
        assertThat(Drawing.withShapes().equals(""), is(false));
    }

    @Test
    public void drawingIsNotEqualToNull() {
        assertThat(Drawing.withShapes().equals(null), is(false));
    }

    @Test
    public void drawingsWithDifferentShapesAreNotEqual() {
        assertThat(Drawing.withShapes(CIRCLE).equals(Drawing.withShapes(LINE)), is(false));
    }
}
