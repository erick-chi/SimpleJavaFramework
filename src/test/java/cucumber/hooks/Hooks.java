package cucumber.hooks;

import Framework.Abstracts.Common;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks extends Common {

    @Before
    public void setup() throws IOException {
        // Setup logic here
        setUp();
    }

    @After
    public void teardown() {
        // Teardown logic here
        QuitDriver();
    }
}
