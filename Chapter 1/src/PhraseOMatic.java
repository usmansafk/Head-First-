
public class PhraseOMatic {
	public  static void main(String[] args) {
		
		// make three sets of words to chose from
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B",
            "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
            "critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", 
            "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", 
            "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
            "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
		
		// find out how many words in each list
		int wordListOneSize = wordListOne.length;
		int wordListTwoSize = wordListTwo.length;
		int wordListThreeSize = wordListThree.length;

		// generate three random numbers
		int randomNumber1 = (int)(Math.random() * wordListOneSize );
		int randomNumber2 = (int)(Math.random() * wordListTwoSize );
		int randomNumber3 = (int)(Math.random() * wordListThreeSize );
		
		// build the phrase
		String phrase = "We need a " + wordListOne[randomNumber1] + ", " 
									 + wordListTwo[randomNumber2] + " and " 
									 + wordListThree[randomNumber3] + " robot.";
		// print the phrase
		System.out.println(phrase);
		
	}
}
