//Name: Michael Elyafi, ACCC: melyafi
import java.util.*;

public class ScannerFactory{
  
  private static Scanner keyboardScanner = null;
  
  public static Scanner getKeyboardScanner(){
    if (keyboardScanner == null){
      Scanner keyboardScanner = new Scanner(System.in);
    }
    return keyboardScanner;
  }
}