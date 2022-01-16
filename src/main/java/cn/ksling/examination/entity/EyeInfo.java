package cn.ksling.examination.entity;

public class EyeInfo {
    private Integer id;

    private Integer no;

    private Integer nakedVisionLeft;

    private Integer nakedVisionRight;

    private Integer correctedVisionLeft;

    private Integer correctedVisionRight;

    private Integer degreeLeft;

    private Integer degreeRight;

    private String colorVision;

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

    public Integer getNakedVisionLeft() {
        return nakedVisionLeft;
    }

    public void setNakedVisionLeft(Integer nakedVisionLeft) {
        this.nakedVisionLeft = nakedVisionLeft;
    }

    public Integer getNakedVisionRight() {
        return nakedVisionRight;
    }

    public void setNakedVisionRight(Integer nakedVisionRight) {
        this.nakedVisionRight = nakedVisionRight;
    }

    public Integer getCorrectedVisionLeft() {
        return correctedVisionLeft;
    }

    public void setCorrectedVisionLeft(Integer correctedVisionLeft) {
        this.correctedVisionLeft = correctedVisionLeft;
    }

    public Integer getCorrectedVisionRight() {
        return correctedVisionRight;
    }

    public void setCorrectedVisionRight(Integer correctedVisionRight) {
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