import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class Basics {

	public static void main(String[] args) {
		

		RestAssured.baseURI = "https://feature1.litmos.com/";
		
		Map<String,Object> headerMap = new HashMap<String,Object>();
		headerMap.put("apikey", "f5de5ef4-f6c4-4e40-8c31-49972ce8f0c8");
		headerMap.put("Content-Type", "text/xml");
		
		given().headers(headerMap).
		when().get("v1.svc/courses/jCsesuX5Oe41/modules/CyFd89tKRIs1/sessions").
		then().log().all().assertThat().statusCode(200);
		
		
	}

}


