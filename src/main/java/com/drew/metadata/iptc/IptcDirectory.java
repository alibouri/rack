package com.drew.metadata.iptc;

import com.drew.metadata.b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import r4.a;

public class IptcDirectory extends b {
    public static final int TAG_ACTION_ADVISED = 554;
    public static final int TAG_APPLICATION_RECORD_VERSION = 0x200;
    public static final int TAG_ARM_IDENTIFIER = 376;
    public static final int TAG_ARM_VERSION = 378;
    public static final int TAG_AUDIO_DURATION = 665;
    public static final int TAG_AUDIO_OUTCUE = 666;
    public static final int TAG_AUDIO_SAMPLING_RATE = 663;
    public static final int TAG_AUDIO_SAMPLING_RESOLUTION = 664;
    public static final int TAG_AUDIO_TYPE = 662;
    public static final int TAG_BY_LINE = 0x250;
    public static final int TAG_BY_LINE_TITLE = 597;
    public static final int TAG_CAPTION = 632;
    public static final int TAG_CAPTION_WRITER = 634;
    public static final int TAG_CATEGORY = 0x20F;
    public static final int TAG_CITY = 602;
    public static final int TAG_CODED_CHARACTER_SET = 346;
    public static final int TAG_CONTACT = 630;
    public static final int TAG_CONTENT_LOCATION_CODE = 538;
    public static final int TAG_CONTENT_LOCATION_NAME = 539;
    public static final int TAG_COPYRIGHT_NOTICE = 628;
    public static final int TAG_COUNTRY_OR_PRIMARY_LOCATION_CODE = 612;
    public static final int TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME = 613;
    public static final int TAG_CREDIT = 622;
    public static final int TAG_DATE_CREATED = 567;
    public static final int TAG_DATE_SENT = 326;
    public static final int TAG_DESTINATION = 0x105;
    public static final int TAG_DIGITAL_DATE_CREATED = 574;
    public static final int TAG_DIGITAL_TIME_CREATED = 0x23F;
    public static final int TAG_EDITORIAL_UPDATE = 520;
    public static final int TAG_EDIT_STATUS = 0x207;
    public static final int TAG_ENVELOPE_NUMBER = 296;
    public static final int TAG_ENVELOPE_PRIORITY = 316;
    public static final int TAG_ENVELOPE_RECORD_VERSION = 0x100;
    public static final int TAG_EXPIRATION_DATE = 549;
    public static final int TAG_EXPIRATION_TIME = 550;
    public static final int TAG_FILE_FORMAT = 276;
    public static final int TAG_FILE_VERSION = 278;
    public static final int TAG_FIXTURE_ID = 534;
    public static final int TAG_HEADLINE = 617;
    public static final int TAG_IMAGE_ORIENTATION = 643;
    public static final int TAG_IMAGE_TYPE = 642;
    public static final int TAG_JOB_ID = 696;
    public static final int TAG_KEYWORDS = 537;
    public static final int TAG_LANGUAGE_IDENTIFIER = 647;
    public static final int TAG_LOCAL_CAPTION = 633;
    public static final int TAG_MASTER_DOCUMENT_ID = 697;
    public static final int TAG_OBJECT_ATTRIBUTE_REFERENCE = 0x204;
    public static final int TAG_OBJECT_CYCLE = 587;
    public static final int TAG_OBJECT_NAME = 0x205;
    public static final int TAG_OBJECT_PREVIEW_DATA = 714;
    public static final int TAG_OBJECT_PREVIEW_FILE_FORMAT = 712;
    public static final int TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION = 713;
    public static final int TAG_OBJECT_TYPE_REFERENCE = 0x203;
    public static final int TAG_ORIGINAL_TRANSMISSION_REFERENCE = 615;
    public static final int TAG_ORIGINATING_PROGRAM = 577;
    public static final int TAG_OWNER_ID = 700;
    public static final int TAG_PRODUCT_ID = 306;
    public static final int TAG_PROGRAM_VERSION = 582;
    public static final int TAG_PROVINCE_OR_STATE = 607;
    public static final int TAG_RASTERIZED_CAPTION = 637;
    public static final int TAG_REFERENCE_DATE = 0x22F;
    public static final int TAG_REFERENCE_NUMBER = 562;
    public static final int TAG_REFERENCE_SERVICE = 557;
    public static final int TAG_RELEASE_DATE = 542;
    public static final int TAG_RELEASE_TIME = 547;
    public static final int TAG_SERVICE_ID = 286;
    public static final int TAG_SHORT_DOCUMENT_ID = 698;
    public static final int TAG_SOURCE = 627;
    public static final int TAG_SPECIAL_INSTRUCTIONS = 552;
    public static final int TAG_SUBJECT_REFERENCE = 0x20C;
    public static final int TAG_SUB_LOCATION = 604;
    public static final int TAG_SUPPLEMENTAL_CATEGORIES = 532;
    public static final int TAG_TIME_CREATED = 572;
    public static final int TAG_TIME_SENT = 0x150;
    public static final int TAG_UNIQUE_DOCUMENT_ID = 699;
    public static final int TAG_UNIQUE_OBJECT_NAME = 356;
    public static final int TAG_URGENCY = 0x20A;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        IptcDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0x100, hashMap0, "Enveloped Record Version", 0x105, "Destination");
        com.apollographql.apollo.api.b.z(276, hashMap0, "File Format", 278, "File Version");
        com.apollographql.apollo.api.b.z(286, hashMap0, "Service Identifier", 296, "Envelope Number");
        com.apollographql.apollo.api.b.z(306, hashMap0, "Product Identifier", 316, "Envelope Priority");
        com.apollographql.apollo.api.b.z(326, hashMap0, "Date Sent", 0x150, "Time Sent");
        com.apollographql.apollo.api.b.z(346, hashMap0, "Coded Character Set", 356, "Unique Object Name");
        com.apollographql.apollo.api.b.z(376, hashMap0, "ARM Identifier", 378, "ARM Version");
        com.apollographql.apollo.api.b.z(0x200, hashMap0, "Application Record Version", 0x203, "Object Type Reference");
        com.apollographql.apollo.api.b.z(0x204, hashMap0, "Object Attribute Reference", 0x205, "Object Name");
        com.apollographql.apollo.api.b.z(0x207, hashMap0, "Edit Status", 520, "Editorial Update");
        com.apollographql.apollo.api.b.z(0x20A, hashMap0, "Urgency", 0x20C, "Subject Reference");
        com.apollographql.apollo.api.b.z(0x20F, hashMap0, "Category", 532, "Supplemental Category(s)");
        com.apollographql.apollo.api.b.z(534, hashMap0, "Fixture Identifier", 537, "Keywords");
        com.apollographql.apollo.api.b.z(538, hashMap0, "Content Location Code", 539, "Content Location Name");
        com.apollographql.apollo.api.b.z(542, hashMap0, "Release Date", 547, "Release Time");
        com.apollographql.apollo.api.b.z(549, hashMap0, "Expiration Date", 550, "Expiration Time");
        com.apollographql.apollo.api.b.z(552, hashMap0, "Special Instructions", 554, "Action Advised");
        com.apollographql.apollo.api.b.z(557, hashMap0, "Reference Service", 0x22F, "Reference Date");
        com.apollographql.apollo.api.b.z(562, hashMap0, "Reference Number", 567, "Date Created");
        com.apollographql.apollo.api.b.z(572, hashMap0, "Time Created", 574, "Digital Date Created");
        com.apollographql.apollo.api.b.z(0x23F, hashMap0, "Digital Time Created", 577, "Originating Program");
        com.apollographql.apollo.api.b.z(582, hashMap0, "Program Version", 587, "Object Cycle");
        com.apollographql.apollo.api.b.z(0x250, hashMap0, "By-line", 597, "By-line Title");
        com.apollographql.apollo.api.b.z(602, hashMap0, "City", 604, "Sub-location");
        com.apollographql.apollo.api.b.z(607, hashMap0, "Province/State", 612, "Country/Primary Location Code");
        com.apollographql.apollo.api.b.z(613, hashMap0, "Country/Primary Location Name", 615, "Original Transmission Reference");
        com.apollographql.apollo.api.b.z(617, hashMap0, "Headline", 622, "Credit");
        com.apollographql.apollo.api.b.z(627, hashMap0, "Source", 628, "Copyright Notice");
        com.apollographql.apollo.api.b.z(630, hashMap0, "Contact", 632, "Caption/Abstract");
        com.apollographql.apollo.api.b.z(633, hashMap0, "Local Caption", 634, "Caption Writer/Editor");
        com.apollographql.apollo.api.b.z(637, hashMap0, "Rasterized Caption", 642, "Image Type");
        com.apollographql.apollo.api.b.z(643, hashMap0, "Image Orientation", 647, "Language Identifier");
        com.apollographql.apollo.api.b.z(662, hashMap0, "Audio Type", 663, "Audio Sampling Rate");
        com.apollographql.apollo.api.b.z(664, hashMap0, "Audio Sampling Resolution", 665, "Audio Duration");
        com.apollographql.apollo.api.b.z(666, hashMap0, "Audio Outcue", 696, "Job Identifier");
        com.apollographql.apollo.api.b.z(697, hashMap0, "Master Document Identifier", 698, "Short Document Identifier");
        com.apollographql.apollo.api.b.z(699, hashMap0, "Unique Document Identifier", 700, "Owner Identifier");
        com.apollographql.apollo.api.b.z(712, hashMap0, "Object Data Preview File Format", 713, "Object Data Preview File Format Version");
        hashMap0.put(714, "Object Data Preview Data");
    }

    public IptcDirectory() {
        this.setDescriptor(new a(9, this));
    }

    private Date getDate(int v, int v1) {
        String s = this.getString(v);
        String s1 = this.getString(v1);
        if(s == null) {
            return null;
        }
        if(s1 == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyyMMddHHmmssZ").parse(s + s1);
        }
        catch(ParseException unused_ex) {
            return null;
        }
    }

    public Date getDateCreated() {
        return this.getDate(567, 572);
    }

    public Date getDateSent() {
        return this.getDate(326, 0x150);
    }

    public Date getDigitalDateCreated() {
        return this.getDate(574, 0x23F);
    }

    public Date getExpirationDate() {
        return this.getDate(549, 550);
    }

    public List getKeywords() {
        String[] arr_s = this.getStringArray(537);
        return arr_s == null ? null : Arrays.asList(arr_s);
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "IPTC";
    }

    public Date getReleaseDate() {
        return this.getDate(542, 547);
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return IptcDirectory._tagNameMap;
    }
}

