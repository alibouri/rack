package com.apollographql.apollo.api.http;

import Nb.j;
import com.apollographql.apollo.api.ApolloRequest;
import java.util.Map;

public final class DefaultWebSocketPayloadComposer implements WebSocketPayloadComposer {
    @Override  // com.apollographql.apollo.api.http.WebSocketPayloadComposer
    public Map compose(ApolloRequest apolloRequest0) {
        j.f(apolloRequest0, "apolloRequest");
        return DefaultHttpRequestComposer.Companion.composePayload(apolloRequest0);
    }
}

