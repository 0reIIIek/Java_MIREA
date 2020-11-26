package ex4;

public class TelephoneNumber {
    private String fourNums;
    private String lastThreeNums;
    private String threeNums;
    private String countryCode;

    public TelephoneNumber(String telephoneNumber) {
        this.fourNums = telephoneNumber.substring(telephoneNumber.length()-4);
        this.lastThreeNums = telephoneNumber.substring(telephoneNumber.length()-7, telephoneNumber.length()-4);
        this.threeNums = telephoneNumber.substring(telephoneNumber.length()-10, telephoneNumber.length()-7);
        this.countryCode = telephoneNumber.substring(0,telephoneNumber.length()-10);
    }

    @Override
    public String toString() {
        return "+" + this.countryCode + this.threeNums + "-" +
                this.lastThreeNums + "-" + this.fourNums;
    }
}
