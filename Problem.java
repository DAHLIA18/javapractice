import java.util.ArrayList;
import java.util.List;

class Problem {
    private String name;
    private String type;
    private boolean status;

    public Problem(String name, String type) {
        this.name = name;
        this.type = type;
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean getStatus() {
        return status;
    }

    public void solveProblem() {
        this.status = true;
    }
}

class Person {
    private List<Problem> problems;

    public Person() {
        this.problems = new ArrayList<>();
    }

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public List<Problem> recountProblems() {
        List<Problem> unsolvedProblems = new ArrayList<>();
        for (Problem problem : problems) {
            if (!problem.getStatus()) {
                unsolvedProblems.add(problem)
            }
        }
        return unsolvedProblems;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.addProblem(new Problem("Financial debt", "Financial"));
        person.addProblem(new Problem("Lack of motivation", "Spiritual"));
        person.addProblem(new Problem("Technical issues", "Technical"));

        List<Problem> unsolvedProblems = person.recountProblems();
        System.out.println("Unsolved problems:");
        for (Problem problem : unsolvedProblems) {
            System.out.println("- " + problem.getName() + " (" + problem.getType() + ")");
        }
    }
}