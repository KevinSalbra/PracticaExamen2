package UI;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @author Dylan
 * @author Noé
 * @author Kristhel
 */
public class UI {

    private static Console console = System.console();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String[] input(String name, String[] msgs) {
        String[] inputs = new String[msgs.length];
        print("-----" + name + "------");
        for (int i = 0; i < msgs.length; i++) {
            inputs[i] = input1(msgs[i]);
        }
        return inputs;
    }

    public static String input1(String msg) {
        Boolean opt = false;
        String data;
        String response;
        do {
            print(msg);
            data = readLine();
            print("Is the information entered correct? [y/n]");
            opt = false;
            response = readLine();
            if (response.startsWith("y")) {
                opt = true;
            }
        } while (!opt);
        return data;
    }

    public static void print(String output) {
        System.out.println(output);
    }

    public static int menu(String name, String[] options) {
        /**
         * Retorna el indice de las opciones Retorna -1 en caso de error
         */
        int opt = -1;
        print("========" + name.toUpperCase() + "===========" + "\n");
        print("Select an option.\n");
        for (int i = 0; i < options.length; i++) {
            print((i + 1) + "-------------" + options[i]);
        }
        do {
            opt = Integer.parseInt(readLine().trim());
            if (opt - 1 >= options.length || opt <= 0) {
                print("Enter an option between 1 & " + options.length);
                opt = -1;
            }
        } while (opt == -1);
        return opt - 1;
    }

    private static String readLine() {
        if (console != null) {
            return console.readLine();
        } else {
            try {
                return reader.readLine();
            } catch (IOException x) {
                print("Read error" + x.getMessage());
                return " ";
            }
        }
    }

}
