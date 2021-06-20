// Assignment number one for week 3

fun main(args: Array<String>){
    var num: Int = 1
    
    while (num in 1..100){   
        if (num%3==0 && num%5==0){
            println("FizzBuzz")
        }
        else if (num % 3 == 0){
            println("Fizz")
        }
        else if (num % 5==0){
            println("Buzz")
        }
        else println(num)
        num++
        }
        
       
  // Assignment number two
        // Built-in function
    var word : String
    word = "Good food"
    println(word.reversed())
    
    // Written loop to reverse string
    var str : String = "God is Good"
    var length : Int = str.length-1
    for (index in str.indices){
        println(str[length-index])
        }
}
