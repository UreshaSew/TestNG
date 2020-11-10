import org.testng.annotations.Test;

public class Group {

    @Test(groups = "initialize")
    public void test1_SetUpChrome(){}

    @Test(dependsOnGroups = "initialize",groups = "application")
    public void test2_OpenOrangeHRM(){}

    @Test  (dependsOnGroups = "application")
    public void test3_SignIn() {}

    @Test  (dependsOnGroups = "application")
    public void test4_SearchUser() {}

    @Test  (dependsOnGroups = "application")
    public void test5_SearchEmployee() {}

    @Test  (dependsOnGroups = "application")
    public void test6_SearchCandidate() {}

    @Test  (dependsOnGroups = "application")
    public void test7_SignOut() {}

}
