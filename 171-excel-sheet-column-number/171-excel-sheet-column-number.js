/**
 * @param {string} columnTitle
 * @return {number}
 */
var titleToNumber = function(columnTitle) {
   let ans=0
      for(let i=0;i<columnTitle.length;i++){
         ans=ans*26+columnTitle.charCodeAt(i)-64
    }
    return ans;
    
};