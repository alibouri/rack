package com.apollographql.apollo.api.json;

import com.apollographql.apollo.api.Upload;
import java.io.Closeable;

public interface JsonWriter extends Closeable {
    JsonWriter beginArray();

    JsonWriter beginObject();

    JsonWriter endArray();

    JsonWriter endObject();

    void flush();

    String getPath();

    JsonWriter name(String arg1);

    JsonWriter nullValue();

    JsonWriter value(double arg1);

    JsonWriter value(int arg1);

    JsonWriter value(long arg1);

    JsonWriter value(Upload arg1);

    JsonWriter value(JsonNumber arg1);

    JsonWriter value(String arg1);

    JsonWriter value(boolean arg1);
}

