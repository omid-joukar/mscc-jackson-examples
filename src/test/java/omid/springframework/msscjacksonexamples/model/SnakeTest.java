package omid.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@JsonTest
@ActiveProfiles("snake")
public class SnakeTest extends BaseTest {
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto bearDto = getDto();
        String json = objectMapper.writeValueAsString(bearDto);
        System.out.println(json);
    }
}
