package com.ewerk.gradle.plugins.tasks

import org.gradle.api.tasks.compile.JavaCompile

/**
 * Compiles the JPA meta model using querydsl JPA annotation processor.
 *
 * @author holgerstolzenberg
 * @since 1.0.0
 *
 * Provides enabled processors and a single output directory for java sources
 * queryDsl will use either the destination dir or -s
 *
 */
class QuerydslAnnotationProcessor extends JavaCompile {

    QuerydslAnnotationProcessor() {

        setSource(project.sourceSets.main.java)

        setClasspath(project.configurations.compile)

        def processors =  project.querydsl.activeProcessorClassNames.join(",")

        options.compilerArgs = [
                "-verbose",
                '-proc:only',
                "-processor", processors
        ]

        destinationDir = project.file(project.querydsl.querydslSourcesDir)
    }

}
