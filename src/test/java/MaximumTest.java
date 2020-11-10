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
    public void givenMaximumInteger_AsAFirstParameter_ShouldReturnMaximum() {
        Integer maximumResult=maximum.maximumInteger(5,4,3);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumInteger_AsSecondParameter_ShouldReturnMaximum(){
        Integer maximumResult=maximum.maximumInteger(4,5,3);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumInteger_AsThirdParameter_ShouldReturnMaximum() {
        Integer maximumResult=maximum.maximumInteger(3,4,5);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
}