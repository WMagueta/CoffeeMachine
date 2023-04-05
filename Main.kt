package machine

class coffeeMachine {

    var waterMl = 400
    var milkMl = 540
    var coffeeBeans = 120
    var cups = 9
    var money = 550

    inner class drink(water: Int, milk: Int, beans: Int, cost: Int) {
        private val water1 = water
        private val milk1 = milk
        private val beans1 = beans
        private val cost1 = cost

        fun buyDrink(water: Int = water1, milk: Int = milk1, beans: Int = beans1, cost: Int = cost1) {
            if (water <= waterMl && milk <= milkMl && beans <= coffeeBeans && cups >= 1) {
                println("I have enough resources, making you a coffee!")
                println(" ")
                waterMl -= water
                milkMl -= milk
                coffeeBeans -= beans
                cups -= 1
                money += cost
            } else if (water > waterMl) {
                println("Sorry, not enough water!")
                println(" ")
            } else if (milk > milkMl) {
                println("Sorry, not enough milk!")
                println(" ")
            } else if (beans > coffeeBeans) {
                println("Sorry, not enough coffee beans!")
                println(" ")
            } else {
                println("Sorry, not enough cups!")
                println(" ")
            }
        }
    }

    val espresso = drink(250, 0, 16, 4)
    val latte = drink(350, 75, 20, 7)
    val cappuccino = drink(200, 100, 12, 6)

    fun buy() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
        val productOfChoice = readln()
        when (productOfChoice) {
            "1" -> espresso.buyDrink()
            "2" -> latte.buyDrink()
            "3" -> cappuccino.buyDrink()
        }
        println(" ")
    }

    fun fill() {
        println("Write how many ml of water you want to add: ")
        waterMl += readln().toInt()

        println("Write how many ml of milk you want to add: ")
        milkMl += readln().toInt()

        println("Write how many grams of coffee beans you want to add: ")
        coffeeBeans += readln().toInt()

        println("Write how many disposable cups you want to add: ")
        cups += readln().toInt()

        println(" ")
    }

    fun take() {
        println("I gave you $$money")
        println(" ")
        money = 0
    }

    fun display() {
        println("The coffee machine has: ")
        println("$waterMl ml of water")
        println("$milkMl ml of milk")
        println("$coffeeBeans g of coffee beans")
        println("$cups disposable cups")
        println("$$money of money")
        println(" ")
    }

    init {
        var loop = 1
        while(loop == 1) {
            println("Write action (buy, fill, take, remaining, exit)")
            val action = readln()
            println(" ")
            when (action) {
                "buy" -> buy()
                "take" -> take()
                "fill" -> fill()
                "remaining" -> display()
                "exit" -> loop = 0
            }
        }
    }

}

fun main() {
    coffeeMachine()
}
