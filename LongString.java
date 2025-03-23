// Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.

// Example:
// String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"}
// String toSearch = "ODG";

//Returns 9 (LODGESSSS)


//Algorithm

// 1. take the for loop for main string
// 2. take the for loop for each string
// 3. consider minimum of integer
// 4. compare given substring with each index string and store for the length greater than the minimum
// 5. return the length 


class LongString {

    public static int longestStr(String str[], String subStr) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < str.length; i++ ){
            if(str[i].length() >= subStr.length()){
                for(int j = 0; j <= (str[i].length() - (subStr.length())); j++ ){
                
                    if((str[i].substring(j,(j + subStr.length()))).equals(subStr)) {
                        int temp = str[i].length(); 
                        if(temp > max){
                            max = temp;
                        }
                    }
                }
            }
        }

        return max;
    }

    public static void main(String[] strings) {
        String[] str = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String subStr = "ODG";
        int max = longestStr(str, subStr);
        System.out.println("The maximum length:" + max);
    }
}