import static org.junit.Assert.*;
import org.junit.Test;

public final class RestResourceTest {

    @Test
    public void getResourceList() {
        final RestResource resource =
            new RestResource("https://api.github.com/repos/romero/java-rest-client/issues");
        final String json = resource.get();

        assertFalse(json.isEmpty());
    }

    @Test
    public void getSingleResource() {
        final RestResource resource =
            new RestResource("https://api.github.com/repos/romero/java-rest-client/issues/1");
        final String json = resource.get();

        assertFalse(json.isEmpty());
    }
}
