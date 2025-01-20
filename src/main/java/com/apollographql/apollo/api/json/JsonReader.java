package com.apollographql.apollo.api.json;

import Gb.a;
import Gb.b;
import java.io.Closeable;
import java.util.List;

public interface JsonReader extends Closeable {
    public static enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        LONG,
        BOOLEAN,
        NULL,
        END_DOCUMENT,
        ANY;

        static {
            Token.$VALUES = arr_jsonReader$Token;
            Token.$ENTRIES = new b(arr_jsonReader$Token);
        }

        public static a getEntries() {
            return Token.$ENTRIES;
        }
    }

    JsonReader beginArray();

    JsonReader beginObject();

    JsonReader endArray();

    JsonReader endObject();

    List getPath();

    boolean hasNext();

    boolean nextBoolean();

    double nextDouble();

    int nextInt();

    long nextLong();

    String nextName();

    Void nextNull();

    JsonNumber nextNumber();

    String nextString();

    Token peek();

    void rewind();

    int selectName(List arg1);

    void skipValue();
}

