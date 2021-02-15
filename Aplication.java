package aplication;

/**
 * @author SILVIU
 */
public class Aplication {
    public static void main(String[] args) {
        
        String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        n = n * 3;
        n += Integer.parseInt("10101", 2);
        n += Integer.parseInt("FF", 16);
        n = n * 6;
  
        int result = n;
        while(result > 9) // While the new result has more than one digit, continue to sum the digits of the result
        {
            n = 0;
            while(result > 0)
            {
                n += result % 10;
                result /= 10;
            }
            result = n;
        }
    
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]); 
    }
}
