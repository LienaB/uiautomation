package com.nordstrom.smrt.domain;

public class CustomerChoiceDescription {
    private String sku;
    private String size1;
    private String size2;
    private String target;
    private String asoh;
    private String inTransit;
    private String requested;
    private String ssa;
    private String raw;
    private String pull;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSize1() {
        return size1;
    }

    public void setSize1(String size1) {
        this.size1 = size1;
    }

    public String getSize2() {
        return size2;
    }

    public void setsize2(String size2) {
        this.size2 = size2;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getAsoh() {
        return asoh;
    }

    public void setAsoh(String asoh) {
        this.asoh = asoh;
    }

    public String getInTransit() {
        return inTransit;
    }

    public void setInTransit(String inTransit) {
        this.inTransit = inTransit;
    }

    public String getRequested() { return requested; }

    public void setRequested(String requested) { this.requested = requested; }

    public String getSsa() {
        return ssa;
    }

    public void setSsa(String ssa) { this.ssa = ssa; }

    public String getRaw() { return raw; }

    public void setRaw(String raw) { this.raw = raw; }

    public String getPull() { return pull; }

    public void setPull(String pull) { this.pull = pull; }
}
