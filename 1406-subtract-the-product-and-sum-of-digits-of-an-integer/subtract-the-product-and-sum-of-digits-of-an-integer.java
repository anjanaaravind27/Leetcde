class Solution {
    public int subtractProductAndSum(int n) {
     int product =1;
     int sum = 0;
     int result = 0;
     String s = String.valueOf(n);
     int [] ar = new int[s.length()];
     for(int i=0;i<s.length();i++){
         ar[i] = s.charAt(i) - '0';
         sum=sum+ar[i];
         product=product*ar[i];
         result = product - sum;
      }
      return result;
    }
}