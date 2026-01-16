/**
 * @param {number} a
 * @param {number} b
 * @return {number}
 */
var commonFactors = function(a, b) {
    x=0;
    out=0
    if(a>b){
        x=a;
    }
    else{
        x=b
    }
    for(let i=1;i<=x;i++){
        if(a%i===0 && b%i===0){
            out++;
        }
    }return out
};