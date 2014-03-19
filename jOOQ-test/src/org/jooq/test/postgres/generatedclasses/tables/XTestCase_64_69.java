/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_64_69 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 2113238194;

	/**
	 * The singleton instance of <code>public.x_test_case_64_69</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * The column <code>public.x_test_case_64_69.id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.x_test_case_64_69.unused_id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("unused_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.x_test_case_64_69</code> table reference
	 */
	public XTestCase_64_69() {
		this("x_test_case_64_69", null);
	}

	/**
	 * Create an aliased <code>public.x_test_case_64_69</code> table reference
	 */
	public XTestCase_64_69(java.lang.String alias) {
		this(alias, org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	private XTestCase_64_69(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> aliased) {
		this(alias, aliased, null);
	}

	private XTestCase_64_69(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_X_TEST_CASE_64_69;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.postgres.generatedclasses.Keys.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69A, org.jooq.test.postgres.generatedclasses.Keys.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69B);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69 rename(java.lang.String name) {
		return new org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69(name, null);
	}
}
