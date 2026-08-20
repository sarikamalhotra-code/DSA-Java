# LeetCode 125 - Valid Palindrome

## 📝 Problem

A phrase is a palindrome if, after converting all uppercase letters into lowercase
and removing all non-alphanumeric characters, it reads the same forward and backward.

Given a string `s`, return `true` if it is a palindrome, otherwise return `false`.

---

## 💡 Approach

I used the **Two Pointer** approach.

- `left` pointer starts from the beginning of the string.
- `right` pointer starts from the end of the string.
- Ignore spaces and non-alphanumeric characters.
- Convert characters to lowercase before comparing.
- If the characters are different, return `false`.
- If they are the same, move both pointers toward the center.
- If all characters match, return `true`.

---

## 🔍 Example

### Input
text
s = "A man, a plan, a canal: Panama"

After removing non-alphanumeric characters and converting to lowercase:
amanaplanacanalpanama

Output

true