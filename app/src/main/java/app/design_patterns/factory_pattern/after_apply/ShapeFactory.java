package app.design_patterns.factory_pattern.after_apply;

import app.design_patterns.factory_pattern.Circle;
import app.design_patterns.factory_pattern.Rectangle;
import app.design_patterns.factory_pattern.Shape;
import app.design_patterns.factory_pattern.Square;

public class ShapeFactory {

    public Shape getShape(String shape_type) {
        if (shape_type == null) {
            return null;
        }
        if (shape_type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        else if(shape_type.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shape_type.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

}
