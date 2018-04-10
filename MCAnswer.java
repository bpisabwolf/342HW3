//Name: Michael Elyafi, ACCC: melyafi
import java.util.*;
import java.io.*;

public abstract class MCAnswer extends Answer{
 protected String text;
 //protected boolean selected;
 protected double creditIfSelected;
 
 protected MCAnswer(String text, double creditIfSelected){
  this.text = text;
  this.creditIfSelected = creditIfSelected;
 }
 public void print(){
  System.out.println(text);
 }
 //new
 public double getCredit(Answer rightAnswer){
   MCAnswer answerTemp = (MCAnswer) rightAnswer;
   
   if (text.equals(answerTemp.text)){
     return creditIfSelected;
   }
   return 0;
 }
 //public void setSelected(boolean selected){
 //  this.selected = selected;
 //}
 public void save(PrintWriter writingData){
   int counting = 0;
   if (creditIfSelected > 0){
     //writingData.println(creditIfSelected);
     counting++;
   }
   //writingData.println(counting);
   //writingData.println(text);
 }
 
  public void saveStudentAnswer(PrintWriter writingData){
    if (creditIfSelected > 0){
      writingData.println(creditIfSelected);
      writingData.println(text);
    }
 }
}