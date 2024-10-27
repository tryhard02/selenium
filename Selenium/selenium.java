public class selenium{
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        assertEquals("Google", driver.getTitle());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}