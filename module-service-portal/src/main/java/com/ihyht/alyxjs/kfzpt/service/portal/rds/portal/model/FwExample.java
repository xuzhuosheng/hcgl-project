package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FwExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     */
    public FwExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @param orderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @param distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @param criteria
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFwmcIsNull() {
            addCriterion("FWMC is null");
            return (Criteria) this;
        }

        public Criteria andFwmcIsNotNull() {
            addCriterion("FWMC is not null");
            return (Criteria) this;
        }

        public Criteria andFwmcEqualTo(String value) {
            addCriterion("FWMC =", value, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcNotEqualTo(String value) {
            addCriterion("FWMC <>", value, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcGreaterThan(String value) {
            addCriterion("FWMC >", value, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcGreaterThanOrEqualTo(String value) {
            addCriterion("FWMC >=", value, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcLessThan(String value) {
            addCriterion("FWMC <", value, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcLessThanOrEqualTo(String value) {
            addCriterion("FWMC <=", value, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcLike(String value) {
            addCriterion("FWMC like", value, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcNotLike(String value) {
            addCriterion("FWMC not like", value, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcIn(List<String> values) {
            addCriterion("FWMC in", values, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcNotIn(List<String> values) {
            addCriterion("FWMC not in", values, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcBetween(String value1, String value2) {
            addCriterion("FWMC between", value1, value2, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmcNotBetween(String value1, String value2) {
            addCriterion("FWMC not between", value1, value2, "fwmc");
            return (Criteria) this;
        }

        public Criteria andFwmsIsNull() {
            addCriterion("FWMS is null");
            return (Criteria) this;
        }

        public Criteria andFwmsIsNotNull() {
            addCriterion("FWMS is not null");
            return (Criteria) this;
        }

        public Criteria andFwmsEqualTo(String value) {
            addCriterion("FWMS =", value, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsNotEqualTo(String value) {
            addCriterion("FWMS <>", value, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsGreaterThan(String value) {
            addCriterion("FWMS >", value, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsGreaterThanOrEqualTo(String value) {
            addCriterion("FWMS >=", value, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsLessThan(String value) {
            addCriterion("FWMS <", value, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsLessThanOrEqualTo(String value) {
            addCriterion("FWMS <=", value, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsLike(String value) {
            addCriterion("FWMS like", value, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsNotLike(String value) {
            addCriterion("FWMS not like", value, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsIn(List<String> values) {
            addCriterion("FWMS in", values, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsNotIn(List<String> values) {
            addCriterion("FWMS not in", values, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsBetween(String value1, String value2) {
            addCriterion("FWMS between", value1, value2, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwmsNotBetween(String value1, String value2) {
            addCriterion("FWMS not between", value1, value2, "fwms");
            return (Criteria) this;
        }

        public Criteria andFwflIdIsNull() {
            addCriterion("FWFL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFwflIdIsNotNull() {
            addCriterion("FWFL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFwflIdEqualTo(String value) {
            addCriterion("FWFL_ID =", value, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdNotEqualTo(String value) {
            addCriterion("FWFL_ID <>", value, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdGreaterThan(String value) {
            addCriterion("FWFL_ID >", value, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdGreaterThanOrEqualTo(String value) {
            addCriterion("FWFL_ID >=", value, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdLessThan(String value) {
            addCriterion("FWFL_ID <", value, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdLessThanOrEqualTo(String value) {
            addCriterion("FWFL_ID <=", value, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdLike(String value) {
            addCriterion("FWFL_ID like", value, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdNotLike(String value) {
            addCriterion("FWFL_ID not like", value, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdIn(List<String> values) {
            addCriterion("FWFL_ID in", values, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdNotIn(List<String> values) {
            addCriterion("FWFL_ID not in", values, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdBetween(String value1, String value2) {
            addCriterion("FWFL_ID between", value1, value2, "fwflId");
            return (Criteria) this;
        }

        public Criteria andFwflIdNotBetween(String value1, String value2) {
            addCriterion("FWFL_ID not between", value1, value2, "fwflId");
            return (Criteria) this;
        }

        public Criteria andLrrqIsNull() {
            addCriterion("LRRQ is null");
            return (Criteria) this;
        }

        public Criteria andLrrqIsNotNull() {
            addCriterion("LRRQ is not null");
            return (Criteria) this;
        }

        public Criteria andLrrqEqualTo(Date value) {
            addCriterion("LRRQ =", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqNotEqualTo(Date value) {
            addCriterion("LRRQ <>", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqGreaterThan(Date value) {
            addCriterion("LRRQ >", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqGreaterThanOrEqualTo(Date value) {
            addCriterion("LRRQ >=", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqLessThan(Date value) {
            addCriterion("LRRQ <", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqLessThanOrEqualTo(Date value) {
            addCriterion("LRRQ <=", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqIn(List<Date> values) {
            addCriterion("LRRQ in", values, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqNotIn(List<Date> values) {
            addCriterion("LRRQ not in", values, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqBetween(Date value1, Date value2) {
            addCriterion("LRRQ between", value1, value2, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqNotBetween(Date value1, Date value2) {
            addCriterion("LRRQ not between", value1, value2, "lrrq");
            return (Criteria) this;
        }

        public Criteria andXgrqIsNull() {
            addCriterion("XGRQ is null");
            return (Criteria) this;
        }

        public Criteria andXgrqIsNotNull() {
            addCriterion("XGRQ is not null");
            return (Criteria) this;
        }

        public Criteria andXgrqEqualTo(Date value) {
            addCriterion("XGRQ =", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqNotEqualTo(Date value) {
            addCriterion("XGRQ <>", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqGreaterThan(Date value) {
            addCriterion("XGRQ >", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqGreaterThanOrEqualTo(Date value) {
            addCriterion("XGRQ >=", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqLessThan(Date value) {
            addCriterion("XGRQ <", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqLessThanOrEqualTo(Date value) {
            addCriterion("XGRQ <=", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqIn(List<Date> values) {
            addCriterion("XGRQ in", values, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqNotIn(List<Date> values) {
            addCriterion("XGRQ not in", values, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqBetween(Date value1, Date value2) {
            addCriterion("XGRQ between", value1, value2, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqNotBetween(Date value1, Date value2) {
            addCriterion("XGRQ not between", value1, value2, "xgrq");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNull() {
            addCriterion("YXBZ is null");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNotNull() {
            addCriterion("YXBZ is not null");
            return (Criteria) this;
        }

        public Criteria andYxbzEqualTo(String value) {
            addCriterion("YXBZ =", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotEqualTo(String value) {
            addCriterion("YXBZ <>", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThan(String value) {
            addCriterion("YXBZ >", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThanOrEqualTo(String value) {
            addCriterion("YXBZ >=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThan(String value) {
            addCriterion("YXBZ <", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThanOrEqualTo(String value) {
            addCriterion("YXBZ <=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLike(String value) {
            addCriterion("YXBZ like", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotLike(String value) {
            addCriterion("YXBZ not like", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzIn(List<String> values) {
            addCriterion("YXBZ in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotIn(List<String> values) {
            addCriterion("YXBZ not in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzBetween(String value1, String value2) {
            addCriterion("YXBZ between", value1, value2, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotBetween(String value1, String value2) {
            addCriterion("YXBZ not between", value1, value2, "yxbz");
            return (Criteria) this;
        }

        public Criteria andScbzIsNull() {
            addCriterion("SCBZ is null");
            return (Criteria) this;
        }

        public Criteria andScbzIsNotNull() {
            addCriterion("SCBZ is not null");
            return (Criteria) this;
        }

        public Criteria andScbzEqualTo(String value) {
            addCriterion("SCBZ =", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzNotEqualTo(String value) {
            addCriterion("SCBZ <>", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzGreaterThan(String value) {
            addCriterion("SCBZ >", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzGreaterThanOrEqualTo(String value) {
            addCriterion("SCBZ >=", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzLessThan(String value) {
            addCriterion("SCBZ <", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzLessThanOrEqualTo(String value) {
            addCriterion("SCBZ <=", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzLike(String value) {
            addCriterion("SCBZ like", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzNotLike(String value) {
            addCriterion("SCBZ not like", value, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzIn(List<String> values) {
            addCriterion("SCBZ in", values, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzNotIn(List<String> values) {
            addCriterion("SCBZ not in", values, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzBetween(String value1, String value2) {
            addCriterion("SCBZ between", value1, value2, "scbz");
            return (Criteria) this;
        }

        public Criteria andScbzNotBetween(String value1, String value2) {
            addCriterion("SCBZ not between", value1, value2, "scbz");
            return (Criteria) this;
        }

        public Criteria andIconIdIsNull() {
            addCriterion("ICON_ID is null");
            return (Criteria) this;
        }

        public Criteria andIconIdIsNotNull() {
            addCriterion("ICON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIconIdEqualTo(String value) {
            addCriterion("ICON_ID =", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotEqualTo(String value) {
            addCriterion("ICON_ID <>", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdGreaterThan(String value) {
            addCriterion("ICON_ID >", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdGreaterThanOrEqualTo(String value) {
            addCriterion("ICON_ID >=", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdLessThan(String value) {
            addCriterion("ICON_ID <", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdLessThanOrEqualTo(String value) {
            addCriterion("ICON_ID <=", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdLike(String value) {
            addCriterion("ICON_ID like", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotLike(String value) {
            addCriterion("ICON_ID not like", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdIn(List<String> values) {
            addCriterion("ICON_ID in", values, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotIn(List<String> values) {
            addCriterion("ICON_ID not in", values, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdBetween(String value1, String value2) {
            addCriterion("ICON_ID between", value1, value2, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotBetween(String value1, String value2) {
            addCriterion("ICON_ID not between", value1, value2, "iconId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(Long value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(Long value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(Long value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(Long value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(Long value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(Long value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<Long> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<Long> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(Long value1, Long value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(Long value1, Long value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andApiUrlIsNull() {
            addCriterion("API_URL is null");
            return (Criteria) this;
        }

        public Criteria andApiUrlIsNotNull() {
            addCriterion("API_URL is not null");
            return (Criteria) this;
        }

        public Criteria andApiUrlEqualTo(String value) {
            addCriterion("API_URL =", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotEqualTo(String value) {
            addCriterion("API_URL <>", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlGreaterThan(String value) {
            addCriterion("API_URL >", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlGreaterThanOrEqualTo(String value) {
            addCriterion("API_URL >=", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLessThan(String value) {
            addCriterion("API_URL <", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLessThanOrEqualTo(String value) {
            addCriterion("API_URL <=", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLike(String value) {
            addCriterion("API_URL like", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotLike(String value) {
            addCriterion("API_URL not like", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlIn(List<String> values) {
            addCriterion("API_URL in", values, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotIn(List<String> values) {
            addCriterion("API_URL not in", values, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlBetween(String value1, String value2) {
            addCriterion("API_URL between", value1, value2, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotBetween(String value1, String value2) {
            addCriterion("API_URL not between", value1, value2, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andPchIsNull() {
            addCriterion("PCH is null");
            return (Criteria) this;
        }

        public Criteria andPchIsNotNull() {
            addCriterion("PCH is not null");
            return (Criteria) this;
        }

        public Criteria andPchEqualTo(String value) {
            addCriterion("PCH =", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotEqualTo(String value) {
            addCriterion("PCH <>", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchGreaterThan(String value) {
            addCriterion("PCH >", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchGreaterThanOrEqualTo(String value) {
            addCriterion("PCH >=", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLessThan(String value) {
            addCriterion("PCH <", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLessThanOrEqualTo(String value) {
            addCriterion("PCH <=", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchLike(String value) {
            addCriterion("PCH like", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotLike(String value) {
            addCriterion("PCH not like", value, "pch");
            return (Criteria) this;
        }

        public Criteria andPchIn(List<String> values) {
            addCriterion("PCH in", values, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotIn(List<String> values) {
            addCriterion("PCH not in", values, "pch");
            return (Criteria) this;
        }

        public Criteria andPchBetween(String value1, String value2) {
            addCriterion("PCH between", value1, value2, "pch");
            return (Criteria) this;
        }

        public Criteria andPchNotBetween(String value1, String value2) {
            addCriterion("PCH not between", value1, value2, "pch");
            return (Criteria) this;
        }

        public Criteria andZssxIsNull() {
            addCriterion("zssx is null");
            return (Criteria) this;
        }

        public Criteria andZssxIsNotNull() {
            addCriterion("zssx is not null");
            return (Criteria) this;
        }

        public Criteria andZssxEqualTo(Integer value) {
            addCriterion("zssx =", value, "zssx");
            return (Criteria) this;
        }

        public Criteria andZssxNotEqualTo(Integer value) {
            addCriterion("zssx <>", value, "zssx");
            return (Criteria) this;
        }

        public Criteria andZssxGreaterThan(Integer value) {
            addCriterion("zssx >", value, "zssx");
            return (Criteria) this;
        }

        public Criteria andZssxGreaterThanOrEqualTo(Integer value) {
            addCriterion("zssx >=", value, "zssx");
            return (Criteria) this;
        }

        public Criteria andZssxLessThan(Integer value) {
            addCriterion("zssx <", value, "zssx");
            return (Criteria) this;
        }

        public Criteria andZssxLessThanOrEqualTo(Integer value) {
            addCriterion("zssx <=", value, "zssx");
            return (Criteria) this;
        }

        public Criteria andZssxIn(List<Integer> values) {
            addCriterion("zssx in", values, "zssx");
            return (Criteria) this;
        }

        public Criteria andZssxNotIn(List<Integer> values) {
            addCriterion("zssx not in", values, "zssx");
            return (Criteria) this;
        }

        public Criteria andZssxBetween(Integer value1, Integer value2) {
            addCriterion("zssx between", value1, value2, "zssx");
            return (Criteria) this;
        }

        public Criteria andZssxNotBetween(Integer value1, Integer value2) {
            addCriterion("zssx not between", value1, value2, "zssx");
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