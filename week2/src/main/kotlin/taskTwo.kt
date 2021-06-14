fun main() {
    var goat: Animal = Animal("Bingo")
    goat.eat("grass")
}

class Animal {
    var  name: String = ""
    var age: Int = 0
    var species: String = ""

    constructor(name: String){
        this.name = name
    }

    constructor(name: String, age: Int, species: String){
        this.name = name
        this.age = age
        this.species = species
    }

    fun eat(nameOfFood: String){
        println("$name is eating $nameOfFood")
    }

    fun walk(){
        println("$name is walking")
    }

    fun sleep(){
        println("$name is sleeping")
    }
}