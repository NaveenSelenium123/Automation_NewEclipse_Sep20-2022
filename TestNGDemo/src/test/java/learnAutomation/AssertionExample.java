package learnAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
String name="Naveen";
boolean value=true;

@Test
public void checkEqual() {
Assert.assertTrue(value, "this is a method");
}
}
