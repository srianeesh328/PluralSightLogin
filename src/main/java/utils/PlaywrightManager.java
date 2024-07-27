package utils;

import com.microsoft.playwright.*;

public class PlaywrightManager {
    private static Playwright playwright;
    private static Browser browser;

    // Initialize Playwright and Browser
    public static Browser getBrowser() {
        if (playwright == null) {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        }
        return browser;
    }

    // Optionally, you can get a new page within the browser
    public static Page getPage() {
        return getBrowser().newPage();
    }

    // Close the browser and Playwright instance
    public static void close() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
}
