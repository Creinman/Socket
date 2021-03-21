import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.CloseableHttpResponse;
import org.apache.http.impl.*;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        public static final String REMOTE_SERVICE_URI = "https://cat-fact.herokuapp.com/facts";
        public static ObjectMapper mapper = new ObjectMapper();
        HttpGet request = new HttpGet(REMOTE_SERVICE_URI);
        CloseableHttpResponse response = httpClient.execute(request);
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)    // максимальное время ожидание подключения к серверу
                        .setSocketTimeout(30000)    // максимальное время ожидания получения данных
                        .setRedirectsEnabled(false) // возможность следовать редиректу в ответе
                        .build())
                .build();

        List<Post> posts = mapper.readValue(
                response.getEntity().getContent(), new
                        TypeReference<List<Post>>() {});

        posts.forEach(System.out::println);

    }
}
