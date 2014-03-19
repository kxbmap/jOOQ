/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgType extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -526211898;

	/**
	 * The singleton instance of <code>pg_catalog.pg_type</code>
	 */
	public static final org.jooq.util.postgres.pg_catalog.tables.PgType PG_TYPE = new org.jooq.util.postgres.pg_catalog.tables.PgType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_type.typname</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPNAME = createField("typname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typnamespace</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> TYPNAMESPACE = createField("typnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typowner</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> TYPOWNER = createField("typowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typlen</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> TYPLEN = createField("typlen", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typbyval</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> TYPBYVAL = createField("typbyval", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typtype</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPTYPE = createField("typtype", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typcategory</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPCATEGORY = createField("typcategory", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typispreferred</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> TYPISPREFERRED = createField("typispreferred", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typisdefined</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> TYPISDEFINED = createField("typisdefined", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typdelim</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPDELIM = createField("typdelim", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typrelid</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> TYPRELID = createField("typrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typelem</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> TYPELEM = createField("typelem", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typarray</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> TYPARRAY = createField("typarray", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typinput</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPINPUT = createField("typinput", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typoutput</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPOUTPUT = createField("typoutput", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typreceive</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPRECEIVE = createField("typreceive", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typsend</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPSEND = createField("typsend", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typmodin</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPMODIN = createField("typmodin", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typmodout</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPMODOUT = createField("typmodout", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typanalyze</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPANALYZE = createField("typanalyze", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typalign</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPALIGN = createField("typalign", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typstorage</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPSTORAGE = createField("typstorage", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typnotnull</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> TYPNOTNULL = createField("typnotnull", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typbasetype</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> TYPBASETYPE = createField("typbasetype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typtypmod</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TYPTYPMOD = createField("typtypmod", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typndims</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TYPNDIMS = createField("typndims", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typcollation</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> TYPCOLLATION = createField("typcollation", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typdefaultbin</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Object> TYPDEFAULTBIN = createField("typdefaultbin", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_node_tree"), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typdefault</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPDEFAULT = createField("typdefault", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typacl</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String[]> TYPACL = createField("typacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * Create a <code>pg_catalog.pg_type</code> table reference
	 */
	public PgType() {
		this("pg_type", null);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_type</code> table reference
	 */
	public PgType(java.lang.String alias) {
		this(alias, org.jooq.util.postgres.pg_catalog.tables.PgType.PG_TYPE);
	}

	private PgType(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private PgType(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.postgres.pg_catalog.tables.PgType as(java.lang.String alias) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.util.postgres.pg_catalog.tables.PgType rename(java.lang.String name) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgType(name, null);
	}
}
