import java.util.Scanner;

public class QuestionService {

Question[] questions =new Question[5];
String input[] = new String[5];

public QuestionService()
{
questions[0] =new Question(1,"what", "Java","Cpp","Python","C","1");
questions[1] =new Question(2,"what", "Java","Cpp","Python","C","1");
questions[2] =new Question(3,"what", "Java","Cpp","Python","C","1");
questions[3] =new Question(4,"what", "Java","Cpp","Python","C","1");
questions[4] =new Question(5,"what", "Java","Cpp","Python","C","1");

}

public void displayQuestions()
{
    int i=0;
for(Question q:questions){
    System.out.println("Question no. : "+q.getId());
    System.out.println(q.getQuestion());
    System.out.println("Option 1: "+ q.getOpt1());
    System.out.println("Option 2: "+ q.getOpt2());
    System.out.println("Option 3: "+ q.getOpt3());
    System.out.println("Option 4: "+ q.getOpt4());
    Scanner scn =new Scanner(System.in);
    input[i]=scn.nextLine();
    i++;

}
for (String s : input) {
 
    System.out.println(s);
  
}

}

public void printScore(){
    int score =0;
    for(int i=0;i<questions.length;i++){
        Question ques =questions[i];
        String answer=ques.getAnswers();
        String userAnswer=input[i];
        if (answer.equals(userAnswer)) {
            score++;
        }
       

    }
    System.out.println("Your Score is : "+score);
}

}