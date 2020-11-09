import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityExecutionOrder {
    @BeforeClass
    public void setUp() {}

    @Test(priority = 1)
    public void signIn() {}

    @Test (priority = 2)
    public void searchTShirt() {}

    @Test (priority = 3)
    public void signOut() {}

    @AfterClass
    public void tearDown() {}
}
