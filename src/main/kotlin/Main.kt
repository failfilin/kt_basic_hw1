fun main() {
    val amount: Long  = 1_000_000// Размер платежа
    val commission = 0.75/ 100 // Процент зп перевод
    val commissionAmount = if  (amount * commission > 35) amount * commission else 35
    println("Размер комиссии = $commissionAmount")
}