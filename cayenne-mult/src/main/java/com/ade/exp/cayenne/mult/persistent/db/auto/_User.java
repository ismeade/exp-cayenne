package com.ade.exp.cayenne.mult.persistent.db.auto;

import com.ade.exp.cayenne.mult.persistent.db2.Company;
import org.apache.cayenne.CayenneDataObject;

/**
 * Class _User was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _User extends CayenneDataObject {

    public static final String ADDERSS_PROPERTY = "adderss";
    public static final String AGE_PROPERTY = "age";
    public static final String EMAIL_PROPERTY = "email";
    public static final String NAME_PROPERTY = "name";
    public static final String COMPANY_PROPERTY = "company";

    public static final String ID_PK_COLUMN = "id";

    public void setAdderss(String adderss) {
        writeProperty(ADDERSS_PROPERTY, adderss);
    }
    public String getAdderss() {
        return (String)readProperty(ADDERSS_PROPERTY);
    }

    public void setAge(Integer age) {
        writeProperty(AGE_PROPERTY, age);
    }
    public Integer getAge() {
        return (Integer)readProperty(AGE_PROPERTY);
    }

    public void setEmail(String email) {
        writeProperty(EMAIL_PROPERTY, email);
    }
    public String getEmail() {
        return (String)readProperty(EMAIL_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setCompany(Company company) {
        setToOneTarget(COMPANY_PROPERTY, company, true);
    }

    public Company getCompany() {
        return (Company)readProperty(COMPANY_PROPERTY);
    }


}
