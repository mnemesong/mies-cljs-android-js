// Compiled by ClojureScript 1.10.339 {}
goog.provide('mies_cljs_android_js.core');
goog.require('cljs.core');
front.send("hello from front");
front.on("hello from back",(function (msg){
console.log(msg);

return document.getElementById("msg").innerHTML = msg;
}));

//# sourceMappingURL=core.js.map
