import java.util.List;
import java.util.Scanner;

public class Communicator {
    Scanner scanner = new Scanner(System.in);
    public String enterNameOfTeam(String text){
        System.out.print(text);
        return scanner.nextLine();
    }
    public void resultOut(List<String> list){
        String data;
        if (list.get(1).equals("0") && list.get(2).equals("0") && list.get(3).equals("0")) {
            data = list.get(0) + ": This team didn`t play";
        } else {
            data = list.get(0) + ":W=" + list.get(1) + ";D=" + list.get(2) + ";L=" + list.get(3) + ";Scored=" + list.get(4) + ";Conceded=" + list.get(5) + ";Points=" + list.get(6);
        }
        System.out.println(data);
    }
    public void close(){
        scanner.close();
    }
}
