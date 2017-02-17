package pl.pragmatists.trainings.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class HelloWorldEndpoint {

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/api/hello",
            produces = APPLICATION_JSON_VALUE
    )
    public Hello hello() {
        return new Hello("World");
    }

    class Hello {
        String hello;

        public Hello(String hello) {
            this.hello = hello;
        }

    }
}
