package cn.ksling.examination.entity;

public class InternalInfo {
    private Integer no;

    private Integer heartRate;

    private Float bloodPressureContract;

    private Float bloodPressureDiastole;

    private String liverFunction;

    private String nutritionalStatus;

    private String cardiovascular;

    private String nerve;

    private String liver;

    private String lung;

    private String spleen;

    private String other;

    private String physicianOpinion;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Float getBloodPressureContract() {
        return bloodPressureContract;
    }

    public void setBloodPressureContract(Float bloodPressureContract) {
        this.bloodPressureContract = bloodPressureContract;
    }

    public Float getBloodPressureDiastole() {
        return bloodPressureDiastole;
    }

    public void setBloodPressureDiastole(Float bloodPressureDiastole) {
        this.bloodPressureDiastole = bloodPressureDiastole;
    }

    public String getLiverFunction() {
        return liverFunction;
    }

    public void setLiverFunction(String liverFunction) {
        this.liverFunction = liverFunction == null ? null : liverFunction.trim();
    }

    public String getNutritionalStatus() {
        return nutritionalStatus;
    }

    public void setNutritionalStatus(String nutritionalStatus) {
        this.nutritionalStatus = nutritionalStatus == null ? null : nutritionalStatus.trim();
    }

    public String getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(String cardiovascular) {
        this.cardiovascular = cardiovascular == null ? null : cardiovascular.trim();
    }

    public String getNerve() {
        return nerve;
    }

    public void setNerve(String nerve) {
        this.nerve = nerve == null ? null : nerve.trim();
    }

    public String getLiver() {
        return liver;
    }

    public void setLiver(String liver) {
        this.liver = liver == null ? null : liver.trim();
    }

    public String getLung() {
        return lung;
    }

    public void setLung(String lung) {
        this.lung = lung == null ? null : lung.trim();
    }

    public String getSpleen() {
        return spleen;
    }

    public void setSpleen(String spleen) {
        this.spleen = spleen == null ? null : spleen.trim();
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