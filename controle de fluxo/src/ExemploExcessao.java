import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcessao {
  
    public static void main(String[] args) throws ParseException {
      
      Number valor = Double.valueOf("a1.75");
  
          valor = extracted();
          
          System.out.println(valor);
    }
    private static Number extracted() throws ParseException {
      return NumberFormat.getInstance().parse("a1.75");
    }
  }
  
