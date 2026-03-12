class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
     int sum =0;
     String s= String.valueOf(x);
     int []arr = new int[s.length()];
     for(int i=0;i<s.length();i++){
        arr[i]=s.charAt(i)-'0';
        sum += arr[i];

     }  if(x % sum==0){
        return sum;
     } else{
        return -1;
     }
    }
}