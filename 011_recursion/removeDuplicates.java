
public class removeDuplicates {
    static void remove(String str, int index, StringBuilder newStr, boolean[] map){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index) ;
        if(map[currChar - 'a'] == true){
            remove(str, index+1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            remove(str, index+1, newStr, map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
