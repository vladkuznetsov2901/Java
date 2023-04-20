package Lab1.src.Lab3;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class telephoneNumbersTask9 {
    public static void main(String[] args) {
        Pattern simplePattern = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3,4}\\)?[\\- ]?)?[\\d\\- ]{5,10}$");
        StringBuilder numbers = new StringBuilder();
        List<String> phoneNumbers = List.of(
                "Мои номера 220-30-40 и 8904-378-16-61 не считая служебных 234-00-76 ghfhg 89034564545 yvhg 2345656 bjhgjk 23454",
                 "89613170407"
        );
        for (String number : phoneNumbers) {
            for (int i = 0; i < number.length(); i++){
                if (Character.isDigit(number.charAt(i)) || number.charAt(i) == '-'
                        || number.charAt(i) == '(' || number.charAt(i) == ')'){
                    numbers.append(number.charAt(i));

                }
                if (Character.isLetter(number.charAt(i)) && !numbers.isEmpty()){
                    Matcher matcher = simplePattern.matcher(numbers);
                    if (matcher.matches()) {
                        System.out.println(numbers);
                    }
                    numbers = new StringBuilder();
                }

            }
            Matcher matcher = simplePattern.matcher(numbers);
            if (matcher.matches()) {
                System.out.println(numbers);
            }

        }
    }
}

