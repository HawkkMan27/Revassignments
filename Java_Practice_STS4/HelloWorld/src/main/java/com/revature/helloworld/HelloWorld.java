
// This  is how we write a comment in Java

// This line (package) must always be the first non commented line in a .java file
package com.revature.helloworld;
/*
 * 
 * Multi Line Comment
 * 
 * Packages are a way of organizing our code into a hierarchy
 * 
 * lower.case.naming.convention
 * 
 * 2 types of packages
 * 
 * User-Defined (like the one we are using)
 * 
 * Built-in
 * 
 * Java.lang (Automatically imported)
 * 
 *  Other built in packages (Collections) - but these need to be manually imported.
 *  
 *  
 */
// java.util.logging.*;

/*
 * Class Declaration - PascaleCase
 * 
 */
/*
 * You can create your own javadocs to share pertinent information 
 * with other developers who might need to work on your code.
 * 
 * String name = Dan
 * 
 * @author DanielFellemen
 * 
 */
public class HelloWorld {

	//main method - it acts as an entry point into our program.
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
	}
}
