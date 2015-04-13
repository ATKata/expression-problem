package ep.shapes;

public class ShapeDrawerFactory {

    public static Drawer getDrawer(Shape shape){
        if(shape instanceof Line) {
            return new LineDrawer((Line)shape);
        }
        return null;
    }
}
