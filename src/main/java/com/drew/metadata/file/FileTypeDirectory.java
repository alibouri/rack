package com.drew.metadata.file;

import c4.a;
import com.drew.metadata.b;
import java.util.HashMap;

public class FileTypeDirectory extends b {
    public static final int TAG_DETECTED_FILE_MIME_TYPE = 3;
    public static final int TAG_DETECTED_FILE_TYPE_LONG_NAME = 2;
    public static final int TAG_DETECTED_FILE_TYPE_NAME = 1;
    public static final int TAG_EXPECTED_FILE_NAME_EXTENSION = 4;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        FileTypeDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Detected File Type Name", 2, "Detected File Type Long Name");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Detected MIME Type", 4, "Expected File Name Extension");
    }

    public FileTypeDirectory(a a0) {
        this.setDescriptor(new r4.a(0, this));
        this.setString(1, a0.X);
        this.setString(2, a0.Y);
        String s = a0.Z;
        if(s != null) {
            this.setString(3, s);
        }
        String s1 = null;
        String[] arr_s = a0.b0;
        if((arr_s == null || arr_s.length == 0 ? null : arr_s[0]) != null) {
            if(arr_s != null && arr_s.length != 0) {
                s1 = arr_s[0];
            }
            this.setString(4, s1);
        }
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "File Type";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return FileTypeDirectory._tagNameMap;
    }
}

