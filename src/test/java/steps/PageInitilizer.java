package steps;

import pages.LoginPage;

public class PageInitilizer {

    // Class that will help initialize objects of pages in order to use their data
    public static LoginPage lg;


    public static void initilizePages() {
        lg = new LoginPage();
    }
}
