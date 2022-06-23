import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class keywordExtractor {

    public static String URL = "https://www.youtube.com/watch?v=5Eqb_-j3FDA";
    public static String cssQuery = "[name=\"keywords\"]";
    public static String attributeKey = "content";


    public static void main(String args[]) throws IOException {
        Document doc = Jsoup.connect(URL).get();
        String keyword = doc.select(cssQuery).attr(attributeKey);
        //  System.out.println(keyword);

        List<String> myList = new ArrayList<String>(Arrays.asList(keyword.split(",")));

        for(String key : myList){
            System.out.println(key.trim());
        }
    }
}
