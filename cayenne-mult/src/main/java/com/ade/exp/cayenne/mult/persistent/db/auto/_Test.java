package com.ade.exp.cayenne.mult.persistent.db.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Test was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Test extends CayenneDataObject {

    public static final String INFO_PROPERTY = "info";

    public static final String TEST_ID_PK_COLUMN = "TEST_ID";

    public void setInfo(String info) {
        writeProperty(INFO_PROPERTY, info);
    }
    public String getInfo() {
        return (String)readProperty(INFO_PROPERTY);
    }

}
