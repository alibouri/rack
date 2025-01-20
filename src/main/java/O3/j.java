package o3;

import A7.b;
import Bb.F;
import Bb.q;
import W4.f;
import hb.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import n3.a;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import q3.c;
import q3.d;

public abstract class j {
    public static final Object a;
    public static final DocumentBuilderFactory b;

    static {
        j.a = new Object();
        DocumentBuilderFactory documentBuilderFactory0 = DocumentBuilderFactory.newInstance();
        documentBuilderFactory0.setNamespaceAware(true);
        documentBuilderFactory0.setIgnoringComments(true);
        documentBuilderFactory0.setExpandEntityReferences(false);
        try {
            documentBuilderFactory0.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            documentBuilderFactory0.setFeature("http://xml.org/sax/features/external-general-entities", false);
            documentBuilderFactory0.setFeature("http://xerces.apache.org/xerces2-j/features.html#disallow-doctype-decl", false);
            documentBuilderFactory0.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            documentBuilderFactory0.setFeature("http://xerces.apache.org/xerces2-j/features.html#external-parameter-entities", false);
            documentBuilderFactory0.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            documentBuilderFactory0.setXIncludeAware(false);
            documentBuilderFactory0.setExpandEntityReferences(false);
        }
        catch(Throwable unused_ex) {
        }
        j.b = documentBuilderFactory0;
    }

    public static Object[] a(Node node0, boolean z, Object[] arr_object) {
        NodeList nodeList0 = node0.getChildNodes();
        for(int v = 0; v < nodeList0.getLength(); ++v) {
            Node node1 = nodeList0.item(v);
            if(7 == node1.getNodeType() && "xpacket".equals(((ProcessingInstruction)node1).getTarget())) {
                arr_object[2] = ((ProcessingInstruction)node1).getData();
            }
            else if(3 != node1.getNodeType() && 7 != node1.getNodeType()) {
                String s = node1.getNamespaceURI();
                String s1 = node1.getLocalName();
                if(("xmpmeta".equals(s1) || "xapmeta".equals(s1)) && "adobe:ns:meta/".equals(s)) {
                    return j.a(node1, false, arr_object);
                }
                if(!z && "RDF".equals(s1) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(s)) {
                    arr_object[0] = node1;
                    arr_object[1] = j.a;
                    return arr_object;
                }
                Object[] arr_object1 = j.a(node1, z, arr_object);
                if(arr_object1 != null) {
                    return arr_object1;
                }
            }
        }
        return null;
    }

