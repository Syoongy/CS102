import java.util.ArrayList;

public class ShapeUtility {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {

        if (shapeList != null) {
            Octagon highestOctagon = null;

            for (Shape s : shapeList) {

                if (s instanceof Octagon) {
                    if (highestOctagon == null) {
                        highestOctagon = (Octagon) s;
                    } else if (s.getArea() > highestOctagon.getArea()) {
                        highestOctagon = (Octagon) s;
                    }
                }
            }
            return highestOctagon;
        }
        return null;
    }

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList) {
        ArrayList<Shape> retList = new ArrayList<>();

        if (shapeList != null) {
            for (Shape s : shapeList) {
                if (!(s instanceof Rectangle)) {
                    retList.add(s);
                }
            }
        }

        return retList;
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea) {
        ArrayList<Square> retList = new ArrayList<>();

        if (shapeList != null) {
            for (Shape s : shapeList) {
                if (s instanceof Square && s.getArea() >= minArea) {
                    retList.add((Square) s);
                }
            }
        }

        return retList;
    }

    public static ArrayList<Shape> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int length) {
        ArrayList<Shape> retList = new ArrayList<>();

        if (shapeList != null) {
            for (Shape s : shapeList) {
                if (s instanceof Rectangle) {
                    Rectangle testRect = (Rectangle) s;
                    if (testRect.getLength() >= length) {
                        retList.add(testRect);
                    }
                }
            }
        }

        return retList;
    }
}
