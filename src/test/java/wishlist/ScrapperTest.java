package wishlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import service.Scrapper;

public class ScrapperTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void weMapTest() {
		Scrapper scrapper = new Scrapper();
		scrapper.getChepest("키보드");
	}

}
