package intermediate.challenge196;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Challenge196IntegerTest{
	
	private MySet<Integer> mySet;
	
	@Before
	public void setUp(){
		List<Integer> input = new ArrayList<Integer>();
		input.addAll(Arrays.asList(new Integer[]{1,1}));		
		mySet = new MySet<Integer>(input);
	}

	@After
	public void tearDown(){
		mySet = null;
	}
	
	@Test
	public void testNoDuplicateInsertion(){
		assertEquals(mySet.size(), 1);
	}
	
	@Test
	public void testAllInserted(){
		assertEquals(mySet.contains(1), true);		
	}
	
	@Test
	public void testUnion(){
		
	}
	
	@Test
	public void testIntersection(){
		
	}
}
