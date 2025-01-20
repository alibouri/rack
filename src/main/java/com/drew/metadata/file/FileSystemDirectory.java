package com.drew.metadata.file;

import com.drew.metadata.b;
import java.util.HashMap;

public class FileSystemDirectory extends b {
    public static final int TAG_FILE_MODIFIED_DATE = 3;
    public static final int TAG_FILE_NAME = 1;
    public static final int TAG_FILE_SIZE = 2;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        FileSystemDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "File Name", 2, "File Size");
        hashMap0.put(3, "File Modified Date");
    }

    public FileSystemDirectory() {
        this.setDescriptor(new A4.b(29, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "File";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return FileSystemDirectory._tagNameMap;
    }
}

