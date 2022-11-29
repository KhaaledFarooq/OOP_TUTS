public class PostalService {
    static String [] barCodes = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",
    ":||::","|:::|","|::|:","|:|::"};
    static String [] zipCodes = {"0","1","2","3","4","5","6","7","8","9"};

    private final String [] userEnteredBarCode = new String[6];
    private final String [] userEnteredZipCode = new String[6];


    public void setBarCode(String barCode) {
        userEnteredBarCode[0] = barCode.substring(0,5);
        userEnteredBarCode[1]  = barCode.substring(5,10);
        userEnteredBarCode[2]  = barCode.substring(10,15);
        userEnteredBarCode[3]  = barCode.substring(15,20);
        userEnteredBarCode[4]  = barCode.substring(20,25);
        userEnteredBarCode[5]  = barCode.substring(25,30);
    }

    public void setZipCode(String zipCode) {
        userEnteredZipCode[0] = zipCode.substring(0,1);
        userEnteredZipCode[1] = zipCode.substring(1,2);
        userEnteredZipCode[2] = zipCode.substring(2,3);
        userEnteredZipCode[3] = zipCode.substring(3,4);
        userEnteredZipCode[4] = zipCode.substring(4,5);
        userEnteredZipCode[5] = zipCode.substring(5,6);
    }


    public String convertToZipCode(){
        String convertedZipCode ="";
        for (String s : userEnteredBarCode) {
            for (int j = 0; j < barCodes.length; j++) {
                if (s.equals(barCodes[j])) {
                    convertedZipCode = convertedZipCode.concat(zipCodes[j]);
                    break;
                }
            }
        }
        if(convertedZipCode.equals("")){
            return "Incorrect Barcode";
        }
        else {
            return convertedZipCode;
        }
    }

    public String convertToBarCode(){
        String convertedBarCode = "";
        for (String s : userEnteredZipCode) {
            for (int j = 0; j < zipCodes.length; j++) {
                if (s.equals(zipCodes[j])) {
                    convertedBarCode = convertedBarCode.concat(barCodes[j]);
                    break;
                }
            }
        }
        if(convertedBarCode.equals("")){
            return "Incorrect Barcode";
        }
        else {
            return convertedBarCode;
        }
    }
}
