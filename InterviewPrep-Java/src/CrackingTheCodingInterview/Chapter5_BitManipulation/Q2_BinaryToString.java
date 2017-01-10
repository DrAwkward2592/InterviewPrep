package CrackingTheCodingInterview.Chapter5_BitManipulation;

public class Q2_BinaryToString {
	 public static String printBinary(double n) {
	        StringBuilder sb = new StringBuilder();
	        sb.append("0.");
	        while (n > 0) {
	            if (n * 2 >= 1) {
	                sb.append(1);
	                n = n * 2 - 1;
	            } else {
	                sb.append(0);
	                n *= 2;
	            }
	            if (sb.length() > 32) {
	                return "ERROR(" + sb.toString() + ")";
	            }
	        }
	        return sb.toString();
	    }

	    //TEST----------------------------------
	    public static void main(String[] args) {
	        System.out.println(printBinary(0.0));
	        System.out.println(printBinary(0.25));
	        System.out.println(printBinary(0.025));
	        System.out.println(printBinary(0.75));
	        System.out.println(printBinary(0.750001));
	    }
}
