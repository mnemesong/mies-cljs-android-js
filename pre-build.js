const fs = require('fs');
const path = require('path');

/**
 * replaceAll polyphill
 */
function replace_all(str, search, replace) {
    const newStr = str.replace(search, replace);
    if(newStr === str) {
        return newStr;
    }
    return replace_all(newStr, search, replace);
}

/**
 * This script remove some path defining bug, which contains in android-js runtime 
 */
const backendScriptContent = fs
    .readFileSync('./assets/cljs-backend/backend.js').toString();
const lines = backendScriptContent.replace('\r', '').split('\n');
const requireLineSign = /^require\(.*\)[;]?/;
const linesReworked = lines.map(l => {
    if(l.match(requireLineSign)) {
        const replaced = l.replace('path.resolve(".")', '"./"');
        const newString = 'require("./' + eval(replaced.substring(7)) + '");';
        return replace_all(newString, '\\', '/');
    }
    return l;
});
fs.writeFileSync('./assets/cljs-backend/backend.js', linesReworked.join('\n'));