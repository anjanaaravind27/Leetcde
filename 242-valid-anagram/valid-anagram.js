/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    let resultS = s.split('').sort().join('');
    let resultT= t.split('').sort().join('');
  if(resultS === resultT){
    return true;
  } else{
    return false;
  }
};