    public static i b(Object object0, c c0) {
        k k21;
        Document document0;
        if(object0 == null) {
            throw new a("Parameter must not be null", 4);
        }
        if(object0 instanceof String && ((String)object0).length() == 0) {
            throw new a("Parameter must not be null or empty", 4);
        }
        c c1 = c0 == null ? new c() : c0;
        if(object0 instanceof InputStream) {
            InputStream inputStream0 = (InputStream)object0;
            if(c1.c(16) || c1.c(8) || c1.c(0x40)) {
                try {
                    b b0 = new b(10, false);
                    b0.Z = null;
                    b0.Y = 0;
                    b0.b0 = new byte[0x4000];
                    int v;
                    while((v = inputStream0.read(((byte[])b0.b0), b0.Y, 0x4000)) > 0) {
                        int v1 = b0.Y + v;
                        b0.Y = v1;
                        if(v != 0x4000) {
                            break;
                        }
                        b0.h(v1 + 0x4000);
                    }
                    document0 = j.d(b0, c1);
                }
                catch(IOException iOException0) {
                    throw new a("Error reading the XML-file", 204, iOException0);
                }
            }
            else {
                document0 = j.c(new InputSource(inputStream0));
            }
        }
        else if(object0 instanceof byte[]) {
            b b1 = new b(10, false);
            b1.Z = null;
            b1.b0 = (byte[])object0;
            b1.Y = ((byte[])object0).length;
            document0 = j.d(b1, c1);
        }
        else {
            String s = (String)object0;
            if(c1.c(0x40)) {
                try {
                    j.b.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                }
                catch(Throwable unused_ex) {
                }
            }
            try {
                document0 = j.c(new InputSource(new StringReader(s)));
            }
            catch(a a0) {
                if(a0.X != 201 || !c1.c(8)) {
                    throw a0;
                }
                document0 = j.c(new InputSource(new o3.a(new StringReader(s))));
            }
        }
        Object[] arr_object = j.a(document0, c1.c(1), new Object[3]);
        if(arr_object != null && arr_object[1] == j.a) {
            Node node0 = (Node)arr_object[0];
            i i0 = new i();
            if(!node0.hasAttributes()) {
                throw new a("Invalid attributes of rdf:RDF element", 202);
            }
            k k0 = i0.X;
            for(int v2 = 0; v2 < node0.getChildNodes().getLength(); ++v2) {
                Node node1 = node0.getChildNodes().item(v2);
                if(!q.I(node1)) {
                    q.U(i0, k0, node1, true, c1);
                }
            }
            String s1 = (String)arr_object[2];
            if(!c1.c(0x20)) {
                k k1 = i0.X;
                F.s(k1, "http://purl.org/dc/elements/1.1/", null, true);
                k k2 = i0.X;
                Iterator iterator0 = k2.o();
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    k k3 = (k)object1;
                    if("http://purl.org/dc/elements/1.1/".equals(k3.X)) {
                        for(int v3 = 1; v3 <= k3.i(); ++v3) {
                            k k4 = k3.g(v3);
                            d d0 = (d)l.a.get(k4.X);
                            if(d0 != null) {
                                if((k4.j().a & 0x300) == 0) {
                                    k k5 = new k(k4.X, null, d0);
                                    k4.X = "[]";
                                    k5.a(k4);
                                    k5.Z = k3;
                                    ((ArrayList)k3.h()).set(v3 - 1, k5);
                                    if(d0.c(0x1000) && !k4.j().c(0x40)) {
                                        k4.c(new k("xml:lang", "x-default", null));
                                    }
                                }
                                else {
                                    k4.j().e(0x1E00, false);
                                    d d1 = k4.j();
                                    int v4 = d1.a | d0.a;
                                    d1.b(v4);
                                    d1.a = v4;
                                    if(d0.c(0x1000)) {
                                        l.b(k4);
                                    }
                                }
                            }
                        }
                    }
                    else if("http://ns.adobe.com/exif/1.0/".equals(k3.X)) {
                        k k6 = F.q(k3, "exif:GPSTimeStamp", false);
                        if(k6 != null) {
                            try {
                                o3.d d2 = f.q(k6.Y);
                                if(d2.X == 0 && d2.Y == 0 && d2.Z == 0) {
                                    k k7 = F.q(k3, "exif:DateTimeOriginal", false);
                                    if(k7 == null) {
                                        k7 = F.q(k3, "exif:DateTimeDigitized", false);
                                    }
                                    if(k7 != null) {
                                        o3.d d3 = f.q(k7.Y);
                                        GregorianCalendar gregorianCalendar0 = d2.a();
                                        gregorianCalendar0.set(1, d3.X);
                                        gregorianCalendar0.set(2, d3.Y);
                                        gregorianCalendar0.set(5, d3.Z);
                                        k6.Y = android.support.v4.media.session.a.K(new o3.d(gregorianCalendar0));
                                    }
                                }
                            }
                            catch(a unused_ex) {
                            }
                        }
                        k k8 = F.q(k3, "exif:UserComment", false);
                        if(k8 == null) {
                            continue;
                        }
                        if((k8.j().a & 0x300) == 0) {
                            k k9 = new k("[]", k8.Y, k8.j());
                            k9.Z = k8;
                            for(int v5 = k8.c0 == null ? 0 : k8.c0.size(); v5 > 0; --v5) {
                                k9.c(k8.l((k8.c0 == null ? 0 : k8.c0.size()) - v5));
                            }
                            d d4 = k8.j();
                            d4.e(16, false);
                            d4.e(0x40, false);
                            d4.e(0x80, false);
                            k8.c0 = null;
                            if(!k9.j().c(0x40)) {
                                d d5 = new d();
                                d5.e(0x20, true);
                                k9.c(new k("xml:lang", "x-default", d5));
                                k9.j().e(16, true);
                                k9.j().e(0x40, true);
                            }
                            k8.a(k9);
                            k8.d0 = new d(0x1E00);
                            k8.Y = "";
                        }
                        l.b(k8);
                    }
                    else if("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(k3.X)) {
                        k k10 = F.q(k3, "xmpDM:copyright", false);
                        if(k10 != null) {
                            try {
                                k k11 = F.s(k2, "http://purl.org/dc/elements/1.1/", null, true);
                                String s2 = k10.Y;
                                k k12 = F.q(k11, "dc:rights", false);
                                if(k12 == null || !k12.m()) {
                                    i0.c("\n\n" + s2);
                                }
                                else {
                                    int v6 = F.G(k12, "x-default");
                                    if(v6 < 0) {
                                        i0.c(k12.g(1).Y);
                                        v6 = F.G(k12, "x-default");
                                    }
                                    k k13 = k12.g(v6);
                                    String s3 = k13.Y;
                                    int v7 = s3.indexOf("\n\n");
                                    if(v7 >= 0) {
                                        if(!s3.substring(v7 + 2).equals(s2)) {
                                            k13.Y = s3.substring(0, v7 + 2) + s2;
                                        }
                                    }
                                    else if(!s2.equals(s3)) {
                                        k13.Y = s3 + "\n\n" + s2;
                                    }
                                }
                                k k14 = k10.Z;
                                ((ArrayList)k14.h()).remove(k10);
                                if(k14.b0.isEmpty()) {
                                    k14.b0 = null;
                                }
                            }
                            catch(a unused_ex) {
                            }
                        }
                    }
                    else if("http://ns.adobe.com/xap/1.0/rights/".equals(k3.X)) {
                        k k15 = F.q(k3, "xmpRights:UsageTerms", false);
                        if(k15 == null) {
                            continue;
                        }
                        l.b(k15);
                    }
                }
                if(k1.f0) {
                    k1.f0 = false;
                    boolean z = c1.c(4);
                    for(Object object2: Collections.unmodifiableList(new ArrayList(k1.h()))) {
                        k k16 = (k)object2;
                        if(k16.f0) {
                            Iterator iterator2 = k16.o();
                            while(iterator2.hasNext()) {
                                Object object3 = iterator2.next();
                                k k17 = (k)object3;
                                if(k17.g0) {
                                    k17.g0 = false;
                                    m m0 = n3.c.a.e(k17.X);
                                    if(m0 != null) {
                                        k k18 = F.s(k1, m0.a, null, true);
                                        k18.e0 = false;
                                        String s4 = m0.b;
                                        String s5 = m0.c;
                                        k k19 = F.q(k18, s4 + s5, false);
                                        q3.a a1 = m0.d;
                                        if(k19 == null) {
                                            if(a1.a == 0) {
                                                k17.X = s4 + s5;
                                                k18.a(k17);
                                                iterator2.remove();
                                            }
                                            else {
                                                k k20 = new k(s4 + s5, null, new d(a1.a));
                                                k18.a(k20);
                                                l.c(iterator2, k17, k20);
                                            }
                                        }
                                        else if(a1.a == 0) {
                                            if(z) {
                                                l.a(k17, k19, true);
                                            }
                                            iterator2.remove();
                                        }
                                        else {
                                            if(a1.c(0x1000)) {
                                                int v8 = F.G(k19, "x-default");
                                                k21 = v8 == -1 ? null : k19.g(v8);
                                            }
                                            else {
                                                k21 = k19.m() ? k19.g(1) : null;
                                            }
                                            if(k21 == null) {
                                                l.c(iterator2, k17, k19);
                                            }
                                            else {
                                                if(z) {
                                                    l.a(k17, k21, true);
                                                }
                                                iterator2.remove();
                                            }
                                        }
                                    }
                                }
                            }
                            k16.f0 = false;
                        }
                    }
                }
                if(k1.X != null && k1.X.length() >= 36) {
                    String s6 = k1.X.toLowerCase();
                    s6 = s6.startsWith("uuid:") ? s6.substring(5) : k1.X.toLowerCase();
                    if(s6 != null) {
                        int v9 = 0;
                        boolean z1 = true;
                        int v10;
                        for(v10 = 0; v10 < s6.length(); ++v10) {
                            if(s6.charAt(v10) == 45) {
                                ++v9;
                                z1 = z1 && (v10 == 8 || v10 == 13 || v10 == 18 || v10 == 23);
                            }
                        }
                        if(z1 && 4 == v9 && 36 == v10) {
                            k k22 = F.r(k1, M6.b.x("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, null);
                            if(k22 == null) {
                                throw new a("Failure creating xmpMM:InstanceID", 9);
                            }
                            k22.d0 = null;
                            k22.Y = "uuid:" + s6;
                            k22.b0 = null;
                            d d6 = k22.j();
                            d6.e(16, false);
                            d6.e(0x40, false);
                            d6.e(0x80, false);
                            k22.c0 = null;
                            k1.X = null;
                        }
                    }
                }
                Iterator iterator3 = k1.o();
                while(iterator3.hasNext()) {
                    Object object4 = iterator3.next();
                    if(!((k)object4).m()) {
                        iterator3.remove();
                    }
                }
            }
            return i0;
        }
        return new i();
    }

    public static Document c(InputSource inputSource0) {
        try {
            DocumentBuilder documentBuilder0 = j.b.newDocumentBuilder();
            documentBuilder0.setErrorHandler(null);
            return documentBuilder0.parse(inputSource0);
        }
        catch(SAXException sAXException0) {
            throw new a("XML parsing failure", 201, sAXException0);
        }
        catch(ParserConfigurationException parserConfigurationException0) {
            throw new a("XML Parser not correctly configured", 0, parserConfigurationException0);
        }
        catch(IOException iOException0) {
            throw new a("Error reading the XML-file", 204, iOException0);
        }
    }

    public static Document d(b b0, c c0) {
        try {
            InputSource inputSource0 = new InputSource(new ByteArrayInputStream(((byte[])b0.b0), 0, b0.Y));
            if(c0.c(0x40)) {
                try {
                    j.b.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                }
                catch(Throwable unused_ex) {
                }
            }
            try {
                return j.c(inputSource0);
            }
            catch(a a0) {
                if("DOCTYPE is disallowed".equals(a0.getCause().getMessage())) {
                    throw new a(a0.getCause().getMessage(), 201);
                }
                if(a0.X != 201 && a0.X != 204) {
                    throw a0;
                }
                if(c0.c(16)) {
                    b0 = h.I(b0);
                }
                if(c0.c(8)) {
                    String s = b0.j();
                    return j.c(new InputSource(new o3.a(new InputStreamReader(new ByteArrayInputStream(((byte[])b0.b0), 0, b0.Y), s))));
                }
                return j.c(new InputSource(new ByteArrayInputStream(((byte[])b0.b0), 0, b0.Y)));
            }
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new a("Unsupported Encoding", 9, unsupportedEncodingException0);
        }
    }
}

