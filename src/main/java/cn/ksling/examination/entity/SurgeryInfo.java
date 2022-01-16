package cn.ksling.examination.entity;

public class SurgeryInfo {
    private Integer id;

    private Integer no;

    private Integer height;

    private Integer weight;

    private String skin;

    private String limb;

    private String lymph;

    private String joint;

    private String spine;

    private String thyroid;

    private String other;

    private String physicianOpinion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin == null ? null : skin.trim();
    }

    public String getLimb() {
        return limb;
    }

    public void setLimb(String limb) {
        this.limb = limb == null ? null : limb.trim();
    }

    public String getLymph() {
        return lymph;
    }

    public void setLymph(String lymph) {
        this.lymph = lymph == null ? null : lymph.trim();
    }

    public String getJoint() {
        return joint;
    }

    public void setJoint(String joint) {
        this.joint = joint == null ? null : joint.trim();
    }

    public String getSpine() {
        return spine;
    }

    public void setSpine(String spine) {
        this.spine = spine == null ? null : spine.trim();
    }

    public String getThyroid() {
        return thyroid;
    }

    public void setThyroid(String thyroid) {
        this.thyroid = thyroid == null ? null : thyroid.trim();
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