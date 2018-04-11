//Boris Pisabaj
//bpisabaj
import java.util.*;
import java.io.*;

public class Exam{
 private String text;
 private ArrayList<Question> listOfQuestions;
 
 //The constructor, everything is zeroed out.
 public Exam(String text){
  this.text = text;
  listOfQuestions = new ArrayList<Question>();
 }
 
  public Exam(Scanner scanningData){
    ScannerFactory.getKeyboardScanner();
 }

 //Prints all the questions
 public void print(){
  System.out.println(text + "\n" );
  for (int i = 0; i < listOfQuestions.size(); i++){
   System.out.print("\t\n" + "Question " + (i+1) + ". " );
   listOfQuestions.get(i).print();
  }
 }
 //Adds question to the exam
 public void addQuestion(Question q){
  listOfQuestions.add(q);
 }

 //Reorder questions in a random order
 public void reorderQuestions(){
  Collections.shuffle(listOfQuestions);
 }
 
 public void reorderMCAnswers(int position){
  if (position < 0){
   for (Question testQ : listOfQuestions){
    if (testQ instanceof MCQuestion){
     ((MCQuestion) testQ).reorderAnswers();
    }
   }
  }
  else {
   ((MCQuestion) listOfQuestions.get(position)).reorderAnswers();
  }
 }
 public void reportQuestionValues(){
  for (int i = 0; i < listOfQuestions.size(); i++){
   System.out.println("Question " + (i+1) + ". Total points you scored:" + listOfQuestions.get(i).getValue() + "\n Total points possible:" + listOfQuestions.get(i).maxValue);
  }
  System.out.println("Overall Score: " + getValue());
 }
 public void getAnswerFromStudent(int position){
  listOfQuestions.get(position).getAnswerFromStudent();
 }
 
 //Gets the whole score of the exam
 public double getValue(){
  double score = 0;
  for (int i = 0; i < listOfQuestions.size(); i++){
   score += listOfQuestions.get(i).getValue();
  }
  return score;
 }
 
 //new
 public void save(PrintWriter writingData){
    writingData.println(text);
    for (int i = 0; i < listOfQuestions.size(); i++)
    {
      if (listOfQuestions.get(i) instanceof MCSAQuestion){
        writingData.println("MCSAQuestion");
        listOfQuestions.get(i).save(writingData);
      }
      if (listOfQuestions.get(i) instanceof MCMAQuestion){
        writingData.println("MCMAQuestion");
        listOfQuestions.get(i).save(writingData);
      }
      if (listOfQuestions.get(i) instanceof SAQuestion){
        writingData.println("SAQuestion");
        listOfQuestions.get(i).save(writingData);
      }
    }
 }
 
 public void saveStudentAnswers(PrintWriter writingData){
    writingData.println(text);
    for (int i = 0; i < listOfQuestions.size(); i++)
    {
      if (listOfQuestions.get(i) instanceof MCSAQuestion){
        writingData.println("MCSAQuestion");
       listOfQuestions.get(i).saveStudentAnswers(writingData);
      }
      if (listOfQuestions.get(i) instanceof MCMAQuestion){
        writingData.println("MCMAQuestion");
       listOfQuestions.get(i).saveStudentAnswers(writingData);
      }
      if (listOfQuestions.get(i) instanceof SAQuestion){
        writingData.println("SAQuestion");
       listOfQuestions.get(i).saveStudentAnswers(writingData);
      }
    }
 }
 public void restoreStudentAnswers(Scanner scanningData){
 
 }
}