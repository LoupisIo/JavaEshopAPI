package gr.upatras.JavaEshopProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoteBookTest {

	NoteBook testnoteBook = new NoteBook(100, "TestnoteBook", "TestDesc", 9.99, 1000, 80, 500);


	
	

	@Test
	public void testGetPageNum() {
		assertTrue(testnoteBook.getPageNum()==500);
		
	}

	@Test
	public void testSetPageNum() {
		testnoteBook.setPageNum(250);
		assertTrue(testnoteBook.getPageNum()==250);
		
	}

	@Test
	public void testGetWeight() {
		assertEquals(testnoteBook.getSections(),80);
		
	}

	@Test
	public void testSetWeight() {
		testnoteBook.setSections(100);
		assertEquals(testnoteBook.getSections(),100);
	}

	@Test
	public void testItem() {
		assertTrue(testnoteBook instanceof Item);
	}

	@Test
	public void testGetName() {
		assertEquals(testnoteBook.getName(),"TestnoteBook");
	}

	@Test
	public void testSetName() {
		testnoteBook.setName("NewTestName");
		assertEquals(testnoteBook.getName(),"NewTestName");
		
	}

	@Test
	public void testGetPrice() {
		assertTrue(testnoteBook.getPrice()==9.99);
		
	}

	@Test
	public void testSetPrice() {
		testnoteBook.setPrice(10.0);
		assertTrue(testnoteBook.getPrice()==10.0);
	}

	@Test
	public void testGetDescription() {
		assertEquals(testnoteBook.getDescription(),"TestDesc");
		
		
	}

	@Test
	public void testSetDescription() {
		testnoteBook.setDescription("TestDesc2");
		assertEquals(testnoteBook.getDescription(),"TestDesc2");
		
	}

	@Test
	public void testGetStock() {
		assertTrue(testnoteBook.getStock()==1000);
	}

	@Test
	public void testSetStock() {
		testnoteBook.setStock(1500);
		assertTrue(testnoteBook.getStock()==1500);
	}

	@Test
	public void testGetId() {
		assertTrue(testnoteBook.getId()==100);
		
	}

	@Test
	public void testSetId() {
		testnoteBook.setId(200);
		assertTrue(testnoteBook.getId()==200);
	}

	@Test
	public void testGetCategory() {
		assertEquals(testnoteBook.getCategory(),"Notebook");
	}

}
