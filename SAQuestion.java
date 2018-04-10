//Name: Michael Elyafi, ACCC: melyafi
import java.util.*;
import java.io.*;

public class SAQuestion extends Question{
 
 public SAQuestion(String text, double maxValue){
  super(text, maxValue);
 }
 public SAQuestion(Scanner scanningData){
    super(scanningData);
 }
 public Answer getNewAnswer(){
  Answer SAanswer = new SAAnswer(null);
  return SAanswer;
 }
 public Answer getNewAnswer(String text){
  Answer SAanswer = new SAAnswer(text);
  return SAanswer;
 }
 public void getAnswerFromStudent(){
  Scanner shrtScan = new Scanner(System.in);
  String shrtAnswer = shrtScan.next();
  shrtAnswer = shrtAnswer.toLowerCase();
  Answer SAanswer = getNewAnswer(shrtAnswer);
  studentAnswer = SAanswer;
 }
 public double getValue(){
  if(studentAnswer.getCredit(rightAnswer) > 0){
   return studentAnswer.getCredit(rightAnswer);
  }
  else{
   return 0.0;
  }
 }
 
 public void save(PrintWriter writingData){
   writingData.println(maxValue);
   SAAnswer ans = (SAAnswer)rightAnswer;
   writingData.println(ans.text);
 }
  public void saveStudentAnswer(PrintWriter writingData){
   writingData.println(maxValue);
   writingData.println(text);
   SAAnswer ans = (SAAnswer)rightAnswer;
   writingData.println(ans.text);
 }
}