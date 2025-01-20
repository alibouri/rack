package com.apollographql.apollo.api.http;

import com.apollographql.apollo.api.ApolloRequest;
import java.util.Map;

public interface WebSocketPayloadComposer {
    Map compose(ApolloRequest arg1);
}

