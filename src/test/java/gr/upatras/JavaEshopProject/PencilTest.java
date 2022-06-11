package gr.upatras.JavaEshopProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PencilTest {
	Pencil testpencil = new Pencil(100, "TestPencil", "TestDesc", 9.99, 1000, "H", 1.0);


	
	

	@Test
	public void testGetTipSize() {
		assertTrue(testpencil.getTipSize()==1.0);
		
	}

	@Test
	public void testSetTipSize() {
		testpencil.setTipSize(1.5);
		assertTrue(testpencil.getTipSize()==1.5);
		
	}

	@Test
	public void testGetType() {
		assertEquals(testpencil.getType(),"H");
		
	}

	@Test
	public void testSetType() {
		testpencil.setType("HB");
		assertEquals(testpencil.getType(),"HB");
	}

	@Test
	public void testItem() {
		assertTrue(testpencil instanceof Item);
	}

	@Test
	public void testGetName() {
		assertEquals(testpencil.getName(),"TestPencil");
	}

	@Test
	public void testSetName() {
		testpencil.setName("NewTestName");
		assertEquals(testpencil.getName(),"NewTestName");
		
	}

	@Test
	public void testGetPrice() {
		assertTrue(testpencil.getPrice()==9.99);
		
	}

	@Test
	public void testSetPrice() {
		testpencil.setPrice(10.0);
		assertTrue(testpencil.getPrice()==10.0);
	}

	@Test
	public void testGetDescription() {
		assertEquals(testpencil.getDescription(),"TestDesc");
		
		
	}

	@Test
	public void testSetDescription() {
		testpencil.setDescription("TestDesc2");
		assertEquals(testpencil.getDescription(),"TestDesc2");
		
	}

	@Test
	public void testGetStock() {
		assertTrue(testpencil.getStock()==1000);
	}

	@Test
	public void testSetStock() {
		testpencil.setStock(1500);
		assertTrue(testpencil.getStock()==1500);
	}

	@Test
	public void testGetId() {
		assertTrue(testpencil.getId()==100);
		
	}

	@Test
	public void testSetId() {
		testpencil.setId(200);
		assertTrue(testpencil.getId()==200);
	}

	@Test
	public void testGetCategory() {
		assertEquals(testpencil.getCategory(),"Pencil");
	}


}
