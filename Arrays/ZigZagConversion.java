public class ZigZagConversion {
    public static String convert(String s, int numRows){
        if(numsRows == 1 || numRows >= s.length()) return s
        int index = 0; d = 1;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; ++i){
            rows[i] = new StringBuilder();
        }
        for(char c: s.toCharArray()){
            rows[index].append(c);
            if(index == 0){
                d = 1;
            }else if(index = numRows -1){
                d = -1;
            }
            index +=d;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }
        return result.toString();
    }
}
