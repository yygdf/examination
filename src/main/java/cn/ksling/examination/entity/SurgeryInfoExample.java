package cn.ksling.examination.entity;

import java.util.ArrayList;
import java.util.List;

public class SurgeryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurgeryInfoExample() {
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

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andSkinIsNull() {
            addCriterion("skin is null");
            return (Criteria) this;
        }

        public Criteria andSkinIsNotNull() {
            addCriterion("skin is not null");
            return (Criteria) this;
        }

        public Criteria andSkinEqualTo(String value) {
            addCriterion("skin =", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotEqualTo(String value) {
            addCriterion("skin <>", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThan(String value) {
            addCriterion("skin >", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThanOrEqualTo(String value) {
            addCriterion("skin >=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThan(String value) {
            addCriterion("skin <", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThanOrEqualTo(String value) {
            addCriterion("skin <=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLike(String value) {
            addCriterion("skin like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotLike(String value) {
            addCriterion("skin not like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinIn(List<String> values) {
            addCriterion("skin in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotIn(List<String> values) {
            addCriterion("skin not in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinBetween(String value1, String value2) {
            addCriterion("skin between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotBetween(String value1, String value2) {
            addCriterion("skin not between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andLimbIsNull() {
            addCriterion("limb is null");
            return (Criteria) this;
        }

        public Criteria andLimbIsNotNull() {
            addCriterion("limb is not null");
            return (Criteria) this;
        }

        public Criteria andLimbEqualTo(String value) {
            addCriterion("limb =", value, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbNotEqualTo(String value) {
            addCriterion("limb <>", value, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbGreaterThan(String value) {
            addCriterion("limb >", value, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbGreaterThanOrEqualTo(String value) {
            addCriterion("limb >=", value, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbLessThan(String value) {
            addCriterion("limb <", value, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbLessThanOrEqualTo(String value) {
            addCriterion("limb <=", value, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbLike(String value) {
            addCriterion("limb like", value, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbNotLike(String value) {
            addCriterion("limb not like", value, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbIn(List<String> values) {
            addCriterion("limb in", values, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbNotIn(List<String> values) {
            addCriterion("limb not in", values, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbBetween(String value1, String value2) {
            addCriterion("limb between", value1, value2, "limb");
            return (Criteria) this;
        }

        public Criteria andLimbNotBetween(String value1, String value2) {
            addCriterion("limb not between", value1, value2, "limb");
            return (Criteria) this;
        }

        public Criteria andLymphIsNull() {
            addCriterion("lymph is null");
            return (Criteria) this;
        }

        public Criteria andLymphIsNotNull() {
            addCriterion("lymph is not null");
            return (Criteria) this;
        }

        public Criteria andLymphEqualTo(String value) {
            addCriterion("lymph =", value, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphNotEqualTo(String value) {
            addCriterion("lymph <>", value, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphGreaterThan(String value) {
            addCriterion("lymph >", value, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphGreaterThanOrEqualTo(String value) {
            addCriterion("lymph >=", value, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphLessThan(String value) {
            addCriterion("lymph <", value, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphLessThanOrEqualTo(String value) {
            addCriterion("lymph <=", value, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphLike(String value) {
            addCriterion("lymph like", value, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphNotLike(String value) {
            addCriterion("lymph not like", value, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphIn(List<String> values) {
            addCriterion("lymph in", values, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphNotIn(List<String> values) {
            addCriterion("lymph not in", values, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphBetween(String value1, String value2) {
            addCriterion("lymph between", value1, value2, "lymph");
            return (Criteria) this;
        }

        public Criteria andLymphNotBetween(String value1, String value2) {
            addCriterion("lymph not between", value1, value2, "lymph");
            return (Criteria) this;
        }

        public Criteria andJointIsNull() {
            addCriterion("joint is null");
            return (Criteria) this;
        }

        public Criteria andJointIsNotNull() {
            addCriterion("joint is not null");
            return (Criteria) this;
        }

        public Criteria andJointEqualTo(String value) {
            addCriterion("joint =", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointNotEqualTo(String value) {
            addCriterion("joint <>", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointGreaterThan(String value) {
            addCriterion("joint >", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointGreaterThanOrEqualTo(String value) {
            addCriterion("joint >=", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointLessThan(String value) {
            addCriterion("joint <", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointLessThanOrEqualTo(String value) {
            addCriterion("joint <=", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointLike(String value) {
            addCriterion("joint like", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointNotLike(String value) {
            addCriterion("joint not like", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointIn(List<String> values) {
            addCriterion("joint in", values, "joint");
            return (Criteria) this;
        }

        public Criteria andJointNotIn(List<String> values) {
            addCriterion("joint not in", values, "joint");
            return (Criteria) this;
        }

        public Criteria andJointBetween(String value1, String value2) {
            addCriterion("joint between", value1, value2, "joint");
            return (Criteria) this;
        }

        public Criteria andJointNotBetween(String value1, String value2) {
            addCriterion("joint not between", value1, value2, "joint");
            return (Criteria) this;
        }

        public Criteria andSpineIsNull() {
            addCriterion("spine is null");
            return (Criteria) this;
        }

        public Criteria andSpineIsNotNull() {
            addCriterion("spine is not null");
            return (Criteria) this;
        }

        public Criteria andSpineEqualTo(String value) {
            addCriterion("spine =", value, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineNotEqualTo(String value) {
            addCriterion("spine <>", value, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineGreaterThan(String value) {
            addCriterion("spine >", value, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineGreaterThanOrEqualTo(String value) {
            addCriterion("spine >=", value, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineLessThan(String value) {
            addCriterion("spine <", value, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineLessThanOrEqualTo(String value) {
            addCriterion("spine <=", value, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineLike(String value) {
            addCriterion("spine like", value, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineNotLike(String value) {
            addCriterion("spine not like", value, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineIn(List<String> values) {
            addCriterion("spine in", values, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineNotIn(List<String> values) {
            addCriterion("spine not in", values, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineBetween(String value1, String value2) {
            addCriterion("spine between", value1, value2, "spine");
            return (Criteria) this;
        }

        public Criteria andSpineNotBetween(String value1, String value2) {
            addCriterion("spine not between", value1, value2, "spine");
            return (Criteria) this;
        }

        public Criteria andThyroidIsNull() {
            addCriterion("thyroid is null");
            return (Criteria) this;
        }

        public Criteria andThyroidIsNotNull() {
            addCriterion("thyroid is not null");
            return (Criteria) this;
        }

        public Criteria andThyroidEqualTo(String value) {
            addCriterion("thyroid =", value, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidNotEqualTo(String value) {
            addCriterion("thyroid <>", value, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidGreaterThan(String value) {
            addCriterion("thyroid >", value, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidGreaterThanOrEqualTo(String value) {
            addCriterion("thyroid >=", value, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidLessThan(String value) {
            addCriterion("thyroid <", value, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidLessThanOrEqualTo(String value) {
            addCriterion("thyroid <=", value, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidLike(String value) {
            addCriterion("thyroid like", value, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidNotLike(String value) {
            addCriterion("thyroid not like", value, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidIn(List<String> values) {
            addCriterion("thyroid in", values, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidNotIn(List<String> values) {
            addCriterion("thyroid not in", values, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidBetween(String value1, String value2) {
            addCriterion("thyroid between", value1, value2, "thyroid");
            return (Criteria) this;
        }

        public Criteria andThyroidNotBetween(String value1, String value2) {
            addCriterion("thyroid not between", value1, value2, "thyroid");
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