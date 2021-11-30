package cn.ksling.examination.entity;

public class FacialFeaturesInfo {
    private Integer no;

    private Float hearingLeft;

    private Float hearingRight;

    private String earInfection;

    private String smell;

    private String stutter;

    private String other;

    private String physicianOpinion;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Float getHearingLeft() {
        return hearingLeft;
    }

    public void setHearingLeft(Float hearingLeft) {
        this.hearingLeft = hearingLeft;
    }

    public Float getHearingRight() {
        return hearingRight;
    }

    public void setHearingRight(Float hearingRight) {
        this.hearingRight = hearingRight;
    }

    public String getEarInfection() {
        return earInfection;
    }

    public void setEarInfection(String earInfection) {
        this.earInfection = earInfection == null ? null : earInfection.trim();
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell == null ? null : smell.trim();
    }

    public String getStutter() {
        return stutter;
    }

    public void setStutter(String stutter) {
        this.stutter = stutter == null ? null : stutter.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getPhysicianOpinion() {
        return physicianOpinion;
    }

    public void setPhysicianOpinion(String physicianOpinion) {
        this.physicianOpinion = physicianOpinion == null ? null : physicianOpinion.trim();
    }
}