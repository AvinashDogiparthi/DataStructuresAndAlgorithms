### Recursion in Programming

---

### What is Recursion?

- **Recursion** is a technique where a **function calls itself** (directly or indirectly) to solve a problem.
- Every recursive problem must have:
    1. **Base Case** → the stopping condition (prevents infinite calls).
    2. **Recursive Case** → the part where the function calls itself to break the problem into smaller parts.

---

### Example 1: Factorial

The factorial of `n` is defined as:  n! = n × (n-1) × (n-2) × ... × 1

**Using recursion:**
```text
int factorial(int n) {
    if (n == 0 || n == 1)   // ✅ Base Case
        return 1;
    return n * factorial(n - 1); // 🔄 Recursive Case
}
```

**Call Flow(factorial(4)):**
```text
factorial(4)
= 4 * factorial(3)
= 4 * (3 * factorial(2))
= 4 * (3 * (2 * factorial(1)))
= 4 * (3 * (2 * 1))
= 24
```


### Why Recursion ?
- It helps us in solving bigger/complex problems in a simple way
- You can convert recursion solution into iteration and vice versa
- Space complexity is not constant because of recursive calls
- It helps in breaking down bigger problems into smaller problems


