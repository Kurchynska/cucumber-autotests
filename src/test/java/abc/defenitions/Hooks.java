package abc.defenitions;

import abc.po.MainPage;
import cucumber.api.java.After;

public class Hooks {

    private MainPage mainPage = new MainPage();

    @After
    public void closeDriver(){
        mainPage.getDriver().quit();
    }
}
