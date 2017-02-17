package pl.pragmatists.trainings.infrastructure;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("objectMapper")
public class CustomObjectMapper extends ObjectMapper {

    public CustomObjectMapper() {
        super();
        this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.setVisibility(PropertyAccessor.FIELD, Visibility.NON_PRIVATE);
    }

}
