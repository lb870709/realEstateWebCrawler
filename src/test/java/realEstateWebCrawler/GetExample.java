/*package realEstateWebCrawler;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetExample {
	  OkHttpClient client = new OkHttpClient();

	  String run(String url) throws IOException {
	    Request request = new Request.Builder()
	        .url(url)
	        .build();

	    try (Response response = client.newCall(request).execute()) {
	      return response.body().string();
	    }
	  }

	  public static void main(String[] args) throws IOException {
	    GetExample example = new GetExample();
	    String response = example.run("http://sc.hkexnews.hk/TuniS/www.hkexnews.hk/sdw/search/mutualmarket_c.aspx?t=sz");
	    System.out.println(response);
	  }
	}*/