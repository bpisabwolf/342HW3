//Boris Pisabaj
import java.util.*;
import java.io.*;

public abstract class Answer {
 protected Answer(){
  
 }
 public Answer (Scanner scannerData)
 {
   ScannerFactory.getKeyboardScanner();
 }
 public abstract void print();
 
 public abstract double getCredit(Answer rightAnswer);
 
 public abstract void save(PrintWriter writingData);
 
 public abstract void saveStudentAnswer(PrintWriter writingData);
}