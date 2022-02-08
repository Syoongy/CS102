
package demo; //Will generate classes/demo on compile.

import entity.*;

public class Test {
    public static void main(String[] args) {
        // -cp or -classpath to define where to look for .class file in the cli
        // -sourcepath <path> will be the first level where the compiler looks. (The
        // folder containing all the package folders)
        // -cp defaults -sourcepath to the same directory
        // -d directory of where to build the .class file
        // System.out.println("Hello World!");

        Person p = new Person("apple");
        System.out.println(p);
    }
}