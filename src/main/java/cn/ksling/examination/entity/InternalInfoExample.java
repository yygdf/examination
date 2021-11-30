package cn.ksling.examination.entity;

import java.util.ArrayList;
import java.util.List;

public class InternalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InternalInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNull() {
            addCriterion("heart_rate is null");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNotNull() {
            addCriterion("heart_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHeartRateEqualTo(Integer value) {
            addCriterion("heart_rate =", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotEqualTo(Integer value) {
            addCriterion("heart_rate <>", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThan(Integer value) {
            addCriterion("heart_rate >", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("heart_rate >=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThan(Integer value) {
            addCriterion("heart_rate <", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThanOrEqualTo(Integer value) {
            addCriterion("heart_rate <=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateIn(List<Integer> values) {
            addCriterion("heart_rate in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotIn(List<Integer> values) {
            addCriterion("heart_rate not in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateBetween(Integer value1, Integer value2) {
            addCriterion("heart_rate between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotBetween(Integer value1, Integer value2) {
            addCriterion("heart_rate not between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractIsNull() {
            addCriterion("blood_pressure_contract is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractIsNotNull() {
            addCriterion("blood_pressure_contract is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractEqualTo(Float value) {
            addCriterion("blood_pressure_contract =", value, "bloodPressureContract");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractNotEqualTo(Float value) {
            addCriterion("blood_pressure_contract <>", value, "bloodPressureContract");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractGreaterThan(Float value) {
            addCriterion("blood_pressure_contract >", value, "bloodPressureContract");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractGreaterThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_contract >=", value, "bloodPressureContract");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractLessThan(Float value) {
            addCriterion("blood_pressure_contract <", value, "bloodPressureContract");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractLessThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_contract <=", value, "bloodPressureContract");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractIn(List<Float> values) {
            addCriterion("blood_pressure_contract in", values, "bloodPressureContract");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractNotIn(List<Float> values) {
            addCriterion("blood_pressure_contract not in", values, "bloodPressureContract");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractBetween(Float value1, Float value2) {
            addCriterion("blood_pressure_contract between", value1, value2, "bloodPressureContract");
            return (Criteria) this;
        }

        public Criteria andBloodPressureContractNotBetween(Float value1, Float value2) {
            addCriterion("blood_pressure_contract not between", value1, value2, "bloodPressureContract");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleIsNull() {
            addCriterion("blood_pressure_diastole is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleIsNotNull() {
            addCriterion("blood_pressure_diastole is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleEqualTo(Float value) {
            addCriterion("blood_pressure_diastole =", value, "bloodPressureDiastole");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleNotEqualTo(Float value) {
            addCriterion("blood_pressure_diastole <>", value, "bloodPressureDiastole");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleGreaterThan(Float value) {
            addCriterion("blood_pressure_diastole >", value, "bloodPressureDiastole");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleGreaterThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_diastole >=", value, "bloodPressureDiastole");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleLessThan(Float value) {
            addCriterion("blood_pressure_diastole <", value, "bloodPressureDiastole");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleLessThanOrEqualTo(Float value) {
            addCriterion("blood_pressure_diastole <=", value, "bloodPressureDiastole");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleIn(List<Float> values) {
            addCriterion("blood_pressure_diastole in", values, "bloodPressureDiastole");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleNotIn(List<Float> values) {
            addCriterion("blood_pressure_diastole not in", values, "bloodPressureDiastole");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleBetween(Float value1, Float value2) {
            addCriterion("blood_pressure_diastole between", value1, value2, "bloodPressureDiastole");
            return (Criteria) this;
        }

        public Criteria andBloodPressureDiastoleNotBetween(Float value1, Float value2) {
            addCriterion("blood_pressure_diastole not between", value1, value2, "bloodPressureDiastole");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionIsNull() {
            addCriterion("liver_function is null");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionIsNotNull() {
            addCriterion("liver_function is not null");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionEqualTo(String value) {
            addCriterion("liver_function =", value, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionNotEqualTo(String value) {
            addCriterion("liver_function <>", value, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionGreaterThan(String value) {
            addCriterion("liver_function >", value, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("liver_function >=", value, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionLessThan(String value) {
            addCriterion("liver_function <", value, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionLessThanOrEqualTo(String value) {
            addCriterion("liver_function <=", value, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionLike(String value) {
            addCriterion("liver_function like", value, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionNotLike(String value) {
            addCriterion("liver_function not like", value, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionIn(List<String> values) {
            addCriterion("liver_function in", values, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionNotIn(List<String> values) {
            addCriterion("liver_function not in", values, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionBetween(String value1, String value2) {
            addCriterion("liver_function between", value1, value2, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andLiverFunctionNotBetween(String value1, String value2) {
            addCriterion("liver_function not between", value1, value2, "liverFunction");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusIsNull() {
            addCriterion("nutritional_status is null");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusIsNotNull() {
            addCriterion("nutritional_status is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusEqualTo(String value) {
            addCriterion("nutritional_status =", value, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusNotEqualTo(String value) {
            addCriterion("nutritional_status <>", value, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusGreaterThan(String value) {
            addCriterion("nutritional_status >", value, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("nutritional_status >=", value, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusLessThan(String value) {
            addCriterion("nutritional_status <", value, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusLessThanOrEqualTo(String value) {
            addCriterion("nutritional_status <=", value, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusLike(String value) {
            addCriterion("nutritional_status like", value, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusNotLike(String value) {
            addCriterion("nutritional_status not like", value, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusIn(List<String> values) {
            addCriterion("nutritional_status in", values, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusNotIn(List<String> values) {
            addCriterion("nutritional_status not in", values, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusBetween(String value1, String value2) {
            addCriterion("nutritional_status between", value1, value2, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andNutritionalStatusNotBetween(String value1, String value2) {
            addCriterion("nutritional_status not between", value1, value2, "nutritionalStatus");
            return (Criteria) this;
        }

        public Criteria andCardiovascularIsNull() {
            addCriterion("cardiovascular is null");
            return (Criteria) this;
        }

        public Criteria andCardiovascularIsNotNull() {
            addCriterion("cardiovascular is not null");
            return (Criteria) this;
        }

        public Criteria andCardiovascularEqualTo(String value) {
            addCriterion("cardiovascular =", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularNotEqualTo(String value) {
            addCriterion("cardiovascular <>", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularGreaterThan(String value) {
            addCriterion("cardiovascular >", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularGreaterThanOrEqualTo(String value) {
            addCriterion("cardiovascular >=", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularLessThan(String value) {
            addCriterion("cardiovascular <", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularLessThanOrEqualTo(String value) {
            addCriterion("cardiovascular <=", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularLike(String value) {
            addCriterion("cardiovascular like", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularNotLike(String value) {
            addCriterion("cardiovascular not like", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularIn(List<String> values) {
            addCriterion("cardiovascular in", values, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularNotIn(List<String> values) {
            addCriterion("cardiovascular not in", values, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularBetween(String value1, String value2) {
            addCriterion("cardiovascular between", value1, value2, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularNotBetween(String value1, String value2) {
            addCriterion("cardiovascular not between", value1, value2, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andNerveIsNull() {
            addCriterion("nerve is null");
            return (Criteria) this;
        }

        public Criteria andNerveIsNotNull() {
            addCriterion("nerve is not null");
            return (Criteria) this;
        }

        public Criteria andNerveEqualTo(String value) {
            addCriterion("nerve =", value, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveNotEqualTo(String value) {
            addCriterion("nerve <>", value, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveGreaterThan(String value) {
            addCriterion("nerve >", value, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveGreaterThanOrEqualTo(String value) {
            addCriterion("nerve >=", value, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveLessThan(String value) {
            addCriterion("nerve <", value, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveLessThanOrEqualTo(String value) {
            addCriterion("nerve <=", value, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveLike(String value) {
            addCriterion("nerve like", value, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveNotLike(String value) {
            addCriterion("nerve not like", value, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveIn(List<String> values) {
            addCriterion("nerve in", values, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveNotIn(List<String> values) {
            addCriterion("nerve not in", values, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveBetween(String value1, String value2) {
            addCriterion("nerve between", value1, value2, "nerve");
            return (Criteria) this;
        }

        public Criteria andNerveNotBetween(String value1, String value2) {
            addCriterion("nerve not between", value1, value2, "nerve");
            return (Criteria) this;
        }

        public Criteria andLiverIsNull() {
            addCriterion("liver is null");
            return (Criteria) this;
        }

        public Criteria andLiverIsNotNull() {
            addCriterion("liver is not null");
            return (Criteria) this;
        }

        public Criteria andLiverEqualTo(String value) {
            addCriterion("liver =", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverNotEqualTo(String value) {
            addCriterion("liver <>", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverGreaterThan(String value) {
            addCriterion("liver >", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverGreaterThanOrEqualTo(String value) {
            addCriterion("liver >=", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverLessThan(String value) {
            addCriterion("liver <", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverLessThanOrEqualTo(String value) {
            addCriterion("liver <=", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverLike(String value) {
            addCriterion("liver like", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverNotLike(String value) {
            addCriterion("liver not like", value, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverIn(List<String> values) {
            addCriterion("liver in", values, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverNotIn(List<String> values) {
            addCriterion("liver not in", values, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverBetween(String value1, String value2) {
            addCriterion("liver between", value1, value2, "liver");
            return (Criteria) this;
        }

        public Criteria andLiverNotBetween(String value1, String value2) {
            addCriterion("liver not between", value1, value2, "liver");
            return (Criteria) this;
        }

        public Criteria andLungIsNull() {
            addCriterion("lung is null");
            return (Criteria) this;
        }

        public Criteria andLungIsNotNull() {
            addCriterion("lung is not null");
            return (Criteria) this;
        }

        public Criteria andLungEqualTo(String value) {
            addCriterion("lung =", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungNotEqualTo(String value) {
            addCriterion("lung <>", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungGreaterThan(String value) {
            addCriterion("lung >", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungGreaterThanOrEqualTo(String value) {
            addCriterion("lung >=", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungLessThan(String value) {
            addCriterion("lung <", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungLessThanOrEqualTo(String value) {
            addCriterion("lung <=", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungLike(String value) {
            addCriterion("lung like", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungNotLike(String value) {
            addCriterion("lung not like", value, "lung");
            return (Criteria) this;
        }

        public Criteria andLungIn(List<String> values) {
            addCriterion("lung in", values, "lung");
            return (Criteria) this;
        }

        public Criteria andLungNotIn(List<String> values) {
            addCriterion("lung not in", values, "lung");
            return (Criteria) this;
        }

        public Criteria andLungBetween(String value1, String value2) {
            addCriterion("lung between", value1, value2, "lung");
            return (Criteria) this;
        }

        public Criteria andLungNotBetween(String value1, String value2) {
            addCriterion("lung not between", value1, value2, "lung");
            return (Criteria) this;
        }

        public Criteria andSpleenIsNull() {
            addCriterion("spleen is null");
            return (Criteria) this;
        }

        public Criteria andSpleenIsNotNull() {
            addCriterion("spleen is not null");
            return (Criteria) this;
        }

        public Criteria andSpleenEqualTo(String value) {
            addCriterion("spleen =", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenNotEqualTo(String value) {
            addCriterion("spleen <>", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenGreaterThan(String value) {
            addCriterion("spleen >", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenGreaterThanOrEqualTo(String value) {
            addCriterion("spleen >=", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenLessThan(String value) {
            addCriterion("spleen <", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenLessThanOrEqualTo(String value) {
            addCriterion("spleen <=", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenLike(String value) {
            addCriterion("spleen like", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenNotLike(String value) {
            addCriterion("spleen not like", value, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenIn(List<String> values) {
            addCriterion("spleen in", values, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenNotIn(List<String> values) {
            addCriterion("spleen not in", values, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenBetween(String value1, String value2) {
            addCriterion("spleen between", value1, value2, "spleen");
            return (Criteria) this;
        }

        public Criteria andSpleenNotBetween(String value1, String value2) {
            addCriterion("spleen not between", value1, value2, "spleen");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionIsNull() {
            addCriterion("physician_opinion is null");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionIsNotNull() {
            addCriterion("physician_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionEqualTo(String value) {
            addCriterion("physician_opinion =", value, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionNotEqualTo(String value) {
            addCriterion("physician_opinion <>", value, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionGreaterThan(String value) {
            addCriterion("physician_opinion >", value, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("physician_opinion >=", value, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionLessThan(String value) {
            addCriterion("physician_opinion <", value, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionLessThanOrEqualTo(String value) {
            addCriterion("physician_opinion <=", value, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionLike(String value) {
            addCriterion("physician_opinion like", value, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionNotLike(String value) {
            addCriterion("physician_opinion not like", value, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionIn(List<String> values) {
            addCriterion("physician_opinion in", values, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionNotIn(List<String> values) {
            addCriterion("physician_opinion not in", values, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionBetween(String value1, String value2) {
            addCriterion("physician_opinion between", value1, value2, "physicianOpinion");
            return (Criteria) this;
        }

        public Criteria andPhysicianOpinionNotBetween(String value1, String value2) {
            addCriterion("physician_opinion not between", value1, value2, "physicianOpinion");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}