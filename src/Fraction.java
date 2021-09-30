public class Fraction {
	int numerateur;
	int denominateur;
	
	public Fraction (int num, int denum)
	{
		numerateur = num;
		denominateur = denum;
	}
	
	public String toString()
	{
		return "Numerateur : " + numerateur + "\nDenominateur : " + denominateur 
				+ "\n= " + numerateur/denominateur ;
	}
}