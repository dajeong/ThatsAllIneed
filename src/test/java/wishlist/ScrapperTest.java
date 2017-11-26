package wishlist;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.Scrapper;

public class ScrapperTest {

	private static final Logger logger = LoggerFactory.getLogger(ScrapperTest.class);

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
		scrapper.getChepest("무접점 키보드");
	}

}
