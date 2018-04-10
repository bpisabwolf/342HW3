//Name: Michael Elyafi, ACCC: melyafi
import java.util.*;
import java.io.*;

public class MCMAQuestion extends MCQuestion{
  
  protected ArrayList<Answer> studentAnswer = new ArrayList<Answer>();
  
  private double baseCredit;

 public MCMAQuestion(String text, double maxValue, double baseCredit){
  super(text, maxValue);
  this.baseCredit = baseCredit;
//  studentAnswer 
 }
 
 public MCMAQuestion(Scanner scanningData){
    super(scanningData);
 }
 
 public Answer getNewAnswer(){
  Answer ans = new MCSAAnswer(null, 0.0);
  return ans;
 }

 public Answer getNewAnswer(String text, double creditIfSelected){
  Answer ans = new MCSAAnswer(text, creditIfSelected);
  return ans;
  
 }
 public void getAnswerFromStudent(){
  Scanner scan = new Scanner(System.in);
  String getChar = scan.next();
  getChar = getChar.toLowerCase();
  char letter = getChar.charAt(0);
  int numLetter = (int)letter;
  int temp = numLetter - 97;
  MCMAAnswer temparry = (MCMAAnswer)answerMC.get(temp);
  studentAnswer.add(temparry);
 }
 
  //new
 public double getValue() {
   double points = 0.0;
   for (int i = 0; i < studentAnswer.size(); i++){
     points += super.getValue((MCAnswer)studentAnswer.get(i));
   }
   points = ((points + baseCredit) * maxValue);
   return points;
 }
 
  public void save(PrintWriter writingData){
    writingData.println(text);
    writingData.println(maxValue);
    writingData.println(baseCredit);
    writingData.println(answerMC.size());
  }
  public void saveStudentAnswer(PrintWriter writingData) {
    writingData.println(studentAnswer.size());
    for(Answer ans : studentAnswer) {
      ans.saveStudentAnswer(writingData);
    }
  } 
 /*
 public double getValue(){
  if(studentAnswer.getCredit(rightAnswer) > 0){
   return studentAnswer.getCredit(rightAnswer);
  }
  else{
   return 0.0;
  }
 }
 */
}