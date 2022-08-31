package steps;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.LoginPage;

public class Pageinitilizer {
    public static LoginPage lg;
    public static DashboardPage dash;
    public static AddEmployeePage addEmp;

    public void initilizeObjects() {
        lg = new LoginPage();
        dash = new DashboardPage();
        addEmp = new AddEmployeePage();
    }
}
