package repository

import entities.Person
import java.sql.PreparedStatement
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
        val pStmt: PreparedStatement = connection.prepareStatement(
        "SELECT id, fName, lName, nickname, age FROM people WHERE id = ?"
        )

        pStmt.setInt(1, id)
        val results: ResultSet = pStmt.executeQuery()

        if (results.next())
        {
            return Person(
                id = results.getInt("id"),
                fName = results.getString("fName"),
                lName = results.getString("lName"),
                nickname =  results.getString("nickname"),
                age = results.getInt("age")
            )
        }
        return null
    }

    fun save(person: Person)
    {
        val pStmt: PreparedStatement = connection.prepareStatement(
        "INSERT INTO people (fName, lName, nickname, age) VALUES (?, ?, ?, ?)",
            Statement.RETURN_GENERATED_KEYS
        )

        //bind my parameters to the query (avoid SQL injection)
        pStmt.setString(1, person.fName)
        pStmt.setString(2, person.lName)
        pStmt.setString(3, person.nickname)
        pStmt.setInt(4, person.age)

        person.id = pStmt.executeUpdate()
    }

    fun update(person: Person)
    {
        val pStmt: PreparedStatement = connection.prepareStatement(
        "UPDATE people SET fName = ?, lName = ?, nickname = ?, age = ? " +
            "WHERE id = ?"
        )

        pStmt.setString(1, person.fName)
        pStmt.setString(2, person.lName)
        pStmt.setString(3, person.nickname)
        pStmt.setInt(4, person.age)
        pStmt.setInt(5, person.id)

        pStmt.execute()
    }

    fun delete(id: Int)
    {
        val pStmt: PreparedStatement = connection.prepareStatement(
        "DELETE FROM people WHERE id = ?"
        )

        pStmt.setInt(1, id)
        pStmt.execute()
    }
}












