package com.gzwl.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class DictionaryTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryTypeExample() {
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

        public Criteria andDictionaryTypeIdIsNull() {
            addCriterion("dictionary_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdIsNotNull() {
            addCriterion("dictionary_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdEqualTo(Integer value) {
            addCriterion("dictionary_type_id =", value, "dictionaryTypeId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdNotEqualTo(Integer value) {
            addCriterion("dictionary_type_id <>", value, "dictionaryTypeId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdGreaterThan(Integer value) {
            addCriterion("dictionary_type_id >", value, "dictionaryTypeId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictionary_type_id >=", value, "dictionaryTypeId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdLessThan(Integer value) {
            addCriterion("dictionary_type_id <", value, "dictionaryTypeId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("dictionary_type_id <=", value, "dictionaryTypeId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdIn(List<Integer> values) {
            addCriterion("dictionary_type_id in", values, "dictionaryTypeId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdNotIn(List<Integer> values) {
            addCriterion("dictionary_type_id not in", values, "dictionaryTypeId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_type_id between", value1, value2, "dictionaryTypeId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_type_id not between", value1, value2, "dictionaryTypeId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameIsNull() {
            addCriterion("dictionary_type_name is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameIsNotNull() {
            addCriterion("dictionary_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameEqualTo(String value) {
            addCriterion("dictionary_type_name =", value, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameNotEqualTo(String value) {
            addCriterion("dictionary_type_name <>", value, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameGreaterThan(String value) {
            addCriterion("dictionary_type_name >", value, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_type_name >=", value, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameLessThan(String value) {
            addCriterion("dictionary_type_name <", value, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameLessThanOrEqualTo(String value) {
            addCriterion("dictionary_type_name <=", value, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameLike(String value) {
            addCriterion("dictionary_type_name like", value, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameNotLike(String value) {
            addCriterion("dictionary_type_name not like", value, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameIn(List<String> values) {
            addCriterion("dictionary_type_name in", values, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameNotIn(List<String> values) {
            addCriterion("dictionary_type_name not in", values, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameBetween(String value1, String value2) {
            addCriterion("dictionary_type_name between", value1, value2, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNameNotBetween(String value1, String value2) {
            addCriterion("dictionary_type_name not between", value1, value2, "dictionaryTypeName");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueIsNull() {
            addCriterion("dictionary_type_value is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueIsNotNull() {
            addCriterion("dictionary_type_value is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueEqualTo(String value) {
            addCriterion("dictionary_type_value =", value, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueNotEqualTo(String value) {
            addCriterion("dictionary_type_value <>", value, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueGreaterThan(String value) {
            addCriterion("dictionary_type_value >", value, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_type_value >=", value, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueLessThan(String value) {
            addCriterion("dictionary_type_value <", value, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueLessThanOrEqualTo(String value) {
            addCriterion("dictionary_type_value <=", value, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueLike(String value) {
            addCriterion("dictionary_type_value like", value, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueNotLike(String value) {
            addCriterion("dictionary_type_value not like", value, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueIn(List<String> values) {
            addCriterion("dictionary_type_value in", values, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueNotIn(List<String> values) {
            addCriterion("dictionary_type_value not in", values, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueBetween(String value1, String value2) {
            addCriterion("dictionary_type_value between", value1, value2, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeValueNotBetween(String value1, String value2) {
            addCriterion("dictionary_type_value not between", value1, value2, "dictionaryTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeIsNull() {
            addCriterion("dictionary_type_type is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeIsNotNull() {
            addCriterion("dictionary_type_type is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeEqualTo(String value) {
            addCriterion("dictionary_type_type =", value, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeNotEqualTo(String value) {
            addCriterion("dictionary_type_type <>", value, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeGreaterThan(String value) {
            addCriterion("dictionary_type_type >", value, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_type_type >=", value, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeLessThan(String value) {
            addCriterion("dictionary_type_type <", value, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeLessThanOrEqualTo(String value) {
            addCriterion("dictionary_type_type <=", value, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeLike(String value) {
            addCriterion("dictionary_type_type like", value, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeNotLike(String value) {
            addCriterion("dictionary_type_type not like", value, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeIn(List<String> values) {
            addCriterion("dictionary_type_type in", values, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeNotIn(List<String> values) {
            addCriterion("dictionary_type_type not in", values, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeBetween(String value1, String value2) {
            addCriterion("dictionary_type_type between", value1, value2, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeTypeNotBetween(String value1, String value2) {
            addCriterion("dictionary_type_type not between", value1, value2, "dictionaryTypeType");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }
        /** 别名条件 */
        public Criteria andParentIdEqualTo_alias(Integer value) {
            addCriterion("dictionary_type1.parent_id =", value, "dtParentId");
            return (Criteria) this;
        }
		/** 别名条件 */
        public Criteria andDictionaryTypeValueLike_alias(String value) {
            addCriterion("dictionary_type1.dictionary_type_value like", value, "dictionaryTypeValue");
            return (Criteria) this;
        }
        /** 别名条件 */
        public Criteria andDictionaryTypeNameLike_alias(String value) {
            addCriterion("dictionary_type1.dictionary_type_name like", value, "dictionaryTypeName");
            return (Criteria) this;
        }
        
		/** 别名条件 */
        public Criteria andDictionaryTypeTypeEqualTo_alias(String value) {
            addCriterion("dictionary_type1.dictionary_type_type =", value, "dictionaryTypeType");
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