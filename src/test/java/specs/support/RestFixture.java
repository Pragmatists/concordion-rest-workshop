package specs.support;

import org.chiknrice.test.SpringifiedConcordionRunner;
import org.concordion.api.FullOGNL;
import org.concordion.api.extension.Extension;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import pl.pragmatists.concordion.rest.RestExtension;
import pl.pragmatists.trainings.ConcordionRestApplication;

@RunWith(SpringifiedConcordionRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {ConcordionRestApplication.class})
@FullOGNL
public abstract class RestFixture {

    @LocalServerPort
    protected int port;

    @Extension
    public RestExtension rest = new RestExtension().includeBootstrap().enableCodeMirror();

    @Before
    public void detectPort() {
        rest.port(port);
    }

}
