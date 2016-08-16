package com.atr.hibtasks.utils;

import org.hibernate.cfg.DefaultNamingStrategy;

public class CustomNamingStrategy extends DefaultNamingStrategy {
    private static final long serialVersionUID = -2126804134903162037L;

    public String classToTableName(String className) {
        return "T_" + super.classToTableName(className).toUpperCase();
    }

    public String propertyToColumnName(String propName) {
        return "F_" + super.propertyToColumnName(propName);
    }

    public String columnName(String columnName) {
        return columnName;
    }

    public String tableName(String tableName) {
        return tableName;
    }
}


