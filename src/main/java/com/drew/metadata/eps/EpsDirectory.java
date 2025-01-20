package com.drew.metadata.eps;

import com.drew.metadata.b;
import java.util.HashMap;

public class EpsDirectory extends b {
    public static final int TAG_AUTHOR = 2;
    public static final int TAG_BOUNDING_BOX = 3;
    public static final int TAG_COLOR_TYPE = 30;
    public static final int TAG_CONTINUE_LINE = 36;
    public static final int TAG_COPYRIGHT = 4;
    public static final int TAG_CREATION_DATE = 5;
    public static final int TAG_CREATOR = 6;
    public static final int TAG_DOCUMENT_DATA = 16;
    public static final int TAG_DSC_VERSION = 1;
    public static final int TAG_EMULATION = 17;
    public static final int TAG_EXTENSIONS = 18;
    public static final int TAG_FOR = 7;
    public static final int TAG_IMAGE_DATA = 8;
    public static final int TAG_IMAGE_HEIGHT = 29;
    public static final int TAG_IMAGE_WIDTH = 28;
    public static final int TAG_KEYWORDS = 9;
    public static final int TAG_LANGUAGE_LEVEL = 19;
    public static final int TAG_MODIFY_DATE = 10;
    public static final int TAG_OPERATOR_INTERNVENTION = 22;
    public static final int TAG_OPERATOR_MESSAGE = 23;
    public static final int TAG_ORIENTATION = 20;
    public static final int TAG_PAGES = 11;
    public static final int TAG_PAGE_ORDER = 21;
    public static final int TAG_PROOF_MODE = 24;
    public static final int TAG_RAM_SIZE = 0x1F;
    public static final int TAG_REQUIREMENTS = 25;
    public static final int TAG_ROUTING = 12;
    public static final int TAG_SUBJECT = 13;
    public static final int TAG_TIFF_PREVIEW_OFFSET = 33;
    public static final int TAG_TIFF_PREVIEW_SIZE = 0x20;
    public static final int TAG_TITLE = 14;
    public static final int TAG_VERSION = 15;
    public static final int TAG_VM_LOCATION = 26;
    public static final int TAG_VM_USAGE = 27;
    public static final int TAG_WMF_PREVIEW_OFFSET = 35;
    public static final int TAG_WMF_PREVIEW_SIZE = 34;
    static final HashMap _tagIntegerMap;
    static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        EpsDirectory._tagNameMap = hashMap0;
        HashMap hashMap1 = new HashMap();
        EpsDirectory._tagIntegerMap = hashMap1;
        Integer integer0 = 1;
        hashMap1.put("%!PS-Adobe-", integer0);
        Integer integer1 = 2;
        hashMap1.put("%%Author", integer1);
        Integer integer2 = 3;
        hashMap1.put("%%BoundingBox", integer2);
        Integer integer3 = 4;
        hashMap1.put("%%Copyright", integer3);
        Integer integer4 = 5;
        hashMap1.put("%%CreationDate", integer4);
        Integer integer5 = 6;
        hashMap1.put("%%Creator", integer5);
        Integer integer6 = 7;
        hashMap1.put("%%For", integer6);
        Integer integer7 = 8;
        hashMap1.put("%ImageData", integer7);
        Integer integer8 = 9;
        hashMap1.put("%%Keywords", integer8);
        Integer integer9 = 10;
        hashMap1.put("%%ModDate", integer9);
        Integer integer10 = 11;
        hashMap1.put("%%Pages", integer10);
        Integer integer11 = 12;
        hashMap1.put("%%Routing", integer11);
        Integer integer12 = 13;
        hashMap1.put("%%Subject", integer12);
        Integer integer13 = 14;
        hashMap1.put("%%Title", integer13);
        Integer integer14 = 15;
        hashMap1.put("%%Version", integer14);
        hashMap1.put("%%DocumentData", 16);
        com.apollographql.apollo.api.b.u(17, hashMap1, "%%Emulation", 18, "%%Extensions");
        com.apollographql.apollo.api.b.u(19, hashMap1, "%%LanguageLevel", 20, "%%Orientation");
        com.apollographql.apollo.api.b.u(21, hashMap1, "%%PageOrder", 22, "%%OperatorIntervention");
        com.apollographql.apollo.api.b.u(23, hashMap1, "%%OperatorMessage", 24, "%%ProofMode");
        com.apollographql.apollo.api.b.u(25, hashMap1, "%%Requirements", 26, "%%VMlocation");
        com.apollographql.apollo.api.b.u(27, hashMap1, "%%VMusage", 28, "Image Width");
        com.apollographql.apollo.api.b.u(29, hashMap1, "Image Height", 30, "Color Type");
        com.apollographql.apollo.api.b.u(0x1F, hashMap1, "Ram Size", 0x20, "TIFFPreview");
        com.apollographql.apollo.api.b.u(33, hashMap1, "TIFFPreviewOffset", 34, "WMFPreview");
        com.apollographql.apollo.api.b.u(35, hashMap1, "WMFPreviewOffset", 36, "%%+");
        hashMap0.put(36, "Line Continuation");
        hashMap0.put(integer2, "Bounding Box");
        hashMap0.put(integer3, "Copyright");
        hashMap0.put(16, "Document Data");
        com.apollographql.apollo.api.b.z(17, hashMap0, "Emulation", 18, "Extensions");
        com.apollographql.apollo.api.b.z(19, hashMap0, "Language Level", 20, "Orientation");
        hashMap0.put(21, "Page Order");
        hashMap0.put(integer14, "Version");
        hashMap0.put(integer7, "Image Data");
        hashMap0.put(28, "Image Width");
        com.apollographql.apollo.api.b.z(29, hashMap0, "Image Height", 30, "Color Type");
        hashMap0.put(0x1F, "Ram Size");
        hashMap0.put(integer5, "Creator");
        hashMap0.put(integer4, "Creation Date");
        hashMap0.put(integer6, "For");
        hashMap0.put(25, "Requirements");
        hashMap0.put(integer11, "Routing");
        hashMap0.put(integer13, "Title");
        hashMap0.put(integer0, "DSC Version");
        hashMap0.put(integer10, "Pages");
        hashMap0.put(22, "Operator Intervention");
        com.apollographql.apollo.api.b.z(23, hashMap0, "Operator Message", 24, "Proof Mode");
        com.apollographql.apollo.api.b.z(26, hashMap0, "VM Location", 27, "VM Usage");
        hashMap0.put(integer1, "Author");
        hashMap0.put(integer8, "Keywords");
        hashMap0.put(integer9, "Modify Date");
        hashMap0.put(integer12, "Subject");
        hashMap0.put(0x20, "TIFF Preview Size");
        com.apollographql.apollo.api.b.z(33, hashMap0, "TIFF Preview Offset", 34, "WMF Preview Size");
        hashMap0.put(35, "WMF Preview Offset");
    }

    public EpsDirectory() {
        this.setDescriptor(new A4.b(13, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "EPS";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return EpsDirectory._tagNameMap;
    }
}

