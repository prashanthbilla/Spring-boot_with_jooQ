/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.generated.tables.Register;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RegisterRecord extends UpdatableRecordImpl<RegisterRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>billa.register.id</code>.
     */
    public RegisterRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>billa.register.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>billa.register.userId</code>.
     */
    public RegisterRecord setUserid(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>billa.register.userId</code>.
     */
    public String getUserid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>billa.register.name</code>.
     */
    public RegisterRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>billa.register.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>billa.register.password</code>.
     */
    public RegisterRecord setPassword(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>billa.register.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>billa.register.phoneNum</code>.
     */
    public RegisterRecord setPhonenum(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>billa.register.phoneNum</code>.
     */
    public String getPhonenum() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Register.REGISTER.ID;
    }

    @Override
    public Field<String> field2() {
        return Register.REGISTER.USERID;
    }

    @Override
    public Field<String> field3() {
        return Register.REGISTER.NAME;
    }

    @Override
    public Field<String> field4() {
        return Register.REGISTER.PASSWORD;
    }

    @Override
    public Field<String> field5() {
        return Register.REGISTER.PHONENUM;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUserid();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public String component5() {
        return getPhonenum();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUserid();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public String value5() {
        return getPhonenum();
    }

    @Override
    public RegisterRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RegisterRecord value2(String value) {
        setUserid(value);
        return this;
    }

    @Override
    public RegisterRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public RegisterRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public RegisterRecord value5(String value) {
        setPhonenum(value);
        return this;
    }

    @Override
    public RegisterRecord values(Integer value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RegisterRecord
     */
    public RegisterRecord() {
        super(Register.REGISTER);
    }

    /**
     * Create a detached, initialised RegisterRecord
     */
    public RegisterRecord(Integer id, String userid, String name, String password, String phonenum) {
        super(Register.REGISTER);

        setId(id);
        setUserid(userid);
        setName(name);
        setPassword(password);
        setPhonenum(phonenum);
    }
}
