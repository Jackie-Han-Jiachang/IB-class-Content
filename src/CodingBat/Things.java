package CodingBat;

public class Things {
    public int countEvens(int[] nums) {
        int counter = 0;
        for (int i : nums){
          if (i % 2 == 0){
            counter++;
          }
        }
        return counter;
    }

    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length-1; i++){
            if (min > nums[i+1]){
                min = nums[i+1];
            }
            if (max < nums[i+1]){
                max = nums[i+1];
            }
        }
        return max-min;
    }

    public int centeredAverage(int[] nums) {
        //find max and min
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length-1; i++){
            if (min > nums[i+1]){
                min = nums[i+1];
            }
            if (max < nums[i+1]){
                max = nums[i+1];
            }
        }
        for (int i : nums){
            sum += i;
        }
        int ret = (sum - max - min)/(nums.length-2);
        return ret;
    }

    public int sum13(int[] nums) {
        int sum = 0;
        int tempSum = 0;
        //boolean have = false;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 13 && i != nums.length-1){
                //have = true;
                nums[i] = 0;
                nums[i+1] = 0;
            } else if(nums[i] == 13){
                nums[i] = 0;
            }
        }
        for (int i : nums) sum += i;

        return sum;
    }

    public int sum67(int[] nums) {
        if (nums.length == 0) return 0;
        //tag 6 and 7
        int start = 0;
        int end = 0;
        int sum = 0;
        int tempSum = 0;
        boolean have = false;
        //boolean head = false;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 6){
                int j = i;
                while (nums[j] != 7 && j!= nums.length){
                    tempSum += nums[j];
                    j++;
                }tempSum += 7;
            }
        }
        // while(have){
        //     for (int i = 0; i < start; i++){
        //         sum += nums[i];
        //     } for (int i = end + 1; i < nums.length; i++){
        //         sum += nums[i];
        //     }
        //     have = false;
        // }
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum - tempSum;
    }
    public int sum67(int[] nums) {
        int sum = 0;
        boolean inSection = false;
    
        for (int num : nums) {
            if (num == 6) {
                inSection = true;   // start ignoring
            } else if (inSection && num == 7) {
                inSection = false;  // stop ignoring after 7
            } else if (!inSection) {
                sum += num;         // add normally if not ignoring
            }
        }
    
        return sum;
    }

    public String frontTimes(String str, int n) {
        String temp = "";
        if (str.length() <= 3){
            String subString = str.substring(0, str.length());
            for (int i = 0; i < n; i++){
                temp += subString;
            }
        } else{
            String subString = str.substring(0,3);
            for (int i = 0; i < n; i++){
                temp += subString;
            }
        }
        return temp;
    }

    boolean doubleX(String str) {
        boolean twoX = false;
        boolean first = true;
        for(int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == 'x' && first){
                first = false;
                if (str.charAt(i+1) == 'x'){
                    twoX = true;
                }
            }
        }
        return twoX;
    }

    public String stringSplosion(String str) {
        String temp = "";
        String subString = "";
        for(int i = 0; i < str.length(); i++){
            subString = str.substring(0,i+1);
            temp += subString;
        }
        return temp;
    }

    public int arrayCount9(int[] nums) {
        int counter = 0;
        for (int i : nums){
            if (i == 9) counter++;
        }
        return counter;
    }

    public boolean array123(int[] nums) {
        boolean ret = false;
        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                ret = true;
            }
        }
        return ret;
    }

    public String stringX(String str) {
        boolean head = false;
        boolean tail = false;
        String temp = str.replace("x", "");
        String ret = "";
        if(str.length() == 0){
          return "";
        }
        if(str=="x"){
          return "x";
        }
        if (str.charAt(0) == 'x'){
            head = true;
        }if (str.charAt(str.length()-1) == 'x'){
            tail = true;
        }
        if(!head && !tail){
            ret = temp;
        }
        else if (head){
            temp = "x" + temp;
            ret = temp;
        }if (tail){
            temp = temp + "x";
            ret = temp;
        }
        
        return ret;
    }
    public String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
          // Only append the char if it is not the "x" case
          if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
            result = result + str.substring(i, i+1); // Could use str.charAt(i) here
          }
        }
        return result;
    }

    public String stringYak(String str) {
        String temp = "";
        boolean inSection = false;
    
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equals("y")) {
                inSection = true;
            } else if (inSection && str.substring(i,i+1).equals("k")) {
                inSection = false;
            } else if (!inSection) {
                temp += str.substring(i,i+1);
            }
        }
        return temp;
    }
    public String stringYak(String str) {
        String result = "";
        
        for (int i=0; i<str.length(); i++) {
          // Look for i starting a "yak" -- advance i in that case
          if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
            i =  i + 2;
          } else { // Otherwise do the normal append
            result = result + str.charAt(i);
          }
        }
        
        return result;
    }
    public boolean noTriples(int[] nums) {
        boolean ret = true;
        for (int i = 0; i < nums.length-2; i++){
            int temp = nums[i];
            if (nums[i+1] == temp && nums[i+2] == temp){
                ret = false;
            }
        }
        return ret;
    }
    public String[] fizzBuzz(int start, int end) {
        String[] ret = new String[end - start];
        for(int i = 0; i < end - start; i++){
          if ((i+start) % 3 == 0 && (i+start) % 5 == 0){
            ret[i] = "FizzBuzz";
          } if ((i+start) % 3 == 0){
            ret[i]="Fizz";
          } if ((i+start) % 5 == 0){
            ret[i]="Buzz";
        }ret[i] = String.valueOf(i + start);
      }return ret;
    }
    
}

