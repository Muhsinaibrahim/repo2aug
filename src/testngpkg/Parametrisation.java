package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrisation {
@Parameters("a")
@Test
public void test1(String a)
{
System.out.println("value="+a);	
}
}
