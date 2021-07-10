package test;

import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void test3() {
		System.out.println("test 3");
	}
	@Test(groups={"smoke"})
	public void test31() {
		System.out.println("test31");
	}

}
