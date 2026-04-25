/**
 * @param {string[]} words
 * @return {string}
 */
var firstPalindrome = function(words) {
    for(let i =0;i<words.length;i++){
        let output=words[i];
        let reverse = output.split("").reverse().join("");
        if(reverse===output){
             return output;
        }
    }return "";
};