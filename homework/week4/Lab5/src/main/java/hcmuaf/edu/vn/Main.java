package hcmuaf.edu.vn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string = "K1101   CSDL  1  20/7/2006  10.00  Dat,\n" +
                "K1101  CTDLGT  1  28/12/2006  9.00  Dat,\n" +
                "K1101  THDC  1  20/5/2006  9.00  Dat,\n" +
                "K1101  CTRR  1  13/5/2006  9.50  Dat,\n" +
                "K1102   CSDL  1  20/7/2006  4.00   Khong Dat,\n" +
                "K1102   CSDL  2  27/7/2006 4.25   Khong Dat,\n" +
                "K1102   CSDL  3  10/8/2006  4.50   Khong Dat,\n" +
                "K1102  CTDLGT  1  28/12/2006  4,50   Khong Dat  ,\n" +
                "K1102  CTDLGT  2  5/1/2007 4,00   Khong Dat,\n" +
                "K1102  CTDLGT  3  15/1/2007  6.00  Dat,\n" +
                "K1102  THDC  1  20/5/2006  5.00  Dat,\n" +
                "K1102  CTRR  1  13/5/2006  7.00  Dat,\n" +
                "K1103   CSDL  1  20/7/2006  3.50   Khong Dat,\n" +
                "K1103   CSDL  2  27/7/2006  8.25 Dat,\n" +
                "K1103  CTDLGT  1  28/12/2006  7.00  Dat,\n" +
                "K1103  THDC  1  20/5/2006  8.00  Dat,\n" +
                "K1103  CTRR  1  13/5/2006  6.50  Dat,\n" +
                "K1104 CSDL  1  20/7/2006  376   Khong Dat,\n" +
                "K1104  CTDLGT  1  28/12/2006 4,00   Khong Dat,\n" +
                "K1104  THDC  1  20/5/2006  4,00   Khong Dat,\n" +
                "K1104  CTRR  1  13/5/2006 4.00   Khong Dat,\n" +
                "K1104  CTRR  2  20/5/2006  3.50   Khong Dat,\n" +
                "K1104  CTRR  3  30/6/2006 4.00   Khong Dat,\n" +
                "K1201   CSDL  1  20/7/2006  6.00  Dat,\n" +
                "K1201  CTDLGT  1  28/12/2006  5.00  Dat,\n" +
                "K1201  THDC  1  20/5/2006  8.50  Dat,\n" +
                "K1201  CTRR  1  13/5/2006  9.00  Dat,\n" +
                "K1202   CSDL  1  20/7/2006  8.00  Dat,\n" +
                "K1202  CTDLGT  1  28/12/2006  4.00   Khong Dat,\n" +
                "K1202  CTDLGT  2  5/1/2007  5.00  Dat,\n" +
                "K1202  THDC  1  20/5/2006  400   Khong Dat,\n" +
                "K1202  THDC  2  27/5/2006  4.00   Khong Dat,\n" +
                "K1202  CTRR  1  13/5/2006  3.00   Khong Dat,\n" +
                "K1202  CTRR  2  20/5/2006  4.00   Khong Dat,\n" +
                "  K1202  CTRR  3  30/6/2006  6.25  Dat,\n" +
                "  K1203   CSDL  1  20/7/2006  9.25  Dat,\n" +
                "  K1203  CTDLGT  1  28/12/2006  9.50  Dat,\n" +
                "  K1203  THDC  1  20/5/2006  10.00  Dat,\n" +
                "  K1203  CTRR  1  13/5/2006  10.00  Dat,\n" +
                "  K1204  CSDL  1  20/7/2006  8.50  Dat,\n" +
                "  K1204  CTDLGT  1  28/12/2006  6.75  Dat,\n" +
                "  K1204  THDC  1  20/5/2006  4.00   Khong Dat,\n" +
                "  K1204  CTRR  1  13/5/2006  6.00  Dat,\n" +
                "  K1301   CSDL  1  20/12/2006  4.25   Khong Dat,\n" +
                "  K1301  CTDLGT  1  25/7/2006  8.00  Dat,\n" +
                "  K1301  THDC  1  20/5/2006  7.75  Dat,\n" +
                "  K1301  CTRR  1  13/5/2006  8.00  Dat,\n" +
                "  K1302  CSDL  1  20/12/2006  6.75  Dat,\n" +
                "  K1302  CTDLGT  1  25/7/2006  5.00  Dat,\n" +
                " K1302  THDC  1  20/5/2006  8.00  Dat,\n" +
                "  K1302  CTRR  1  13/5/2006  8.50  Dat,\n" +
                "  K1303  CSDL  1  20/12/2006  4.00   Khong Dat,\n" +
                "K1303  CTDLGT  1  25/7/2006  4.50   Khong Dat,\n" +
                "K1303  CTDLGT  2  7/8/2006  4.00   Khong Dat,\n" +
                "  K1303  CTDLGT  3  15/8/2006 4.25   Khong Dat,\n" +
                "K1303  THDC  1  20/5/2006 4.50   Khong Dat,\n" +
                "K1303  CTRR  1  13/5/2006  3.25   Khong Dat,\n" +
                "  K1303  CTRR  2  20/5/2006  5.00  Dat,\n" +
                "  K1304  CSDL  1  20/12/2006  7.75  Dat,\n" +
                "  K1304  CTDLGT  1  25/7/2006  9.75  Dat,\n" +
                "  K1304  THDC  1  20/5/2006  5.50  Dat,\n" +
                "  K1304  CTRR  1  13/5/2006  5.00  Dat,\n" +
                "  K1305  CSDL  1  20/12/2006  9.25  Dat,\n" +
                "  K1305  CTDLGT  1  25/7/2006  10.00  Dat,\n" +
                "  K1305  THDC  1  20/5/2006  8.00  Dat,\n" +
                "  K1305  CTRR  1  13/5/2006  10.00  Dat  \n".trim();
        string = string.replace("  ", " ");
        string = string.replace("  ", " ");
        string = string.replace(",", "");
        String[] arrayString = string.split("\n");
        String result = "";
        for(String line : arrayString){
            if(line.startsWith(" ")){
                line = line.substring(1, line.length()).replace(" ", "', '");
            }else{
                line = line.replace(" ", "', '");
            }

            line = "('" + line + "')," + "\n";
            result += line;
        }

        String result2 = "";
        arrayString = result.split("\n");
        for(String line : arrayString){
            String[] arrayChar = line.split(" ");
            for(int index = 0; index < arrayChar.length; index++){
                if(index == 4){
                    result2 += arrayChar[index].replace("'", "") + " ";
                }else{
                    result2 += arrayChar[index]  + " ";
                }
            }
            result2 += "\n";
        }

        System.out.println(result2);
    }
}
