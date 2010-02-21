package com.mysema.query.hql.domain.sql;

import com.mysema.query.types.path.*;
import static com.mysema.query.types.path.PathMetadataFactory.*;

/**
 * SPerson is a Querydsl query type for SPerson
 */
@SuppressWarnings("serial")
@com.mysema.query.sql.Table(value="PERSON")
public class SPerson extends PEntity<SPerson> {

    public final PComparable<java.util.Date> birthday = createComparable("BIRTHDAY", java.util.Date.class);

    public final PNumber<Long> i = createNumber("I", Long.class);

    public final PString name = createString("NAME");

    public final PNumber<Long> nationalityId = createNumber("NATIONALITY_ID", Long.class);

    public final PNumber<Long> pidId = createNumber("PID_ID", Long.class);

    public SPerson(String variable) {
        super(SPerson.class, forVariable(variable));
    }

    public SPerson(PEntity<? extends SPerson> entity) {
        super(entity.getType(),entity.getMetadata());
    }

    public SPerson(PathMetadata<?> metadata) {
        super(SPerson.class, metadata);
    }

}

