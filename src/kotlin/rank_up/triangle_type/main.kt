package rank_up.kotlin_pl.triangle_type

fun main() {
    // Test cases
    println(triangleType(2.0, 4.0, 6.0)) // 0 (Not a triangle)
    println(triangleType(8.0, 5.0, 7.0)) // 1 (Acute)
    println(triangleType(3.0, 4.0, 5.0)) // 2 (Right)
    println(triangleType(7.0, 12.0, 8.0)) // 3 (Obtuse)
}