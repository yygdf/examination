package cn.ksling.examination.entity;

public class EyeInfo {
    private Integer no;

    private Float nakedVisionLeft;

    private Float nakedVisionRight;

    private Float correctedVisionLeft;

    private Float correctedVisionRight;

    private Integer degreeLeft;

    private Integer degreeRight;

    private String colorVision;

    private String other;

    private String physicianOpinion;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Float getNakedVisionLeft() {
        return nakedVisionLeft;
    }

    public void setNakedVisionLeft(Float nakedVisionLeft) {
        this.nakedVisionLeft = nakedVisionLeft;
    }

    public Float getNakedVisionRight() {
        return nakedVisionRight;
    }

    public void setNakedVisionRight(Float nakedVisionRight) {
        this.nakedVisionRight = nakedVisionRight;
    }

    public Float getCorrectedVisionLeft() {
        return correctedVisionLeft;
    }

    public void setCorrectedVisionLeft(Float correctedVisionLeft) {
        this.correctedVisionLeft = correctedVisionLeft;
    }

    public Float getCorrectedVisionRight() {
        return correctedVisionRight;
    }

    public void setCorrectedVisionRight(Float correctedVisionRight) {
        this.correctedVisionRight = correctedVisionRight;
    }

    public Integer getDegreeLeft() {
        return degreeLeft;
    }

    public void setDegreeLeft(Integer degreeLeft) {
        this.degreeLeft = degreeLeft;
    }

    public Integer getDegreeRight() {
        return degreeRight;
    }

    public void setDegreeRight(Integer degreeRight) {
        this.degreeRight = degreeRight;
    }

    public String getColorVision() {
        return colorVision;
    }

    public void setColorVision(String colorVision) {
        this.colorVision = colorVision == null ? null : colorVision.trim();
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