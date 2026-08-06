package Quiz_Console_App;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "what we learn here", "Java", "Cpp", "Python", "Html", "Java");
        questions[1] = new Question(2, "Size of double", "8 bytes", "4 bytes", "16 bytes", "2 bytes", "8 bytes");
        questions[2] = new Question(3, "Size of int", "4 bytes", "2 bytes", "8 bytes", "1 byte", "4 bytes");
        questions[3] = new Question(4, "Size of float", "4 bytes", "2 bytes", "8 bytes", "1 byte", "4 bytes");
        questions[4] = new Question(5, "Size of long", "8 bytes", "4 bytes", "16 bytes", "2 bytes", "8 bytes");
    }

    public void playQuiz() {
        int i=0;
        for (Question q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for (String s : selection) {
            System.out.println(s);
        }
    }

}
