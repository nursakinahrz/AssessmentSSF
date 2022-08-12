package ssf.assessment.day20.services;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class NewsService {
    
    private static final String LATEST_NEWS ="https://min-api.cryptocompare.com/data/v2/news/";
    

    @Value("${API_KEY}")
    private String apiKey;
    //private String LatestNewsArticlesEndpoint;
    //private String News;

    public List<String> getArticles(String news) {
        return getArticles(news);

    }

    public List<String> getArticles (String news, String latestNewsArticlesEndpoint) {
        List<String> result = new LinkedList<>();
    
        

        String articleUrl = UriComponentsBuilder.fromUriString(LATEST_NEWS)
        .queryParam("key", news)
        .queryParam("cat", latestNewsArticlesEndpoint)
        .queryParam("api_key", apiKey)
        .toUriString();

        RequestEntity<Void> req = RequestEntity.get(articleUrl).build();

        RestTemplate template = new RestTemplate();
        ResponseEntity<String> resp;

        try {
            resp = template.exchange(req, String.class);
        } catch (Exception ex) {
            ex.printStackTrace();


        }
        return result;


        
    }


    


}

