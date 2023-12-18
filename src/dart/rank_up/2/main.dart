import "dart:core";

// ! Solution #1
// int getCount(String inputStr) {
//   // Define a list of vowels
//   List<String> vowels = ['a', 'e', 'i', 'o', 'u'];

//   // Convert the input string to lowercase to make the comparison case-insensitive
//   inputStr = inputStr.toLowerCase();

//   // Initialize a variable to count the number of vowels
//   int count = 0;

//   // Loop through each character in the input string
//   for (int i = 0; i < inputStr.length; i++) {
//     // Check if the character is a vowel
//     if (vowels.contains(inputStr[i])) {
//       // Increment the count if it's a vowel
//       count++;
//     }
//   }

//   // Return the final count
//   return count;
// }

// ! Solution 2
int getCount(String str) => new RegExp('[aeiou]').allMatches(str).length;

void main() {
  // Example usage
  print(getCount("hi"));  // Output: 2 (e, o are vowels)
}

// https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/dart
