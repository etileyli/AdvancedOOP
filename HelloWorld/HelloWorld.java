public class HelloWorld{
  public static void main(String[] args){

    double cash  = 10000;
    double busd = 14.07;

    double cashUSD = cash / busd;

    double coinUnitPriceInBinance = 1;   // In usdt
    double coinUnitPriceInParibu = 13.88;   // In try


    double coinAmount = cashUSD / coinUnitPriceInBinance;

    double coinTotalPriceInParibu = coinAmount * coinUnitPriceInParibu;

    double balanceInPercent = (coinTotalPriceInParibu / cash - 1) * 100 ;

    System.out.println("");
    System.out.println("Total Final Amount\t" + coinTotalPriceInParibu);
    System.out.println("Balance %" +  balanceInPercent);
    System.out.println("");
  }
}
