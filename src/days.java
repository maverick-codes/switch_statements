
import java.util.Scanner;
public class days{
    public static void main (String[]args){
        Scanner in  = new Scanner(System.in);
        System.out.println("choose a number");
        int day = in.nextInt();
        System.out.println("what fruit you bring today");
        String fruit = in.next();

        switch (day) {
            case 1 -> {
                System.out.println("monday");
                switch (fruit) {
                    case "mango", " grapes", " leechi", " papaya", "pomegranate", "banana" ->
                            System.out.println("it was apple today");
                    case "apple" -> System.out.println("voila good job vedik");
                }
            }
            case 2 -> {
                System.out.println("tuesday");
                switch (fruit) {
                    case "apple", " grapes", " leechi", " papaya", "pomegranate", "banana" ->
                            System.out.println("it was mango today");
                    case "mango" -> System.out.println("voila good job vedik");
                }
            }
            case 3 -> {
                System.out.println("wednesday");
                switch (fruit) {
                    case "mango", " apple", " leechi", " papaya", "pomegranate", "banana" ->
                            System.out.println("it was grapes today");
                    case "grapes" -> System.out.println("voila good job vedik");
                }
            }
            case 4 -> {
                System.out.println("thursday");
                switch (fruit) {
                    case "mango", " grapes", " apple", " papaya", "pomegranate", "banana" ->
                            System.out.println("it was leechi today");
                    case "leechi" -> System.out.println("voila good job vedik");
                }
            }
            case 5 -> {
                System.out.println("friday");
                switch (fruit) {
                    case "mango", " grapes", " leechi", " apple", "pomegranate", "banana" ->
                            System.out.println("it was papaya today");
                    case "papaya" -> System.out.println("voila good job vedik");
                }
            }
            case 6 -> {
                System.out.println("saturday");
                switch (fruit) {
                    case "mango", " grapes", " leechi", " papaya", "apple", "banana" ->
                            System.out.println("it was pomegranate today");
                    case "pomegranate" -> System.out.println("voila good job vedik");
                }
            }
            case 7 -> {
                System.out.println("sunday");
                switch (fruit) {
                    case "mango", " grapes", " leechi", " papaya", "pomegranate", "apple" ->
                            System.out.println("it was banana today");
                    case "banana" -> System.out.println("voila good job vedik");
                }
            }
            default -> System.out.println("not an option");
        }




    }
}

