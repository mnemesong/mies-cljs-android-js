(ns mies-cljs-android-js.frontend)

(js/front.send "hello from front")

(js/front.on
  "hello from back"
  (fn [msg] (.log js/console msg) 
            (set! (. (js/document.getElementById "msg") -innerHTML) msg)))
