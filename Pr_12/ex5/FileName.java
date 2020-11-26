package ex5;

public class FileName {
    private String name;

    public FileName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }

    public void getLine(){
        String[] strArr = this.name.split(" ");
        for (int i = 0; i < strArr.length; i++){
            StringBuilder sbLeft = new StringBuilder(strArr[i].toLowerCase());
            for (int j = 1; j < strArr.length; j++){
                StringBuilder sbRight = new StringBuilder(strArr[j].toLowerCase());
                if (sbLeft.charAt(sbLeft.length()-1) == sbRight.charAt(0)){
                    String temp = strArr[i+1];
                    strArr[i+1] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
        this.name = "";
        for (int i = 0; i < strArr.length; i++) {
            this.name += strArr[i];
            if (i < strArr.length-1){
                this.name += " ";
            }
        }
    }
}
