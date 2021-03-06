package com.example.psp2.entities.Workplaces

import javax.persistence.DiscriminatorColumn
import javax.persistence.Entity
import javax.persistence.Id

@DiscriminatorColumn
@Entity
open class Workplace {
    @Id
    open var id: String? = null
    open var address: String? = null
    open var city: String? = null
    var constructionType: String? = null
}