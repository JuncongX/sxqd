package edu.zjgsu.ito.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ReportExample() {
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

        public Criteria andStudentRecruitmentIdIsNull() {
            addCriterion("student_recruitment_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdIsNotNull() {
            addCriterion("student_recruitment_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdEqualTo(Integer value) {
            addCriterion("student_recruitment_id =", value, "studentRecruitmentId");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdNotEqualTo(Integer value) {
            addCriterion("student_recruitment_id <>", value, "studentRecruitmentId");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdGreaterThan(Integer value) {
            addCriterion("student_recruitment_id >", value, "studentRecruitmentId");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_recruitment_id >=", value, "studentRecruitmentId");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdLessThan(Integer value) {
            addCriterion("student_recruitment_id <", value, "studentRecruitmentId");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_recruitment_id <=", value, "studentRecruitmentId");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdIn(List<Integer> values) {
            addCriterion("student_recruitment_id in", values, "studentRecruitmentId");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdNotIn(List<Integer> values) {
            addCriterion("student_recruitment_id not in", values, "studentRecruitmentId");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_recruitment_id between", value1, value2, "studentRecruitmentId");
            return (Criteria) this;
        }

        public Criteria andStudentRecruitmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_recruitment_id not between", value1, value2, "studentRecruitmentId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPublishedDateIsNull() {
            addCriterion("published_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishedDateIsNotNull() {
            addCriterion("published_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedDateEqualTo(Date value) {
            addCriterion("published_date =", value, "publishedDate");
            return (Criteria) this;
        }

        public Criteria andPublishedDateNotEqualTo(Date value) {
            addCriterion("published_date <>", value, "publishedDate");
            return (Criteria) this;
        }

        public Criteria andPublishedDateGreaterThan(Date value) {
            addCriterion("published_date >", value, "publishedDate");
            return (Criteria) this;
        }

        public Criteria andPublishedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("published_date >=", value, "publishedDate");
            return (Criteria) this;
        }

        public Criteria andPublishedDateLessThan(Date value) {
            addCriterion("published_date <", value, "publishedDate");
            return (Criteria) this;
        }

        public Criteria andPublishedDateLessThanOrEqualTo(Date value) {
            addCriterion("published_date <=", value, "publishedDate");
            return (Criteria) this;
        }

        public Criteria andPublishedDateIn(List<Date> values) {
            addCriterion("published_date in", values, "publishedDate");
            return (Criteria) this;
        }

        public Criteria andPublishedDateNotIn(List<Date> values) {
            addCriterion("published_date not in", values, "publishedDate");
            return (Criteria) this;
        }

        public Criteria andPublishedDateBetween(Date value1, Date value2) {
            addCriterion("published_date between", value1, value2, "publishedDate");
            return (Criteria) this;
        }

        public Criteria andPublishedDateNotBetween(Date value1, Date value2) {
            addCriterion("published_date not between", value1, value2, "publishedDate");
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

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
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

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeIsNull() {
            addCriterion("readover_time is null");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeIsNotNull() {
            addCriterion("readover_time is not null");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeEqualTo(Date value) {
            addCriterion("readover_time =", value, "readoverTime");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeNotEqualTo(Date value) {
            addCriterion("readover_time <>", value, "readoverTime");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeGreaterThan(Date value) {
            addCriterion("readover_time >", value, "readoverTime");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("readover_time >=", value, "readoverTime");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeLessThan(Date value) {
            addCriterion("readover_time <", value, "readoverTime");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeLessThanOrEqualTo(Date value) {
            addCriterion("readover_time <=", value, "readoverTime");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeIn(List<Date> values) {
            addCriterion("readover_time in", values, "readoverTime");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeNotIn(List<Date> values) {
            addCriterion("readover_time not in", values, "readoverTime");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeBetween(Date value1, Date value2) {
            addCriterion("readover_time between", value1, value2, "readoverTime");
            return (Criteria) this;
        }

        public Criteria andReadoverTimeNotBetween(Date value1, Date value2) {
            addCriterion("readover_time not between", value1, value2, "readoverTime");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeIsNull() {
            addCriterion("c_readover_time is null");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeIsNotNull() {
            addCriterion("c_readover_time is not null");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeEqualTo(Date value) {
            addCriterion("c_readover_time =", value, "cReadoverTime");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeNotEqualTo(Date value) {
            addCriterion("c_readover_time <>", value, "cReadoverTime");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeGreaterThan(Date value) {
            addCriterion("c_readover_time >", value, "cReadoverTime");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_readover_time >=", value, "cReadoverTime");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeLessThan(Date value) {
            addCriterion("c_readover_time <", value, "cReadoverTime");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_readover_time <=", value, "cReadoverTime");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeIn(List<Date> values) {
            addCriterion("c_readover_time in", values, "cReadoverTime");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeNotIn(List<Date> values) {
            addCriterion("c_readover_time not in", values, "cReadoverTime");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeBetween(Date value1, Date value2) {
            addCriterion("c_readover_time between", value1, value2, "cReadoverTime");
            return (Criteria) this;
        }

        public Criteria andCReadoverTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_readover_time not between", value1, value2, "cReadoverTime");
            return (Criteria) this;
        }

        public Criteria andCScoreIsNull() {
            addCriterion("c_score is null");
            return (Criteria) this;
        }

        public Criteria andCScoreIsNotNull() {
            addCriterion("c_score is not null");
            return (Criteria) this;
        }

        public Criteria andCScoreEqualTo(Integer value) {
            addCriterion("c_score =", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreNotEqualTo(Integer value) {
            addCriterion("c_score <>", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreGreaterThan(Integer value) {
            addCriterion("c_score >", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_score >=", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreLessThan(Integer value) {
            addCriterion("c_score <", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreLessThanOrEqualTo(Integer value) {
            addCriterion("c_score <=", value, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreIn(List<Integer> values) {
            addCriterion("c_score in", values, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreNotIn(List<Integer> values) {
            addCriterion("c_score not in", values, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreBetween(Integer value1, Integer value2) {
            addCriterion("c_score between", value1, value2, "cScore");
            return (Criteria) this;
        }

        public Criteria andCScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("c_score not between", value1, value2, "cScore");
            return (Criteria) this;
        }

        public Criteria andCCommentIsNull() {
            addCriterion("c_comment is null");
            return (Criteria) this;
        }

        public Criteria andCCommentIsNotNull() {
            addCriterion("c_comment is not null");
            return (Criteria) this;
        }

        public Criteria andCCommentEqualTo(String value) {
            addCriterion("c_comment =", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentNotEqualTo(String value) {
            addCriterion("c_comment <>", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentGreaterThan(String value) {
            addCriterion("c_comment >", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentGreaterThanOrEqualTo(String value) {
            addCriterion("c_comment >=", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentLessThan(String value) {
            addCriterion("c_comment <", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentLessThanOrEqualTo(String value) {
            addCriterion("c_comment <=", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentLike(String value) {
            addCriterion("c_comment like", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentNotLike(String value) {
            addCriterion("c_comment not like", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentIn(List<String> values) {
            addCriterion("c_comment in", values, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentNotIn(List<String> values) {
            addCriterion("c_comment not in", values, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentBetween(String value1, String value2) {
            addCriterion("c_comment between", value1, value2, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentNotBetween(String value1, String value2) {
            addCriterion("c_comment not between", value1, value2, "cComment");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(String value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(String value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(String value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(String value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(String value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(String value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLike(String value) {
            addCriterion("week like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotLike(String value) {
            addCriterion("week not like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<String> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<String> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(String value1, String value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(String value1, String value2) {
            addCriterion("week not between", value1, value2, "week");
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