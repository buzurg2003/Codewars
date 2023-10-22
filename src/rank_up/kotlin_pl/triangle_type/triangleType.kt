package rank_up.kotlin_pl.triangle_type

/* Should return ᐃ type:
    0 : if ᐃ cannot be made with given sides
    1 : acute ᐃ
    2 : right ᐃ
    3 : obtuse ᐃ
*/

fun triangleType(a: Double, b: Double, c: Double): Int {
    // Check if the sides can form a triangle
    if (a + b <= c || a + c <= b || b + c <= a) {
        return 0 // Not a triangle
    }

    // Calculate the squares of the sides
    val aSquared = a * a
    val bSquared = b * b
    val cSquared = c * c

    // Check for a right triangle (one angle is 90 degrees)
    if (aSquared + bSquared == cSquared || aSquared + cSquared == bSquared || bSquared + cSquared == aSquared) {
        return 2 // Right triangle
    }

    // Check for an acute or obtuse triangle
    if (aSquared + bSquared > cSquared && aSquared + cSquared > bSquared && bSquared + cSquared > aSquared) {
        // All angles are less than 90 degrees, so it's an acute triangle
        return 1
    } else {
        // At least one angle is greater than 90 degrees, so it's an obtuse triangle
        return 3
    }
}



