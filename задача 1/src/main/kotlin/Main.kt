fun main() {
    /* задача 1*/
    val amount = 1000
    val proccomis = 0.0075
    val min = 35

    var comis = amount * proccomis
    if (comis < min){
        comis = min.toDouble()
    }
    println("Коммисия за перевод составляет $comis рублей")


/* задача 2 */
    val likes = 72
    if(likes % 2 == 1){
        println("Понравилось $likes человеку")
    }
    else {
        println("Понравилось $likes людям")
    }


    /* задача 3*/
    val postPok: Boolean = true
    val totalSum = 5000.0

    var discount: Double = 0.0

    if (totalSum > 1000 && totalSum <= 10000) {
        discount = 100.0
    } else if (totalSum > 10000) {
        discount = totalSum * 0.05
    }

    if (postPok) {
        discount += totalSum * 0.01
    }

    val finalSum = totalSum - discount
    println("Общая стоимость покупки состовляет: $finalSum")
}