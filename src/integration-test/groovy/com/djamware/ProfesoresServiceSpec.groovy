package com.djamware

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProfesoresServiceSpec extends Specification {

    ProfesoresService profesoresService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Profesores(...).save(flush: true, failOnError: true)
        //new Profesores(...).save(flush: true, failOnError: true)
        //Profesores profesores = new Profesores(...).save(flush: true, failOnError: true)
        //new Profesores(...).save(flush: true, failOnError: true)
        //new Profesores(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //profesores.id
    }

    void "test get"() {
        setupData()

        expect:
        profesoresService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Profesores> profesoresList = profesoresService.list(max: 2, offset: 2)

        then:
        profesoresList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        profesoresService.count() == 5
    }

    void "test delete"() {
        Long profesoresId = setupData()

        expect:
        profesoresService.count() == 5

        when:
        profesoresService.delete(profesoresId)
        sessionFactory.currentSession.flush()

        then:
        profesoresService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Profesores profesores = new Profesores()
        profesoresService.save(profesores)

        then:
        profesores.id != null
    }
}
