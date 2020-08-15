# SeleniumTestAutomation

The project has been developed in IntellJ Idea on the MacOS operating system.
To run the Selenium test project you need to run the UiTests class.

Executable files for webdrivers are included in /resources/exec directory.

Execution is supported for Chrome, Firefox and Safari. It can be changed in the /resources/env.properties under webdriver.browserType.
In the case of the files being corrupted during upload/download, please download compatible executable files for your browser versions
1. Chrome driver: https://chromedriver.chromium.org/downloads
2. Firefox driver: https://github.com/mozilla/geckodriver/releases 

Sometimes during the first run on MacOS, the drivers need to be allowed in the System Preferences > Security & Privacy. In this case, you should also re-run the tests.

To run tests on the Safari browser, you will first need to enable the Safari driver in the terminal using ```safaridriver --enable```

The output file, named ```printed_dresses.txt``` is created in the resources directory and is overwritten in each run.
