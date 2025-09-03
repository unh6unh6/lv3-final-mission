package finalmission.service;

import finalmission.domain.vo.LolName;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MockRiotRestClientImpl implements RiotRestClient {

    @Override
    public boolean existsLolName(final LolName name) {
        final LolName lolName = new LolName("누신누황123213", "nunu");
        return !name.equals(lolName);
    }
}
