/**
 * This class is generated by jOOQ
 */
package com.jooqtest.model.tables.records;


import com.jooqtest.model.tables.Author;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorRecord extends UpdatableRecordImpl<AuthorRecord> implements Record3<Long, String, Timestamp> {

    private static final long serialVersionUID = 742048030;

    /**
     * Setter for <code>jooqtest.author.author_id</code>.
     */
    public void setAuthorId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooqtest.author.author_id</code>.
     */
    public Long getAuthorId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>jooqtest.author.full_name</code>.
     */
    public void setFullName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooqtest.author.full_name</code>.
     */
    public String getFullName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooqtest.author.date_added</code>.
     */
    public void setDateAdded(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooqtest.author.date_added</code>.
     */
    public Timestamp getDateAdded() {
        return (Timestamp) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Author.AUTHOR.AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Author.AUTHOR.FULL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Author.AUTHOR.DATE_ADDED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFullName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateAdded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value1(Long value) {
        setAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value2(String value) {
        setFullName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value3(Timestamp value) {
        setDateAdded(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord values(Long value1, String value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorRecord
     */
    public AuthorRecord() {
        super(Author.AUTHOR);
    }

    /**
     * Create a detached, initialised AuthorRecord
     */
    public AuthorRecord(Long authorId, String fullName, Timestamp dateAdded) {
        super(Author.AUTHOR);

        set(0, authorId);
        set(1, fullName);
        set(2, dateAdded);
    }
}