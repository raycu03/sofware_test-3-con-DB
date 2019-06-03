package com.djamware

import grails.gorm.services.Service

@Service(Profesores)
interface ProfesoresService {

    Profesores get(Serializable id)

    List<Profesores> list(Map args)

    Long count()

    void delete(Serializable id)

    Profesores save(Profesores profesores)

}