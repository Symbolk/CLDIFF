package edu.fdu.se.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class AndroidRepoCommitExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	public AndroidRepoCommitExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
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

		public Criteria andCommitIdIsNull() {
			addCriterion("commit_id is null");
			return (Criteria) this;
		}

		public Criteria andCommitIdIsNotNull() {
			addCriterion("commit_id is not null");
			return (Criteria) this;
		}

		public Criteria andCommitIdEqualTo(String value) {
			addCriterion("commit_id =", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdNotEqualTo(String value) {
			addCriterion("commit_id <>", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdGreaterThan(String value) {
			addCriterion("commit_id >", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdGreaterThanOrEqualTo(String value) {
			addCriterion("commit_id >=", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdLessThan(String value) {
			addCriterion("commit_id <", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdLessThanOrEqualTo(String value) {
			addCriterion("commit_id <=", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdLike(String value) {
			addCriterion("commit_id like", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdNotLike(String value) {
			addCriterion("commit_id not like", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdIn(List<String> values) {
			addCriterion("commit_id in", values, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdNotIn(List<String> values) {
			addCriterion("commit_id not in", values, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdBetween(String value1, String value2) {
			addCriterion("commit_id between", value1, value2, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdNotBetween(String value1, String value2) {
			addCriterion("commit_id not between", value1, value2, "commitId");
			return (Criteria) this;
		}

		public Criteria andBranchIdIsNull() {
			addCriterion("branch_id is null");
			return (Criteria) this;
		}

		public Criteria andBranchIdIsNotNull() {
			addCriterion("branch_id is not null");
			return (Criteria) this;
		}

		public Criteria andBranchIdEqualTo(Integer value) {
			addCriterion("branch_id =", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdNotEqualTo(Integer value) {
			addCriterion("branch_id <>", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdGreaterThan(Integer value) {
			addCriterion("branch_id >", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("branch_id >=", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdLessThan(Integer value) {
			addCriterion("branch_id <", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdLessThanOrEqualTo(Integer value) {
			addCriterion("branch_id <=", value, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdIn(List<Integer> values) {
			addCriterion("branch_id in", values, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdNotIn(List<Integer> values) {
			addCriterion("branch_id not in", values, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdBetween(Integer value1, Integer value2) {
			addCriterion("branch_id between", value1, value2, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchIdNotBetween(Integer value1, Integer value2) {
			addCriterion("branch_id not between", value1, value2, "branchId");
			return (Criteria) this;
		}

		public Criteria andBranchNameIsNull() {
			addCriterion("branch_name is null");
			return (Criteria) this;
		}

		public Criteria andBranchNameIsNotNull() {
			addCriterion("branch_name is not null");
			return (Criteria) this;
		}

		public Criteria andBranchNameEqualTo(String value) {
			addCriterion("branch_name =", value, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameNotEqualTo(String value) {
			addCriterion("branch_name <>", value, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameGreaterThan(String value) {
			addCriterion("branch_name >", value, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameGreaterThanOrEqualTo(String value) {
			addCriterion("branch_name >=", value, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameLessThan(String value) {
			addCriterion("branch_name <", value, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameLessThanOrEqualTo(String value) {
			addCriterion("branch_name <=", value, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameLike(String value) {
			addCriterion("branch_name like", value, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameNotLike(String value) {
			addCriterion("branch_name not like", value, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameIn(List<String> values) {
			addCriterion("branch_name in", values, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameNotIn(List<String> values) {
			addCriterion("branch_name not in", values, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameBetween(String value1, String value2) {
			addCriterion("branch_name between", value1, value2, "branchName");
			return (Criteria) this;
		}

		public Criteria andBranchNameNotBetween(String value1, String value2) {
			addCriterion("branch_name not between", value1, value2, "branchName");
			return (Criteria) this;
		}

		public Criteria andTagNameIsNull() {
			addCriterion("tag_name is null");
			return (Criteria) this;
		}

		public Criteria andTagNameIsNotNull() {
			addCriterion("tag_name is not null");
			return (Criteria) this;
		}

		public Criteria andTagNameEqualTo(String value) {
			addCriterion("tag_name =", value, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameNotEqualTo(String value) {
			addCriterion("tag_name <>", value, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameGreaterThan(String value) {
			addCriterion("tag_name >", value, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameGreaterThanOrEqualTo(String value) {
			addCriterion("tag_name >=", value, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameLessThan(String value) {
			addCriterion("tag_name <", value, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameLessThanOrEqualTo(String value) {
			addCriterion("tag_name <=", value, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameLike(String value) {
			addCriterion("tag_name like", value, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameNotLike(String value) {
			addCriterion("tag_name not like", value, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameIn(List<String> values) {
			addCriterion("tag_name in", values, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameNotIn(List<String> values) {
			addCriterion("tag_name not in", values, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameBetween(String value1, String value2) {
			addCriterion("tag_name between", value1, value2, "tagName");
			return (Criteria) this;
		}

		public Criteria andTagNameNotBetween(String value1, String value2) {
			addCriterion("tag_name not between", value1, value2, "tagName");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeIsNull() {
			addCriterion("commit_datetime is null");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeIsNotNull() {
			addCriterion("commit_datetime is not null");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeEqualTo(Date value) {
			addCriterion("commit_datetime =", value, "commitDatetime");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeNotEqualTo(Date value) {
			addCriterion("commit_datetime <>", value, "commitDatetime");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeGreaterThan(Date value) {
			addCriterion("commit_datetime >", value, "commitDatetime");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("commit_datetime >=", value, "commitDatetime");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeLessThan(Date value) {
			addCriterion("commit_datetime <", value, "commitDatetime");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeLessThanOrEqualTo(Date value) {
			addCriterion("commit_datetime <=", value, "commitDatetime");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeIn(List<Date> values) {
			addCriterion("commit_datetime in", values, "commitDatetime");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeNotIn(List<Date> values) {
			addCriterion("commit_datetime not in", values, "commitDatetime");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeBetween(Date value1, Date value2) {
			addCriterion("commit_datetime between", value1, value2, "commitDatetime");
			return (Criteria) this;
		}

		public Criteria andCommitDatetimeNotBetween(Date value1, Date value2) {
			addCriterion("commit_datetime not between", value1, value2, "commitDatetime");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampIsNull() {
			addCriterion("commit_timestamp is null");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampIsNotNull() {
			addCriterion("commit_timestamp is not null");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampEqualTo(Date value) {
			addCriterion("commit_timestamp =", value, "commitTimestamp");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampNotEqualTo(Date value) {
			addCriterion("commit_timestamp <>", value, "commitTimestamp");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampGreaterThan(Date value) {
			addCriterion("commit_timestamp >", value, "commitTimestamp");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampGreaterThanOrEqualTo(Date value) {
			addCriterion("commit_timestamp >=", value, "commitTimestamp");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampLessThan(Date value) {
			addCriterion("commit_timestamp <", value, "commitTimestamp");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampLessThanOrEqualTo(Date value) {
			addCriterion("commit_timestamp <=", value, "commitTimestamp");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampIn(List<Date> values) {
			addCriterion("commit_timestamp in", values, "commitTimestamp");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampNotIn(List<Date> values) {
			addCriterion("commit_timestamp not in", values, "commitTimestamp");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampBetween(Date value1, Date value2) {
			addCriterion("commit_timestamp between", value1, value2, "commitTimestamp");
			return (Criteria) this;
		}

		public Criteria andCommitTimestampNotBetween(Date value1, Date value2) {
			addCriterion("commit_timestamp not between", value1, value2, "commitTimestamp");
			return (Criteria) this;
		}

		public Criteria andIssdkfileIsNull() {
			addCriterion("issdkfile is null");
			return (Criteria) this;
		}

		public Criteria andIssdkfileIsNotNull() {
			addCriterion("issdkfile is not null");
			return (Criteria) this;
		}

		public Criteria andIssdkfileEqualTo(Integer value) {
			addCriterion("issdkfile =", value, "issdkfile");
			return (Criteria) this;
		}

		public Criteria andIssdkfileNotEqualTo(Integer value) {
			addCriterion("issdkfile <>", value, "issdkfile");
			return (Criteria) this;
		}

		public Criteria andIssdkfileGreaterThan(Integer value) {
			addCriterion("issdkfile >", value, "issdkfile");
			return (Criteria) this;
		}

		public Criteria andIssdkfileGreaterThanOrEqualTo(Integer value) {
			addCriterion("issdkfile >=", value, "issdkfile");
			return (Criteria) this;
		}

		public Criteria andIssdkfileLessThan(Integer value) {
			addCriterion("issdkfile <", value, "issdkfile");
			return (Criteria) this;
		}

		public Criteria andIssdkfileLessThanOrEqualTo(Integer value) {
			addCriterion("issdkfile <=", value, "issdkfile");
			return (Criteria) this;
		}

		public Criteria andIssdkfileIn(List<Integer> values) {
			addCriterion("issdkfile in", values, "issdkfile");
			return (Criteria) this;
		}

		public Criteria andIssdkfileNotIn(List<Integer> values) {
			addCriterion("issdkfile not in", values, "issdkfile");
			return (Criteria) this;
		}

		public Criteria andIssdkfileBetween(Integer value1, Integer value2) {
			addCriterion("issdkfile between", value1, value2, "issdkfile");
			return (Criteria) this;
		}

		public Criteria andIssdkfileNotBetween(Integer value1, Integer value2) {
			addCriterion("issdkfile not between", value1, value2, "issdkfile");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table android_repo_commit
	 * @mbg.generated  Sun Dec 17 20:41:24 CST 2017
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
     * This class corresponds to the database table android_repo_commit
     *
     * @mbg.generated do_not_delete_during_merge Fri Nov 24 14:31:43 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}