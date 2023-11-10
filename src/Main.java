import java.util.HashSet;
import java.util.Set;

public class Main {
    private final String first, last;
    public Main(String first, String last)
    {
        this.first = first;
        this.last = last;
    }
    public boolean equals(Object o)
    {
        if (!(o instanceof Main))
            return false;
        Main n = (Main)o;
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        return 63 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args)
    {
        Set<Main> s = new HashSet<Main>();
        s.add(new Main("Shubham", "Juneja"));
        System.out.println(
                s.contains(new Main("Shubham", "Juneja")));
    }
}