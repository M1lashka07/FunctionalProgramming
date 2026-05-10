package test

import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val fileItems = File("items.json")
    val fileBooks = File("books.json")

    writeToFileBooks(fileBooks)
    readFromFileBooks(fileBooks).forEach(::println)
}

fun writeToFileItems(file: File) {

    val items = mutableListOf<Item>()
    while (true) {
        print("Enter ID or 0 to exit: ")
        val id = readln().toInt()
        if (id == 0) break
        print("Enter name: ")
        val name = readln()

        items.add(Item(id, name))
    }

    file.writeText(Json.encodeToString(items))

}

fun readFromFileItems(file: File): List<Item> {

    return Json.decodeFromString(file.readText().trim())

}

fun writeToFileBooks(file: File) {
    val books = mutableListOf<Book>()

    while (true) {
        print("Enter name of book or 0 to exit: ")
        val name = readln()
        if (name == "0") break
        print("Enter author: ")
        val author = readln()
        print("Enter year : ")
        val year = readln().toInt()

        books.add(Book(name, author, year))
    }

    file.writeText(Json.encodeToString(books))
}

fun readFromFileBooks(file: File): List<Book> {

    return Json.decodeFromString(file.readText().trim())

}

