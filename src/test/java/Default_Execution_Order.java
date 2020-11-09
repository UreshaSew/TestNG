import org.testng.annotations.*;

@Test
public class Default_Execution_Order {

    @BeforeClass
    public void setUp() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("AfterClass");
    }

    public void signIn(){
        System.out.println("SignIn");
    }

    public void searchTShirt(){
        System.out.println("SearchTShirt");
    }

    public void signOut(){
        System.out.println("SignOut");
    }

}
