public class HelloWorldTest {
    public static void main(String[] args) {
        System.out.println("Running tests...");

        // Test case 1: Test if the HelloWorld class prints "Hello, world!"
        testHelloWorldOutput();

        // Test case 2: Add more test cases as needed

        System.out.println("Tests completed.");
    }

    private static void testHelloWorldOutput() {
        HelloWorld helloWorld = new HelloWorld();
        String expectedOutput = "Hello, world!";
        String actualOutput = helloWorld.getGreeting();
        if (expectedOutput.equals(actualOutput)) {
            System.out.println("Test passed: HelloWorld prints 'Hello, world!'");
        } else {
            System.out.println("Test failed: HelloWorld prints '" + actualOutput + "', expected '" + expectedOutput + "'");
        }
    }
}

class HelloWorld {
    public String getGreeting() {
        return "Hello, world!";
    }
}
