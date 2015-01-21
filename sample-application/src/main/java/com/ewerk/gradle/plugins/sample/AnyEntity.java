package com.ewerk.gradle.plugins.sample;

import com.mysema.query.annotations.QueryEntity;

@QueryEntity
public class AnyEntity {

    private Long id;

    public AnyEntity() {
    }

    public Long getId() {
        return id;
    }
}
