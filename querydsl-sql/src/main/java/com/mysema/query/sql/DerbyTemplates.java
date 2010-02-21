/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.sql;

import com.mysema.query.types.operation.Ops;

/**
 * DerbyTemplates is an SQL dialect for Derby
 * 
 * @author tiwe
 *
 */
public class DerbyTemplates extends SQLTemplates {
    {
        addClass2TypeMappings("smallint", Byte.class);
        
        add(Ops.CONCAT, "varchar({0} || {1})");
        add(Ops.MathOps.ROUND, "floor({0})");
        add(Ops.DateTimeOps.DAY_OF_MONTH, "day({0})");
        
        // case for eq
        add(Ops.CASE_EQ, "case {1} end");
        add(Ops.CASE_EQ_WHEN,  "when {0} = {1} then {2} {3}");
        add(Ops.CASE_EQ_ELSE,  "else {0}");
        
        setLimitAndOffsetSymbols(false);
        setLimitTemplate("fetch first %1$s rows only");
        setOffsetTemplate("offset %1$s rows");
        setLimitOffsetTemplate("offset %2$s rows fetch next %1$s rows only");

    }
}