package objectPool

import java.util.*

/**
 * Object Pool Design Pattern
 * Participant: Pool
 */
class Pool {
    /**
     * The Pool
     * - A list of free objects
     * - A list of busy objects
     * - A maximum number of objects allowed
     */
    companion object Pool {
        private var freeObjects: Queue<DBObject> = LinkedList<DBObject>()
        private var busyObjects: Queue<DBObject> = LinkedList<DBObject>()
        private const val MAX_NUM_OF_OBJECTS: Int = 3

        init {
            println("Creating a Pool...")
            println("Pool ${this.hashCode()} created.\n")
        }
    }

    /**
     * Handle clients' requests for object(s)
     */
    private fun getObject() {
        // check if there isn't an available object
        if (freeObjects.isEmpty()) {
            //check if we already have max objects allowed in the pool
            if (busyObjects.size == MAX_NUM_OF_OBJECTS) {
                println("\n-> No free objects. Pool is full. Please try back.")
            }
            else { //If not, instantiate the object
                val obj = DBObject()
                busyObjects.add(obj)
                println("\n-> Here is your object: ${obj.hashCode()}")
            }
        }
        else {
            //if there is, give it to the client
            val obj = freeObjects.remove()
            obj.state = 1 //set its state
            busyObjects.add(obj)
            println("\n-> Here is your object: ${obj.hashCode()}")
        }

        listObjects()
    }

    /**
     * Handle returning object(s) from the clients
     * Real-world application, e.g. with a DB connection object:
     *      This method can be implemented to
     *      set a time-out for each object and
     *      collect any idle objects from the clients.
     */
    private fun returnObject() {
        if (busyObjects.isEmpty()) {
            println("\n-> Nothing to return")
        }
        else {
            val obj = busyObjects.remove()
            obj.state = 0 //clear the state
            freeObjects.add(obj)
            println("\n-> Objects state has been reset. Coming back to pool.")
        }

        listObjects()
    }

    /**
     * List all objects in the pool
     */
    private fun listObjects() {
        println("\n----------- TOTAL OBJECTS in POOL (MAX is $MAX_NUM_OF_OBJECTS) -----------")

        print(" Free Objects: ")
        for (obj in freeObjects) {
            print("${obj.hashCode()}(${obj.state}) ")
        }
        println()

        print(" Busy Objects: ")
        for (obj in busyObjects) {
            print("${obj.hashCode()}(${obj.state}) ")
        }
        println("\n--------------------------------------------------------\n")

        nav()
    }

    /**
     * Navigation for demonstration
     */
    fun nav() {
        println("Menu Options:")
        print(
            """
                1. Gimme an object
                2. Return the object
                3. List total objects in the pool
                4. Done with selection
                Please select an option: 
                """.trimIndent()
        )

        when (readLine()) {
            "1" -> getObject()
            "2" -> returnObject()
            "3" -> listObjects()
            "4" -> return
        }

        println()
    }
}