package com.ewerk.gradle.plugins

/**
 * DLS extension for the Querydsl plugin. Provides some convenient configuration options.
 *
 * @author holgerstolzenberg
 * @since 1.0.0
 */
class QuerydslPluginExtension {

    static final String NAME = "querydsl"

    static final String DEFAULT_QUERYDSL_SOURCES_DIR = new File("src/querydsl/java")
    static final String DEFAULT_LIBRARY = "com.mysema.querydsl:querydsl-apt:3.6.0"

    String querydslSourcesDir = DEFAULT_QUERYDSL_SOURCES_DIR
    String library = DEFAULT_LIBRARY

    Set<String> activeProcessorClassNames = [] as Set

    private boolean jpa;
    private boolean querydslDefault;
    private boolean springDataMongo;

    void setQuerydslDefault(boolean enabled) {
        if (enabled) {
            activeProcessorClassNames.add(QuerydslProcessorEnum.QUERYDSL.processorClassName())
        }
    }

    void setJpa(boolean enabled) {
        if (enabled) {
            activeProcessorClassNames.add(QuerydslProcessorEnum.JPA.processorClassName())
        }
    }

    void setSpringDataMongo(boolean enabled) {
        if (enabled) {
            activeProcessorClassNames.add(QuerydslProcessorEnum.MONGO.processorClassName())
        }
    }

}
