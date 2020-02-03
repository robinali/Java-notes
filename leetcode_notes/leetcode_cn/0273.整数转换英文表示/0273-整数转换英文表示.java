class Solution {
    String[] less20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] thousands = {"", "Thousand", "Million", "Billion"};
    
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        while(num > 0) {
            if(num % 1000 != 0) {
                sb.insert(0, (numberToWordsLessThanThousand(num % 1000) + thousands[i] + " "));
            }
            num /= 1000;
            i++;
        }
        return sb.toString().trim();
    }
    
    private String numberToWordsLessThanThousand(int num) {
        if(num == 0) return "";
        if(num < 20) {
            return less20[num] + " ";
        } else if(num < 100) {
            return tens[num /10] + " " + numberToWordsLessThanThousand(num % 10);
        } else {
            return less20[num / 100] + " Hundred " + numberToWordsLessThanThousand(num % 100);
        }
    }
}