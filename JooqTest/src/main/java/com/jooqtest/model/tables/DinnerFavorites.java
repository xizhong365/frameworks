/**
 * This class is generated by jOOQ
 */
package com.jooqtest.model.tables;


import com.jooqtest.model.Jooqtest;
import com.jooqtest.model.Keys;
import com.jooqtest.model.tables.records.DinnerFavoritesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class DinnerFavorites extends TableImpl<DinnerFavoritesRecord> {

    private static final long serialVersionUID = 2145088755;

    /**
     * The reference instance of <code>jooqtest.dinner_favorites</code>
     */
    public static final DinnerFavorites DINNER_FAVORITES = new DinnerFavorites();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DinnerFavoritesRecord> getRecordType() {
        return DinnerFavoritesRecord.class;
    }

    /**
     * The column <code>jooqtest.dinner_favorites.foodid</code>.
     */
    public final TableField<DinnerFavoritesRecord, Long> FOODID = createField("foodid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>jooqtest.dinner_favorites.dinner_guest_id</code>.
     */
    public final TableField<DinnerFavoritesRecord, Long> DINNER_GUEST_ID = createField("dinner_guest_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>jooqtest.dinner_favorites</code> table reference
     */
    public DinnerFavorites() {
        this("dinner_favorites", null);
    }

    /**
     * Create an aliased <code>jooqtest.dinner_favorites</code> table reference
     */
    public DinnerFavorites(String alias) {
        this(alias, DINNER_FAVORITES);
    }

    private DinnerFavorites(String alias, Table<DinnerFavoritesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DinnerFavorites(String alias, Table<DinnerFavoritesRecord> aliased, Field<?>[] parameters) {
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
    public List<ForeignKey<DinnerFavoritesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DinnerFavoritesRecord, ?>>asList(Keys.DINNER_FAVORITES_IBFK_1, Keys.DINNER_FAVORITES_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DinnerFavorites as(String alias) {
        return new DinnerFavorites(alias, this);
    }

    /**
     * Rename this table
     */
    public DinnerFavorites rename(String name) {
        return new DinnerFavorites(name, null);
    }
}