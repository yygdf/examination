package cn.ksling.examination.entity;

import java.util.ArrayList;
import java.util.List;

public class FacialFeaturesInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FacialFeaturesInfoExample() {
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

        public Criteria andHearingLeftIsNull() {
            addCriterion("hearing_left is null");
            return (Criteria) this;
        }

        public Criteria andHearingLeftIsNotNull() {
            addCriterion("hearing_left is not null");
            return (Criteria) this;
        }

        public Criteria andHearingLeftEqualTo(Float value) {
            addCriterion("hearing_left =", value, "hearingLeft");
            return (Criteria) this;
        }

        public Criteria andHearingLeftNotEqualTo(Float value) {
            addCriterion("hearing_left <>", value, "hearingLeft");
            return (Criteria) this;
        }

        public Criteria andHearingLeftGreaterThan(Float value) {
            addCriterion("hearing_left >", value, "hearingLeft");
            return (Criteria) this;
        }

        public Criteria andHearingLeftGreaterThanOrEqualTo(Float value) {
            addCriterion("hearing_left >=", value, "hearingLeft");
            return (Criteria) this;
        }

        public Criteria andHearingLeftLessThan(Float value) {
            addCriterion("hearing_left <", value, "hearingLeft");
            return (Criteria) this;
        }

        public Criteria andHearingLeftLessThanOrEqualTo(Float value) {
            addCriterion("hearing_left <=", value, "hearingLeft");
            return (Criteria) this;
        }

        public Criteria andHearingLeftIn(List<Float> values) {
            addCriterion("hearing_left in", values, "hearingLeft");
            return (Criteria) this;
        }

        public Criteria andHearingLeftNotIn(List<Float> values) {
            addCriterion("hearing_left not in", values, "hearingLeft");
            return (Criteria) this;
        }

        public Criteria andHearingLeftBetween(Float value1, Float value2) {
            addCriterion("hearing_left between", value1, value2, "hearingLeft");
            return (Criteria) this;
        }

        public Criteria andHearingLeftNotBetween(Float value1, Float value2) {
            addCriterion("hearing_left not between", value1, value2, "hearingLeft");
            return (Criteria) this;
        }

        public Criteria andHearingRightIsNull() {
            addCriterion("hearing_right is null");
            return (Criteria) this;
        }

        public Criteria andHearingRightIsNotNull() {
            addCriterion("hearing_right is not null");
            return (Criteria) this;
        }

        public Criteria andHearingRightEqualTo(Float value) {
            addCriterion("hearing_right =", value, "hearingRight");
            return (Criteria) this;
        }

        public Criteria andHearingRightNotEqualTo(Float value) {
            addCriterion("hearing_right <>", value, "hearingRight");
            return (Criteria) this;
        }

        public Criteria andHearingRightGreaterThan(Float value) {
            addCriterion("hearing_right >", value, "hearingRight");
            return (Criteria) this;
        }

        public Criteria andHearingRightGreaterThanOrEqualTo(Float value) {
            addCriterion("hearing_right >=", value, "hearingRight");
            return (Criteria) this;
        }

        public Criteria andHearingRightLessThan(Float value) {
            addCriterion("hearing_right <", value, "hearingRight");
            return (Criteria) this;
        }

        public Criteria andHearingRightLessThanOrEqualTo(Float value) {
            addCriterion("hearing_right <=", value, "hearingRight");
            return (Criteria) this;
        }

        public Criteria andHearingRightIn(List<Float> values) {
            addCriterion("hearing_right in", values, "hearingRight");
            return (Criteria) this;
        }

        public Criteria andHearingRightNotIn(List<Float> values) {
            addCriterion("hearing_right not in", values, "hearingRight");
            return (Criteria) this;
        }

        public Criteria andHearingRightBetween(Float value1, Float value2) {
            addCriterion("hearing_right between", value1, value2, "hearingRight");
            return (Criteria) this;
        }

