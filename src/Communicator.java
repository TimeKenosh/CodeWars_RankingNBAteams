import java.util.Scanner;

public class Communicator {
    Scanner scanner = new Scanner(System.in);
    public String enterNameOfTeam(String text){
        System.out.print(text);
        return scanner.nextLine();
    }
    public void resultOut(String result){
        System.out.println(result);
    }
    public void close(){
        scanner.close();
    }
}
