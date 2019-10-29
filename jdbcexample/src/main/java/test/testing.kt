package test

import repository.PersonCRUDRepository

fun main()
{
    val repo = PersonCRUDRepository()
    val people = repo.findAll()

    for (person in people)
    {
        println(person)
    }
}