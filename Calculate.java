public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate");
		double first = Double.valueOf(arg[0]);
		double second= Double.valueOf(arg[1]);
		double summ = first + second;
		double diff = second - first;
		double dev = second / first;
		double stepen = Math.pow(first, second);
		System.out.println("Summ = " + summ +  '\n' + "Diff = " + diff + 
		'\n' + "dev = " + dev + '\n' + "stepen = " + stepen);
	}
}