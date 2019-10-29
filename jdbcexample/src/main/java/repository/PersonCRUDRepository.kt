package repository

import entities.Person
import java.sql.ResultSet
import java.sql.Statement

class PersonCRUDRepository : DBConnection()
{
    fun findAll() : List<Person>
    {
        val listResults = mutableListOf<Person>()

        val stmt: Statement = connection.createStatement()
        val results: ResultSet = stmt.executeQuery(
        "SELECT id, fName, lName, nickname, age FROM people")

        while (results.next())
        {
            listResults.add(Person(
                id = results.getInt("id"),
                fName = results.getString("fName"),
                lName = results.getString("lName"),
                nickname =  results.getString("nickname"),
                age = results.getInt("age")
            ))
        }

        return listResults
    }

    fun findById(id: Int): Person?
    {
        return null
    }

    fun save(person: Person)
    {

    }

    fun update(person: Person)
    {

    }

    fun delete(id: Int)
    {

    }
}












