import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Random;

/**
 * Write a description of class Passwords here.
 *
 * @author Mark Verra
 * @version Spring 2021
 */
public class Passwords
{
    private static final ArrayList<String> GREEK_LETTERS = new ArrayList<String>();;
    
    private int nums;
    
    private String firstLetter;
    
    private String secondLetter;
    
    private static Random r = new Random();
    public Passwords()
    {
        GREEK_LETTERS.add("Alpha");
        GREEK_LETTERS.add("Beta");
        GREEK_LETTERS.add("Gamma");
        GREEK_LETTERS.add("Delta");
        GREEK_LETTERS.add("Epsilon");
        GREEK_LETTERS.add("Zeta");
        GREEK_LETTERS.add("Eta");
        GREEK_LETTERS.add("Theta");
        GREEK_LETTERS.add("Iota");
        GREEK_LETTERS.add("Kappa");
        GREEK_LETTERS.add("Lambda");
        GREEK_LETTERS.add("Mu");
        GREEK_LETTERS.add("Nu");
        GREEK_LETTERS.add("Omicron");
        GREEK_LETTERS.add("Pi");
        GREEK_LETTERS.add("Rho");
        GREEK_LETTERS.add("Sigma");
        GREEK_LETTERS.add("Tau");
        GREEK_LETTERS.add("Upsilon");
        GREEK_LETTERS.add("Phi");
        GREEK_LETTERS.add("Chi");
        GREEK_LETTERS.add("Psi");
        GREEK_LETTERS.add("Omega");
        GREEK_LETTERS.add("Tango");
        GREEK_LETTERS.trimToSize();
        // firstLetter = "Alpha";
        // nums = 0;
        // secondLetter = "Alpha";
    }
    
    // ACCESSORS
    public ArrayList<String> getLetters()
    {
        return GREEK_LETTERS;
    }
    
    public int getNums()
    {
        return nums;
    }
    
    public String getFirstLetter()
    {
        return firstLetter;
    }
    
    public String getSecondLetter()
    {
        return secondLetter;
    }
    
    // MUTATORS
    public void setNums(int newNum)
    {
        nums = newNum;
    }
    
    public void setFirstLetter(String firstLetter)
    {
        this.firstLetter = firstLetter;
    }
    
    public void setSecondLetter(String secondLetter)
    {
        this.secondLetter = secondLetter;
    }
    
    
    @Override
    public String toString()
    {
        return getFirstLetter() + getNums() + getSecondLetter();
    }
    
    public static void main(String[] args)
    {
        Passwords p = new Passwords();
        
        while(!GREEK_LETTERS.isEmpty())
        {
            p.setFirstLetter(GREEK_LETTERS.remove(r.nextInt(GREEK_LETTERS.size())));
            p.setNums(r.nextInt(100));
            p.setSecondLetter(GREEK_LETTERS.remove(r.nextInt(GREEK_LETTERS.size())));
            System.out.println(p.toString());
        }
    }
    
    // public static void main(String[] args)
    // {
        // Passwords p = new Passwords();
        
        // p.setFirstLetter(GREEK_LETTERS.get(r.nextInt(GREEK_LETTERS.size())));
        // p.setNums(r.nextInt(100));
        // p.setSecondLetter(GREEK_LETTERS.get(r.nextInt(GREEK_LETTERS.size())));
        // System.out.println(p.toString());
    // }
}
