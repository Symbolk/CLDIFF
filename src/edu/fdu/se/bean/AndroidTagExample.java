package edu.fdu.se.bean;

import java.util.ArrayList;
import java.util.List;

public class AndroidTagExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public AndroidTagExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
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

		public Criteria andTagNameFullIsNull() {
			addCriterion("tag_name_full is null");
			return (Criteria) this;
		}

		public Criteria andTagNameFullIsNotNull() {
			addCriterion("tag_name_full is not null");
			return (Criteria) this;
		}

		public Criteria andTagNameFullEqualTo(String value) {
			addCriterion("tag_name_full =", value, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullNotEqualTo(String value) {
			addCriterion("tag_name_full <>", value, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullGreaterThan(String value) {
			addCriterion("tag_name_full >", value, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullGreaterThanOrEqualTo(String value) {
			addCriterion("tag_name_full >=", value, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullLessThan(String value) {
			addCriterion("tag_name_full <", value, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullLessThanOrEqualTo(String value) {
			addCriterion("tag_name_full <=", value, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullLike(String value) {
			addCriterion("tag_name_full like", value, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullNotLike(String value) {
			addCriterion("tag_name_full not like", value, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullIn(List<String> values) {
			addCriterion("tag_name_full in", values, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullNotIn(List<String> values) {
			addCriterion("tag_name_full not in", values, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullBetween(String value1, String value2) {
			addCriterion("tag_name_full between", value1, value2, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameFullNotBetween(String value1, String value2) {
			addCriterion("tag_name_full not between", value1, value2, "tagNameFull");
			return (Criteria) this;
		}

		public Criteria andTagNameShortIsNull() {
			addCriterion("tag_name_short is null");
			return (Criteria) this;
		}

		public Criteria andTagNameShortIsNotNull() {
			addCriterion("tag_name_short is not null");
			return (Criteria) this;
		}

		public Criteria andTagNameShortEqualTo(String value) {
			addCriterion("tag_name_short =", value, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortNotEqualTo(String value) {
			addCriterion("tag_name_short <>", value, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortGreaterThan(String value) {
			addCriterion("tag_name_short >", value, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortGreaterThanOrEqualTo(String value) {
			addCriterion("tag_name_short >=", value, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortLessThan(String value) {
			addCriterion("tag_name_short <", value, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortLessThanOrEqualTo(String value) {
			addCriterion("tag_name_short <=", value, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortLike(String value) {
			addCriterion("tag_name_short like", value, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortNotLike(String value) {
			addCriterion("tag_name_short not like", value, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortIn(List<String> values) {
			addCriterion("tag_name_short in", values, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortNotIn(List<String> values) {
			addCriterion("tag_name_short not in", values, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortBetween(String value1, String value2) {
			addCriterion("tag_name_short between", value1, value2, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagNameShortNotBetween(String value1, String value2) {
			addCriterion("tag_name_short not between", value1, value2, "tagNameShort");
			return (Criteria) this;
		}

		public Criteria andTagShaIdIsNull() {
			addCriterion("tag_sha_id is null");
			return (Criteria) this;
		}

		public Criteria andTagShaIdIsNotNull() {
			addCriterion("tag_sha_id is not null");
			return (Criteria) this;
		}

		public Criteria andTagShaIdEqualTo(String value) {
			addCriterion("tag_sha_id =", value, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdNotEqualTo(String value) {
			addCriterion("tag_sha_id <>", value, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdGreaterThan(String value) {
			addCriterion("tag_sha_id >", value, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdGreaterThanOrEqualTo(String value) {
			addCriterion("tag_sha_id >=", value, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdLessThan(String value) {
			addCriterion("tag_sha_id <", value, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdLessThanOrEqualTo(String value) {
			addCriterion("tag_sha_id <=", value, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdLike(String value) {
			addCriterion("tag_sha_id like", value, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdNotLike(String value) {
			addCriterion("tag_sha_id not like", value, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdIn(List<String> values) {
			addCriterion("tag_sha_id in", values, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdNotIn(List<String> values) {
			addCriterion("tag_sha_id not in", values, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdBetween(String value1, String value2) {
			addCriterion("tag_sha_id between", value1, value2, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andTagShaIdNotBetween(String value1, String value2) {
			addCriterion("tag_sha_id not between", value1, value2, "tagShaId");
			return (Criteria) this;
		}

		public Criteria andProjectNameIsNull() {
			addCriterion("project_name is null");
			return (Criteria) this;
		}

		public Criteria andProjectNameIsNotNull() {
			addCriterion("project_name is not null");
			return (Criteria) this;
		}

		public Criteria andProjectNameEqualTo(String value) {
			addCriterion("project_name =", value, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameNotEqualTo(String value) {
			addCriterion("project_name <>", value, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameGreaterThan(String value) {
			addCriterion("project_name >", value, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
			addCriterion("project_name >=", value, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameLessThan(String value) {
			addCriterion("project_name <", value, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameLessThanOrEqualTo(String value) {
			addCriterion("project_name <=", value, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameLike(String value) {
			addCriterion("project_name like", value, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameNotLike(String value) {
			addCriterion("project_name not like", value, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameIn(List<String> values) {
			addCriterion("project_name in", values, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameNotIn(List<String> values) {
			addCriterion("project_name not in", values, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameBetween(String value1, String value2) {
			addCriterion("project_name between", value1, value2, "projectName");
			return (Criteria) this;
		}

		public Criteria andProjectNameNotBetween(String value1, String value2) {
			addCriterion("project_name not between", value1, value2, "projectName");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table android_tag
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table android_tag
     *
     * @mbg.generated do_not_delete_during_merge Sun Dec 17 17:23:35 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}