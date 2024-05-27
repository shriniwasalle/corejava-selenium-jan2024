package org.alpha.aishwarya.seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriverManager {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String actualtTitle = driver.getTitle();
        String expectedTitle = "Google";

        if (actualtTitle.equals(expectedTitle))
            System.out.println("Test Case Pass");
        else
            System.out.println("Test Case Fail");

        driver.close();
    }


}
/**
 * ---OUTPUT-----
 * "C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.2\lib\idea_rt.jar=57834:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk-11;C:\Automation Testing\corejava-selenium-jan2024\target\classes;C:\Users\aishw\.m2\repository\org\seleniumhq\selenium\selenium-java\3.141.59\selenium-java-3.141.59.jar;C:\Users\aishw\.m2\repository\org\seleniumhq\selenium\selenium-api\3.141.59\selenium-api-3.141.59.jar;C:\Users\aishw\.m2\repository\org\seleniumhq\selenium\selenium-chrome-driver\3.141.59\selenium-chrome-driver-3.141.59.jar;C:\Users\aishw\.m2\repository\org\seleniumhq\selenium\selenium-edge-driver\3.141.59\selenium-edge-driver-3.141.59.jar;C:\Users\aishw\.m2\repository\org\seleniumhq\selenium\selenium-firefox-driver\3.141.59\selenium-firefox-driver-3.141.59.jar;C:\Users\aishw\.m2\repository\org\seleniumhq\selenium\selenium-ie-driver\3.141.59\selenium-ie-driver-3.141.59.jar;C:\Users\aishw\.m2\repository\org\seleniumhq\selenium\selenium-opera-driver\3.141.59\selenium-opera-driver-3.141.59.jar;C:\Users\aishw\.m2\repository\org\seleniumhq\selenium\selenium-remote-driver\3.141.59\selenium-remote-driver-3.141.59.jar;C:\Users\aishw\.m2\repository\org\seleniumhq\selenium\selenium-safari-driver\3.141.59\selenium-safari-driver-3.141.59.jar;C:\Users\aishw\.m2\repository\org\seleniumhq\selenium\selenium-support\3.141.59\selenium-support-3.141.59.jar;C:\Users\aishw\.m2\repository\net\bytebuddy\byte-buddy\1.8.15\byte-buddy-1.8.15.jar;C:\Users\aishw\.m2\repository\org\apache\commons\commons-exec\1.3\commons-exec-1.3.jar;C:\Users\aishw\.m2\repository\com\google\guava\guava\25.0-jre\guava-25.0-jre.jar;C:\Users\aishw\.m2\repository\com\google\code\findbugs\jsr305\1.3.9\jsr305-1.3.9.jar;C:\Users\aishw\.m2\repository\org\checkerframework\checker-compat-qual\2.0.0\checker-compat-qual-2.0.0.jar;C:\Users\aishw\.m2\repository\com\google\errorprone\error_prone_annotations\2.1.3\error_prone_annotations-2.1.3.jar;C:\Users\aishw\.m2\repository\com\google\j2objc\j2objc-annotations\1.1\j2objc-annotations-1.1.jar;C:\Users\aishw\.m2\repository\org\codehaus\mojo\animal-sniffer-annotations\1.14\animal-sniffer-annotations-1.14.jar;C:\Users\aishw\.m2\repository\com\squareup\okhttp3\okhttp\3.11.0\okhttp-3.11.0.jar;C:\Users\aishw\.m2\repository\com\squareup\okio\okio\1.14.0\okio-1.14.0.jar;C:\Users\aishw\.m2\repository\io\github\bonigarcia\webdrivermanager\5.7.0\webdrivermanager-5.7.0.jar;C:\Users\aishw\.m2\repository\org\slf4j\slf4j-api\2.0.12\slf4j-api-2.0.12.jar;C:\Users\aishw\.m2\repository\com\google\code\gson\gson\2.10.1\gson-2.10.1.jar;C:\Users\aishw\.m2\repository\com\github\docker-java\docker-java\3.3.5\docker-java-3.3.5.jar;C:\Users\aishw\.m2\repository\com\github\docker-java\docker-java-core\3.3.5\docker-java-core-3.3.5.jar;C:\Users\aishw\.m2\repository\com\github\docker-java\docker-java-api\3.3.5\docker-java-api-3.3.5.jar;C:\Users\aishw\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.10.3\jackson-annotations-2.10.3.jar;C:\Users\aishw\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.10.3\jackson-databind-2.10.3.jar;C:\Users\aishw\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.10.3\jackson-core-2.10.3.jar;C:\Users\aishw\.m2\repository\org\bouncycastle\bcpkix-jdk18on\1.76\bcpkix-jdk18on-1.76.jar;C:\Users\aishw\.m2\repository\org\bouncycastle\bcprov-jdk18on\1.76\bcprov-jdk18on-1.76.jar;C:\Users\aishw\.m2\repository\org\bouncycastle\bcutil-jdk18on\1.76\bcutil-jdk18on-1.76.jar;C:\Users\aishw\.m2\repository\org\slf4j\jcl-over-slf4j\1.7.30\jcl-over-slf4j-1.7.30.jar;C:\Users\aishw\.m2\repository\com\github\docker-java\docker-java-transport-httpclient5\3.3.5\docker-java-transport-httpclient5-3.3.5.jar;C:\Users\aishw\.m2\repository\com\github\docker-java\docker-java-transport\3.3.5\docker-java-transport-3.3.5.jar;C:\Users\aishw\.m2\repository\net\java\dev\jna\jna\5.13.0\jna-5.13.0.jar;C:\Users\aishw\.m2\repository\org\brotli\dec\0.1.2\dec-0.1.2.jar;C:\Users\aishw\.m2\repository\org\apache\commons\commons-lang3\3.14.0\commons-lang3-3.14.0.jar;C:\Users\aishw\.m2\repository\org\apache\commons\commons-compress\1.26.0\commons-compress-1.26.0.jar;C:\Users\aishw\.m2\repository\commons-io\commons-io\2.15.1\commons-io-2.15.1.jar;C:\Users\aishw\.m2\repository\org\apache\httpcomponents\client5\httpclient5\5.2.1\httpclient5-5.2.1.jar;C:\Users\aishw\.m2\repository\org\apache\httpcomponents\core5\httpcore5\5.2\httpcore5-5.2.jar;C:\Users\aishw\.m2\repository\org\apache\httpcomponents\core5\httpcore5-h2\5.2\httpcore5-h2-5.2.jar;C:\Users\aishw\.m2\repository\org\testng\testng\7.9.0\testng-7.9.0.jar;C:\Users\aishw\.m2\repository\com\beust\jcommander\1.82\jcommander-1.82.jar;C:\Users\aishw\.m2\repository\org\webjars\jquery\3.7.1\jquery-3.7.1.jar" org.alpha.aishwarya.seleniumconcepts.TestWebDriverManager
 * SLF4J(W): No SLF4J providers were found.
 * SLF4J(W): Defaulting to no-operation (NOP) logger implementation
 * SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
 * Starting ChromeDriver 123.0.6312.86 (9b72c47a053648d405376c5cf07999ed626728da-refs/branch-heads/6312@{#698}) on port 18821
 * Only local connections are allowed.
 * Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
 * ChromeDriver was started successfully.
 * Apr 01, 2024 9:13:16 AM org.openqa.selenium.remote.ProtocolHandshake createSession
 * INFO: Detected dialect: W3C
 * Test Case Pass
 */


