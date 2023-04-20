package Lab1.src.Lab2;

public class UTF16 {
    public static void main(String[] args){
        var cnt = 0;
        for (int j = 0; j < 16; j++){
            System.out.print("      " + Integer.toString(j, 16) + " ");
        }
        System.out.println("");
            for (int i = 0x400; i <= 0x4ff; i++) {
                cnt += 1;
                char ch = (char) i;

                System.out.print("|" + ch + "|");
                if (cnt == 16){
                    System.out.println("\n");
                    cnt = 0;
                }
        }

        System.out.println("");

        for (int j = 0; j < 16; j++){
            System.out.print("       " + Integer.toString(j, 16) + " ");
        }
        System.out.println("");
        for (int i = 0x20a0; i <= 0x20bf; i++) {
            cnt += 1;
            char ch = (char) i;
            String tempOct = Integer.toOctalString(i);
            String tempHex = Integer.toHexString(i);

            System.out.print("0x" + Integer.toString(i, 16) + "|" + ch + "|");
            if (cnt == 16){
                System.out.println("\n");
                cnt = 0;
            }
        }

    }



}
