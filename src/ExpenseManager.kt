class ExpenseManager {
    private val expenses = mutableListOf<Expense>()

    fun addExpense(title: String, amount: Double, category: String) {
        val id = expenses.size + 1
        expenses.add(Expense(id, title, amount, category))
        println("✅ Saqlandi: $title ($amount so'm)")
    }

    fun showReport() {
        if (expenses.isEmpty()) {
            println("📭 Xarajatlar ro'yxati bo'sh.")
            return
        }

        println("\n--- 📊 Umumiy Xarajatlar Hisoboti ---")
        val total = expenses.sumOf { it.amount }

        val byCategory = expenses.groupBy { it.category }

        byCategory.forEach { (category, list) ->
            val catSum = list.sumOf { it.amount }
            val percentage = (catSum / total) * 100
            println("🔹 $category: ${catSum.toInt()} so'm (%.1f%%)".format(percentage))
        }

        println("-------------------------------------")
        println("💰 Jami xarajat: ${total.toInt()} so'm")
    }
}