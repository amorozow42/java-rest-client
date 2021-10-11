import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public final class RestResource {

    private final String url;

    public RestResource(final String url) {
        this.url = url;
    }

    public String get() {
        try {
            final HttpClient client = HttpClient
                .newBuilder()
                .build();

            final HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

            return client
                .send(request, HttpResponse.BodyHandlers.ofString())
                .body();
        } catch (Exception e) {
            throw new RuntimeException("Can not get resource", e);
        }
    }
}
