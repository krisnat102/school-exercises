import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zad_26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> wordList = new ArrayList<String>();

        String commandString = sc.nextLine();

        ArrayList<String> commandList = new ArrayList<String>();
        commandList.add(commandString);
        while (!commandString.contains("END")) {
            switch (commandString) {
                case "Add": {
                    String[] addString = sc.nextLine().split("\\s+");
                    wordList.addAll(Arrays.asList(addString));
                    System.out.println(wordList);
                    break;
                }
                case "Update": {
                    for (String word : wordList) {
                        if (!Character.isUpperCase(word.charAt(0))) {
                            if (Character.isLetter(word.charAt(0))) {
                                wordList.remove(word);
                                Character.toUpperCase(word.charAt(0));
                                wordList.add(word);
                            }
                        }
                    }
                    System.out.println(wordList);
                    break;
                }
                case "Remove": {
                    int toRemove = sc.nextInt();
                    wordList.remove(toRemove);

                    System.out.println(wordList);
                    break;
                }
                case "Search": {
                    String word = sc.nextLine();
                        if (wordList.contains(word)) {
                            System.out.println(word + " found");
                        } else {
                            System.out.println("not contained");
                        }
                    System.out.println(wordList);
                    break;
                }
                case "Length": {
                    int i = sc.nextInt();
                    boolean lengthBool = false;
                    for (String word : wordList) {
                        if (word.length() == i) {
                            System.out.println(word);
                            lengthBool = true;
                        }
                    }
                    if(lengthBool == false){
                        System.out.println("not contained");
                    }
                    System.out.println(wordList);
                    break;
                }
                case "Print": {
                    for (String word : wordList) {
                        System.out.println(word + "; ");
                    }
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + commandString);
            }
            commandString = sc.nextLine();
        }
    }
}
