import MyPackage.Balance;
class AccBal{
	public static void main(String args[]){
		Balance c[] = new Balance[2];
		c[0] = new Balance("Abhishek", 125);
		c[1] = new Balance("Rathore", -12.5);
		for(int i=0;i<2;i++)
			c[i].show();
	}
}
