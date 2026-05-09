/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
 
    let ar = n.toString().split('');
    let product = 1;
    let sum = 0;
    let output =0;

    for(let i = 0; i < ar.length; i++) {
       let num = Number(ar[i]);
        product *=num;
        sum +=num;
        output = product - sum;
    }

    return output;
};