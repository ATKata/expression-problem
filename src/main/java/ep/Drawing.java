package ep;

import ep.shapes.*;

import java.util.Arrays;
import java.util.List;

public class Drawing {
    private final List<Shape> shapes;

    public Drawing(Shape... shapes) {
        this.shapes = Arrays.asList(shapes);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Drawing)) {
            return false;
        }

        Drawing other = (Drawing) obj;
        return other.shapes.equals(shapes);
    }

    public static Drawing withShapes(Shape... shapes) {
        return new Drawing(shapes);
    }

    @Override
    public String toString() {
        String s = "Drawing";
        for (Shape shape : shapes) {
            s += "\n" + stringForShape(shape);
        }
        return s;
    }

    private String stringForShape(Shape shape) {
        Drawer drawer = ShapeDrawerFactory.getDrawer(shape);
        return drawer.draw();
    }


}
