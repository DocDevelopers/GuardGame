import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Doc on 2/25/16.
 */
public class SingleNumberFinderTest {
    SingleNumberFinder singleNumberFinder;
    @Before
    public void init(){
        singleNumberFinder = new SingleNumberFinder();
    }

    @Test
    public void testConvertToSingleDigit() throws Exception {
        long input1 = 13;
        int expectedOut1 = 4;

        long input2 = 1235;
        int expectedOut2 =  2;

        assertEquals(expectedOut1, singleNumberFinder.convertToSingleDigit(input1));
        assertEquals(expectedOut2, singleNumberFinder.convertToSingleDigit(input2));

    }

    @Test
    public void testIsNumSingleDigit() throws Exception {
        long TRUE_NUM = 5;
        long FALSE_NUM = 23;
        long TRUE_NUM1 = 3;
        long FALSE_NUM1 = 54;

        assertEquals(true, singleNumberFinder.isNumSingleDigit(TRUE_NUM));
        assertEquals(true, singleNumberFinder.isNumSingleDigit(TRUE_NUM1));
        assertEquals(false, singleNumberFinder.isNumSingleDigit(FALSE_NUM));
        assertEquals(false, singleNumberFinder.isNumSingleDigit(FALSE_NUM1));

    }

    @Test
    public void testAddSubNumbers() throws Exception {
        int[] subNums = {1,2,3};
        int expected = 6;

        assertEquals(expected, singleNumberFinder.addSubNumbers(subNums));
    }

    @Test
    public void testConvertToArrayOfSubNumbers() throws Exception {
        String number = "1234";
        int[] expected = {1,2,3,4};

        assertArrayEquals(expected, singleNumberFinder.convertToArrayOfSubNumbers(number));
    }

    @Test
    public void testConvertNumToString() throws Exception {
        long number = 1234;
        String expected = "1234";

        assertEquals(expected, singleNumberFinder.convertNumToString(number));
    }
}