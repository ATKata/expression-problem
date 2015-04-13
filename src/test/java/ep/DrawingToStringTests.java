package ep;

import ep.shapes.Line;
import ep.shapes.Point2D;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DrawingToStringTests {

    @Test
    public void emptyDrawingShouldStartWithDrawingText() {
        Drawing drawing = new Drawing();

        assertThat(drawing.toString(), equalTo("Drawing"));
    }

    @Test
    public void testDrawingWithASingleLine(){
        Drawing drawing = new Drawing(new Line(Point2D.at(1, 2),Point2D.at(3,4)));
        assertThat(drawing.toString(), equalTo("Drawing\nLine [Start = (1,2), End = (3,4)]"));
    }
}
