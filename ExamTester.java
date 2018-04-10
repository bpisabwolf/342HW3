//Boris Pisabaj
//bpisabaj
import java.util.*;
import java.io.*;
public class ExamTester {

    public static void main(String[] args) {
  System.out.println("Name: Boris Pisabaj");
        Exam exam = new Exam("Our Exam");

  MCSAQuestion question1 = new MCSAQuestion("What is my favorite food?", 1.0);
  MCSAAnswer a1 = new MCSAAnswer("Eggs", 1.0);
  MCSAAnswer b1 = new MCSAAnswer("Chicken", 0.0);
  MCSAAnswer c1 = new MCSAAnswer("Tofu", 0.0);
  MCSAAnswer d1 = new MCSAAnswer("Banana", 0.5);
  MCSAAnswer e1 = new MCSAAnswer("Strawberries", 0.0);
  question1.addAnswer(a1);
  question1.addAnswer(b1);
  question1.addAnswer(c1);
  question1.addAnswer(d1);
  question1.addAnswer(e1);
  question1.setRightAnswer(a1);
  exam.addQuestion(question1);
   
  SAQuestion question2 = new SAQuestion("Who recently got access to ultra instinct?", 1.0);
  SAAnswer shrtAnswer = new SAAnswer("goku");
  question2.setRightAnswer(shrtAnswer);
  exam.addQuestion(question2);
  
  MCSAQuestion question3 = new MCSAQuestion("Who is the batman?", 1.0);
  MCSAAnswer a3 = new MCSAAnswer("Bruce Wayne", 1.0);
  MCSAAnswer b3 = new MCSAAnswer("Superman", 0.0);
  MCSAAnswer c3 = new MCSAAnswer("The Joker", 0.0);
  MCSAAnswer d3 = new MCSAAnswer("Spiderman", 0.0);
  MCSAAnswer e3 = new MCSAAnswer("The capital of Winsconsin", 0.5);
  question3.addAnswer(a3);
  question3.addAnswer(b3);
  question3.addAnswer(c3);
  question3.addAnswer(d3);
  question3.addAnswer(e3);
  question3.setRightAnswer(a3);
  exam.addQuestion(question3);
  
  SAQuestion question4 = new SAQuestion("The correct answer is: sleepy", 1.0);
  SAAnswer shrtAnswer4 = new SAAnswer("sleepy");
  question4.setRightAnswer(shrtAnswer4);
  exam.addQuestion(question4);
  
  exam.reorderMCAnswers(-1);
  exam.reorderQuestions();
  exam.print();
  exam.getAnswerFromStudent(0);
  exam.getAnswerFromStudent(1);
  exam.getAnswerFromStudent(2);
  exam.getAnswerFromStudent(3);
  exam.reportQuestionValues();
      
File file = new File ("ExamDataFile.txt");
File file2 = new File ("StudentAnswerDataFile.txt");
try
{
  PrintWriter printWriter = new PrintWriter(file);
  PrintWriter printWriter2 = new PrintWriter(file2);
  exam.save(printWriter);
  exam.saveStudentAnswer(printWriter2);
  printWriter.close();
  printWriter2.close();
}
catch (FileNotFoundException ex)
{
  System.out.println("error");
}
    }
}
