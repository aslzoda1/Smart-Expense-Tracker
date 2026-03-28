import java.util.Scanner;
fun main() {
    val manager = ExpenseManager()
    val scanner = Scanner(System.`in`)

    println("🚀 Kotlin Expense Tracker-ga xush kelibsiz!")

    while (true) {
        println("\n1. Xarajat qo'shish | 2. Hisobot | 3. Chiqish")
        print("Tanlang: ")

        when (scanner.next()) {
            "1" -> {
                print("Nomi: ")
                val title = scanner.next()
                print("Summasi: ")
                val amount = scanner.nextDouble()
                print("Kategoriyasi (Ovqat, Yo'l, O'yin): ")
                val category = scanner.next()
                manager.addExpense(title, amount, category)
            }
            "2" -> manager.showReport()
            "3" -> {
                println("Xayr! Pullaringizga ehtiyot bo'ling! 😊")
                return
            }
            else -> println("⚠️ Noto'g'ri buyruq!")}
        }
}
