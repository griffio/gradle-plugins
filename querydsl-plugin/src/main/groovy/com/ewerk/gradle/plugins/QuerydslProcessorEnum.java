package com.ewerk.gradle.plugins;

public enum QuerydslProcessorEnum {

    QUERYDSL("com.mysema.query.apt.QuerydslAnnotationProcessor"),
    MONGO("org.springframework.data.mongodb.repository.support.MongoAnnotationProcessor"),
    JPA("com.mysema.query.apt.jpa.JPAAnnotationProcessor");

    private final String processorClassName;

    QuerydslProcessorEnum(String processorClassName) {
        this.processorClassName = processorClassName;
    }

    public String processorClassName() {
        return processorClassName;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }

}
