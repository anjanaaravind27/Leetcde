class Solution {
    public String defangIPaddr(String address) {
    //     String result="";
    //     String[]a=address.split("\\.");
    //    for(int i =0 ;i<a.length;i++){
    //     result+=a[i];
    //     if(i < a.length - 1){
    //        result += "[.]"; 
    //     }
    //    }
    //    return result; 
    return address.replace(".","[.]");
    }
}