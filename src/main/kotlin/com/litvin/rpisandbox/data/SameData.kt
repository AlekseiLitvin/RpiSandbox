package com.litvin.rpisandbox.data

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class SameData(
    @Id
    @GeneratedValue
    var id: Long = 0,
    var text: String,
    var creationDate: LocalDateTime? = LocalDateTime.now()
)