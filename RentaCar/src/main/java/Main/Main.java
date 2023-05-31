/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import UI.UI;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        
        
        
        
    }
    
      private static void Menu() {

        int opc1;

        String options[] = {"Add Administrator", "Add collaborator", "Add Project", "Add Sprint", "Add Task", "Exit"};

        do {

            opc1 = UI.menu("Menu", options);

            switch (opc1) {

                case 0:
                   
                    break;

                case 1:
                   
                    break;

                case 2:
                  
                    break;

                case 3:
                   
                    break;

                case 4:
                   
                    break;

                case 5:
                    UI.print("Leaving....");
                    break;

                default:
                    UI.print("Type a valid option");
                    break;
            }

        } while (opc1 != 5);

    }
}
