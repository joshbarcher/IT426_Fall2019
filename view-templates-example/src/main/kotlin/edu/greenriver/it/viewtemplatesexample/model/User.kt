package edu.greenriver.it.viewtemplatesexample.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    val username: String,
    val age: Int,
    val account: AccountType
)
{

}

enum class AccountType
{
    PREMIER,
    STANDARD
}