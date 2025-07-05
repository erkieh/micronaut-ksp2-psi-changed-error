package com.example

import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.junit5.annotation.MicronautTest

@MicronautTest
class EntityControllerTest {
    // FIXME: works when the following annotation is removed
    @MockBean
    lateinit var entityService: EntityService
}