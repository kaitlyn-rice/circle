import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class CircleTest{
    private Circle c, c2;
    private RightSolution r, r2;

    // test Diameter
    @Test public void testDiameter() {
        c = new Circle(0, 0, 2);
        r = new RightSolution(0, 0, 2);
        assertThat("\nThis is a test on your diameter method. Given a circle:\n" + r + "\nThe diameter ", 
            c.diameter(), is(r.diameter()));
    }

    // test Area
    @Test public void testArea() {
        c = new Circle(0, 1.5, 3.43);
        r = new RightSolution(0, 1.5, 3.43);
        assertThat("\nThis is a test on your diameter method. Given a circle:\n" + r + "\nThe area ", 
            c.area(), is(r.area()));
    }

    // test Perimeter
    @Test public void testPerimeter() {
        c = new Circle(20, 1.5, 3.96);
        r = new RightSolution(20, 1.5, 3.96);
        assertThat("\nThis is a test on your perimeter method. Given a circle:\n" + r + "\nThe perimeter ",
            c.perimeter(), is(r.perimeter()));
    }

    // test isUnitCircle
    @Test public void testIsUnitCircle() {
        c = new Circle(0, 0, 1);
        r = new RightSolution(0, 0, 1);
        assertThat("\nThis is a test on your isUnitCircle method. Given a circle:\n" + r + "\nThe circle is a unit cirlce.",
            c.isUnitCircle(), is(r.isUnitCircle()));

        c.setX(1);
        r.setX(1);
        assertThat("\nThis is a test on your isUnitCircle and setX methods. Given a circle:\n" + r + "\nThe circle is a unit cirlce.",
            c.isUnitCircle(), is(r.isUnitCircle()));

        c.setX(0);
        r.setX(0);
        c.setRadius(-1);
        r.setRadius(-1);
        assertThat("\nThis is a test on your isUnitCircle and setRadius methods. Given a circle:\n" + r + "\nThe circle is a unit cirlce.",
            c.isUnitCircle(), is(r.isUnitCircle()));
    }

    // test equals
    @Test public void testEquals() {
        c = new Circle(0, 0, 1);
        c2 = new Circle(0, 0, 1.2);

        r = new RightSolution(0, 0, 1);
        r2 = new RightSolution(0, 0, 1.2);

        assertThat("\nThis is a test on your equals method. Given a circle:\n" + r 
            + "\nAnd another circle:\n" + r2 + "\nThey are the same.",
            c.equals(c2), is(r.equals(r2)));
    }

    // test isConcentric
    @Test public void testIsConcentric() {
        c = new Circle(0, -4, 3);
        c2 = new Circle(0, -4, 3);

        r = new RightSolution(0, -4, 3);
        r2 = new RightSolution(0, -4, 3);

        assertThat("\nThis is a test on your isConcentric method. Given a circle:\n" + r 
            + "\nAnd another circle:\n" + r2 + "\nThey are concentric.",
            c.isConcentric(c2), is(r.isConcentric(r2)));
    }

    // test distance
    @Test public void testDistance() {
        c = new Circle(0, -4, 3.1);
        c2 = new Circle(12, 6.8, 1.2);

        r = new RightSolution(0, -4, 3.1);
        r2 = new RightSolution(12, 6.8, 1.2);

        assertThat("\nThis is a test on your distance method. Given a circle:\n" + r 
            + "\nAnd another circle:\n" + r2 + "\nTheir distance ",
            c.distance(c2), is(r.distance(r2)));
    }

    // test intersects
    @Test public void testIntersects() {
        c = new Circle(0, -4, 3.1);
        c2 = new Circle(2, 6.8, 1.2);

        r = new RightSolution(0, -4, 3.1);
        r2 = new RightSolution(2, 6.8, 1.2);

        assertThat("\nThis is a test on your intersects method. Given a circle:\n" + r 
            + "\nAnd another circle:\n" + r2 + "\nThey intersect with each other.",
            c.intersects(c2), is(r.intersects(r2)));
    }
}
