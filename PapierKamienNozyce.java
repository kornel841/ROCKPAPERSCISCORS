import java.util.Random;
import java.util.Scanner;

public class PapierKamienNozyce {
  public static void main(String[] args) {  
    
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      String[] kpn = {"k", "p", "n"};
      String computerMove = kpn[new Random().nextInt(kpn.length)];
      
      String playerMove;
      
      while(true) {
        System.out.println("Wybierz swoj ruch (k, p, or n)");
        playerMove = scanner.nextLine();
        if (playerMove.equals("k") || playerMove.equals("p") || playerMove.equals("n")) {
          break;
        }
        System.out.println(playerMove + " to nieprawidlowy ruch.");
      }
      
      System.out.println("Komputer gral: " + computerMove);
      
      if (playerMove.equals(computerMove)) {
        System.out.println("Remis!");
      }
      else if (playerMove.equals("k")) {
        if (computerMove.equals("p")) {
          System.out.println("Przegrales!");
          
        } else if (computerMove.equals("n")) {
          System.out.println("Wygrales!");
        }
      }
      
      else if (playerMove.equals("p")) {
        if (computerMove.equals("k")) {
          System.out.println("Wygrales!");
          
        } else if (computerMove.equals("n")) {
          System.out.println("Przegrales!");
        }
      }
      
      else if (playerMove.equals("n")) {
        if (computerMove.equals("p")) {
          System.out.println("Wygrales!");
          
        } else if (computerMove.equals("k")) {
          System.out.println("Przegrales!");
        }
      }
      
      System.out.println("Grasz jeszcze? (t/n)");
      String playAgain = scanner.nextLine();
      
      if (!playAgain.equals("t")) {
        break;
      }
    }
    scanner.close();
  }
}
;
