// Java program to use replaceAll(regex, str) method

package com.replaces;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating string
        String str = "I love cats. They are awesome. I know cats love to sleep.";

        // Regex for replacement
        String regex = "(?i)cat";

        // Replace and print to console
        System.out.println(str.replaceAll(regex, "dog"));
    }
}