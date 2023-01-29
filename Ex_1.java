//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
//Данные для фильтрации приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
//Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …
public class Ex_1 {
    public static void main(String[] args) {
        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        String finalstring = new String("Baeldung");
        String startstring = "select * from students where";
        String replStr1 = str.replace('{', ' ');
        String replStr2 = replStr1.replace('}', ' ');
        for (int i = 0; i < str.length() + 1; i++) {
            String replStr3 = replStr2.replace('\'', '\"');
            String replStr4 = replStr3.replace(':', '=');
            String replStr5 = replStr4.replace(",", " and");
            finalstring = startstring + replStr5;
        }
        System.out.println(finalstring);
    }
}

// String[] words = str.split(",");

// for(String word : words){
// System.out.println(word);
// char a = word.charAt(1);
// System.out.println(word.getClass().getSimpleName());

// String finalstring = new String("Baeldung");
// str.charAt(2)
// finalstring = "select * from students where
