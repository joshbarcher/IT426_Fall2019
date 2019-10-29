package test

import entities.Person
import repository.PersonCRUDRepository

fun main()
{
    val repo = PersonCRUDRepository()

    //enter a few test records
    /*repo.save(Person(
        id = 0,
        fName = "William",
        lName = "Perry",
        nickname = "The Fridge",
        age = 45
    ))

    repo.save(Person(
        id = 0,
        fName = "Massie",
        lName = "Williams",
        nickname = "Arya",
        age = 24
    ))*/

    //update the first record
    val person1 = repo.findById(1)
    if (person1 != null)
    {
        person1.fName = "Juan"

        repo.update(person1);
    }

    //delete the second record
    repo.delete(2)

    val people = repo.findAll()
    for (person in people)
    {
        println(person)
    }
}