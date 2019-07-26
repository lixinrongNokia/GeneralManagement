package com.gzwl.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employee.employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameIsNull() {
            addCriterion("employee_login_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameIsNotNull() {
            addCriterion("employee_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameEqualTo(String value) {
            addCriterion("employee_login_name =", value, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameNotEqualTo(String value) {
            addCriterion("employee_login_name <>", value, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameGreaterThan(String value) {
            addCriterion("employee_login_name >", value, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_login_name >=", value, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameLessThan(String value) {
            addCriterion("employee_login_name <", value, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameLessThanOrEqualTo(String value) {
            addCriterion("employee_login_name <=", value, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameLike(String value) {
            addCriterion("employee_login_name like", value, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameNotLike(String value) {
            addCriterion("employee_login_name not like", value, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameIn(List<String> values) {
            addCriterion("employee_login_name in", values, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameNotIn(List<String> values) {
            addCriterion("employee_login_name not in", values, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameBetween(String value1, String value2) {
            addCriterion("employee_login_name between", value1, value2, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginNameNotBetween(String value1, String value2) {
            addCriterion("employee_login_name not between", value1, value2, "employeeLoginName");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordIsNull() {
            addCriterion("employee_login_password is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordIsNotNull() {
            addCriterion("employee_login_password is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordEqualTo(String value) {
            addCriterion("employee_login_password =", value, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordNotEqualTo(String value) {
            addCriterion("employee_login_password <>", value, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordGreaterThan(String value) {
            addCriterion("employee_login_password >", value, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("employee_login_password >=", value, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordLessThan(String value) {
            addCriterion("employee_login_password <", value, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("employee_login_password <=", value, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordLike(String value) {
            addCriterion("employee_login_password like", value, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordNotLike(String value) {
            addCriterion("employee_login_password not like", value, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordIn(List<String> values) {
            addCriterion("employee_login_password in", values, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordNotIn(List<String> values) {
            addCriterion("employee_login_password not in", values, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordBetween(String value1, String value2) {
            addCriterion("employee_login_password between", value1, value2, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("employee_login_password not between", value1, value2, "employeeLoginPassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameIsNull() {
            addCriterion("employee_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameIsNotNull() {
            addCriterion("employee_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameEqualTo(String value) {
            addCriterion("employee_nick_name =", value, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameNotEqualTo(String value) {
            addCriterion("employee_nick_name <>", value, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameGreaterThan(String value) {
            addCriterion("employee_nick_name >", value, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_nick_name >=", value, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameLessThan(String value) {
            addCriterion("employee_nick_name <", value, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameLessThanOrEqualTo(String value) {
            addCriterion("employee_nick_name <=", value, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameLike(String value) {
            addCriterion("employee_nick_name like", value, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameNotLike(String value) {
            addCriterion("employee_nick_name not like", value, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameIn(List<String> values) {
            addCriterion("employee_nick_name in", values, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameNotIn(List<String> values) {
            addCriterion("employee_nick_name not in", values, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameBetween(String value1, String value2) {
            addCriterion("employee_nick_name between", value1, value2, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNickNameNotBetween(String value1, String value2) {
            addCriterion("employee_nick_name not between", value1, value2, "employeeNickName");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIsNull() {
            addCriterion("employee_status is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIsNotNull() {
            addCriterion("employee_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusEqualTo(Boolean value) {
            addCriterion("employee_status =", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotEqualTo(Boolean value) {
            addCriterion("employee_status <>", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusGreaterThan(Boolean value) {
            addCriterion("employee_status >", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("employee_status >=", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLessThan(Boolean value) {
            addCriterion("employee_status <", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("employee_status <=", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLike(Boolean value) {
            addCriterion("employee_status like", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotLike(Boolean value) {
            addCriterion("employee_status not like", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIn(List<Boolean> values) {
            addCriterion("employee_status in", values, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotIn(List<Boolean> values) {
            addCriterion("employee_status not in", values, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("employee_status between", value1, value2, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("employee_status not between", value1, value2, "employeeStatus");
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