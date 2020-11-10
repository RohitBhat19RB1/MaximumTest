import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumTest {
    Maximum maximum;

    @Before
    public void setUp() throws Exception {
        maximum=new Maximum();
    }

    @Test
    public void givenMaximumInteger_AsAFirstParameter_ShouldReturnMaximumInteger() {
        Integer maximumResult=maximum.checkMaximum(5,4,3);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumInteger_AsSecondParameter_ShouldReturnMaximumInteger(){
        Integer maximumResult=maximum.checkMaximum(4,5,3);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumInteger_AsThirdParameter_ShouldReturnMaximumInteger() {
        Integer maximumResult=maximum.checkMaximum(3,4,5);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumFloat_AsFirstParameter_ShouldReturnMaximumFloat() {
        Float maximumResult=maximum.checkMaximum(8.8f,7.7f,6.6f);
        Float expectedResult=8.8f;
        Assert.assertEquals(expectedResult,maximumResult);
    }

    @Test
    public void givenMaximumFloat_AsSecondParameter_ShouldReturnMaximumFloat() {
        Float maximumResult=maximum.checkMaximum(7.7f,8.8f,6.6f);
        Float expectedResult=8.8f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumFloat_AsThirdParameter_ShouldReturnMaximumFloat(){
        Float maximumResult=maximum.checkMaximum(6.6f,7.7f,8.8f);
        Float expectedResult=8.8f;
        Assert.assertEquals(expectedResult,maximumResult);
    }

    @Test
    public void givenMaximumString_AsFirstParameter_ShouldReturnMaximumString() {
        String maximumResult=maximum.checkMaximum("peach","orange","apple");
        Assert.assertEquals("peach",maximumResult);
    }
    @Test
    public void givenMaximumString_AsSecondParameter_ShouldReturnMaximumString() {
        String maximumResult=maximum.checkMaximum("orange","peach","apple");
        Assert.assertEquals("peach",maximumResult);
    }

    @Test
    public void givenMaximumstring_AsThirdParameter_ShouldReturnMaximumString() {
        String maximumResult=maximum.checkMaximum("apple","orange","peach");
        Assert.assertEquals("peach",maximumResult);
    }

    @Test
    public void givenMaximumInteger_ShouldReturnMaximumInteger() {
        Comparable maximumResult=maximum.checkMaximum(8,7,6);
        Assert.assertEquals(8,maximumResult);
    }
    @Test
    public void givenMaximumFloat_UsingGenericClass_ShouldReturnMaximumFloat() {
        Comparable maximumResult=maximum.checkMaximum(7.7,6.7,9.9);
        Assert.assertEquals(9.9,maximumResult);
    }
    @Test
    public void givenMaximumString_UsingGenericClass_ShouldReturnMaximumString(){
        Comparable maximumResult=maximum.checkMaximum("peach","orange","apple");
        Assert.assertEquals("peach",maximumResult);
    }

    @Test
    public void givenNIntegers_UsingMoreThanThreeParameters_ShouldReturnMaximumInteger() {
        Integer maximumResult=maximum.moreThan_ThreeParameters(5,7,2,8,9,10);
        Integer expectedResult=10;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenNFloats_UsingMoreThanThreeParameters_ShouldReturnMaximumFloat(){
        Float maximumResult=maximum.moreThan_ThreeParameters(7.7f,4.4f,5.5f,9.9f);
        Float expectedResult=9.9f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenNStrings_UsingMoreThanThreeParameters_ShouldReturnMaximumString(){
        String maximumResult=maximum.moreThan_ThreeParameters("orange","peach","apple","strawberry");
        Assert.assertEquals("strawberry",maximumResult);
    }

    @Test
    public void givenIntegers_UsingThreeParameters_ShouldPrintMaximumInteger() {
        maximum.printMaximum(5,9,2);
    }

    @Test
    public void givenFloats_UsingThreeParameters_ShouldPrintMaximumFloat() {
        maximum.printMaximum(5.5f,9.7f,2.4f);
    }

    @Test
    public void givenStrings_UsingThreeParameters_ShouldPrintMaximumString() {
        maximum.printMaximum("orange","peach","apple");
    }

    @Test
    public void givenIntegers_UsingMoreThanThreeParameters_ShouldPrintMaximumInteger() {
        maximum.printMaximum(5,9,2,88,45);
    }

    @Test
    public void givenFloats_UsingMoreThanThreeParameters_ShouldPrintMaximumFloat() {
        maximum.printMaximum(5.5f,9.7f,2.4f,102.6f,45.7f);
    }

    @Test
    public void givenStrings_UsingMoreThanThreeParameters_ShouldPrintMaximumString() {
        maximum.printMaximum("orange","peach","apple","pine-apple","pomegranate");
    }


}