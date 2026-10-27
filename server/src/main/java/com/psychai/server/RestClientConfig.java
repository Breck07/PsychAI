package main.java.com.psychai.server;

/*
    Configuration Class for restClients
*/
@Configuration
public class RestClientConfig {
    @value("${ai.api.key}")
    String AI_API_KEY;

    // Client for communicating with AI model
    @Bean(name = "PythonClient")
    public RestClient restClient(RestClient.builder builder){
        return builder
            .baseUrl("http://localhost:8080/pymodel")
            .defualtHeader("X-API-Key", AI_API_KEY)
            .build();
    }
}
