package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	@Test(groups={"smoke"})
	public void Demo() {
		System.out.println("Hello");
	}
	@AfterSuite
	public void afsuite() {
		System.out.println("After Suite test 2");
	}
	@AfterTest
	public void test23() {
		System.out.println("After test 2");
	}
	@Test
	public void SecondTest() {
		System.out.println("Hey");
	}
	@BeforeSuite
	public void befsuite() {
		System.out.println("Before Suite test 2");
	}
	@Test
	public void test2() {
		System.out.println("test 2");
	}
	@BeforeTest
	public void test22() {
		System.out.println("Before test 2");
	}
}
