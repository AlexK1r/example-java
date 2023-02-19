// Написать метод который приводит сторку к нормальному виду
// строка на вход
// Добрый день Как дела Все хорошо
// выход
// Добрый день. Как дела. Все хорошо.

/**
 * prog2
 */
public class prog2 {

    public static void main(String[] args) {
        String str = "     Добрый  день Как  дела Все хорошо выход     ";
        System.out.println(str);
        str = str.trim(); //удалим провелы вначале и вконце строки
        System.out.println(corStr(str));
    }

    public static String corStr(String incomingString) {
        StringBuilder str = new StringBuilder().append(incomingString);
        for (int j = 0; j < str.length(); j++) {
            //ставим точки вконце предложений кроме последнего
            if (str.charAt(j) == ' ' && 
                Character.isUpperCase(str.charAt(j + 1)) &&
                Character.isLowerCase(str.charAt(j - 1))) {
                    str.insert(j, '.');                    
            }
            //удалим двойные пробелы если они есть
            else if (str.charAt(j) == ' ' &&   
                    str.charAt(j + 1) == ' ' && 
                    str.charAt(j + 1) != str.length()) {
                        str.deleteCharAt(j + 1);
            }
        }        
        str.append('.');
        return str.toString();
    }
}