package junit;

import org.junit.*;

import com.exercises.Exercise3;

public class Exercise3Test {
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("--- Starting jUnit for Technical Test");
	}
	
	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("--- Finished jUnit for Technical Test");
	}

	@Test
    public void exercise3Test1() {
		System.out.println("- Starting test 1 for exercise 3");
		System.out.println("- Initializing variables with 1,1");
		int[] numbers = {1,1};
		System.out.println("- Executing Exercise3.pivotExcercise(number)");
		boolean result = Exercise3.pivotExcercise(numbers);
		System.out.println("Result is " + result);
		Assert.assertFalse(result);
		System.out.println("- Finished test for exercise 3");
    }

	@Test
    public void exercise3Test2() {
		System.out.println("- Starting test 2 for exercise 3");
		System.out.println("- Initializing variables with ");
		int[] numbers = {1, 2, 1};
		System.out.println("- Executing Exercise3.pivotExcercise(number)");
		boolean result = Exercise3.pivotExcercise(numbers);
		System.out.println("Result is " + result);
		Assert.assertTrue(result);
		System.out.println("- Finished test 2 for exercise 3");
    }

	@Test
    public void exercise3Test3() {
		System.out.println("- Starting test 3 for exercise 3");
		System.out.println("- Initializing variables with 1, 2, 2, 1");
		int[] numbers = {1, 2, 2, 1};
		System.out.println("- Executing Exercise3.pivotExcercise(number)");
		boolean result = Exercise3.pivotExcercise(numbers);
		System.out.println("Result is " + result);
		Assert.assertFalse(result);
		System.out.println("- Finished test 3 for exercise 3");
    }

	@Test
    public void exercise3Test4() {
		System.out.println("- Starting test 4 for exercise 3");
		System.out.println("- Initializing variables with 5, 9, 7, 17, 6, 5, 4, 6");
		int[] numbers = {5, 9, 7, 17, 6, 5, 4, 6};
		System.out.println("- Executing Exercise3.pivotExcercise(number)");
		boolean result = Exercise3.pivotExcercise(numbers);
		System.out.println("Result is " + result);
		Assert.assertTrue(result);
		System.out.println("- Finished test 4 for exercise 3");
    }
	
	
}
