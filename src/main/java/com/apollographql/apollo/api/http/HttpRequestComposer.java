package com.apollographql.apollo.api.http;

import com.apollographql.apollo.api.ApolloRequest;

public interface HttpRequestComposer {
    HttpRequest compose(ApolloRequest arg1);
}

