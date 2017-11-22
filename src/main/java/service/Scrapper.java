package service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Scrapper {
	
	static final String WEMAKEPRICE = "http://search.wemakeprice.com/search/";
	static final String WEMAKEPRICE_CATEGORY_DIGITAL = "100000?";
	static final String WEMAKEPRICE_CATEGORY_FOOD_LIVING_BABIES = "100030?";
	static final String WEMAKEPRICE_CATEGORY_FASHION_BEAUTY = "100010?";
	static final String WEMAKEPRICE_CATEGORY_LOCAL_SERVICE = "110100?";
	static final String WEMAKEPRICE_CATEGORY_TOUR_LEISURE = "990000?";
	static final String WEMAKEPRICE_QUERY_TYPE = "&queryType=0&_service=5&_type=3";
	static final String WEMAKEPRICE_SORT_CHEAP = "&sort=cheap";
	static final String WEMAKEPRICE_SORT_FAVORITE = "&sort=favorite";
	static final String WEMAKEPRICE_PRICE = "&price=10000~100000";
	static final String WEMAKEPRICE_KEYWORKD = "&search_keyword=";
	
	public void getChepest(String keyword) {
		keyword = "제습기";
		
		String query = WEMAKEPRICE + WEMAKEPRICE_QUERY_TYPE + WEMAKEPRICE_CATEGORY_TOUR_LEISURE
				+ WEMAKEPRICE_SORT_CHEAP + WEMAKEPRICE_PRICE + WEMAKEPRICE_KEYWORKD + keyword;
		
		
		try {
			Document wemap = Jsoup.connect(query).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
