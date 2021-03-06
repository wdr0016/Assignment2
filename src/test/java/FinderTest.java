import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FinderTest {

    @Test
    public void test_normalMaxArray() {
        Finder x = new Finder();
        int[] array1 = {2, 5, 9};
        int[] array2 = {-5, 9, 2};
        int[] array3 = {0, -8, -15};
        int[] array4 = {1};

        assertEquals(new Integer(9), x.findMax(array1));
        assertEquals(new Integer(9), x.findMax(array2));
        assertEquals(new Integer(0), x.findMax(array3));
        assertEquals(new Integer(1), x.findMax(array4));
    }

    @Test
    public void test_edgeMaxArray() {
        Finder x = new Finder();

        assertNull(x.findMax(null));

        int[] emptyArray = {};
        assertNull(x.findMax(emptyArray));
    }

    @Test
    public void test_normalMinArray() {
        Finder x = new Finder();
        int[] array1 = {2, 5, 2};
        int[] array2 = {-5, 9, 2};
        int[] array3 = {0, -8, -15};
        int[] array4 = {1};

        assertEquals(new Integer(2), x.findMin(array1));
        assertEquals(new Integer(-5), x.findMin(array2));
        assertEquals(new Integer(-15), x.findMin(array3));
        assertEquals(new Integer(1), x.findMin(array4));
    }

    @Test
    public void test_edgeMinArray() {
        Finder x = new Finder();

        assertNull(x.findMin(null));

        int[] emptyArray = {};
        assertNull(x.findMin(emptyArray));
    }
}
