package edu.zjgsu.ito.model;

import java.util.ArrayList;
import java.util.List;

public class StudentClubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public StudentClubExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClubNameIsNull() {
            addCriterion("club_name is null");
            return (Criteria) this;
        }

        public Criteria andClubNameIsNotNull() {
            addCriterion("club_name is not null");
            return (Criteria) this;
        }

        public Criteria andClubNameEqualTo(String value) {
            addCriterion("club_name =", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameNotEqualTo(String value) {
            addCriterion("club_name <>", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameGreaterThan(String value) {
            addCriterion("club_name >", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameGreaterThanOrEqualTo(String value) {
            addCriterion("club_name >=", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameLessThan(String value) {
            addCriterion("club_name <", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameLessThanOrEqualTo(String value) {
            addCriterion("club_name <=", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameLike(String value) {
            addCriterion("club_name like", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameNotLike(String value) {
            addCriterion("club_name not like", value, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameIn(List<String> values) {
            addCriterion("club_name in", values, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameNotIn(List<String> values) {
            addCriterion("club_name not in", values, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameBetween(String value1, String value2) {
            addCriterion("club_name between", value1, value2, "clubName");
            return (Criteria) this;
        }

        public Criteria andClubNameNotBetween(String value1, String value2) {
            addCriterion("club_name not between", value1, value2, "clubName");
            return (Criteria) this;
        }

        public Criteria andIndentityIsNull() {
            addCriterion("indentity is null");
            return (Criteria) this;
        }

        public Criteria andIndentityIsNotNull() {
            addCriterion("indentity is not null");
            return (Criteria) this;
        }

        public Criteria andIndentityEqualTo(String value) {
            addCriterion("indentity =", value, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityNotEqualTo(String value) {
            addCriterion("indentity <>", value, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityGreaterThan(String value) {
            addCriterion("indentity >", value, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityGreaterThanOrEqualTo(String value) {
            addCriterion("indentity >=", value, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityLessThan(String value) {
            addCriterion("indentity <", value, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityLessThanOrEqualTo(String value) {
            addCriterion("indentity <=", value, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityLike(String value) {
            addCriterion("indentity like", value, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityNotLike(String value) {
            addCriterion("indentity not like", value, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityIn(List<String> values) {
            addCriterion("indentity in", values, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityNotIn(List<String> values) {
            addCriterion("indentity not in", values, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityBetween(String value1, String value2) {
            addCriterion("indentity between", value1, value2, "indentity");
            return (Criteria) this;
        }

        public Criteria andIndentityNotBetween(String value1, String value2) {
            addCriterion("indentity not between", value1, value2, "indentity");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNull() {
            addCriterion("instruction is null");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNotNull() {
            addCriterion("instruction is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionEqualTo(String value) {
            addCriterion("instruction =", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotEqualTo(String value) {
            addCriterion("instruction <>", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThan(String value) {
            addCriterion("instruction >", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("instruction >=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThan(String value) {
            addCriterion("instruction <", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThanOrEqualTo(String value) {
            addCriterion("instruction <=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLike(String value) {
            addCriterion("instruction like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotLike(String value) {
            addCriterion("instruction not like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionIn(List<String> values) {
            addCriterion("instruction in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotIn(List<String> values) {
            addCriterion("instruction not in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionBetween(String value1, String value2) {
            addCriterion("instruction between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotBetween(String value1, String value2) {
            addCriterion("instruction not between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andDelectTagIsNull() {
            addCriterion("delect_tag is null");
            return (Criteria) this;
        }

        public Criteria andDelectTagIsNotNull() {
            addCriterion("delect_tag is not null");
            return (Criteria) this;
        }

        public Criteria andDelectTagEqualTo(Boolean value) {
            addCriterion("delect_tag =", value, "delectTag");
            return (Criteria) this;
        }

        public Criteria andDelectTagNotEqualTo(Boolean value) {
            addCriterion("delect_tag <>", value, "delectTag");
            return (Criteria) this;
        }

        public Criteria andDelectTagGreaterThan(Boolean value) {
            addCriterion("delect_tag >", value, "delectTag");
            return (Criteria) this;
        }

        public Criteria andDelectTagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delect_tag >=", value, "delectTag");
            return (Criteria) this;
        }

        public Criteria andDelectTagLessThan(Boolean value) {
            addCriterion("delect_tag <", value, "delectTag");
            return (Criteria) this;
        }

        public Criteria andDelectTagLessThanOrEqualTo(Boolean value) {
            addCriterion("delect_tag <=", value, "delectTag");
            return (Criteria) this;
        }

        public Criteria andDelectTagIn(List<Boolean> values) {
            addCriterion("delect_tag in", values, "delectTag");
            return (Criteria) this;
        }

        public Criteria andDelectTagNotIn(List<Boolean> values) {
            addCriterion("delect_tag not in", values, "delectTag");
            return (Criteria) this;
        }

        public Criteria andDelectTagBetween(Boolean value1, Boolean value2) {
            addCriterion("delect_tag between", value1, value2, "delectTag");
            return (Criteria) this;
        }

        public Criteria andDelectTagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delect_tag not between", value1, value2, "delectTag");
            return (Criteria) this;
        }
    }

    /**
     */
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