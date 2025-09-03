package finalmission.service;

import finalmission.domain.vo.LolName;

public interface RiotRestClient {

    boolean existsLolName(final LolName name);
}
