package gr.upatras.JavaEshopProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaperTest {

Paper testpaper = new Paper(100, "Testpaper", "TestDesc", 9.99, 1000, 80, 500);


	
	

	@Test
	public void testGetPageNum() {
		assertTrue(testpaper.getPageNum()==500);
		
	}

	@Test
	public void testSetPageNum() {
		testpaper.setPageNum(250);
		assertTrue(testpaper.getPageNum()==250);
		
	}

	@Test
	public void testGetWeight() {
		assertEquals(testpaper.getWeight(),80);
		
	}

	@Test
	public void testSetWeight() {
		testpaper.setWeight(100);
		assertEquals(testpaper.getWeight(),100);
	}

	@Test
	public void testItem() {
		assertTrue(testpaper instanceof Item);
	}

	@Test
	public void testGetName() {
		assertEquals(testpaper.getName(),"Testpaper");
	}

	@Test
	public void testSetName() {
		testpaper.setName("NewTestName");
		assertEquals(testpaper.getName(),"NewTestName");
		
	}

	@Test
	public void testGetPrice() {
		assertTrue(testpaper.getPrice()==9.99);
		
	}

	@Test
	public void testSetPrice() {
		testpaper.setPrice(10.0);
		assertTrue(testpaper.getPrice()==10.0);
	}

	@Test
	public void testGetDescription() {
		assertEquals(testpaper.getDescription(),"TestDesc");
		
		
	}

	@Test
	public void testSetDescription() {
		testpaper.setDescription("TestDesc2");
		assertEquals(testpaper.getDescription(),"TestDesc2");
		
	}

	@Test
	public void testGetStock() {
		assertTrue(testpaper.getStock()==1000);
	}

	@Test
	public void testSetStock() {
		testpaper.setStock(1500);
		assertTrue(testpaper.getStock()==1500);
	}

	@Test
	public void testGetId() {
		assertTrue(testpaper.getId()==100);
		
	}

	@Test
	public void testSetId() {
		testpaper.setId(200);
		assertTrue(testpaper.getId()==200);
	}

	@Test
	public void testGetCategory() {
		assertEquals(testpaper.getCategory(),"Paper");
	}

}
