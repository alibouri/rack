package com.wave.customer;

import Nb.j;
import R9.T;
import R9.c0;
import q9.j3;
import q9.o0;

public final class b extends j3 implements T {
    public final CreatePinActivity b;

    public b(CreatePinActivity createPinActivity0) {
        this.b = createPinActivity0;
        super(createPinActivity0);
    }

    @Override  // R9.T
    public final void U(String s) {
        j.f(s, "pin");
        CreatePinParams createPinParams0 = new CreatePinParams(((c0)this.b.G0.getValue()).Z.X, s);
        StepConfirmPin createPinWorkflow$StepConfirmPin0 = new StepConfirmPin(s);
        o0.G(this.b, this.b.H0, CreatePinActivity.class, createPinParams0, createPinWorkflow$StepConfirmPin0, false);
    }
}

