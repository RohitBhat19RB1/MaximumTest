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
        Integer maximumResult=maximum.maximumInteger(5,4,3);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumInteger_AsSecondParameter_ShouldReturnMaximumInteger(){
        Integer maximumResult=maximum.maximumInteger(4,5,3);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumInteger_AsThirdParameter_ShouldReturnMaximumInteger() {
        Integer maximumResult=maximum.maximumInteger(3,4,5);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumFloat_AsFirstParameter_ShouldReturnMaximumFloat() {
        Float maximumResult=maximum.maximumFloat(8.8f,7.7f,6.6f);
        Float expectedResult=8.8f;
        Assert.assertEquals(expectedResult,maximumResult);
    }

    @Test
    public void givenMaximumFloat_AsSecondParameter_ShouldReturnMaximumFloat() {
        Float maximumResult=maximum.maximumFloat(7.7f,8.8f,6.6f);
        Float expectedResult=8.8f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumFloat_AsThirdParameter_ShouldReturnMaximumFloat(){
        Float maximumResult=maximum.maximumFloat(6.6f,7.7f,8.8f);
        Float expectedResult=8.8f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
}