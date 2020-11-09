import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageVerification {


    @Test
    public void testHomePageVerification() {
        // Hard  Assert test pass
        Assert.assertEquals(true, true, "The Welcome Link Is Not Correct On The Home Page");

        Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");

        Assert.assertTrue(true, "The Dashboard Is Not Correct On The Home Page");

    }

    @Test
    public void A() {
        // Hard assert test fail

        Assert.assertEquals(true, false, "The Welcome Link Is Not Correct On The Home Page");
        System.out.println("3. Verify Welcome Link");
        // print message. Skip from this to next @Test

        Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
        System.out.println("4. Verify Admin Tab");

        Assert.assertTrue(false, "The Dashboard Is Not Correct On The Home Page");
        System.out.println("5. Verify Dashboard");
    }

    @Test
    public void B() {
        SoftAssert softassert = new SoftAssert(); // this not skip at first phase
        softassert.assertEquals(true, false, "The Welcome Link Is Not Correct On The Home Page");
        System.out.println("3. Verify Welcome Link");

        softassert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
        System.out.println("4. Verify Admin Tab");

        softassert.assertTrue(false, "The Dashboard Is Not Correct On The Home Page");
        System.out.println("5. Verify Dashboard");

        softassert.assertAll();
    }

}
