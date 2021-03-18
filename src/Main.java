import java.util.List;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        Communicator communicator = new Communicator();
        Calculator calculator =  new Calculator();
        String teamName = communicator.enterNameOfTeam("Enter name of team: ");
        List<String> listOfAllMatches = info.getListOfMatches();
        List<String> listOfNecessaryMatches = info.getNecessaryTeam(listOfAllMatches, teamName);
        List<Integer> listSortedResults = info.result(listOfNecessaryMatches, teamName);
        List<Integer> result = calculator.getResult(listSortedResults);
        communicator.resultOut(result, teamName);
        communicator.close();
    }
}
