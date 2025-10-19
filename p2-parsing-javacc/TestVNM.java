// TESTVNM CLASS USED TO TEST CPS710 ASSIGNMENT 2
class TestVNM {

    private static SimpleCharStream instream;
    private static VNMTokenManager scanner;
    private static VNM parser;

    public static void main(String args[]) {

	// Figure out input stream from args or stdin
	java.io.InputStream infile;
	if (args.length < 1) {
	 	infile = System.in;
	} 
	else try {  
	  	infile = new java.io.FileInputStream(args[0]);
	} catch (java.io.FileNotFoundException e) {
	   	System.out.println("File " + args[0] + " not found."); 
	   	return;
	} 

	// Create scanner and parser
	instream = new SimpleCharStream(infile);
	scanner = new VNMTokenManager(instream);
	parser = new VNM(scanner);

	// Call parser until EOF reached
	while (nextParse());
    	}


    private static boolean nextParse() {
	try {
		parser.start();
	} catch (ParseException e) {	// catch EOF
		return false;
	}
	System.out.println("Parsing succeeded.");
	return true;
	}
}
