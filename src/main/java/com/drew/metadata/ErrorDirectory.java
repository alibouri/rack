package com.drew.metadata;

import M.J;
import java.util.HashMap;

public final class ErrorDirectory extends b {
    public ErrorDirectory() {
    }

    public ErrorDirectory(String s) {
        super.addError(s);
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Error";
    }

    @Override  // com.drew.metadata.b
    public String getTagName(int v) {
        return "";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return new HashMap();
    }

    @Override  // com.drew.metadata.b
    public boolean hasTagName(int v) {
        return false;
    }

    @Override  // com.drew.metadata.b
    public void setObject(int v, Object object0) {
        throw new UnsupportedOperationException(J.e("Cannot add value to ", ErrorDirectory.class.getName(), "."));
    }
}

