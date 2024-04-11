package exceptions;

public class ReThrowTest {

    public static void main(String[] args) {

        String s = "Das ist das Haus von Nikigraus!";

        try {
            try {
                System.out.println(s.toUpperCase());
                System.out.println(s.charAt(100));
            } catch (NullPointerException e) {
                System.out.println("String nicht verfügbar");
            } catch (Exception e) {
                System.out.println("Problemlösung");
                s = fixProblem();
                if (s.length() == 0) throw e;
                //System.out.println(s.charAt(100));
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static String fixProblem() {
        return "";
    }
}
