package cn.ksling.examination.entity;

import java.util.ArrayList;
import java.util.List;

public class EyeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EyeInfoExample() {
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

        public Criteria andNakedVisionLeftIsNull() {
            addCriterion("naked_vision_left is null");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftIsNotNull() {
            addCriterion("naked_vision_left is not null");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftEqualTo(Float value) {
            addCriterion("naked_vision_left =", value, "nakedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftNotEqualTo(Float value) {
            addCriterion("naked_vision_left <>", value, "nakedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftGreaterThan(Float value) {
            addCriterion("naked_vision_left >", value, "nakedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftGreaterThanOrEqualTo(Float value) {
            addCriterion("naked_vision_left >=", value, "nakedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftLessThan(Float value) {
            addCriterion("naked_vision_left <", value, "nakedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftLessThanOrEqualTo(Float value) {
            addCriterion("naked_vision_left <=", value, "nakedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftIn(List<Float> values) {
            addCriterion("naked_vision_left in", values, "nakedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftNotIn(List<Float> values) {
            addCriterion("naked_vision_left not in", values, "nakedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftBetween(Float value1, Float value2) {
            addCriterion("naked_vision_left between", value1, value2, "nakedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andNakedVisionLeftNotBetween(Float value1, Float value2) {
            addCriterion("naked_vision_left not between", value1, value2, "nakedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightIsNull() {
            addCriterion("naked_vision_right is null");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightIsNotNull() {
            addCriterion("naked_vision_right is not null");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightEqualTo(Float value) {
            addCriterion("naked_vision_right =", value, "nakedVisionRight");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightNotEqualTo(Float value) {
            addCriterion("naked_vision_right <>", value, "nakedVisionRight");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightGreaterThan(Float value) {
            addCriterion("naked_vision_right >", value, "nakedVisionRight");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightGreaterThanOrEqualTo(Float value) {
            addCriterion("naked_vision_right >=", value, "nakedVisionRight");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightLessThan(Float value) {
            addCriterion("naked_vision_right <", value, "nakedVisionRight");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightLessThanOrEqualTo(Float value) {
            addCriterion("naked_vision_right <=", value, "nakedVisionRight");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightIn(List<Float> values) {
            addCriterion("naked_vision_right in", values, "nakedVisionRight");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightNotIn(List<Float> values) {
            addCriterion("naked_vision_right not in", values, "nakedVisionRight");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightBetween(Float value1, Float value2) {
            addCriterion("naked_vision_right between", value1, value2, "nakedVisionRight");
            return (Criteria) this;
        }

        public Criteria andNakedVisionRightNotBetween(Float value1, Float value2) {
            addCriterion("naked_vision_right not between", value1, value2, "nakedVisionRight");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftIsNull() {
            addCriterion("corrected_vision_left is null");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftIsNotNull() {
            addCriterion("corrected_vision_left is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftEqualTo(Float value) {
            addCriterion("corrected_vision_left =", value, "correctedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftNotEqualTo(Float value) {
            addCriterion("corrected_vision_left <>", value, "correctedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftGreaterThan(Float value) {
            addCriterion("corrected_vision_left >", value, "correctedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftGreaterThanOrEqualTo(Float value) {
            addCriterion("corrected_vision_left >=", value, "correctedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftLessThan(Float value) {
            addCriterion("corrected_vision_left <", value, "correctedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftLessThanOrEqualTo(Float value) {
            addCriterion("corrected_vision_left <=", value, "correctedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftIn(List<Float> values) {
            addCriterion("corrected_vision_left in", values, "correctedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftNotIn(List<Float> values) {
            addCriterion("corrected_vision_left not in", values, "correctedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftBetween(Float value1, Float value2) {
            addCriterion("corrected_vision_left between", value1, value2, "correctedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionLeftNotBetween(Float value1, Float value2) {
            addCriterion("corrected_vision_left not between", value1, value2, "correctedVisionLeft");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightIsNull() {
            addCriterion("corrected_vision_right is null");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightIsNotNull() {
            addCriterion("corrected_vision_right is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightEqualTo(Float value) {
            addCriterion("corrected_vision_right =", value, "correctedVisionRight");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightNotEqualTo(Float value) {
            addCriterion("corrected_vision_right <>", value, "correctedVisionRight");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightGreaterThan(Float value) {
            addCriterion("corrected_vision_right >", value, "correctedVisionRight");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightGreaterThanOrEqualTo(Float value) {
            addCriterion("corrected_vision_right >=", value, "correctedVisionRight");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightLessThan(Float value) {
            addCriterion("corrected_vision_right <", value, "correctedVisionRight");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightLessThanOrEqualTo(Float value) {
            addCriterion("corrected_vision_right <=", value, "correctedVisionRight");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightIn(List<Float> values) {
            addCriterion("corrected_vision_right in", values, "correctedVisionRight");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightNotIn(List<Float> values) {
            addCriterion("corrected_vision_right not in", values, "correctedVisionRight");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightBetween(Float value1, Float value2) {
            addCriterion("corrected_vision_right between", value1, value2, "correctedVisionRight");
            return (Criteria) this;
        }

        public Criteria andCorrectedVisionRightNotBetween(Float value1, Float value2) {
            addCriterion("corrected_vision_right not between", value1, value2, "correctedVisionRight");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftIsNull() {
            addCriterion("degree_left is null");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftIsNotNull() {
            addCriterion("degree_left is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftEqualTo(Integer value) {
            addCriterion("degree_left =", value, "degreeLeft");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftNotEqualTo(Integer value) {
            addCriterion("degree_left <>", value, "degreeLeft");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftGreaterThan(Integer value) {
            addCriterion("degree_left >", value, "degreeLeft");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftGreaterThanOrEqualTo(Integer value) {
            addCriterion("degree_left >=", value, "degreeLeft");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftLessThan(Integer value) {
            addCriterion("degree_left <", value, "degreeLeft");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftLessThanOrEqualTo(Integer value) {
            addCriterion("degree_left <=", value, "degreeLeft");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftIn(List<Integer> values) {
            addCriterion("degree_left in", values, "degreeLeft");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftNotIn(List<Integer> values) {
            addCriterion("degree_left not in", values, "degreeLeft");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftBetween(Integer value1, Integer value2) {
            addCriterion("degree_left between", value1, value2, "degreeLeft");
            return (Criteria) this;
        }

        public Criteria andDegreeLeftNotBetween(Integer value1, Integer value2) {
            addCriterion("degree_left not between", value1, value2, "degreeLeft");
            return (Criteria) this;
        }

        public Criteria andDegreeRightIsNull() {
            addCriterion("degree_right is null");
            return (Criteria) this;
        }

        public Criteria andDegreeRightIsNotNull() {
            addCriterion("degree_right is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeRightEqualTo(Integer value) {
            addCriterion("degree_right =", value, "degreeRight");
            return (Criteria) this;
        }

        public Criteria andDegreeRightNotEqualTo(Integer value) {
            addCriterion("degree_right <>", value, "degreeRight");
            return (Criteria) this;
        }

        public Criteria andDegreeRightGreaterThan(Integer value) {
            addCriterion("degree_right >", value, "degreeRight");
            return (Criteria) this;
        }

        public Criteria andDegreeRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("degree_right >=", value, "degreeRight");
            return (Criteria) this;
        }

        public Criteria andDegreeRightLessThan(Integer value) {
            addCriterion("degree_right <", value, "degreeRight");
            return (Criteria) this;
        }

        public Criteria andDegreeRightLessThanOrEqualTo(Integer value) {
            addCriterion("degree_right <=", value, "degreeRight");
            return (Criteria) this;
        }

        public Criteria andDegreeRightIn(List<Integer> values) {
            addCriterion("degree_right in", values, "degreeRight");
            return (Criteria) this;
        }

        public Criteria andDegreeRightNotIn(List<Integer> values) {
            addCriterion("degree_right not in", values, "degreeRight");
            return (Criteria) this;
        }

        public Criteria andDegreeRightBetween(Integer value1, Integer value2) {
            addCriterion("degree_right between", value1, value2, "degreeRight");
            return (Criteria) this;
        }

        public Criteria andDegreeRightNotBetween(Integer value1, Integer value2) {
            addCriterion("degree_right not between", value1, value2, "degreeRight");
            return (Criteria) this;
        }

        public Criteria andColorVisionIsNull() {
            addCriterion("color_vision is null");
            return (Criteria) this;
        }

        public Criteria andColorVisionIsNotNull() {
            addCriterion("color_vision is not null");
            return (Criteria) this;
        }

        public Criteria andColorVisionEqualTo(String value) {
            addCriterion("color_vision =", value, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionNotEqualTo(String value) {
            addCriterion("color_vision <>", value, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionGreaterThan(String value) {
            addCriterion("color_vision >", value, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionGreaterThanOrEqualTo(String value) {
            addCriterion("color_vision >=", value, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionLessThan(String value) {
            addCriterion("color_vision <", value, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionLessThanOrEqualTo(String value) {
            addCriterion("color_vision <=", value, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionLike(String value) {
            addCriterion("color_vision like", value, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionNotLike(String value) {
            addCriterion("color_vision not like", value, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionIn(List<String> values) {
            addCriterion("color_vision in", values, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionNotIn(List<String> values) {
            addCriterion("color_vision not in", values, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionBetween(String value1, String value2) {
            addCriterion("color_vision between", value1, value2, "colorVision");
            return (Criteria) this;
        }

        public Criteria andColorVisionNotBetween(String value1, String value2) {
            addCriterion("color_vision not between", value1, value2, "colorVision");
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