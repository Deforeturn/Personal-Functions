    public static String StrIndexAdd(String str, int index, char add) {
        String result = ""; int j = 0;
        for (int i = 0; i < str.length()+1; i++) {
            if (index != i) {
                result += str.charAt(j);
                j++;
            }
            else if (index == i) {
                result += add;
            }
        }
        return result;
    }
