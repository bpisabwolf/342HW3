//Name: Michael Elyafi, ACCC: melyafi
import java.util.*;
import java.io.*;

public class MCSAQuestion extends MCQuestion{
 public MCSAQuestion(String text, double maxValue){
  super(text, maxValue);
 }
 
public MCSAQuestion(Scanner scanningData){
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
  studentAnswer = answerMC.get(temp);
 }
 
  //new
 public double getValue(){
   return super.getValue((MCSAAnswer)studentAnswer) * maxValue;
 }
 
 public void save(PrintWriter writingData){
   int counting = 0;
    writingData.println(maxValue);
    super.save(writingData);
 }
 public void saveStudentAnswer(PrintWriter writingData){
   MCSAAnswer tempstudent = (MCSAAnswer)studentAnswer;
  // writingData.println(super.getValue((MCSAAnswer)studentAnswer) + "\n");
   writingData.println(tempstudent.text + "\n");
 }
}