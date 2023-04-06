# :coffee: CoffeeMachine :coffee:
#### This is a command-line coffee machine simulation program written in Kotlin. It allows you to buy drinks, check the remaining ingredients, fill the machine with new ingredients and take the stored money.


## Getting Started ▶️

### Prerequisites :clipboard:
To run this program, you will need to have the following software installed on your computer:
- Kotlin compiler
- Java Development Kit (JDK)

### Installing :floppy_disk:
1. Clone this repository to your local machine using git clone https://github.com/WMagueta/CoffeeMachine

2. Navigate to the cloned repository's directory using your terminal.

3. Compile the program using the Kotlin compiler: kotlinc CoffeeMachine.kt -include-runtime -d CoffeeMachine.jar.

4. Run the program using the command: java -jar CoffeeMachine.jar.

### Usage :toolbox:
The program will display the desired request and perform the actions of sell coffee, display ingredients, fill ingredients or taking the money. The coffeeMachine itself is a class, containing the stored ingredients as attributes and the functions as methods.
The program uses the drinks class to represent drinks that can be bought, and takes money based on it's cost and use the ingredients stored to make the drink itself, displaying a error message when there's not enough of one ingredient.

### Contributing :hammer_and_pick:
If you would like to contribute to this project, feel free to fork the repository and submit a pull request with your changes.
