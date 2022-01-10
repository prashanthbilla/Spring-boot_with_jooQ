package com.billa.jooq;

import org.jooq.DSLContext;
import org.jooq.generated.Tables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JooqController {

    @Autowired
    DSLContext dslContext;

    @GetMapping("/get/{name}")
    public org.jooq.generated.tables.pojos.Loginmodel getDetals(@PathVariable("name") String name){
        org.jooq.generated.tables.pojos.Loginmodel loginmodel=dslContext.selectFrom(Tables.LOGINMODEL).where(Tables.LOGINMODEL.ID.equals(name)).fetchOneInto(org.jooq.generated.tables.pojos.Loginmodel.class);
        System.out.println(loginmodel);
        return loginmodel;
    }
    @GetMapping("/get")
    public List<org.jooq.generated.tables.pojos.Loginmodel> getAll(){
        return dslContext.selectFrom(Tables.LOGINMODEL).fetchInto(org.jooq.generated.tables.pojos.Loginmodel.class);
    }

    @PostMapping("/post")
    public int post(@RequestBody org.jooq.generated.tables.pojos.Loginmodel loginmodel){
        return dslContext.insertInto(Tables.LOGINMODEL, Tables.LOGINMODEL.ID, Tables.LOGINMODEL.NAME).values(loginmodel.getId(),loginmodel.getName()).execute();
    }

}