        public Criteria andHearingRightNotBetween(Float value1, Float value2) {
            addCriterion("hearing_right not between", value1, value2, "hearingRight");
            return (Criteria) this;
        }

        public Criteria andEarInfectionIsNull() {
            addCriterion("ear_infection is null");
            return (Criteria) this;
        }

        public Criteria andEarInfectionIsNotNull() {
            addCriterion("ear_infection is not null");
            return (Criteria) this;
        }

        public Criteria andEarInfectionEqualTo(String value) {
            addCriterion("ear_infection =", value, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionNotEqualTo(String value) {
            addCriterion("ear_infection <>", value, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionGreaterThan(String value) {
            addCriterion("ear_infection >", value, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionGreaterThanOrEqualTo(String value) {
            addCriterion("ear_infection >=", value, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionLessThan(String value) {
            addCriterion("ear_infection <", value, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionLessThanOrEqualTo(String value) {
            addCriterion("ear_infection <=", value, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionLike(String value) {
            addCriterion("ear_infection like", value, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionNotLike(String value) {
            addCriterion("ear_infection not like", value, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionIn(List<String> values) {
            addCriterion("ear_infection in", values, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionNotIn(List<String> values) {
            addCriterion("ear_infection not in", values, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionBetween(String value1, String value2) {
            addCriterion("ear_infection between", value1, value2, "earInfection");
            return (Criteria) this;
        }

        public Criteria andEarInfectionNotBetween(String value1, String value2) {
            addCriterion("ear_infection not between", value1, value2, "earInfection");
            return (Criteria) this;
        }

        public Criteria andSmellIsNull() {
            addCriterion("smell is null");
            return (Criteria) this;
        }

        public Criteria andSmellIsNotNull() {
            addCriterion("smell is not null");
            return (Criteria) this;
        }

        public Criteria andSmellEqualTo(String value) {
            addCriterion("smell =", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellNotEqualTo(String value) {
            addCriterion("smell <>", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellGreaterThan(String value) {
            addCriterion("smell >", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellGreaterThanOrEqualTo(String value) {
            addCriterion("smell >=", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellLessThan(String value) {
            addCriterion("smell <", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellLessThanOrEqualTo(String value) {
            addCriterion("smell <=", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellLike(String value) {
            addCriterion("smell like", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellNotLike(String value) {
            addCriterion("smell not like", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellIn(List<String> values) {
            addCriterion("smell in", values, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellNotIn(List<String> values) {
            addCriterion("smell not in", values, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellBetween(String value1, String value2) {
            addCriterion("smell between", value1, value2, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellNotBetween(String value1, String value2) {
            addCriterion("smell not between", value1, value2, "smell");
            return (Criteria) this;
        }

        public Criteria andStutterIsNull() {
            addCriterion("stutter is null");
            return (Criteria) this;
        }

        public Criteria andStutterIsNotNull() {
            addCriterion("stutter is not null");
            return (Criteria) this;
        }

        public Criteria andStutterEqualTo(String value) {
            addCriterion("stutter =", value, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterNotEqualTo(String value) {
            addCriterion("stutter <>", value, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterGreaterThan(String value) {
            addCriterion("stutter >", value, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterGreaterThanOrEqualTo(String value) {
            addCriterion("stutter >=", value, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterLessThan(String value) {
            addCriterion("stutter <", value, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterLessThanOrEqualTo(String value) {
            addCriterion("stutter <=", value, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterLike(String value) {
            addCriterion("stutter like", value, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterNotLike(String value) {
            addCriterion("stutter not like", value, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterIn(List<String> values) {
            addCriterion("stutter in", values, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterNotIn(List<String> values) {
            addCriterion("stutter not in", values, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterBetween(String value1, String value2) {
            addCriterion("stutter between", value1, value2, "stutter");
            return (Criteria) this;
        }

        public Criteria andStutterNotBetween(String value1, String value2) {
            addCriterion("stutter not between", value1, value2, "stutter");
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