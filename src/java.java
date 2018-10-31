public class Runner {

    //your main containing tests and output
    public static void main(String[] args) {

        System.out.println(helloName("Matt"));
        System.out.println(helloName("Jim"));
        System.out.println(helloName("Maria"));
        System.out.println(helloName("Kate"));

        System.out.println(nextMethod(true));
    }

    //your codingbat method here - must match
    // the method name from codingbat
    public static String helloName(String name) {
        return "hi " + name;
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;

        }
    }

    public String stringTimes(String str, int n) {
        String output ="";
        for(int i=0; i<n; i++) {
            output += str;
        }
        return output;
    }


    public String seeColor(String str) {
        if(str.startsWith("red")){
            return "red";
        }
        if(str.startsWith("blue")){
            return "blue";
        }else{
            return "";
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp >= 60 && temp <= 90 && !(isSummer)){
            return true;
        }
        if(temp >= 60 && temp <= 100 && isSummer){
            return true;
        }else{
            return false;
        }
    }

    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String x = str.substring(i, i+3);
            if (x.compareTo("cat") == 0)
                cat++;
            if (x.compareTo("dog") == 0)
                dog++;
        }
        if (cat == dog){
            return true;
        }else{
            return false;
        }
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] output = new int[4];
        output[0] = a[0];
        output[1] = a[1];
        output[2] = b[0];
        output[3] = b[1];
        return output;
    }

    public int makeChocolate(int small, int big, int goal) {
        int x = goal % 5;
        if(small + big * 5 < goal){
            return -1;
        }else if(x <= small && goal - big*5 > 4){
            return x + 5;
        }else if(x <= small){
            return x;
        }else{
            return -1;
        }
    }

    public boolean gHappy(String str) {
        boolean happy = true;
        int length = str.length();
        for(int i=1; i < length - 1; i++){
            if(str.charAt(i) == 'g'){
                if(str.charAt(i+1) == 'g' || str.charAt(i-1) == 'g'){
                    happy = true;
                }else{
                    happy = false;
                }
            }
        }
        if(length == 1){
            happy = false;
        }
        if(length > 2 && str.charAt(length-1) == 'g' && str.charAt(length-2) != 'g'){
            happy = false;
        }
        return happy;
    }

    public int[] notAlone(int[] nums, int val) {
        for(int i=1; i<nums.length-1; i++){
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                if(nums[i-1] > nums[i+1]){
                    nums[i] = nums[i-1];
                }else{
                    nums[i] = nums[i+1];
                }
            }
        }
        return nums;
    }

    public int maxMirror(int[] nums) {
        int maximum = 0;
        for(int i = 0; i < nums.length; i++) {
            int index = 0;
            for(int x= nums.length - 1; x >= 0 && i + index < nums.length; x--) {
                if(nums[i + index] == nums[x]) {
                    index++;
                } else {
                    maximum = Math.max(maximum, index);
                    index = 0;
                }
            }
            maximum = Math.max(maximum, index);
        }
        return maximum;
    }
}