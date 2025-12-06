package seleniumwithTestNG;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginDataProvider")
    public Object[][] getLoginData() {
        return new Object[][] {
            {"Admin", "wrongpass"},    // invalid password
            {"wronguser", "admin123"}, // invalid username
            {"Admin", "admin123"}      // valid credentials
        };
    }
    
    @DataProvider(name = "AddAdminDataProvider")
    public Object[][] getAddAdminData() {
        return new Object[][] {
            {"Rah", "anavit", "1235a445", "1235a445"},
            {"Jam","devandrama", "1235b445", "1235b445"}
        };
    }

}
