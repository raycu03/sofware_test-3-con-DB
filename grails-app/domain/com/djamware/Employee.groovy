package com.djamware

class Employee {

    String name
    String email
    String position
    String NRC

    static constraints = {
        email email: true
    }
}