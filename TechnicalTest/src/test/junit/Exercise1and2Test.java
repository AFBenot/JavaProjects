package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.beans.node.impl.RWNodeImpl;
import com.exercises.Exercise1;
import com.exercises.Exercise2;

public class Exercise1and2Test {

	private RWNodeImpl node = null;
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("--- Starting jUnit for Technical Test");
	}
	
	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("--- Finished jUnit for Technical Test");
	}
	
	@Before
    public void setUp() {
		System.out.println("-- Initializing variables");
		for(int i = 1; i <= 10; i++){
			System.out.println("-- Adding Node " + i);
			if (node == null) node = new RWNodeImpl("Node " + i);
			else node.addNode("Node " + i);
		}
    }
	
	@After
    public void tearDown() {
		System.out.println("-- Freeing memory");
		node = null;
		Runtime.getRuntime().gc();
    }

	@Test
    public void exercise1Test() {
		System.out.println("- Starting test for exercise 1");
		System.out.println("- Executing Exercise1.printList(node)");
		Exercise1.printList(node);
		System.out.println("- Finished test for exercise 1");
    }
	
	@Test
    public void exercise2Test() {
		System.out.println("- Starting test for exercise 2");
		System.out.println("- Executing first time Exercise2.printListReverse(node)");
		Exercise2.printListReverse(node);
		System.out.println("- Executing second time Exercise2.printListReverse(node)");
		Exercise2.printListReverse(node);
		System.out.println("- Finished test for exercise 2");
    }
	
}
