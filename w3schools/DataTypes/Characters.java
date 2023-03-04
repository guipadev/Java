package DataTypes;

public class Characters {

    public static void main(String[] args) {

        // Characters
        //The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
        char myGrade = 'B';
        System.out.println(myGrade);

        // Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // Tip: A list of all ASCII values can be found in our ASCII Table Reference. https://www.w3schools.com/charsets/ref_html_ascii.asp

        // Strings
        //The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
        String greeting = "Hello World";
        System.out.println(greeting);
    }
}
