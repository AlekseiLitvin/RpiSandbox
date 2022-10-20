package com.litvin.rpisandbox.repository

import com.litvin.rpisandbox.data.SameData
import org.springframework.data.repository.CrudRepository

interface SameDataRepository : CrudRepository<SameData, Long> {

}