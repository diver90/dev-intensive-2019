package ru.skillbranch.devintensive.models

import java.util.*

class User (
    val id:String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    val lastVisit: Date? = Date(),
    val isOnline: Boolean = false


) {
    //var introBit: String

    constructor(id: String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )
constructor(id: String) : this(id, "John", "Doe $id")

    init {
        println("It`s Alive!!!\n" +
        "${if(lastName==="Doe") "His name id $firstName $lastName" else "And his name is $firstName $lastName!!!"}\n" +
        "${getIntro()}")
                }

    private fun getIntro()="""

           tu tu ru tuuuuu!!!

           tu tu ru tuuuuuuuuuu ...

    """.trimIndent()

    }


