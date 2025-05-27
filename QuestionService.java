import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String[] selections = new String[5];
    Scanner sc = new Scanner(System.in);
    ArrayList<String> correctAnswers = new ArrayList<>();

    public QuestionService(){
        questions[0] = new Question(1, "How many times the CSK has won the IPL?", "2","4","5","3","5");
        questions[1] = new Question(2, "What is the acronym of Royal Challengers Bengaluru?", "RCC","RCB","RBS","RB","RCB");
        questions[2] = new Question(3, "What is the capital city of Rajasthan?", "Bengaluru","New Delhi","Jaipur","Kochi","Jaipur");
        questions[3] = new Question(4, "Size of int (in bytes)?", "2","4","6","8","4");
        questions[4] = new Question(5, "Which programming language was founded in 1985?", "C++","Python","C Sharp","Java","Java");
    }

    public void playQuiz(){
        int i=0;
        for(Question q : questions){
            System.out.print(q.getId()+". ");
            System.out.println(q.getQuestion());
            System.out.print("A. "+q.getOption1());
            System.out.print("\t\tB. "+q.getOption2());
            System.out.print("\t\tC. "+q.getOption3());
            System.out.print("\t\tD. "+q.getOption4());
            System.out.println();
            System.out.println("Enter the answer: ");
            selections[i] = sc.nextLine();
            i++;
        }
        sc.close();
    }
    
    public void printScore(){
        int score = 0;

        for(int i=0; i<questions.length; i++){
            Question question = questions[i];
            String actualAnswer = question.getAnswer();
            String userAnswer = selections[i];
            if(actualAnswer.equals(userAnswer)){
                correctAnswers.add(actualAnswer);
                score++;
            }
        }
        System.out.println("Below are the correct answers given by the user:");
        for(int i=0; i<correctAnswers.size(); i++){
            System.out.println(i+1+". "+correctAnswers.get(i));
        }
        System.out.println("Your Score is: "+score);
    }
}
