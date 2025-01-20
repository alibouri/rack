package com.apollographql.apollo.api.json.internal;

import Nb.j;
import com.apollographql.apollo.api.Upload;
import com.apollographql.apollo.api.json.JsonNumber;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public final class FileUploadAwareJsonWriter implements JsonWriter {
    private final Map uploads;
    private final JsonWriter wrappedWriter;

    public FileUploadAwareJsonWriter(JsonWriter jsonWriter0) {
        j.f(jsonWriter0, "wrappedWriter");
        super();
        this.wrappedWriter = jsonWriter0;
        this.uploads = new LinkedHashMap();
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter beginArray() {
        return this.beginArray();
    }

    public FileUploadAwareJsonWriter beginArray() {
        this.wrappedWriter.beginArray();
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter beginObject() {
        return this.beginObject();
    }

    public FileUploadAwareJsonWriter beginObject() {
        this.wrappedWriter.beginObject();
        return this;
    }

    @Override
    public void close() {
        this.wrappedWriter.close();
    }

    public final Map collectedUploads() {
        return this.uploads;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter endArray() {
        return this.endArray();
    }

    public FileUploadAwareJsonWriter endArray() {
        this.wrappedWriter.endArray();
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter endObject() {
        return this.endObject();
    }

    public FileUploadAwareJsonWriter endObject() {
        this.wrappedWriter.endObject();
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public void flush() {
        this.wrappedWriter.flush();
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public String getPath() {
        return this.wrappedWriter.getPath();
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter name(String s) {
        return this.name(s);
    }

    public FileUploadAwareJsonWriter name(String s) {
        j.f(s, "name");
        this.wrappedWriter.name(s);
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter nullValue() {
        return this.nullValue();
    }

    public FileUploadAwareJsonWriter nullValue() {
        this.wrappedWriter.nullValue();
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(double f) {
        return this.value(f);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(int v) {
        return this.value(v);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(long v) {
        return this.value(v);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(Upload upload0) {
        return this.value(upload0);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(JsonNumber jsonNumber0) {
        return this.value(jsonNumber0);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(String s) {
        return this.value(s);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(boolean z) {
        return this.value(z);
    }

    public FileUploadAwareJsonWriter value(double f) {
        this.wrappedWriter.value(f);
        return this;
    }

    public FileUploadAwareJsonWriter value(int v) {
        this.wrappedWriter.value(v);
        return this;
    }

    public FileUploadAwareJsonWriter value(long v) {
        this.wrappedWriter.value(v);
        return this;
    }

    public FileUploadAwareJsonWriter value(Upload upload0) {
        j.f(upload0, "value");
        String s = this.wrappedWriter.getPath();
        this.uploads.put(s, upload0);
        this.wrappedWriter.nullValue();
        return this;
    }

    public FileUploadAwareJsonWriter value(JsonNumber jsonNumber0) {
        j.f(jsonNumber0, "value");
        this.wrappedWriter.value(jsonNumber0);
        return this;
    }

    public FileUploadAwareJsonWriter value(String s) {
        j.f(s, "value");
        this.wrappedWriter.value(s);
        return this;
    }

    public FileUploadAwareJsonWriter value(boolean z) {
        this.wrappedWriter.value(z);
        return this;
    }
}

