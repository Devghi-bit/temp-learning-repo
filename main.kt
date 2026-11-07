fun main() {

    val secret=3
   var attempts=0
    var guess: Int 
    var youWin = false

    while (you Win == false) {
        print("your guess ")
        if (guess ==null) {
            println("you are kye")
            continue
    }

    if(true) {
        println("Guess the number between 1 and 5:")
        guess = readln()!!.toInt()
        attempts++
      when (guess < secret) {
            println("Too low!")
        } else if (guess > secret) {
            println("Too high!")
        } else {
            println("Congratulations! You've guessed the number in $attempts attempts.")
       break

        }

    }
}
}
