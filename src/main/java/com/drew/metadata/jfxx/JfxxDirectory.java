package com.drew.metadata.jfxx;

import com.drew.metadata.b;
import java.util.HashMap;
import r4.a;

public class JfxxDirectory extends b {
    public static final int TAG_EXTENSION_CODE = 5;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        JfxxDirectory._tagNameMap = hashMap0;
        hashMap0.put(5, "Extension Code");
    }

    public JfxxDirectory() {
        this.setDescriptor(new a(11, this));
    }

    public int getExtensionCode() {
        return this.getInt(5);
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "JFXX";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return JfxxDirectory._tagNameMap;
    }
}

