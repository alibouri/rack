package com.drew.metadata.mov.metadata;

import C4.a;
import com.apollographql.apollo.api.b;
import com.drew.metadata.mov.QuickTimeDirectory;
import java.util.HashMap;

public class QuickTimeMetadataDirectory extends QuickTimeDirectory {
    public static final int TAG_ALBUM = 0x500;
    public static final int TAG_ARTIST = 0x501;
    public static final int TAG_ARTWORK = 0x502;
    public static final int TAG_AUTHOR = 0x503;
    public static final int TAG_COLLECTION_USER = 0x512;
    public static final int TAG_COMMENT = 0x504;
    public static final int TAG_CONTENT_IDENTIFIER = 1308;
    public static final int TAG_COPYRIGHT = 0x505;
    public static final int TAG_CREATION_DATE = 0x506;
    public static final int TAG_DESCRIPTION = 0x507;
    public static final int TAG_DIRECTION_FACING = 1305;
    public static final int TAG_DIRECTION_MOTION = 1306;
    public static final int TAG_DIRECTOR = 0x508;
    public static final int TAG_DISPLAY_NAME = 1307;
    public static final int TAG_GENRE = 0x50A;
    public static final int TAG_INFORMATION = 0x50B;
    public static final int TAG_KEYWORDS = 0x50C;
    public static final int TAG_LOCATION_BODY = 1301;
    public static final int TAG_LOCATION_DATE = 1304;
    public static final int TAG_LOCATION_ISO6709 = 0x50D;
    public static final int TAG_LOCATION_NAME = 1300;
    public static final int TAG_LOCATION_NOTE = 1302;
    public static final int TAG_LOCATION_ROLE = 1303;
    public static final int TAG_MAKE = 1309;
    public static final int TAG_MODEL = 1310;
    public static final int TAG_ORIGINATING_SIGNATURE = 0x51F;
    public static final int TAG_PIXEL_DENSITY = 0x520;
    public static final int TAG_PRODUCER = 0x50E;
    public static final int TAG_PUBLISHER = 0x50F;
    public static final int TAG_RATING_USER = 0x513;
    public static final int TAG_SOFTWARE = 0x510;
    public static final int TAG_TITLE = 0x509;
    public static final int TAG_YEAR = 0x511;
    static final HashMap _tagIntegerMap;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        QuickTimeMetadataDirectory._tagNameMap = hashMap0;
        HashMap hashMap1 = new HashMap();
        QuickTimeMetadataDirectory._tagIntegerMap = hashMap1;
        Integer integer0 = 0x500;
        hashMap1.put("com.apple.quicktime.album", integer0);
        Integer integer1 = 0x501;
        hashMap1.put("com.apple.quicktime.artist", integer1);
        Integer integer2 = 0x502;
        hashMap1.put("com.apple.quicktime.artwork", integer2);
        Integer integer3 = 0x503;
        hashMap1.put("com.apple.quicktime.author", integer3);
        Integer integer4 = 0x504;
        hashMap1.put("com.apple.quicktime.comment", integer4);
        Integer integer5 = 0x505;
        hashMap1.put("com.apple.quicktime.copyright", integer5);
        Integer integer6 = 0x506;
        hashMap1.put("com.apple.quicktime.creationdate", integer6);
        Integer integer7 = 0x507;
        hashMap1.put("com.apple.quicktime.description", integer7);
        Integer integer8 = 0x508;
        hashMap1.put("com.apple.quicktime.director", integer8);
        Integer integer9 = 0x509;
        hashMap1.put("com.apple.quicktime.title", integer9);
        Integer integer10 = 0x50A;
        hashMap1.put("com.apple.quicktime.genre", integer10);
        Integer integer11 = 0x50B;
        hashMap1.put("com.apple.quicktime.information", integer11);
        Integer integer12 = 0x50C;
        hashMap1.put("com.apple.quicktime.keywords", integer12);
        Integer integer13 = 0x50D;
        hashMap1.put("com.apple.quicktime.location.ISO6709", integer13);
        Integer integer14 = 0x50E;
        hashMap1.put("com.apple.quicktime.producer", integer14);
        hashMap1.put("com.apple.quicktime.publisher", 0x50F);
        b.u(0x510, hashMap1, "com.apple.quicktime.software", 0x511, "com.apple.quicktime.year");
        b.u(0x512, hashMap1, "com.apple.quicktime.collection.user", 0x513, "com.apple.quicktime.rating.user");
        b.u(1300, hashMap1, "com.apple.quicktime.location.name", 1301, "com.apple.quicktime.location.body");
        b.u(1302, hashMap1, "com.apple.quicktime.location.note", 1303, "com.apple.quicktime.location.role");
        b.u(1304, hashMap1, "com.apple.quicktime.location.date", 1305, "com.apple.quicktime.direction.facing");
        b.u(1306, hashMap1, "com.apple.quicktime.direction.motion", 1307, "com.apple.quicktime.displayname");
        b.u(1308, hashMap1, "com.apple.quicktime.content.identifier", 1309, "com.apple.quicktime.make");
        b.u(1310, hashMap1, "com.apple.quicktime.model", 0x51F, "com.apple.photos.originating.signature");
        b.u(0x520, hashMap1, "com.apple.quicktime.pixeldensity", 0x400, "----");
        b.u(0x401, hashMap1, "@PST", 0x402, "@ppi");
        b.u(0x403, hashMap1, "@pti", 0x404, "@sti");
        b.u(0x405, hashMap1, "AACR", 1030, "CDEK");
        b.u(0x407, hashMap1, "CDET", 0x408, "GUID");
        b.u(0x409, hashMap1, "VERS", 0x40A, "aART");
        b.u(0x40B, hashMap1, "akID", 0x40C, "albm");
        b.u(0x40D, hashMap1, "apID", 0x40E, "atID");
        b.u(0x40F, hashMap1, "auth", 1040, "catg");
        b.u(1041, hashMap1, "cnID", 1042, "covr");
        b.u(1043, hashMap1, "cpil", 1044, "cprt");
        b.u(1045, hashMap1, "desc", 1046, "disk");
        b.u(1047, hashMap1, "dscp", 1048, "egid");
        b.u(1049, hashMap1, "geID", 1050, "gnre");
        b.u(1051, hashMap1, "grup", 1052, "gshh");
        b.u(1053, hashMap1, "gspm", 1054, "gspu");
        b.u(0x41F, hashMap1, "gssd", 0x420, "gsst");
        b.u(1057, hashMap1, "gstd", 1058, "hdvd");
        b.u(1059, hashMap1, "itnu", 1060, "keyw");
        b.u(1061, hashMap1, "ldes", 1062, "pcst");
        b.u(1063, hashMap1, "perf", 1064, "pgap");
        b.u(1065, hashMap1, "plID", 1066, "prID");
        b.u(1067, hashMap1, "purd", 1068, "purl");
        b.u(1069, hashMap1, "rate", 1070, "rldt");
        b.u(0x42F, hashMap1, "rtng", 0x430, "sfID");
        b.u(1073, hashMap1, "soaa", 1074, "soal");
        b.u(1075, hashMap1, "soar", 1076, "soco");
        b.u(1077, hashMap1, "sonm", 1078, "sosn");
        b.u(1079, hashMap1, "stik", 1080, "titl");
        b.u(1081, hashMap1, "tmpo", 1082, "trkn");
        b.u(1083, hashMap1, "tven", 1084, "tves");
        b.u(1085, hashMap1, "tvnn", 1086, "tvsh");
        b.u(0x43F, hashMap1, "tvsn", 0x440, "yrrc");
        b.u(1089, hashMap1, "\uFFFDART", 1090, "\uFFFDalb");
        b.u(1091, hashMap1, "\uFFFDcmt", 1092, "\uFFFDcom");
        b.u(1093, hashMap1, "\uFFFDcpy", 1094, "\uFFFDday");
        b.u(1095, hashMap1, "\uFFFDdes", 1096, "\uFFFDenc");
        b.u(1097, hashMap1, "\uFFFDgen", 1098, "\uFFFDgrp");
        b.u(1099, hashMap1, "\uFFFDlyr", 1100, "\uFFFDnam");
        b.u(1101, hashMap1, "\uFFFDnrt", 1102, "\uFFFDpub");
        b.u(0x44F, hashMap1, "\uFFFDtoo", 0x450, "\uFFFDtrk");
        hashMap1.put("\uFFFDwrt", 1105);
        hashMap0.put(integer0, "Album");
        hashMap0.put(integer1, "Artist");
        hashMap0.put(integer2, "Artwork");
        hashMap0.put(integer3, "Author");
        hashMap0.put(integer4, "Comment");
        hashMap0.put(integer5, "Copyright");
        hashMap0.put(integer6, "Creation Date");
        hashMap0.put(integer7, "Description");
        hashMap0.put(integer8, "Director");
        hashMap0.put(integer9, "Title");
        hashMap0.put(integer10, "Genre");
        hashMap0.put(integer11, "Information");
        hashMap0.put(integer12, "Keywords");
        hashMap0.put(integer13, "ISO 6709");
        hashMap0.put(integer14, "Producer");
        hashMap0.put(0x50F, "Publisher");
        b.z(0x510, hashMap0, "Software", 0x511, "Year");
        b.z(0x512, hashMap0, "Collection User", 0x513, "Rating User");
        b.z(1300, hashMap0, "Location Name", 1301, "Location Body");
        b.z(1302, hashMap0, "Location Note", 1303, "Location Role");
        b.z(1304, hashMap0, "Location Date", 1305, "Direction Facing");
        b.z(1306, hashMap0, "Direction Motion", 1307, "Display Name");
        b.z(1308, hashMap0, "Content Identifier", 1309, "Make");
        b.z(1310, hashMap0, "Model", 0x51F, "Originating Signature");
        b.z(0x520, hashMap0, "Pixel Density", 0x400, "iTunes Info");
        b.z(0x401, hashMap0, "Parent Short Title", 0x402, "Parent Product ID");
        b.z(0x403, hashMap0, "Parent Title", 0x404, "Short Title");
        b.z(0x405, hashMap0, "Unknown_AACR?", 1030, "Unknown_CDEK?");
        b.z(0x407, hashMap0, "Unknown_CDET?", 0x408, "GUID");
        b.z(0x409, hashMap0, "Product Version", 0x40A, "Album Artist");
        b.z(0x40B, hashMap0, "Apple Store Account Type", 0x40C, "Album");
        b.z(0x40D, hashMap0, "Apple Store Account", 0x40E, "Album Title ID");
        b.z(0x40F, hashMap0, "Author", 1040, "Category");
        b.z(1041, hashMap0, "Apple Store Catalog ID", 1042, "Cover Art");
        b.z(1043, hashMap0, "Compilation", 1044, "Copyright");
        b.z(1045, hashMap0, "Description", 1046, "Disk Number");
        b.z(1047, hashMap0, "Description", 1048, "Episode Global Unique ID");
        b.z(1049, hashMap0, "Genre ID", 1050, "Genre");
        b.z(1051, hashMap0, "Grouping", 1052, "Google Host Header");
        b.z(1053, hashMap0, "Google Ping Message", 1054, "Google Ping URL");
        b.z(0x41F, hashMap0, "Google Source Data", 0x420, "Google Start Time");
        b.z(1057, hashMap0, "Google Track Duration", 1058, "HD Video");
        b.z(1059, hashMap0, "iTunes U", 1060, "Keyword");
        b.z(1061, hashMap0, "Long Description", 1062, "Podcast");
        b.z(1063, hashMap0, "Performer", 1064, "Play Gap");
        b.z(1065, hashMap0, "Play List ID", 1066, "Product ID");
        b.z(1067, hashMap0, "Purchase Date", 1068, "Podcast URL");
        b.z(1069, hashMap0, "Rating Percent", 1070, "Release Date");
        b.z(0x42F, hashMap0, "Rating", 0x430, "Apple Store Country");
        b.z(1073, hashMap0, "Sort Album Artist", 1074, "Sort Album");
        b.z(1075, hashMap0, "Sort Artist", 1076, "Sort Composer");
        b.z(1077, hashMap0, "Sort Name", 1078, "Sort Show");
        b.z(1079, hashMap0, "Media Type", 1080, "Title");
        b.z(1081, hashMap0, "Beats Per Minute", 1082, "Track Number");
        b.z(1083, hashMap0, "TV Episode ID", 1084, "TV Episode");
        b.z(1085, hashMap0, "TV Network Name", 1086, "TV Show");
        b.z(0x43F, hashMap0, "TV Season", 0x440, "Year");
        b.z(1089, hashMap0, "Artist", 1090, "Album");
        b.z(1091, hashMap0, "Comment", 1092, "Composer");
        b.z(1093, hashMap0, "Copyright", 1094, "Content Create Date");
        b.z(1095, hashMap0, "Description", 1096, "Encoded By");
        b.z(1097, hashMap0, "Genre", 1098, "Grouping");
        b.z(1099, hashMap0, "Lyrics", 1100, "Title");
        b.z(1101, hashMap0, "Narrator", 1102, "Publisher");
        b.z(0x44F, hashMap0, "Encoder", 0x450, "Track");
        hashMap0.put(1105, "Composer");
    }

    public QuickTimeMetadataDirectory() {
        this.setDescriptor(new a(6, this));
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public String getName() {
        return "QuickTime Metadata";
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public HashMap getTagNameMap() {
        return QuickTimeMetadataDirectory._tagNameMap;
    }
}

