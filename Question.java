//Name: Michael Elyafi, ACCC: melyafi
import java.util.*;
import java.io.*;

public abstract class Question{
 protected String text;
 protected Answer studentAnswer;
 protected Answer rightAnswer;
 protected double maxValue;
 
 protected Question(String text, double maxValue){
  this.text = text;
  this.maxValue = maxValue;
 }
 public Question(Scanner scanningData){
   ScannerFactory.getKeyboardScanner();
 }
 
 public void print(){
  System.out.println(text);
 }
 public void setRightAnswer(Answer ans){
  rightAnswer = ans;
 }
 public abstract Answer getNewAnswer();
 
 public abstract void getAnswerFromStudent();
 
 public abstract void save(PrintWriter writtingData);
 
 public abstract void saveStudentAnswer(PrintWriter writtingData);
 
 //public void restoreStudentAnswers(Scanner scanningData);
 
 public abstract double getValue();
}