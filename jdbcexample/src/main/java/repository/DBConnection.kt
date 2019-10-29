package repository

import java.lang.RuntimeException
import java.sql.Connection
import java.sql.DriverManager
import java.util.*

open class DBConnection
{
    var connection: Connection

    init
    {
        val properties = Properties()
        properties.put("user", "my_user")
        properties.put("password", "mypass123")

        val connString = "jdbc:mysql://localhost:3306/test_db"

        try
        {
            connection = DriverManager.getConnection(connString, properties)
            println("Connected to DB!")
        }
        catch (ex: Exception)
        {
            println("Error: ${ex.message}")
            throw RuntimeException("Cannot connect to DB")
        }
    }
}