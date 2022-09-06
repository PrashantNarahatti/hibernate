package abstracte;

public abstract class PrepaidCard {
	int cardNo;
	double availableBalance;
	double swipeLimit;
	
	abstract boolean swipeCard(
			);

}
