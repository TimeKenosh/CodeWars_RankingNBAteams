import java.util.List;
import java.util.Scanner;

public class Communicator {
    Scanner scanner = new Scanner(System.in);
    public String enterNameOfTeam(String text){
        System.out.print(text);
        return scanner.nextLine();
    }
    public void resultOut(List<Integer> list, String name){
        String data;
        if (list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0) {
            data = name + ": This team didn`t play";
        } else {
            data = name + ":W=" + list.get(0) + ";D=" + list.get(1) + ";L=" + list.get(2) + ";Scored=" + list.get(3) + ";Conceded=" + list.get(4) + ";Points=" + list.get(5);
        }
        System.out.println(data);
    }
    public void close(){
        scanner.close();
    }
}
