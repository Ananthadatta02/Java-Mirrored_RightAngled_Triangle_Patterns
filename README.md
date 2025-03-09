# Mirrored Right-Angled Triangle in Java

## Description
This Java program prints a **mirrored right-angled triangle** using spaces (` `) and asterisks (`*`). The program utilizes nested loops to format the output correctly, ensuring that the stars (`*`) appear right-aligned.

---

## Code Overview
```java
public class MirroredRightAngleTriangle
{
    public static void main(String[] args)
    {
        int space = 3; // Initial number of spaces before the first star
        int star = 1;  // Initial number of stars in the first row
        
        for(int i = 0; i <= 3; i++) // Outer loop controls the number of rows (4 rows)
        {
            for(int j = 1; j <= space; j++) // Inner loop to print spaces
            {
                System.out.print(" "); // Prints space without newline
            }
            
            for(int j = 1; j <= star; j++) // Inner loop to print stars
            {
                System.out.print("*"); // Prints a star without newline
            }
            
            space--; // Decrease spaces to shift stars right
            star++;  // Increase stars for the next row
            System.out.println(); // Moves to the next line
        }
    }
}
```

---

## Explanation of Code Components

### **1. Variables:**
- `space = 3`: Determines the initial number of spaces before the first star.
- `star = 1`: Represents the number of stars in the first row.

### **2. Outer Loop (Rows Control):**
```java
for(int i = 0; i <= 3; i++)
```
- Runs **4 times** (`i=0` to `i=3`), controlling the number of rows.

### **3. First Inner Loop (Printing Spaces):**
```java
for(int j = 1; j <= space; j++)
```
- Runs from `1` to `space`, printing spaces before stars.
- Initially prints `3` spaces, decreasing in each row.

### **4. Second Inner Loop (Printing Stars):**
```java
for(int j = 1; j <= star; j++)
```
- Runs from `1` to `star`, printing stars after spaces.
- Starts with `1` star and increases each row.

### **5. Updating `space` and `star`:**
```java
space--; // Reduce spaces by 1 in each iteration
star++;  // Increase stars by 1 in each iteration
```
- Spaces **decrease** to shift stars right.
- Stars **increase** to form the triangle shape.

### **6. Printing Statements:**
- `System.out.print(" ")` prints spaces without moving to the next line.
- `System.out.print("*")` prints stars on the same line.
- `System.out.println();` moves to the next line after printing each row.

---

## Output
When executed, the program prints:
```
   *
  **
 ***
****
```
Each row starts with spaces (decreasing each time) followed by stars (increasing each time), forming a **mirrored right-angled triangle**.

---

## Complexity Analysis
- **Time Complexity:** `O(n^2)` (due to nested loops)
- **Space Complexity:** `O(1)` (constant space usage)

---

## Conclusion
This program effectively demonstrates nested loops and the use of **increment/decrement operations** to control output formatting. The concept can be applied to generate different triangle patterns in Java programming.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Mirrored_RightAngled_Triangle_Patterns.git
```
