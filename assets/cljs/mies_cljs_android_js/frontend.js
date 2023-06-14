// Compiled by ClojureScript 1.10.339 {}
goog.provide('mies_cljs_android_js.frontend');
goog.require('cljs.core');
front.send("hello from front");
front.on("hello from back",(function (msg){
console.log(msg);

return document.getElementById("msg").innerHTML = msg;
}));

//# sourceMappingURL=frontend.js.map
