package service;

import java.io.IOException;
import java.util.StringTokenizer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scrapper {
	
	Logger logger = LoggerFactory.getLogger(Scrapper.class);
	
	static final String WEMAKEPRICE = "http://search.wemakeprice.com/search?";
	static final String WEMAKEPRICE_CATEGORY_DIGITAL = "100000?";
	static final String WEMAKEPRICE_CATEGORY_FOOD_LIVING_BABIES = "100030?";
	static final String WEMAKEPRICE_CATEGORY_FASHION_BEAUTY = "100010?";
	static final String WEMAKEPRICE_CATEGORY_LOCAL_SERVICE = "110100?";
	static final String WEMAKEPRICE_CATEGORY_TOUR_LEISURE = "990000?";
	static final String WEMAKEPRICE_QUERY_TYPE = "&queryType=0&_service=5&_type=3";
	static final String WEMAKEPRICE_SORT_CHEAP = "&sort=cheap";
	static final String WEMAKEPRICE_SORT_FAVORITE = "&sort=favorite";
	static final String WEMAKEPRICE_PRICE = "&price=20000~30000";
	static final String WEMAKEPRICE_KEYWORKD = "&search_keyword=";
	
	public void getChepest(String keyword) {
		
		String query = WEMAKEPRICE + WEMAKEPRICE_QUERY_TYPE
				+ WEMAKEPRICE_SORT_CHEAP + WEMAKEPRICE_PRICE + WEMAKEPRICE_KEYWORKD + keyword;
		
		
		try {
			Document wemap = Jsoup.connect(query).get();
			
			Elements productsName = wemap.select(".tit_desc");
			Elements prices = wemap.select(".sale");
			
			Element productName, price;
			
			for(int i=0; i<5; i++) {
				productName = productsName.get(i);
				price = prices.get(i);
				logger.debug(productName.html());
				logger.debug(price.html().split("<span class=\"won\">")[0]);
			}
//			for (Element element : price) {
//				logger.debug(element.html().split("<span class=\"won\">")[0]);
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
