package com.apollographql.apollo.api.http;

import Ab.e;
import Ab.t;
import Ec.k;
import Ec.m;
import Nb.j;
import Vb.q;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.http.internal.UrlEncodeKt;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.MapJsonWriter;
import com.apollographql.apollo.api.json.internal.FileUploadAwareJsonWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DefaultHttpRequestComposer implements HttpRequestComposer {
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final String access$buildGetUrl(Companion defaultHttpRequestComposer$Companion0, String s, Operation operation0, CustomScalarAdapters customScalarAdapters0, boolean z, boolean z1) {
            return defaultHttpRequestComposer$Companion0.buildGetUrl(s, operation0, customScalarAdapters0, z, z1);
        }

        public final String appendQueryParameters(String s, Map map0) {
            j.f(s, "<this>");
            j.f(map0, "parameters");
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(s);
            boolean z = Vb.j.R(s, "?", false);
            for(Object object0: map0.entrySet()) {
                if(z) {
                    stringBuilder0.append('&');
                }
                else {
                    stringBuilder0.append('?');
                    z = true;
                }
                stringBuilder0.append(UrlEncodeKt.urlEncode(((String)((Map.Entry)object0).getKey())));
                stringBuilder0.append('=');
                stringBuilder0.append(UrlEncodeKt.urlEncode(((String)((Map.Entry)object0).getValue())));
            }
            String s1 = stringBuilder0.toString();
            j.e(s1, "toString(...)");
            return s1;
        }

        private final Function1 apqExtensionsWriter(String s, boolean z) {
            return new a(z, s);
        }

        private static final t apqExtensionsWriter$lambda$4(boolean z, String s, JsonWriter jsonWriter0) {
            j.f(jsonWriter0, "<this>");
            if(z) {
                jsonWriter0.name("extensions");
                jsonWriter0.beginObject();
                jsonWriter0.name("persistedQuery");
                jsonWriter0.beginObject();
                jsonWriter0.name("version").value(1);
                jsonWriter0.name("sha256Hash").value(s);
                jsonWriter0.endObject();
                jsonWriter0.endObject();
            }
            return t.a;
        }

        private final String buildGetUrl(String s, Operation operation0, CustomScalarAdapters customScalarAdapters0, boolean z, boolean z1) {
            return this.appendQueryParameters(s, this.composeGetParams(operation0, customScalarAdapters0, z, z1));
        }

        public final m buildParamsMap(Operation operation0, CustomScalarAdapters customScalarAdapters0, boolean z, boolean z1) {
            j.f(operation0, "operation");
            j.f(customScalarAdapters0, "customScalarAdapters");
            Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
            BufferedSinkJsonWriter bufferedSinkJsonWriter0 = new BufferedSinkJsonWriter(j0, null);
            String s = z1 ? operation0.document() : null;
            DefaultHttpRequestComposer.Companion.composePostParams(bufferedSinkJsonWriter0, operation0, customScalarAdapters0, z, s);
            return j0.N(j0.Y);
        }

        public final HttpBody buildPostBody(Operation operation0, CustomScalarAdapters customScalarAdapters0, String s, Function1 function10) {
            j.f(operation0, "operation");
            j.f(customScalarAdapters0, "customScalarAdapters");
            j.f(function10, "extensionsWriter");
            Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
            BufferedSinkJsonWriter bufferedSinkJsonWriter0 = new BufferedSinkJsonWriter(j0, null);
            Map map0 = DefaultHttpRequestComposer.Companion.composePostParams(bufferedSinkJsonWriter0, operation0, customScalarAdapters0, s, function10);
            m m0 = j0.N(j0.Y);
            return map0.isEmpty() ? new HttpBody() {
                private final long contentLength;
                private final String contentType;

                {
                    this.contentType = "application/json";
                    this.contentLength = (long)m0.e();
                }

                @Override  // com.apollographql.apollo.api.http.HttpBody
                public long getContentLength() {
                    return this.contentLength;
                }

                @Override  // com.apollographql.apollo.api.http.HttpBody
                public String getContentType() {
                    return this.contentType;
                }

                @Override  // com.apollographql.apollo.api.http.HttpBody
                public void writeTo(k k0) {
                    j.f(k0, "bufferedSink");
                    k0.I(this.$operationByteString);
                }
            } : new UploadsHttpBody(map0, m0);
        }

        @Ab.a
        public final HttpBody buildPostBody(Operation operation0, CustomScalarAdapters customScalarAdapters0, boolean z, String s) {
            j.f(operation0, "operation");
            j.f(customScalarAdapters0, "customScalarAdapters");
            return this.buildPostBody(operation0, customScalarAdapters0, s, this.apqExtensionsWriter(operation0.id(), z));
        }

        private final Map composeGetParams(Operation operation0, CustomScalarAdapters customScalarAdapters0, boolean z, boolean z1) {
            Map map0 = new LinkedHashMap();
            map0.put("operationName", operation0.name());
            Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
            FileUploadAwareJsonWriter fileUploadAwareJsonWriter0 = new FileUploadAwareJsonWriter(new BufferedSinkJsonWriter(j0, null));
            fileUploadAwareJsonWriter0.beginObject();
            operation0.serializeVariables(fileUploadAwareJsonWriter0, customScalarAdapters0, false);
            fileUploadAwareJsonWriter0.endObject();
            if(!fileUploadAwareJsonWriter0.collectedUploads().isEmpty()) {
                throw new IllegalStateException("FileUpload and Http GET are not supported at the same time");
            }
            map0.put("variables", j0.B());
            if(z1) {
                map0.put("query", operation0.document());
            }
            if(z) {
                Ec.j j1 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
                BufferedSinkJsonWriter bufferedSinkJsonWriter0 = new BufferedSinkJsonWriter(j1, null);
                bufferedSinkJsonWriter0.beginObject();
                bufferedSinkJsonWriter0.name("persistedQuery");
                bufferedSinkJsonWriter0.beginObject();
                bufferedSinkJsonWriter0.name("version").value(1);
                bufferedSinkJsonWriter0.name("sha256Hash").value(operation0.id());
                bufferedSinkJsonWriter0.endObject();
                bufferedSinkJsonWriter0.endObject();
                map0.put("extensions", j1.B());
            }
            return map0;
        }

        public final Map composePayload(ApolloRequest apolloRequest0) {
            j.f(apolloRequest0, "apolloRequest");
            Operation operation0 = apolloRequest0.getOperation();
            Boolean boolean0 = apolloRequest0.getSendApqExtensions();
            boolean z = boolean0 == null ? false : boolean0.booleanValue();
            Boolean boolean1 = apolloRequest0.getSendDocument();
            boolean z1 = boolean1 == null ? true : boolean1.booleanValue();
            CustomScalarAdapters customScalarAdapters0 = (CustomScalarAdapters)apolloRequest0.getExecutionContext().get(CustomScalarAdapters.Key);
            if(customScalarAdapters0 == null) {
                customScalarAdapters0 = CustomScalarAdapters.Empty;
            }
            String s = z1 ? operation0.document() : null;
            MapJsonWriter mapJsonWriter0 = new MapJsonWriter();
            DefaultHttpRequestComposer.Companion.composePostParams(mapJsonWriter0, operation0, customScalarAdapters0, z, s);
            Object object0 = mapJsonWriter0.root();
            j.d(object0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return (Map)object0;
        }

        private final Map composePostParams(JsonWriter jsonWriter0, Operation operation0, CustomScalarAdapters customScalarAdapters0, String s, Function1 function10) {
            jsonWriter0.beginObject();
            jsonWriter0.name("operationName");
            jsonWriter0.value(operation0.name());
            jsonWriter0.name("variables");
            FileUploadAwareJsonWriter fileUploadAwareJsonWriter0 = new FileUploadAwareJsonWriter(jsonWriter0);
            fileUploadAwareJsonWriter0.beginObject();
            operation0.serializeVariables(fileUploadAwareJsonWriter0, customScalarAdapters0, false);
            fileUploadAwareJsonWriter0.endObject();
            Map map0 = fileUploadAwareJsonWriter0.collectedUploads();
            if(s != null) {
                jsonWriter0.name("query");
                jsonWriter0.value(s);
            }
            function10.n(jsonWriter0);
            jsonWriter0.endObject();
            return map0;
        }

        private final Map composePostParams(JsonWriter jsonWriter0, Operation operation0, CustomScalarAdapters customScalarAdapters0, boolean z, String s) {
            return this.composePostParams(jsonWriter0, operation0, customScalarAdapters0, s, this.apqExtensionsWriter(operation0.id(), z));
        }

        public final String getHEADER_ACCEPT_NAME() {
            return DefaultHttpRequestComposer.HEADER_ACCEPT_NAME;
        }

        public final String getHEADER_ACCEPT_VALUE_DEFER() {
            return DefaultHttpRequestComposer.HEADER_ACCEPT_VALUE_DEFER;
        }

        public final String getHEADER_ACCEPT_VALUE_MULTIPART() {
            return DefaultHttpRequestComposer.HEADER_ACCEPT_VALUE_MULTIPART;
        }

        public final String getHEADER_APOLLO_OPERATION_ID() {
            return DefaultHttpRequestComposer.HEADER_APOLLO_OPERATION_ID;
        }

        @Ab.a
        public static void getHEADER_APOLLO_OPERATION_ID$annotations() {
        }

        public final String getHEADER_APOLLO_OPERATION_NAME() {
            return DefaultHttpRequestComposer.HEADER_APOLLO_OPERATION_NAME;
        }

        @Ab.a
        public static void getHEADER_APOLLO_OPERATION_NAME$annotations() {
        }

        public final String getHEADER_APOLLO_REQUIRE_PREFLIGHT$apollo_api() {
            return DefaultHttpRequestComposer.HEADER_APOLLO_REQUIRE_PREFLIGHT;
        }
    }

    public final class WhenMappings {
        static {
            int[] arr_v = new int[HttpMethod.values().length];
            try {
                arr_v[HttpMethod.Get.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[HttpMethod.Post.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final Companion Companion;
    private static final String HEADER_ACCEPT_NAME;
    private static final String HEADER_ACCEPT_VALUE_DEFER;
    private static final String HEADER_ACCEPT_VALUE_MULTIPART;
    private static final String HEADER_APOLLO_OPERATION_ID;
    private static final String HEADER_APOLLO_OPERATION_NAME;
    private static final String HEADER_APOLLO_REQUIRE_PREFLIGHT;
    private final String serverUrl;

    static {
        DefaultHttpRequestComposer.Companion = new Companion(null);
        DefaultHttpRequestComposer.HEADER_APOLLO_OPERATION_ID = "X-APOLLO-OPERATION-ID";
        DefaultHttpRequestComposer.HEADER_APOLLO_OPERATION_NAME = "X-APOLLO-OPERATION-NAME";
        DefaultHttpRequestComposer.HEADER_APOLLO_REQUIRE_PREFLIGHT = "Apollo-Require-Preflight";
        DefaultHttpRequestComposer.HEADER_ACCEPT_NAME = "Accept";
        DefaultHttpRequestComposer.HEADER_ACCEPT_VALUE_DEFER = "multipart/mixed;deferSpec=20220824, application/json";
        DefaultHttpRequestComposer.HEADER_ACCEPT_VALUE_MULTIPART = "multipart/mixed;subscriptionSpec=1.0, application/json";
    }

    public DefaultHttpRequestComposer(String s) {
        j.f(s, "serverUrl");
        super();
        this.serverUrl = s;
    }

    @Override  // com.apollographql.apollo.api.http.HttpRequestComposer
    public HttpRequest compose(ApolloRequest apolloRequest0) {
        j.f(apolloRequest0, "apolloRequest");
        Operation operation0 = apolloRequest0.getOperation();
        CustomScalarAdapters customScalarAdapters0 = (CustomScalarAdapters)apolloRequest0.getExecutionContext().get(CustomScalarAdapters.Key);
        if(customScalarAdapters0 == null) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        ArrayList arrayList0 = new ArrayList();
        if(apolloRequest0.getOperation() instanceof Subscription) {
            arrayList0.add(new HttpHeader(DefaultHttpRequestComposer.HEADER_ACCEPT_NAME, DefaultHttpRequestComposer.HEADER_ACCEPT_VALUE_MULTIPART));
        }
        else {
            arrayList0.add(new HttpHeader(DefaultHttpRequestComposer.HEADER_ACCEPT_NAME, DefaultHttpRequestComposer.HEADER_ACCEPT_VALUE_DEFER));
        }
        if(apolloRequest0.getHttpHeaders() != null) {
            arrayList0.addAll(apolloRequest0.getHttpHeaders());
        }
        Boolean boolean0 = apolloRequest0.getSendApqExtensions();
        boolean z = boolean0 == null ? false : boolean0.booleanValue();
        Boolean boolean1 = apolloRequest0.getSendDocument();
        boolean z1 = boolean1 == null ? true : boolean1.booleanValue();
        switch(WhenMappings.$EnumSwitchMapping$0[(apolloRequest0.getHttpMethod() == null ? HttpMethod.Post : apolloRequest0.getHttpMethod()).ordinal()]) {
            case 1: {
                String s = Companion.access$buildGetUrl(DefaultHttpRequestComposer.Companion, this.serverUrl, operation0, customScalarAdapters0, z, z1);
                return new Builder(HttpMethod.Get, s).addHeader(DefaultHttpRequestComposer.HEADER_APOLLO_REQUIRE_PREFLIGHT, "true").addHeaders(arrayList0).addExecutionContext(apolloRequest0.getExecutionContext()).build();
            }
            case 2: {
                String s1 = z1 ? operation0.document() : null;
                HttpBody httpBody0 = DefaultHttpRequestComposer.Companion.buildPostBody(operation0, customScalarAdapters0, z, s1);
                Builder httpRequest$Builder0 = new Builder(HttpMethod.Post, this.serverUrl).body(httpBody0);
                return q.O(httpBody0.getContentType(), "multipart/form-data", false) ? httpRequest$Builder0.addHeader(DefaultHttpRequestComposer.HEADER_APOLLO_REQUIRE_PREFLIGHT, "true").addHeaders(arrayList0).addExecutionContext(apolloRequest0.getExecutionContext()).build() : httpRequest$Builder0.addHeaders(arrayList0).addExecutionContext(apolloRequest0.getExecutionContext()).build();
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }
}

