/**
 * @author Melissa
 * @date 04/02/2021
 * @purpose create methods and attributes pertaining to all breeds of dogs
 */
public class DogsDemo {

	public static void main(String[] args) {
		String dogName, dogBreed,dogClass;
		int numberOfRibbons, numberOfShows;
		
		Dogs dogsInfo = new Dogs();
		
		dogsInfo.readInput();
		dogsInfo.writeOutput();
		
		dogsInfo.setName("CD");
		dogsInfo.setClass("Working");
		dogsInfo.setBreed("Cairn Terrier");
		dogsInfo.setNumberOfRibbons(5);
		dogsInfo.setNumberOfShows(8);
		dogsInfo.writeOutput();
		
		dogsInfo.setName("Lassie");
		dogsInfo.setClass("Working");
		dogsInfo.setBreed("Collie");
		dogsInfo.setNumberOfRibbons(10);
		dogsInfo.setNumberOfShows(12);
		dogsInfo.writeOutput();
		
		dogsInfo.setName("Benji");
		dogsInfo.setClass("Mutt");
		dogsInfo.setBreed("Mutt");
		dogsInfo.setNumberOfRibbons(0);
		dogsInfo.setNumberOfShows(1);
		dogsInfo.writeOutput();
	}

}
