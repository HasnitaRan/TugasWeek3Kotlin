import java.util.*

fun main() {

    // Soal 1
    val statuspembeli: String = "member"
    val pembelian: Int = 500000
    val hargapembelian: Int = 625000
    val diskon5persen: Double = hargapembelian - (hargapembelian * 0.05)
    val diskon10persen: Double = hargapembelian - (hargapembelian * 0.1)
    val diskon15persen: Double = hargapembelian - (hargapembelian * 0.15)

    if (statuspembeli == "member" && hargapembelian <= pembelian) {
        println("Pembeli 1 mendapat diskon 5% dari 625000," + "Jadi totalnya : " + diskon5persen)
    } else if (statuspembeli != "member" && hargapembelian >= pembelian) {
        println("Pembeli 1 mendapat diskon 10% dari 625000," + "Jadi totalnya : " + diskon10persen)
    } else if (statuspembeli == "member" && hargapembelian >= pembelian) {
        println("Pembeli 1 mendapat diskon 15% dari 625000," + "Jadi totalnya : 625000 - 93750 = " + diskon15persen)
    } else {
    }
    // Soal 2
    val beratBadan: Int = 47
    val tinggiBadan: Int = 153
    val beratBadanIdeal: Int = tinggiBadan - 110

    println("-------------------------------------------------------------------------------------")

    if (beratBadan <= beratBadanIdeal) {
        println("Berat badanmu termasuk KURUS!")
    } else if (beratBadan == beratBadanIdeal) {
        println("Berat badanmu Ideal")
    } else if (beratBadan >= beratBadanIdeal) {
        println("Berat badanmu termasuk Gemuk!")
    } else {
    }
}
