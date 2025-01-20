package Y8;

import A3.e;
import Nb.j;
import Z8.j4;
import c9.B0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import e9.a;

public final class u7 implements Mutation {
    public final Present a;
    public final Present b;
    public final String c;
    public final int d;
    public final Optional e;
    public final Present f;
    public final Optional g;
    public final Optional h;
    public final Present i;
    public final Present j;
    public final Optional k;

    public u7(Present optional$Present0, Present optional$Present1, String s, int v, Optional optional0, Present optional$Present2, Optional optional1, Optional optional2, Present optional$Present3, Present optional$Present4, Optional optional3) {
        j.f(s, "sha256");
        j.f(optional0, "fields");
        j.f(optional1, "isBlurry");
        j.f(optional2, "bizRegistrationId");
        j.f(optional3, "version");
        super();
        this.a = optional$Present0;
        this.b = optional$Present1;
        this.c = s;
        this.d = v;
        this.e = optional0;
        this.f = optional$Present2;
        this.g = optional1;
        this.h = optional2;
        this.i = optional$Present3;
        this.j = optional$Present4;
        this.k = optional3;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(j4.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation SaveDocumentInfoMutation($type: IdPhotoType, $walletId: ID, $sha256: String!, $length: Int!, $fields: [DocumentFieldInput!], $mimetype: String, $isBlurry: Boolean, $bizRegistrationId: String, $source: String, $photoSetId: String, $version: Int) { saveDocumentInfo(type: $type, walletId: $walletId, sha256: $sha256, length: $length, fields: $fields, mimetype: $mimetype, isBlurry: $isBlurry, bizRegistrationId: $bizRegistrationId, source: $source, photoSetId: $photoSetId, version: $version, uploadProtocol: TUS) { succeeded user { __typename id ...KycInfoFragment primaryWallet { id balance } } } }  fragment KycLimitFragment on UserKycLimit { description value }  fragment IdPhotoStatusFragment on UserKycIdPhotoStatus { __typename button ... on UserKycIdPhotoStatusWithSimpleText { text } ... on UserKycIdPhotoStatusWithTextWithIcon { text icon } ... on UserKycIdPhotoStatusWithTextInRectangle { title text icon rectangle } }  fragment KycInfoFragment on User { id kycInfo { kycTier limits { __typename ...KycLimitFragment } idStatus { __typename ...IdPhotoStatusFragment } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u7)) {
            return false;
        }
        if(!this.a.equals(((u7)object0).a)) {
            return false;
        }
        if(!this.b.equals(((u7)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((u7)object0).c)) {
            return false;
        }
        if(this.d != ((u7)object0).d) {
            return false;
        }
        if(!j.a(this.e, ((u7)object0).e)) {
            return false;
        }
        if(!this.f.equals(((u7)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((u7)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((u7)object0).h)) {
            return false;
        }
        if(!this.i.equals(((u7)object0).i)) {
            return false;
        }
        return this.j.equals(((u7)object0).j) ? j.a(this.k, ((u7)object0).k) : false;
    }

    @Override
    public final int hashCode() {
        return this.k.hashCode() + (this.j.hashCode() + (this.i.hashCode() + o.m(this.h, o.m(this.g, (this.f.hashCode() + o.m(this.e, (e.s((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c) + this.d) * 0x1F, 0x1F)) * 0x1F, 0x1F), 0x1F)) * 0x1F) * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "a3cbe436076cdd3d1119078de3c8b511b4781a40e957e44f120f5718eb849660";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SaveDocumentInfoMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(B0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        jsonWriter0.name("type");
        Adapters.-present(Adapters.-nullable(a.k)).toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("walletId");
        NullableAdapter nullableAdapter0 = Adapters.NullableStringAdapter;
        Adapters.-present(nullableAdapter0).toJson(jsonWriter0, customScalarAdapters0, this.b);
        jsonWriter0.name("sha256");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.c);
        jsonWriter0.name("length");
        Adapters.IntAdapter.toJson(jsonWriter0, customScalarAdapters0, ((int)this.d));
        Optional optional0 = this.e;
        if(optional0 instanceof Present) {
            jsonWriter0.name("fields");
            Adapters.-present(Adapters.-nullable(Adapters.-list(Adapters.-obj$default(e9.e.a, false, 1, null)))).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        jsonWriter0.name("mimetype");
        Adapters.-present(nullableAdapter0).toJson(jsonWriter0, customScalarAdapters0, this.f);
        Optional optional1 = this.g;
        if(optional1 instanceof Present) {
            jsonWriter0.name("isBlurry");
            Adapters.-present(Adapters.NullableBooleanAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional1));
        }
        Optional optional2 = this.h;
        if(optional2 instanceof Present) {
            jsonWriter0.name("bizRegistrationId");
            Adapters.-present(nullableAdapter0).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional2));
        }
        jsonWriter0.name("source");
        Adapters.-present(nullableAdapter0).toJson(jsonWriter0, customScalarAdapters0, this.i);
        jsonWriter0.name("photoSetId");
        Adapters.-present(nullableAdapter0).toJson(jsonWriter0, customScalarAdapters0, this.j);
        Optional optional3 = this.k;
        if(optional3 instanceof Present) {
            jsonWriter0.name("version");
            Adapters.-present(Adapters.NullableIntAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional3));
        }
    }

    @Override
    public final String toString() {
        return "SaveDocumentInfoMutation(type=" + this.a + ", walletId=" + this.b + ", sha256=" + this.c + ", length=" + this.d + ", fields=" + this.e + ", mimetype=" + this.f + ", isBlurry=" + this.g + ", bizRegistrationId=" + this.h + ", source=" + this.i + ", photoSetId=" + this.j + ", version=" + this.k + ")";
    }
}

