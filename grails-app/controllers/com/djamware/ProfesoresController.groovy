package com.djamware

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ProfesoresController {

    ProfesoresService profesoresService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond profesoresService.list(params), model:[profesoresCount: profesoresService.count()]
    }

    def show(Long id) {
        respond profesoresService.get(id)
    }

    def create() {
        respond new Profesores(params)
    }

    def save(Profesores profesores) {
        if (profesores == null) {
            notFound()
            return
        }

        try {
            profesoresService.save(profesores)
        } catch (ValidationException e) {
            respond profesores.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'profesores.label', default: 'Profesores'), profesores.id])
                redirect profesores
            }
            '*' { respond profesores, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond profesoresService.get(id)
    }

    def update(Profesores profesores) {
        if (profesores == null) {
            notFound()
            return
        }

        try {
            profesoresService.save(profesores)
        } catch (ValidationException e) {
            respond profesores.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'profesores.label', default: 'Profesores'), profesores.id])
                redirect profesores
            }
            '*'{ respond profesores, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        profesoresService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'profesores.label', default: 'Profesores'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'profesores.label', default: 'Profesores'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
