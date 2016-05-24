/**
 * This class is generated by jOOQ
 */
package com.jooqtest.model.tables;


import com.jooqtest.model.Jooqtest;
import com.jooqtest.model.Keys;
import com.jooqtest.model.tables.records.DinnerGuestsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class DinnerGuests extends TableImpl<DinnerGuestsRecord> {

    private static final long serialVersionUID = -1286237329;

    /**
     * The reference instance of <code>jooqtest.dinner_guests</code>
     */
    public static final DinnerGuests DINNER_GUESTS = new DinnerGuests();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DinnerGuestsRecord> getRecordType() {
        return DinnerGuestsRecord.class;
    }

    /**
     * The column <code>jooqtest.dinner_guests.id</code>.
     */
    public final TableField<DinnerGuestsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>jooqtest.dinner_guests.name</code>.
     */
    public final TableField<DinnerGuestsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>jooqtest.dinner_guests</code> table reference
     */
    public DinnerGuests() {
        this("dinner_guests", null);
    }

    /**
     * Create an aliased <code>jooqtest.dinner_guests</code> table reference
     */
    public DinnerGuests(String alias) {
        this(alias, DINNER_GUESTS);
    }

    private DinnerGuests(String alias, Table<DinnerGuestsRecord> aliased) {
        this(alias, aliased, null);
    }

    private DinnerGuests(String alias, Table<DinnerGuestsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jooqtest.JOOQTEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DinnerGuestsRecord> getPrimaryKey() {
        return Keys.KEY_DINNER_GUESTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DinnerGuestsRecord>> getKeys() {
        return Arrays.<UniqueKey<DinnerGuestsRecord>>asList(Keys.KEY_DINNER_GUESTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DinnerGuests as(String alias) {
        return new DinnerGuests(alias, this);
    }

    /**
     * Rename this table
     */
    public DinnerGuests rename(String name) {
        return new DinnerGuests(name, null);
    }
}