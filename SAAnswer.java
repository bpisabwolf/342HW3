//Name: Michael Elyafi, ACCC: melyafi
import java.util.*;
import java.io.*;

public class SAAnswer extends Answer{
 protected String text;
 public SAAnswer(String text){
  this.text = text;
 }
 public void print(){
  System.out.println(text);
 }
 public double getCredit(Answer rightAnswer){
  if (this.text.equals(((SAAnswer)rightAnswer).text)){
   return 1.0;
  }
  return 0.0;
 }
 
 public void save(PrintWriter writingData){
   writingData.println(text);
 }

  public void saveStudentAnswer(PrintWriter writingData){
   writingData.println(text);
 }
}