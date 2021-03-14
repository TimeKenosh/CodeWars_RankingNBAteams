import java.util.List;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        Communicator communicator = new Communicator();
        String teamName = communicator.enterNameOfTeam("Enter name of team: ");
        List<String> listOfAllMatches = info.getListOfMatches();
        List<String> listOfNecessaryMatches = info.getNecessaryTeam(listOfAllMatches, teamName);
        String result = info.result(listOfNecessaryMatches, teamName);
        communicator.resultOut(result);
        communicator.close();
    }
}
