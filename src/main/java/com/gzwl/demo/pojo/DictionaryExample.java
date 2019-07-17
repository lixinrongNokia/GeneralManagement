package com.gzwl.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class DictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryExample() {
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

        public Criteria andDictionaryIdIsNull() {
            addCriterion("dictionary_id is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdIsNotNull() {
            addCriterion("dictionary_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdEqualTo(Integer value) {
            addCriterion("dictionary_id =", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdNotEqualTo(Integer value) {
            addCriterion("dictionary_id <>", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdGreaterThan(Integer value) {
            addCriterion("dictionary_id >", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictionary_id >=", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdLessThan(Integer value) {
            addCriterion("dictionary_id <", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("dictionary_id <=", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdIn(List<Integer> values) {
            addCriterion("dictionary_id in", values, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdNotIn(List<Integer> values) {
            addCriterion("dictionary_id not in", values, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_id between", value1, value2, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_id not between", value1, value2, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableIsNull() {
            addCriterion("dictionary_table is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableIsNotNull() {
            addCriterion("dictionary_table is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableEqualTo(String value) {
            addCriterion("dictionary_table =", value, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableNotEqualTo(String value) {
            addCriterion("dictionary_table <>", value, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableGreaterThan(String value) {
            addCriterion("dictionary_table >", value, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_table >=", value, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableLessThan(String value) {
            addCriterion("dictionary_table <", value, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableLessThanOrEqualTo(String value) {
            addCriterion("dictionary_table <=", value, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableLike(String value) {
            addCriterion("dictionary_table like", value, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableNotLike(String value) {
            addCriterion("dictionary_table not like", value, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableIn(List<String> values) {
            addCriterion("dictionary_table in", values, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableNotIn(List<String> values) {
            addCriterion("dictionary_table not in", values, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableBetween(String value1, String value2) {
            addCriterion("dictionary_table between", value1, value2, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryTableNotBetween(String value1, String value2) {
            addCriterion("dictionary_table not between", value1, value2, "dictionaryTable");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumIsNull() {
            addCriterion("dictionary_colum is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumIsNotNull() {
            addCriterion("dictionary_colum is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumEqualTo(String value) {
            addCriterion("dictionary_colum =", value, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumNotEqualTo(String value) {
            addCriterion("dictionary_colum <>", value, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumGreaterThan(String value) {
            addCriterion("dictionary_colum >", value, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_colum >=", value, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumLessThan(String value) {
            addCriterion("dictionary_colum <", value, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumLessThanOrEqualTo(String value) {
            addCriterion("dictionary_colum <=", value, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumLike(String value) {
            addCriterion("dictionary_colum like", value, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumNotLike(String value) {
            addCriterion("dictionary_colum not like", value, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumIn(List<String> values) {
            addCriterion("dictionary_colum in", values, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumNotIn(List<String> values) {
            addCriterion("dictionary_colum not in", values, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumBetween(String value1, String value2) {
            addCriterion("dictionary_colum between", value1, value2, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryColumNotBetween(String value1, String value2) {
            addCriterion("dictionary_colum not between", value1, value2, "dictionaryColum");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueIsNull() {
            addCriterion("dictionary_value is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueIsNotNull() {
            addCriterion("dictionary_value is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueEqualTo(String value) {
            addCriterion("dictionary_value =", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotEqualTo(String value) {
            addCriterion("dictionary_value <>", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueGreaterThan(String value) {
            addCriterion("dictionary_value >", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_value >=", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueLessThan(String value) {
            addCriterion("dictionary_value <", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueLessThanOrEqualTo(String value) {
            addCriterion("dictionary_value <=", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueLike(String value) {
            addCriterion("dictionary_value like", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotLike(String value) {
            addCriterion("dictionary_value not like", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueIn(List<String> values) {
            addCriterion("dictionary_value in", values, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotIn(List<String> values) {
            addCriterion("dictionary_value not in", values, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueBetween(String value1, String value2) {
            addCriterion("dictionary_value between", value1, value2, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotBetween(String value1, String value2) {
            addCriterion("dictionary_value not between", value1, value2, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberIsNull() {
            addCriterion("dictionary_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberIsNotNull() {
            addCriterion("dictionary_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberEqualTo(Integer value) {
            addCriterion("dictionary_serial_number =", value, "dictionarySerialNumber");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberNotEqualTo(Integer value) {
            addCriterion("dictionary_serial_number <>", value, "dictionarySerialNumber");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberGreaterThan(Integer value) {
            addCriterion("dictionary_serial_number >", value, "dictionarySerialNumber");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictionary_serial_number >=", value, "dictionarySerialNumber");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberLessThan(Integer value) {
            addCriterion("dictionary_serial_number <", value, "dictionarySerialNumber");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberLessThanOrEqualTo(Integer value) {
            addCriterion("dictionary_serial_number <=", value, "dictionarySerialNumber");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberIn(List<Integer> values) {
            addCriterion("dictionary_serial_number in", values, "dictionarySerialNumber");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberNotIn(List<Integer> values) {
            addCriterion("dictionary_serial_number not in", values, "dictionarySerialNumber");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_serial_number between", value1, value2, "dictionarySerialNumber");
            return (Criteria) this;
        }

        public Criteria andDictionarySerialNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_serial_number not between", value1, value2, "dictionarySerialNumber");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusIsNull() {
            addCriterion("dictionary_status is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusIsNotNull() {
            addCriterion("dictionary_status is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusEqualTo(Integer value) {
            addCriterion("dictionary_status =", value, "dictionaryStatus");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusNotEqualTo(Integer value) {
            addCriterion("dictionary_status <>", value, "dictionaryStatus");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusGreaterThan(Integer value) {
            addCriterion("dictionary_status >", value, "dictionaryStatus");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictionary_status >=", value, "dictionaryStatus");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusLessThan(Integer value) {
            addCriterion("dictionary_status <", value, "dictionaryStatus");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dictionary_status <=", value, "dictionaryStatus");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusIn(List<Integer> values) {
            addCriterion("dictionary_status in", values, "dictionaryStatus");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusNotIn(List<Integer> values) {
            addCriterion("dictionary_status not in", values, "dictionaryStatus");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_status between", value1, value2, "dictionaryStatus");
            return (Criteria) this;
        }

        public Criteria andDictionaryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dictionary_status not between", value1, value2, "dictionaryStatus");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksIsNull() {
            addCriterion("dictionary_remarks is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksIsNotNull() {
            addCriterion("dictionary_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksEqualTo(String value) {
            addCriterion("dictionary_remarks =", value, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksNotEqualTo(String value) {
            addCriterion("dictionary_remarks <>", value, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksGreaterThan(String value) {
            addCriterion("dictionary_remarks >", value, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_remarks >=", value, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksLessThan(String value) {
            addCriterion("dictionary_remarks <", value, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksLessThanOrEqualTo(String value) {
            addCriterion("dictionary_remarks <=", value, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksLike(String value) {
            addCriterion("dictionary_remarks like", value, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksNotLike(String value) {
            addCriterion("dictionary_remarks not like", value, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksIn(List<String> values) {
            addCriterion("dictionary_remarks in", values, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksNotIn(List<String> values) {
            addCriterion("dictionary_remarks not in", values, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksBetween(String value1, String value2) {
            addCriterion("dictionary_remarks between", value1, value2, "dictionaryRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionaryRemarksNotBetween(String value1, String value2) {
            addCriterion("dictionary_remarks not between", value1, value2, "dictionaryRemarks");
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