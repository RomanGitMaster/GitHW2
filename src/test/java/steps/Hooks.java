package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {


    @Before
    public void begin(Scenario scenario){
        System.out.println("Beginning test: "+scenario.getName());
        openBrowserAndLunchApp();
    }
  @After
  public void end(Scenario scenario){
      System.out.println("Ending test: "+scenario.getName()+" "+scenario.getStatus());
      closeBrowser();
  }
}
