//Name: Michael Elyafi, ACCC: melyafi
import java.util.*;
import java.io.*;

public abstract class MCQuestion extends Question{
 
 protected ArrayList<MCAnswer> answerMC;
 
 public MCQuestion(String text, double maxValue){
  super(text, maxValue);
  answerMC = new ArrayList<MCAnswer>();
 }
 
 public MCQuestion(Scanner scanningData){
    super(scanningData);
 }
 
 public void print(){
  System.out.println(text);
  int character = 97;
  for(int i = 0; i <= 4; i++){
   String letter = Character.toString((char) character);
   System.out.print("\t" + letter + ". ");
   answerMC.get(i).print();
   character++;
  }
 }
 
 //new
 public double getValue(MCAnswer multiAnswer) {
   double points = 0.0;
   for (int i = 0; i < answerMC.size(); i++){
     points += answerMC.get(i).getCredit(multiAnswer);
   }
   return points;
 }
 
  public void save(PrintWriter writingData){
    writingData.println(this.text);
    for (int i = 0; i < answerMC.size(); i++){
      answerMC.get(i).save(writingData);
    }
    //writingData.println("");
  }

 public void addAnswer(MCAnswer answer){
   answerMC.add(answer);
 }
 public void reorderAnswers(){
  Collections.shuffle(answerMC);
 }
}