import java.lang.System.exit
import io.github.oshai.kotlinlogging.KotlinLogging
import utils.*

fun mainMenu() : Int {

    print("""
   > ----------------------------------
   > |        NOTE KEEPER APP         |
   > ----------------------------------
   > | NOTE MENU                      |
   > |   1) Add a note                |
   > |   2) List all notes            |
   > |   3) Update a note             |
   > |   4) Delete a note             |
   > ----------------------------------
   > |   0) Exit                      |
   > ----------------------------------
   > ==>> """.trimMargin(">"))
    return readNextInt(" > ==>>")
}

fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1  -> addNote()
            2  -> listNotes()
            3  -> updateNote()
            4  -> deleteNote()
            0  -> exitApp()
            else -> println("Invalid option entered:  ${option}")
        }
    } while (true)
}

fun addNote(){
    logger.info { "addNote() function invoked" }
}

fun listNotes(){
    logger.info { "addNote() function invoked" }
}

fun updateNote(){
    logger.info { "addNote() function invoked" }
}

fun deleteNote(){
    logger.info { "addNote() function invoked" }
}

fun exitApp(){
    println("Exiting...bye")
    exit(0)
}

private val logger = KotlinLogging.logger {}

fun main() {
    runMenu()
}